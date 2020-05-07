package cn.hgy.singledispatch;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public void show(Parent parent){
        parent.show();
    }

    public void showA(Parent parent){
        System.out.println(" showParent ");
    }

    public void showA(Children children){
        System.out.println(" showChildren ");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Parent parent = new Children();
        main.show(parent);
        main.showA(parent);
    }

}
