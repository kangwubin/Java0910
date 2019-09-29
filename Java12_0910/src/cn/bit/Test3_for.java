package cn.bit;

public class Test3_for {
    public static void main(String[] args){
        /*for:1.先执行表达式1进行初始化
        * 2.执行表达式2，判定循环是否要执行
        * 3.执行循环体代码
        * 4.执行表达式3，更新循环变量
        * 5.执行表达式2，再次判定循环是否执行
        * */
        //2.计算1-100的和
        int sum=0;
        for (int a=1;a<=100;a++){
            sum +=a;
            System.out.println("sum="+sum);
        }

        //3.计算 5 的阶乘
        int sum1=0;
        for (int b=1;b<=5;b++){
            sum1 *=b;
            System.out.println("sum1="+sum1);
        }

        //4.计算 1! + 2! + 3! + 4! + 5!
        int result=0;
        for (int i=1;i<=5;i++){
            //第一重循环负责进行求和
            //factorResult表示每一项阶乘的结果
            int factorResult=1;
            for(int j=1;j<=i;j++){
                //第二重循环负责求当前i的阶乘
                factorResult *=j;
            }
            result+=factorResult;
        }
        System.out.println(result);
    }
}
