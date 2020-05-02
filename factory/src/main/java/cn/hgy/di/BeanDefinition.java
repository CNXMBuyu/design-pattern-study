package cn.hgy.di;

import java.util.ArrayList;
import java.util.List;

/**
 * Bean的定义
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class BeanDefinition {

    private String id;
    private String className;
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<ConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    public boolean isSingleton() {
        return Scope.SINGLETON.equals(this.scope);
    }

    public enum Scope {SINGLETON, PROTOTYPE}

    public static class ConstructorArg {
        private String ref;
        private Class type;
        private Object value;

        public Class getType() {
            return type;
        }

        public void setType(Class type) {
            this.type = type;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public String getRef() {
            return ref;
        }

        public void setRef(String ref) {
            this.ref = ref;
        }

        public boolean isRef() {
            return this.ref != null;
        }
    }
}
