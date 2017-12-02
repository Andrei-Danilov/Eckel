class Mouse {
    int age = 35;                                     //нестатическая переменная
    static int mouseCount;             //статическая переменная

    public int nonstatMouseAge() {             //нестатический метод
        return age;
    }
}
class MouseCaller{
    static int st = 0;
    MouseCaller(){
        callingNonStatic();
        }
        String gettingThis(){
        return this.toString();
    }
        static void callingNonStatic(){
            //ошибка компиляции, т.к. нестатика недостижима до создания экземпляра
            //System.out.println(mouse.nonstatMouseAge());
            Mouse mouse = new Mouse();
            System.out.println(mouse.nonstatMouseAge());
        }
    }
    public class xPeHb {
    //нестатический метод за пределами main()
    void check(){
        System.out.println("Срабатывает нестатический метод за пределами main()");
        }
        public static void main(String[] args) {
            Mouse mouse = new Mouse();
//вызываем нестатический метод nonstatMouseAge() из статического main()
            int mouseAge = mouse.nonstatMouseAge();
            System.out.println(mouseAge);
            //создаём объект класса, содержащего статический метод
            MouseCaller mouseCaller = new MouseCaller();
            //вызываем статический метод в виде «объект» точка «имя метода»
            mouseCaller.callingNonStatic();
            System.out.println(mouseCaller.gettingThis());
            //создаём объект "главного" класса
            //xPeHb fignia = new xPeHb();
            //вызываем нестатический метод описаный за пределами main()
            //fignia.check();

        }
    }
