package InheritanceDetails.Base;

public class BaseClass {
    public void Square(int number){
        System.out.println(SquareCalculation(number));
    }
    private int SquareCalculation(int number){
        return number*number;
    }
    public void Cube(int number) {
        System.out.println(CubeCalculation(number));
    }
    int CubeCalculation(int number){
            return number*number*number;
    }
}
