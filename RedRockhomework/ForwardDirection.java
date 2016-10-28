/**
 * Created by sky on 2016/10/24.
 */
public class ForwardDirection extends Shape {
    float down,height;
    public void SetDownAndHeight(float down,float height){
        this.down=down;
        this.height=height;
    }
    public float Area() {
        float area = down * height;
        return area;
    }
}
