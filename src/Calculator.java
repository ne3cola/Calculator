import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {


        while (true) {
            System.out.println("Меню");
            System.out.println("1 - Решить пример");
            System.out.println("2 - Выход");
            int command = new Scanner(System.in).nextInt();

            if (command == 1) {
                System.out.println("Введите пример: ");
                String output = new Scanner(System.in).nextLine();
                String example = output.replaceAll(" ", "");
                String[] index = example.split("");
                int a = Integer.parseInt(index[0]);
                int b = Integer.parseInt(index[2]);
                int sum = 0;

                switch (index[1]) {
                    case "+" -> sum = a + b;
                    case "-" -> sum = a - b;
                    case "*" -> sum = a * b;
                    case "/" -> {
                        if (b == 0) {
                            System.out.println("На НОЛЬ делить нельзя!");
                        } else
                            sum = a / b;
                    }
                    default -> sum = -1;
                }
                System.out.println("Ответ: " + sum);
            } else if (command == 2) {
                System.out.println("Досвидание!");
                break;
            } else
                System.out.println("Вы ввели что-то не так!");
        }
    }
}
