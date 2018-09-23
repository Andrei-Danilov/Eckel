package InitializationDetails.Base;

public class BaseNoninitStatic {
    public BaseNoninitStatic(){
        System.out.println("Начинается выполнение конструктора класса BaseNoninitStatic.");
        System.out.println("BaseNoninitStatic.NonInitString = " + BaseNoninitStatic.NonInitString);
        System.out.println("Меняем значение поля класса на \"конструктор\"");
        BaseNoninitStatic.NonInitString = "конструктор";
        System.out.println("BaseNoninitStatic.NonInitString = " + BaseNoninitStatic.NonInitString);
        System.out.println("Выполнен конструктор класса BaseNoninitStatic.\n");
}
    {
        System.out.println("Начинается выполнение динамического блока класса BaseNoninitStatic.");
        System.out.println("BaseNoninitStatic.NonInitString = " + BaseNoninitStatic.NonInitString);
        System.out.println("Меняем значение поля класса на \"динамический блок\"");
        BaseNoninitStatic.NonInitString = "динамический блок";
        System.out.println("BaseNoninitStatic.NonInitString = " + BaseNoninitStatic.NonInitString);
        System.out.println("Выполнен динамический блок класса BaseNoninitStatic.\n");
    }
    static {
        System.out.println("Начинается выполнение статического блока класса BaseNoninitStatic.");
        System.out.println("BaseNoninitStatic.NonInitString = " + BaseNoninitStatic.NonInitString);
        System.out.println("Меняем значение поля класса на \"статический блок\"");
        BaseNoninitStatic.NonInitString = "статический блок";
        System.out.println("BaseNoninitStatic.NonInitString = " + BaseNoninitStatic.NonInitString);
        System.out.println("Выполнен статический блок блок класса BaseNoninitStatic.\n");
    }
    public static String NonInitString;
}
