package StepicBooleanOperations;

public class OperationClass {
    OperationClass(boolean a, boolean b, boolean c, boolean d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        //pervDisjunktion();
    }
    boolean a, b, c, d;
    void pervDisjunktion() {
        System.out.println("pervDisjunction печатает " + (((a ^ b) && (c ^ d)) ^ (((a && b) ^ (c && d)) && ((a ^ c) && (b ^ d)))));
    }
}
