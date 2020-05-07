package cn.hgy.visitor;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Doc extends AbstractFile {
    @Override
    public void read(IRead read) {
        read.read(this);
    }
}
