package cn.hgy.visitor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        List<AbstractFile> fileList = new ArrayList<>();
        fileList.add(new Doc());
        fileList.add(new Pdf());
        IRead read = new ReadImpl();
        fileList.forEach(abstractFile -> {
            // 编译会失败，所以改用abstractFile.read(read);
            // read.read(abstractFile);
            abstractFile.read(read);
        });
    }
}
