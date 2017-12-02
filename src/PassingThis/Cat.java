package PassingThis;

public class Cat {
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
        this.name = name;
        catCount++;   //увеличиваем значение статический переменной на 1 при каждом ооздании экземпляра
    }
}
