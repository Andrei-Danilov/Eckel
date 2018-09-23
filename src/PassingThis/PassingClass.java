package PassingThis;

public class PassingClass {
    public static void main(String[] args) {
        System.out.println("Создано котиков на данный момент: " + Cat.catCount);

        Cat cat1 = new Cat("Vaska");
        System.out.println("Создан котик по имени: " + cat1.name);
        System.out.println("Создано котиков на данный момент: " + Cat.catCount);

        Cat cat2 = new Cat("Murka");
        System.out.println("Создан котик по имени: " + cat2.name);
        System.out.println("Создано котиков на данный момент: " + Cat.catCount);

        Cat cat3 = new Cat("Matroskin");
        System.out.println("Создан котик по имени: " + cat3.name);
        System.out.println("Создано котиков на данный момент: " + Cat.catCount);

        int statCatCount = Cat.statCatCount(); //вызываем статический метод
        int nonstatCatCount1 = cat1.nonstatCatCount();//вызываем нестатический метод из статического main()
        int age = 111;
        System.out.println("Проверим, чему теперь равно cat1.age: " + cat1.age);
        new Dog();
        Cat cat = new Cat("Ledenets");
    }
}
