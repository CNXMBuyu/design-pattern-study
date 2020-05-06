package cn.hgy.chain;


import java.util.*;
import java.util.function.Predicate;

/**
 * 脚本职责链
 *
 * @author guoyu.huang
 */
public class ScriptChain {


    public void init(List<AbstractScript> initScriptList) {
        // 排序
        Collections.sort(initScriptList);
        // 遍历执行所有脚本
        for (AbstractScript script : initScriptList) {
            if (script.filter(predicate -> {
                return true;
            })) {
                script.doInit();
            }
        }
    }
}
