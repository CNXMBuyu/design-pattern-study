package cn.hgy.visitor;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Pdf extends  AbstractFile {
    @Override
    public void read(IRead read) {
        read.read(this);
    }
}
