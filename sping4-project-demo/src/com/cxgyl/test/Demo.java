package com.cxgyl.test;

import com.cxgyl.test.util.TestUtils;

public class Demo {
    public static void main(String[] args) {
        TestUtils.print("项目开始了");
        List list = new ArrayList();
        list.add("yumx");
        System.out.println("i am a study man");
        TestUtils.print("项目结束了");

        System.out.println(add(2+8));
    }


    public static add(int i,int j){
            System.out.println(i);
            System.out.println(j);
            return i+j;
    }
}
