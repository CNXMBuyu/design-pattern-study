package cn.hgy.templater.classic;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public abstract class Player {

    public void initPlayer() {
        // 保存玩家信息
        savePlayer();
        // 初始化玩家数据，因为每款游戏都不同，所以需要有子类具体实现
        initData();
    }

    protected void savePlayer() {
        System.out.println("已保存玩家信息");
    }

    /**
     * 初始化玩家数据
     */
    protected abstract void initData();


}
