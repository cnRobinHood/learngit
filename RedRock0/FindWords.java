import java.io.*;
import java.util.ArrayList;


/**
 * Created by sky on 2016/11/18.
 */
public class FindWords {
    private String AbsolotePath;
    public FindWords(String AbsolotePath) {
        this.AbsolotePath = AbsolotePath;
    }

    public ArrayList Find(String keyword) throws IOException  {
        File file = new File(AbsolotePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String temp;
        int index = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while ((temp = bufferedReader.readLine()) != null) {
            if (temp.contains(keyword)) {
                list.add(index);
            }
            index++;
        }
        return list;

    }
}
