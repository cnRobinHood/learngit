import java.util.Scanner;

/**
 * Created by sky on 2016/10/17.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("要计算阶乘输入1" + "   " + "要剪切一个数的阶乘输入2");
        int choose = num.nextInt();
        switch (choose) {
            case 1:
                System.out.println("输入你想计算的数： ");
                int input = num.nextInt();
                System.out.println("你的答案是： " + Factorial.result(input));

            case 2:
                System.out.println("输入你想计算的数： ");
                int num1 = num.nextInt();
                System.out.println("输入你想剪切的位置： ");
                int start = num.nextInt();
                int end = num.nextInt();
                System.out.println("你要的答案是： " + Factorial.subResult(num1, start, end));
        }
    }
}
