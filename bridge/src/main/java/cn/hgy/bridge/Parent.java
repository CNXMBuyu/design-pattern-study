package cn.hgy.bridge;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Parent {

    private static final String DEFAULT_NAME = "defaultName";
    private static final String DEFAULT_CODE = "defaultCode";

    public void create(String name, String code){

        if(name == null && code == null){
            name = DEFAULT_NAME;
            code = DEFAULT_CODE;
        }

        // ......
    }
}
