package lab2;
/*
Создать класс Calculator. У него должны быть методы:
-	Сумма
-	Деление
-	Умножение
-	Вычитание
Все методы должны быть перегружены и работать с
    тремя типами данных- double, long и int.
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(39,99));
        System.out.println(divide(81.0,9));
        System.out.println(multiply(7L,3));
        System.out.println(extract(67.2,4));
    }
    static double add(double num1, double num2) {
        return num1 + num2;
    }
    static int add(int num1, int num2) {
        return num1 + num2;
    }
    static long add(long num1, long num2) {
        return num1 + num2;
    }
    static double divide(double num1, double num2) {
        return num1 / num2;
    }
    static int divide(int num1, int num2) {
        return num1 / num2;
    }
    static long divide(long num1, long num2) {
        return num1 / num2;
    }
    static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    static long multiply(long num1, long num2) {
        return num1 * num2;
    }
    static double extract(double num1, double num2) {
        return num1 - num2;
    }
    static int extract(int num1, int num2) {
        return num1 - num2;
    }
    static long extract(long num1, long num2) {
        return num1 - num2;
    }

}
