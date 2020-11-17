import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
  /*      System.out.println("hhh\n" +"hhhhhhhhh");
        System.out.println(9/2);
        int a=2;
        System.out.println(a);

        int[] list={1,2,3,4,5,6,7,8};
        for(int i=0;i<list.length;i++){
             System.out.println(list[i]);
            //写法一： 分配空间同时赋值
        int[] a = new int[]{100,102,444,836,3236};
            for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            }
            //写法二： 省略了new int[],效果一样
        int[] b = {100,102,444,836,3236};
            for(int qi=0;qi<a.length;qi++){
                System.out.println(b[qi]);
            }
            -----------------------------------------

    int  sum=0;  //输出 0-10之间的偶数
        for(int i=0;i<=10;i++){
            if(i%2==0)
                sum+=i;
        }
        System.out.println(sum);
-----------------------------

        Scanner  s=new Scanner(System.in);
        System.out.println("请输入整型   字符串  或者 其他");
        int x=1;
        while (true){
            int a=s.nextInt();//scan.next()和scan.nextLine()用于获取字符串类型的输入，
            //另外我们还可以用scan.nextBoolean()用于获取布尔型的输入，
            // scan.nextInt()用于获取数值型的输入，scan.nextLong()用于获取long类型的输入
            String str=s.nextLine();
            x++;
            System.out.println("输入的内容"+str+String.valueOf(a));
            // 1.) String s = String.valueOf(i);
            // 强制类型转换
　　         // 2.) String s = Integer.toString(i);
            if(x==3)
                break;
        }
        =============================================

        Scanner s = new Scanner(System.in);
        System.out.println("请输入成绩");

        while (true) {
            int grade = s.nextInt();
            if (grade >= 90)
                System.out.println("NB");
            else if (grade > 80)
                System.out.println("还可以");
            else if (grade > 70)
                System.out.println("及格");
            else
                System.out.println("不及格");
        }
        ============================================
      for(int i=1;i<=9;i++){
          for(int j=1;j<=i;j++){
              System.out.print(i*j+"\t");

          }
          System.out.println("");

      }
      ============================================
        String[] str=new String[]{"gao","zhi","yong"};
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

        String  name;
        name="hhh";
        System.out.println("输出"+name);
=============================*/
        int c=3;
        System.out.println(f(c));


    }
    // 阶乘
    public static int f(int a){
        if(a==1)
            return 1;
        else{
            return a*f(a-1);
        }
    }


}

