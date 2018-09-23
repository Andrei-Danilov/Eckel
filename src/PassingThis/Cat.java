package PassingThis;

class Cat {
    {System.out.println("Блок класса Cat выполнен.");}
    String name;            //обычная переменная
    int age = 66;
    static int catCount;    //статическая переменная


    public static void setAge(int age) { //статический метод
        //this.age = age;
        //nonstatCatCount();
    }
    public static int statCatCount(){ //статичекий метод
        return catCount;
    }
    public int nonstatCatCount(){     //нестатический метод
        return catCount;
    }

    Cat(String name) {
        System.out.println("Конструктор класса Cat выполненн.");
        this.name = name;
        catCount++;   //увеличиваем значение статический переменной на 1 при каждом ооздании экземпляра
    }
}
