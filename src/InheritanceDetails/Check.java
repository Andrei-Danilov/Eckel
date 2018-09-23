package InheritanceDetails;


import InheritanceDetails.Base.BaseClass;
import InheritanceDetails.Inherited.InheritedClass;

public class Check{
    public static void main(String[] args) {
        InheritedClass inheritedClass = new InheritedClass();
        System.out.print("Квадрат двойки равен ");
        //есть доступ к унаследованному публичному методу, который, в свою очередь имеет доступ к приватному методу
        inheritedClass.Square(2);
        System.out.print("Куб двойки равен ");
        //System.out.println(SquareCalculation(3)); //нет доступа к унаследованному приватному методу
        //есть доступ к унаследованному публичному методу, который, в свою очередь имеет доступ к package-методу
        inheritedClass.Cube(2);
        //Check check = new Check();
        //нет доступа к приватному методу унаследованного класса
        //check.SquareCalculation(3);
    }
}
