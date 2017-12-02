package StepicBooleanOperations;

/*ЗАГРУЗКА, ИНИЦИАЛИЗИЯ И ПРОЧ.
* MAIN-КЛАСС СОДЕРЖИТ PSVM, ЭТО ТОЧКА ВХОДА В ПРОГРАММУ
* ИЗ PSVM МОЖНО СОЗДАТЬ ЭКЗЕМПЛЯР ЭТОГО ЖЕ КЛАССА
* КАК ЭТО РАБОТАЕТ ВНУТРИ*/
class StepicBooleanOperations {
    public static void main(String[] args) {
        //здесь почему-то дважды вызывается метод pervDisjunktion
        System.out.print("Проверка для 1100 (true): ");
        new OperationClass(true, true, false, false);

        //System.out.println("Проверка для 1100 (true): " + new OperationClass(true, true, false, false));
        System.out.println("Проверка для 0011 (true): " + new OperationClass(false, false, true, true));
        System.out.println("Проверка для 1111 (false): " + new OperationClass(true, true, true, true));
        System.out.println("Проверка для 0000 (false): " + new OperationClass(false, false, false, false));
        System.out.println("Проверка для 1010 (true): " + new OperationClass(true, false, true, false));
        System.out.println("Проверка для 0101 (true): " + new OperationClass(false, true, false, true));
        System.out.println("Проверка для 1001 (true): " + new OperationClass(true, false, false, true));
        System.out.println("Проверка для 0110 (true): " + new OperationClass(false, true, true, false));
        System.out.println("Проверка для 1110 (false): " + new OperationClass(true, true, true, false));
        System.out.println("Проверка для 1101 (false): " + new OperationClass(true, true, false, true));
        System.out.println("Проверка для 1011 (false): " + new OperationClass(true, false, true, true));
        System.out.println("Проверка для 0111 (false): " + new OperationClass(false, true, true, true));
        System.out.println("Проверка для 1000 (false): " + new OperationClass(true, false, false, false));
        System.out.println("Проверка для 0100 (false): " + new OperationClass(false, true, false, false));
        System.out.println("Проверка для 0010 (false): " + new OperationClass(false, false, true, false));
        System.out.println("Проверка для 0001 (false): " + new OperationClass(false, false, false, true));
    }
}

