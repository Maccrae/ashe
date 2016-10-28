package 新建文件夹;

/**
 * Created by Administrator on 2016/10/24.
 */
public class Square extends Shape{
    private double length;
    public Square(double length){
        this.length = length;
    }



    @Override
    public double getArea( ) {
        return Math.pow(length,2);
    }
}
