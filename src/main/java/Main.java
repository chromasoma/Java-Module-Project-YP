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

            String parse = String.valueOf(price);

            String[] parsesParts = parse.split("\\.");

            System.out.println("Товар " + product + " с ценой " + parsesParts[0]
                    + (((Integer.parseInt(parsesParts[0]) >=0 && Integer.parseInt(parsesParts[0]) <=4) ) ? " рубля " : " рублей ")
                    + parsesParts[1] + " копеек " + " успешно добавлен!\n");

            //2) Полученный товар должен быть добавлен в калькулятор.
            goods.addProduct(product, price);

        }

    }
}