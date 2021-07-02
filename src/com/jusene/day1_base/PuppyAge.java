package com.jusene.day1_base;

public class PuppyAge {
    int puppyAge;
    public PuppyAge(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为: "+puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        /*创建对象*/
        PuppyAge myPuppy = new PuppyAge("tom");
        /*通过方法设定age*/
        myPuppy.setAge(2);
        /*调用另外一个方法获取age*/
        myPuppy.getAge();

        System.out.println(myPuppy.puppyAge);
    }
}
