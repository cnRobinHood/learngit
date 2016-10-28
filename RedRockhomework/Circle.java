/**
 * Created by sky on 2016/10/24.
 */
public class Circle extends Shape {
    float radius;
    public void SetRadius(float radius) {
        this.radius = radius;
    }

    public float Area() {
        float area = (float) Math.PI * radius * radius;
        return area;
    }
}
