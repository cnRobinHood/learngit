/**
 * Created by sky on 2016/10/24.
 */
public class Trangle extends Shape {
    float down,height;
    public void SetDownAndHeight(float down,float height){
        this.down=down;
        this.height=height;
    }
    public float Area() {
        return down * height / 2;

    }
}
