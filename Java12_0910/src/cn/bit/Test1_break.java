package cn.bit;

public class Test1_break {
    public static void main(String[] args){
        //给定100-200，找到其中第一个3的倍数
        int num=100;
        while (num<=200){
            if (num % 3==0){
                System.out.print(num);
                break;//结束整个循环
            }
            num++;
        }
        System.out.print("\n hehe");
    }
}
