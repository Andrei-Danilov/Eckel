package StaticMethod;

static class Banana {
    static String bananaColour = "yellow";

    static void peel(String s) {
        if (s == "completely")
            System.out.println("Банан очищен полностью");//очистить банан полностью (при s = "completely")
        else
            System.out.println("Банан очищен наполовину");//очистить банан наполовину (при s = "half")

    }
}
//Статический метод имеет доступ к нестатическим полям объекта, созданного внутри этого метода.
//Но никак не к нестатическим полям своего класса, т.к. нестатические поля на момент связывания метода
//ещё не реализованы???