package cn.bit;
/*1.形参与实参的关系
  C：形参是实参的一份拷贝（Java同样）
 */
public class Test6_add {
    public static void main(String[] args){
     int ret=add(16,18);
     System.out.print(ret);
    }
    public static int add(int x,int y){
        return x+y;
    }
}
