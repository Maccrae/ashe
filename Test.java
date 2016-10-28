package 新建文件夹;

/**
 * Created by Administrator on 2016/10/24.
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(1,1);
        Square square = new Square(1);
        System.out.println("圆形的面积为" + circle.getArea());
        System.out.println("三角形的面积为" + triangle.getArea());
        System.out.println("正方形的面积为" + square.getArea());
    }
}
