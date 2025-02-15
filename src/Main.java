/*ТЕСТОВАЯ ЗАДАЧА “КАЛЬКУЛЯТОР”
Описание:
Создай консольное приложение “Калькулятор”.
Приложение должно читать из консоли введенные пользователем
 строки, числа, арифметические операции проводимые между ними и выводить в консоль результат их выполнения.
Реализуй класс Main с методом public static String calc(String input).
Метод должен принимать строку с арифметическим выражением между двумя числами
и возвращать строку с результатом их выполнения.
Ты можешь добавлять свои импорты, классы и методы. Добавленные классы не должны иметь модификаторы доступа (public или другие)

Требования:
Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.
 Данные передаются в одну строку (смотри пример)!
 Решения, в которых каждое число и арифметическая операция передаются с новой строки считаются неверными.
Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.
На выходе числа не ограничиваются по величине и могут быть любыми.
Калькулятор умеет работать только с целыми числами.
При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций,
приложение выбрасывает исключение и завершает свою работу.
Результатом операции деления является целое число, остаток отбрасывается.
Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.*/



import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner cs = new Scanner(System.in);
        System.out.println("Введите выражение в соответствии с требованиями");
        String input = cs.nextLine();

        System.out.println(calc(input));

    }

    public static String calc (String input) throws Exception
    {

        int x = 0;
        int y = 0;

        input = input.replaceAll(" ","");

        String[] inputExpession = input.split("[+\\-*/]");



        if (inputExpession.length != 2) {
            throw new Exception(" формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)\n");
        }

        if (Integer.parseInt(inputExpession[0]) < 1 || Integer.parseInt(inputExpession[0]) > 10) {
            throw new Exception("операнд не соответствует требованиям");
        } else if (Integer.parseInt(inputExpession[1]) < 1 || Integer.parseInt(inputExpession[1]) > 10 ){
            throw new Exception("операнд не соответствует требованиям");
        } else {

            x = Integer.parseInt(inputExpession[0]);
            y = Integer.parseInt(inputExpession[1]);
        }



        int res = 0;
        String output;
        if (input.contains("+")) {
            res = x + y;

        } else if (input.contains("-")) {
            res = x - y;
        } else if (input.contains("*")) {
            res = x * y;
        } else if (input.contains("/")) {
            res = x / y;
        }

        return output = "" + res;
    }
}
