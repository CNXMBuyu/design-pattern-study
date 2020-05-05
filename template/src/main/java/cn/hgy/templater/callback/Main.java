package cn.hgy.templater.callback;


/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.initPlayer(new PlayerCallback() {
            @Override
            public void initData() {
                System.out.println("初始化游戏玩家数据");
            }
        });
    }
}
