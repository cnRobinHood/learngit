/**
 * Created by sky on 2016/10/17.
 */
class Human {
    private String name;
    private int age;
    private String sex;

    public Human(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String introduce() {
        return getName() + "---" + getAge() + "---" + getSex();
    }
}
