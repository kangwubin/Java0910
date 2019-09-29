package cn.bit;

import java.util.Random;
import java.util.Scanner;

public class Guess_Num_Game {
    public static void main(String[] args){
        /*1.先生成一个随机数字（1-100）
        * 2.提示用户输入一个数字
        * 3.用用户输入的和系统生成的进行对比
        * 4.根据对比的结果显示用户是否猜对
        * 5.循环2*/
        System.out.print("------******------\n");
        System.out.print("欢迎玩猜数字游戏！\n");
        System.out.print("------******------\n");
        Random random=new Random();
        //nextInt:[0-bound)的值
        int toGuess=random.nextInt(100)+1;//0-100的值
        Scanner sc=new Scanner(System.in);
        while (true){
        System.out.print("请输入数字：");
        int num=sc.nextInt();
        if (num<toGuess){
            System.out.print("低了\n");
        }else if (num>toGuess){
            System.out.print("高了\n");
        }else {
            System.out.print("猜对了！");
            break;
            }
        }
        sc.close();
    }
}
