package 新建文件夹;

/**
 * Created by Administrator on 2016/10/24.
 */
public class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
