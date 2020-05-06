package cn.hgy.chain;

import java.util.Arrays;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        ScriptChain scriptChain = new ScriptChain();
        scriptChain.init(Arrays.asList(new ScriptB(), new ScriptA()));
    }
}
