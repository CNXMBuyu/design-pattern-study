package cn.hgy.builder;

/**
 * 建造者模式。一般用于构造函数，或者set方法无法满足的情况，例如所需的参数太多，或者实例化的时候对属性有要求
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class BuilderClass {

    private String a;
    private String b;
    private String c;
    private String d;

    private BuilderClass(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public static class Builder {
        private String a;
        private String b;
        private String c;
        private String d;

        public Builder setA(String a) {
            this.a = a;
            return this;
        }

        public Builder setB(String b) {
            this.b = b;
            return this;
        }

        public Builder setC(String c) {
            this.c = c;
            return this;
        }

        public Builder setD(String d) {
            this.d = d;
            return this;
        }

        public BuilderClass build() {
            if (this.a.equals(b)) {
                throw new IllegalArgumentException("a不能和b属性一样");
            }
            return new BuilderClass(this);
        }
    }
}
