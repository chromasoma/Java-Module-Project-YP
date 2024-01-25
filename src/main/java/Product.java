import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    public void setProduct()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название товара:");
        name = scanner.nextLine(); // исправлено

        System.out.println("Введите стоимость товара:");
        String temp;
        while(true)
        {
            try
            {
                temp = scanner.nextLine().trim();
                price = Double.parseDouble(temp);
                if (price < 0) {
                    throw new Exception("Некорректные данные!");
                }
                Formatter f = new Formatter();
                String[] s = new String[4];
                s = f.getRublesAndKopecks(price);

                System.out.println("Товар " + name + " с ценой " + s[0]
                        + s[1]
                        + s[2] + s[3] + " успешно добавлен!\n");
                break;
            }
            catch (Exception e)
            {
                System.out.println("Неверное значение! Попробуйте еще раз.");
                //scanner.nextLine();
                continue;
            }

        }
    }

    public void setName(String n)
    {
        name = n;
    }
    public void setPrice(double c)
    {
        price = c;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
}
