package cn.hgy.observer.eventbus;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Message {

    private String content;

    public Message(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
