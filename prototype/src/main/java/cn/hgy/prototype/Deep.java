package cn.hgy.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Deep {

    private List<ClassA> list;

    public Deep(List<ClassA> list){
        this.list = new ArrayList<>(list.size());
        list.forEach(classA -> {
            this.list.add(deepCopy(classA));
        });
    }

    public List<ClassA> getList() {
        return list;
    }

    public ClassA deepCopy(ClassA object) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(object);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return (ClassA) oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
