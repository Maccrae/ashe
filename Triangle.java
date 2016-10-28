package 新建文件夹;

/**
 * Created by Administrator on 2016/10/24.
 */
public class Triangle extends Shape{
    private double hemline;
    private double height;
    public Triangle(double hemline , double height){
        this.height = height;
        this.hemline = hemline;
    }

    @Override
    public double getArea() {
        return (height * hemline) / 2 ;
    }
}
