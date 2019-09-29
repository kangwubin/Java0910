package cn.bit;

public class Test8_recursion {
    //递归求 N 的阶乘
    public static void main(String[] args){
        int result=factor(5);
        System.out.println(result);
    }
    public static int factor(int n){
        if (n==1){
            return 1;
        }
        return n * factor(n - 1);
    }
}
