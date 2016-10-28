import java.util.Scanner;

/**
 * Created by sky on 2016/10/24.
 */
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角型的底和高： ");
        float down = sc.nextFloat();
        float height = sc.nextFloat();
        Shape trangle = new Trangle();
        Trangle trangle1 = (Trangle) trangle;
        trangle1.height = height;
        trangle1.down = down;
        System.out.println("三角形的面积为: " + trangle1.Area());
    }
}
