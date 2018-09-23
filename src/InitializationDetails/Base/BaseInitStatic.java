package InitializationDetails.Base;

public class BaseInitStatic {
    public BaseInitStatic(){
        System.out.println("Начинается выполнение конструктора класса BaseInitStatic.");
        System.out.println("BaseInitStatic.initString = " + BaseInitStatic.initString);
        System.out.println("Меняем значение поля класса на \"конструктор\"");
        BaseInitStatic.initString = "конструктор";
        System.out.println("BaseInitStatic.initString = " + BaseInitStatic.initString);
        System.out.println("Выполнен конструктор класса BaseInitStatic.\n");
    }
    {
        System.out.println("Начинается выполнение динамического блока класса BaseInitStatic.");
        System.out.println("BaseInitStatic.initString = " + BaseInitStatic.initString);
        System.out.println("Меняем значение поля класса на \"динамический блок\"");
        BaseInitStatic.initString = "динамический блок";
        System.out.println("BaseInitStatic.initString = " + BaseInitStatic.initString);
        System.out.println("Выполнен динамический блок класса BaseInitStatic.\n");
    }
    static {
        System.out.println("Начинается выполнение статического блока класса BaseInitStatic.");
        System.out.println("BaseInitStatic.initString = " + BaseInitStatic.initString);
        System.out.println("Меняем значение поля класса на \"статический блок\"");
        BaseInitStatic.initString = "статический блок";
        System.out.println("BaseInitStatic.initString = " + BaseInitStatic.initString);
        System.out.println("Выполнен статический блок блок класса BaseInitStatic.\n");
    }
    public static String initString = "начальное значение";
}

