import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ifMoreThanSevenThenHello(number);


        Scanner scanner2 = new Scanner(System.in);
        String name = scanner2.nextLine();
        forNames(name);


        Scanner scanner3 = new Scanner(System.in);
        int size = scanner3.nextInt();
        forArrays(size);
    }

    public static void ifMoreThanSevenThenHello(int number) {


        if (number > 7) {
            System.out.println("Привет");
        }
    }

    public static void forNames(String name) {

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }


    public static void forArrays(int size) {
        int[] array = new int[size];
        Scanner scanner4 = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner4.nextInt();
        }
        for (int a : array) {

            if (a % 3 == 0) {
                System.out.println(a);
            }
        }


    }
}


