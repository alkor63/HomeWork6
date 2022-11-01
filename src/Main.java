public class Main {
    public static void main(String[] args) {
// Выводим в консоль все числа от 1 до 10
        System.out.println("*  Выводим в консоль все числа от 1 до 10  *");
        int i;
        for (i = 1; i <= 10; i++)
            System.out.println("i = "+i);
// Выводим в консоль все числа от 10 до 1
        System.out.println("*  Выводим в консоль все числа от 10 до 1  *");
        for (i = 10; i > 0; i--)
            System.out.println("i = "+i);
// Выводим в консоль все четные числа от 0 до 17
        System.out.println("*  Выводим в консоль все четные числа от 0 до 17  *");
        for (i = 0; i < 17; i +=2)
            System.out.println("i = "+i);
// Выводим в консоль все числа от 10 до -10
        System.out.println("*  Выводим в консоль все числа от 10 до -10  *");
        for (i = 10; i >= -10; i--)
            System.out.println("i = "+i);
// часть 2
// Выводим в консоль все високосные года диапазона
        System.out.println("*  Все високосные годы с 1904 по 2096  *");
        for (int year = 1904; year <= 2096; year +=4)
            System.out.println("год "+ year +" является високосным");
// Выводим в консоль все числа от 7 до 98 с шагом 7
        System.out.println("*  Выводим ряд чисел с шагом 7  *");
        for (i = 7; i <= 98; i +=7)
            System.out.println("i с шагом 7 = "+i);
// Выводим в консоль геометрическую прогрессию от 1 до 512
        System.out.println("*  Выводим геометрическую прогрессию чисел от 1 до 512  *");
        for (i = 1; i <= 512; i *=2)
            System.out.println("удвоенное i = "+i);
// часть 3
// Копим деньги под подушкой
        System.out.println("*  Накапливаем под подушкой по 29000 рублей в месяц  *");
        int salary = 29000;
        for (int month = 1; month <= 12; month++)
            System.out.println("месяц "+month+" - сумма накоплений = "+ salary * month);
// Храним деньги в банке под 12% годовых (1% в месяц)
        System.out.println("*  Накапливаем по 29000 рублей в месяц на банковском вкладе под 12% годовых  *");
        double summa = 0;
        for (int month = 1; month <= 12; month++) {
            summa = (summa + salary) * 1.01;
            System.out.println("месяц " + month + " - сумма накоплений = " + summa);
        }
    }
}