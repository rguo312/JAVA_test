package  com.runoob.test;

public class test{
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){
        test test = new test();
        test.pupAge();
    }
}