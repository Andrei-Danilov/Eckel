package InitializationDetails;

import InitializationDetails.Base.BaseInitStatic;
import InitializationDetails.Base.BaseNoninitStatic;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Создаём экземпляр класса BaseInitStatic.");
        BaseInitStatic baseInitStatic = new BaseInitStatic();
        System.out.println("После создания объекта BaseInitStatic.initString = " + BaseInitStatic.initString);
        System.out.println("Создаём экземпляр класса BaseNoninitStatic.");
        BaseNoninitStatic baseNoninitStatic = new BaseNoninitStatic();
        System.out.println("После создания объекта BaseNoninitStatic.NonInitString = " + BaseNoninitStatic.NonInitString);
    }
}
