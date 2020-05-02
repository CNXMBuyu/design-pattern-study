package cn.hgy.bridge;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class SubClass extends Parent{

    @Override
    public void create(String name, String code) {
        if(name == null || code == null){
            throw new IllegalArgumentException("name或code不能为null");
        }
        super.create(name, code);
    }
}
