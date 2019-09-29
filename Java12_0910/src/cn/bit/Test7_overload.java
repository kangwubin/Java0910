package cn.bit;

public class Test7_overload {
    // overload方法的重载
    /*同一个方法名字, 提供不同版本的实现, 称为 方法重载
    * 针对同一个类:
     方法名相同
     方法的参数不同(参数个数或者参数类型)
     方法的返回值类型不影响重载.
     当两个方法的名字相同, 参数也相同, 但是返回值不同的时候, 不构成重载.
    */
    public static void main(String[] args){
            int a = 10;
            int b = 20;
            int ret = add(a, b);
            System.out.println("ret = " + ret);

            double a2 = 10.5;
            double b2 = 20.5;
            double ret2 = add(a2, b2);
            System.out.println("ret2 = " + ret2);

            double a3 = 10.5;
            double b3 = 10.5;
            double c3 = 20.5;
            double ret3 = add(a3, b3, c3);
            System.out.println("ret3 = " + ret3);
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static double add(double x, double y, double z) {
        return x + y + z;
    }
}
