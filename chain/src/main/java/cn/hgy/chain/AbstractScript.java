package cn.hgy.chain;

import java.util.function.Predicate;

/**
 * 脚本基础类
 * <pre>
 * 实现了{@code Comparable}接口,参考{@link AbstractScript#compareTo(AbstractScript)}
 * 该类提供两个扩展点，抽象函数{@link AbstractScript#doInit()}和过滤函数{@link AbstractScript#filter(Predicate)} ()}
 * </pre>
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public abstract class AbstractScript implements Comparable<AbstractScript> {

    /**
     * 初始化脚本的顺序，必须是正整数，默认为1，0为占用顺序，最优先执行。
     *
     * @return
     */
    protected int sort() {
        return 1;
    }

    /**
     * 默认版本为1.0.0，版本号格式为：x.x.x
     *
     * @return
     */
    protected String version() {
        return "1.0.0";
    }

    /**
     * 默认没有备注
     *
     * @return
     */
    protected String memo() {
        return "";
    }

    /**
     * 过滤
     *
     * @param predicate
     * @return
     */
    public boolean filter(Predicate predicate) {
        return predicate.test(this);
    }

    /**
     * 执行初始化
     */
    public abstract void doInit();

    /**
     * 重写排序：版本号>排序
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(AbstractScript o) {
        int version = compareVersion(this.version(), o.version());
        if (version == 0) {
            return this.sort() - o.sort();
        } else {
            return version;
        }
    }

    /**
     * 比较版本号
     *
     * @param version1
     * @param version2
     * @return
     */
    private int compareVersion(String version1, String version2) {
        // 注意此处为正则匹配，不能用"."；
        String[] versionArray1 = version1.split("\\.");
        String paddingChar = "0";
        for (int i = 0; i < versionArray1.length; i++) {
            // 如果位数只有一位则自动补零（防止出现一个是04，一个是5 直接以长度比较）
            if (versionArray1[i].length() == 1) {
                versionArray1[i] = paddingChar + versionArray1[i];
            }
        }
        String[] versionArray2 = version2.split("\\.");
        for (int i = 0; i < versionArray2.length; i++) {
            // 如果位数只有一位则自动补零
            if (versionArray2[i].length() == 1) {
                versionArray2[i] = paddingChar + versionArray2[i];
            }
        }
        int idx = 0;
        int minLength = Math.min(versionArray1.length, versionArray2.length);
        int diff = 0;
        while (idx < minLength && (diff = versionArray1[idx].length() - versionArray2[idx].length()) == 0
                && (diff = versionArray1[idx].compareTo(versionArray2[idx])) == 0) {
            ++idx;
        }
        // 如果已经分出大小，则直接返回，如果未分出大小，则再比较位数，有子版本的为大；
        diff = (diff != 0) ? diff : versionArray1.length - versionArray2.length;
        return diff;
    }
}
