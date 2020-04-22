package cn.hgy.factory;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class XmlBeanConfigParser implements BeanConfigParser {

    @Override
    public List<BeanDefinition> parse() {
        List<BeanDefinition> beanDefinitionList = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("factory/src/main/resources/beans.xml");
            NodeList beanList = document.getElementsByTagName("bean");

            for (int i = 0; i < beanList.getLength(); i++) {
                Node bean = beanList.item(i);
                BeanDefinition beanDefinition = new BeanDefinition();

                // 读取属性
                beanDefinition.setId(bean.getAttributes().getNamedItem("id").getNodeValue());
                beanDefinition.setClassName(bean.getAttributes().getNamedItem("class").getNodeValue());

                Node scopeNode = bean.getAttributes().getNamedItem("scope");
                if (scopeNode != null) {
                    String scope = scopeNode.getNodeValue();
                    beanDefinition.setScope(BeanDefinition.Scope.valueOf(scope));
                }

                Node lazyNode = bean.getAttributes().getNamedItem("lazy-init");
                if (lazyNode != null) {
                    String lazy = scopeNode.getNodeValue();
                    beanDefinition.setLazyInit(Boolean.valueOf(lazy));
                }

                // 读取子节点 - 构造函数参数
                NodeList attributeList = bean.getChildNodes();
                for (int j = 0; j < attributeList.getLength(); j++) {
                    if (attributeList.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        // 构造函数
                        Node argNode = attributeList.item(j);
                        BeanDefinition.ConstructorArg constructorArg = new BeanDefinition.ConstructorArg();
                        Node refNode = argNode.getAttributes().getNamedItem("ref");
                        if (refNode != null) {
                            constructorArg.setRef(refNode.getNodeValue());
                        }

                        Node typeNode = argNode.getAttributes().getNamedItem("type");
                        if (typeNode != null) {
                            constructorArg.setType(Class.forName(typeNode.getNodeValue()));
                        }

                        Node valueNode = argNode.getAttributes().getNamedItem("value");
                        if (valueNode != null) {
                            constructorArg.setValue(valueNode.getNodeValue());
                        }
                        beanDefinition.getConstructorArgs().add(constructorArg);

                    }
                }
                beanDefinitionList.add(beanDefinition);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return beanDefinitionList;
    }

}
