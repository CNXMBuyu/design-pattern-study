package cn.hgy.visitor;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ReadImpl implements IRead {
    @Override
    public void read(Doc doc) {
        System.out.println("doc");
    }

    @Override
    public void read(Pdf pdf) {
        System.out.println("pdf");
    }
}
