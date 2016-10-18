/**
 * Created by sky on 2016/10/17.
 */
public class Test {
    public static void main(String[] args) {
        final int age = 18;
        Human[] arrey = new Human[6];
        String[][] nameAndsex = {{"赵", "女"}, {"钱", "女"}, {"孙", "女"}, {"李", "男"}, {"周", "男"}, {"吴", "男"}};
        for (int i = 0; i < 6; i++) {
            Human person = new Human(nameAndsex[i][1]);
            arrey[i] = person;
            person.setAge(age);
            person.setName(nameAndsex[i][0]);

        }
        for (int i = 0; i < 6; i++) {
            System.out.println(arrey[i].introduce());
        }
    }
}
