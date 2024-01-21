import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //количество человек
        while (true) {
            System.out.println("На скольких человек необходимо разделить счёт?");
            int number = scanner.nextInt();
            if (number <= 1)
            {
                System.out.println("Неверное значение! Попробуйте еще раз.");
            }
            else
            {
                break;
            }
        }
        //добавление товаров
        String product;
        double price;
        Calculator goods = new Calculator();

        while (true) {
            //1) Запросите у пользователя название товара и его стоимость. Стоимость должна быть в
            // формате рубли.копейки, например 10.45 или 11.40.

            System.out.println("Введите название товара:");
            product = scanner.next();

            System.out.println("Введите стоимость товара:");
            price = scanner.nextDouble();

            String[] parsesParts = String.valueOf(price).split("\\.");
            int r = Integer.parseInt(parsesParts[0]);
            int k;
            if (!parsesParts[1].substring(0,1).equals("0"))
            {
                k = Integer.parseInt(parsesParts[1])*10;
            }
            else
            {
                k = Integer.parseInt(parsesParts[1]);
            }

            String partOne;
            if ((r % 10) == 1)
                partOne = " рубль ";
            else if ((r % 10)>=2 && (r % 10)<=4)
                partOne = " рубля ";
            else
                partOne = " рублей ";

            String partTwo;
            if ((k % 10) == 1)
                partTwo = " копейка ";
            else if ((k % 10)>=2 && k % 10 <=4)
                partTwo = " копейки ";
            else
                partTwo = " копеек ";

            System.out.println("Товар " + product + " с ценой " + r
                    + partOne
                    + k + partTwo + " успешно добавлен!\n");

            //2) Полученный товар должен быть добавлен в калькулятор.
            goods.addProduct(product, price);

            System.out.println("Хотите ли Вы добавить еще один товар?");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("завершить"))
            {

                break;
            }
        }

    }
}