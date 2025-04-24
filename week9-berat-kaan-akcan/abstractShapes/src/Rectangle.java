public class Rectangle extends Shape{
private int sideA = 0 , sideB = 0 ;
public Rectangle(){}
    public Rectangle(int sideA, int sideB){
    this.sideA = sideA;
    this.sideB = sideB;
    }

    public Rectangle(String color ,int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double Perimeter(){
        return 2*(sideA+sideB);
    }
 public double area(){
    return sideA*sideB;
 }
    @java.lang.Override
    public java.lang.String toString() {
        return s"Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}