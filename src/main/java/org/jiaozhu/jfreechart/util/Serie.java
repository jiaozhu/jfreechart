package org.jiaozhu.jfreechart.util;

import java.io.Serializable;
import java.util.Vector;


public class Serie implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;// 名字
    private Vector<Object> data;// 数据值


    public Serie() {

    }

    public Serie(String name, Vector<Object> data) {

        this.name = name;
        this.data = data;
    }

    public Serie(String name, Object[] array) {
        this.name = name;
        if (array != null) {
            data = new Vector<Object>(array.length);
            for (int i = 0; i < array.length; i++) {
                data.add(array[i]);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Object> getData() {
        return data;
    }

    public void setData(Vector<Object> data) {
        this.data = data;
    }

}