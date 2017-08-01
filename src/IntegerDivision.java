public class IntegerDivision {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        System.out.println("Оператор деления / возвращает целый результат, если оба операнда целые:");
        System.out.println("6/5 = " + a/b);
        double c = 6;
        double d = 5;
        System.out.println("Оператор деления / возвращает дробный результат, если хотя бы один из операндов дробный:");
        System.out.println("6/5 = " + c/b + " = " + a/d);
    }
}
