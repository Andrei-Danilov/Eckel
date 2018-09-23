package StaticMethod;

public class BananaPeel {
    static Banana derBanan = new Banana();
    public static void main(String[] args) {
        Banana banana = new Banana();
        Banana.peel("completely");
        System.out.println(banana.bananaColour);

    }
}
