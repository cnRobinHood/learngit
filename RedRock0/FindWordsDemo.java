
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sky on 2016/11/18.
 */
public class FindWordsDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找关键字的文件的绝对路径：");
        String Ap = scanner.nextLine();
        FindWords findWords = new FindWords(Ap);
        System.out.println("请输入你要查找的关键字：");
        String keyword = scanner.nextLine();
        for (Object a : findWords.Find(keyword)
                ) {
            System.out.println(a);
        }
    }
}
