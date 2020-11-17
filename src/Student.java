import java.util.*;
public class Student  extends  Human{
    private  String  name2;
    private int  age;
    private int  sno;


    public  Student(String name2,int age,int sn){
      //  super(name2,age);
        this.name=name2;
        this.age=age;

        sno=sn;
    }
    public void eat(){
        System.out.print(name+"吃了一个鸡腿");
    }
    public static void main(String[] args) {
        Student stu;
        stu=new Student("gzy",21,2020);
        System.out.println(stu.name);
        //stu.eat();
    }
}
