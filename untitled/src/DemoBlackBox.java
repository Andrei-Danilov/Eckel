class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }
}

public class DemoBlackBox {
    public static void main(String[] args) {
        /*Создаём два объекта одного класса с одинаковым значением полей.
        * Каждый объект присваивается свое объектной ссылке.*/
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);
        /*Создаём ещё одну объектную ссылку, указывающую на существующий объект.*/
        BlackBox object3 = object2;

        /*Несмотря на то, что оюъекты object1 и object2 во всём одинаковые, они выдают разные хэш-коды.*/
        System.out.println("HashCode из object1: " + object1.hashCode());
        System.out.println("HashCode из object2: " + object2.hashCode());
        /*Хэш-коды, полученные по объектным ссылкам object2 и object3 совпадают, т.к.
        *эти ссылки указывают на один и тот же объект!*/
        System.out.println("HashCode из object3: " + object3.hashCode());

        System.out.print("\nМетод equals для object1 и object2: ");
        /*При помощи метода equals() объект сравнивает собственный хэш-код с хэш-кодом
        * другого объекта, ссылка на который получена как аргумент. */
        System.out.println(object1.equals(object2));//false
        System.out.print("Метод equals для object2 и object3: ");
        /*Метод equals() возвращает true, т.к. ссылка-аргумент указывает на тот же
        * самый объект, который выполняет сравнение.*/
        System.out.println(object2.equals(object3));//true

        System.out.print("\nСравнение хэш-кодов object1 и object2: ");
        System.out.println(object1.hashCode() == object2.hashCode());
        System.out.print("Сравнение хэш-кодов object2 и object3: ");
        System.out.println(object2.hashCode() == object3.hashCode());

        /*Простое сравнение объектов по имени при помощи оператора сравнения "=="
        * выполняет, по сути, СРАВНЕНИЕ ОБЪЕКТНЫХ ССЫЛОК!
        * Если ссылки указывают на один и тот же объект, оператор сравнения возвращает true,
        * иначе - false.*/
        System.out.print("\nПростое сравнение объектов object1 и object2: ");
        System.out.println(object1 == object2);//false
        System.out.print("Простое сравнение объектов object2 и object3: ");
        System.out.println(object2 == object3);//true

        /*Создаём два одинаковых объекта строкового типа.*/
        String str1 = new String("asdf");
        String str2 = new String("asdf");

        /*Объекты разные, а хэш-коды совпадают, т.к. для класса String хэш-код
        * полностью определяется содержимым объекта, то есть символьной строкой.
        * Если совпадает строка, то считается, что объекты одинаковые*/
        System.out.println("\nHashCode из str1: " + str1.hashCode());
        System.out.println("HashCode из str2: " + str2.hashCode());

        System.out.print("\nМетод equals для str1 и str2 типа String: ");
        System.out.println(str1.equals(str2));//true

        System.out.print("\nСравнение хэш-кодов str1 и str2 типа String: ");
        System.out.println(str1.hashCode() == str2.hashCode());//true

        /*Простое сравнение, как и в случае с остальными классами, сравнивает
        * объектные ссылки. В данном случае имеем два объекта, поэтому false!*/
        System.out.print("\nПростое сравнение объектов str1 и str2: ");
        System.out.println(str1 == str2);//false

    }
}