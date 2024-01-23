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
        while(true)
        {
            try {
                price = scanner.nextDouble();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Неверное значение! Попробуйте еще раз.");
                scanner.next();
                continue;
            }
        }

        Formatter f = new Formatter();
        String[] s = new String[4];
        s = f.getRublesAndKopecks(price);

        System.out.println("Товар " + name + " с ценой " + s[0]
                + s[1]
                + s[2] + s[3] + " успешно добавлен!\n");
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
