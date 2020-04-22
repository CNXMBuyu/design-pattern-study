package cn.hgy.observer.demo;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class MessageA {

    private String content;

    public MessageA(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
