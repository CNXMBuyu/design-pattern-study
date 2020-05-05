package cn.hgy.templater.callback;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Player {

    public void initPlayer(PlayerCallback playerCallback){
        // 保存玩家信息
        savePlayer();
        // 初始化玩家数据，因为每款游戏都不同，所以需要有子类具体实现
        playerCallback.initData();
    }

    protected void savePlayer(){
        System.out.println("已保存玩家信息");
    }
}
