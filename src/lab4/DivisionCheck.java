package lab4;

import java.util.Arrays;

/*
2.	Напишите программу, которая выводит числа от 1 до 100, которые делятся на
    3, 5 и на то и другое (то есть и на 3 и на 5). Пример вывода:

	Делится на 3: ….
	Делится на 5: ….
	Делится на 3 и на 5: ….
 */
public class DivisionCheck {
    public static void main(String[] args) {
        System.out.print("Делится на 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                i++;
            }
        }
        System.out.println();
        System.out.print("Делится на 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                i++;
            }
        }
        System.out.println();
        System.out.print("Делится на 3 и на 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                i++;
            }
        }
    }
}
