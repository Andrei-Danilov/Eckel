
public class HashEquals {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println("HashCode for object1");
        for (int i = 0; i < 10; i++) System.out.println(object1.hashCode());
        System.out.println("HashCode for object2");
        for (int i = 0; i < 10; i++) System.out.println(object2.hashCode());
    }
}
