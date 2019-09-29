package cn.bit;

public class Test5_method {
    public static void main(String[] args){
        //阶乘求和
        int sum=0;
        for (int i=1;i<=5;i++){
            //方法调用，实参
            sum+=factor(i);
        }
        System.out.print(sum);
    }
    //方法的定义：形参
    public static int factor(int num){
        //计算num的阶乘
        int result=1;
        for (int i=1;i<=num;i++){
            result *=i;
        }
        return result;
    }
}
