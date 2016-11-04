import java.util.Scanner;

/**
 * Created by sky on 2016/10/30.
 */
public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个混合四则运算：");
        String str = sc.nextLine();
        Operation operation = new Operation();
        System.out.println("你要的结果是：" + operation.Operation(str));


    }


}

