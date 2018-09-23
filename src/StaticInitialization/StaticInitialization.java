package StaticInitialization;

class Bowl {
    Bowl(int marker) {
        System.out.println("Сработал конструктор класса Bowl, создан объект Bowl" + marker);
    }

    void f1(int marker) {
        System.out.println("Сработал метод f1 класса Bowl (" + marker + ")");
    }
}

class Table {
    static{
        bowl1 = new Bowl(123);
    }
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Сработал конструктор класса Table");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);//создам статический объект?
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Сработал конструктор класса Cupboard");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Первая строка метода main()");
        System.out.println("Создание нового объекта Cupboard в main()");
        new Cupboard();
        System.out.println("Создание нового объекта Cupboard в main()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
