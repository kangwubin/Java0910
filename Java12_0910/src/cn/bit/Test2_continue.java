package cn.bit;

public class Test2_continue {
    public static void main(String[] args){
        //给定100-200，找到其中全部3的倍数
        int num=100;
        while (num<=200){
            if (num % 3!=0){
                num++;
                continue;//跳过此次循环
            }
            System.out.print("\n"+num);
            num++;
        }
    }
}
