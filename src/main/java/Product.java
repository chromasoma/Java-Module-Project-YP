import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    public void setProduct()
    {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Введите название товара:");
            name = scanner.nextLine().trim(); // исправлено
            if (name == null || name.isEmpty())
            {
                System.out.println("Неверное значение! Попробуйте еще раз.");
            }
            else {
                break;
            }
        }
        System.out.println("Введите стоимость товара:");
        String temp;
        while(true)
        {
            try
            {
                temp = scanner.nextLine().trim();
                price = Double.parseDouble(temp);
                if (price <= 0) {
                    throw new Exception("Некорректные данные!");
                }
                Formatter f = new Formatter();
                String[] s = new String[4];
                s = f.getRublesAndKopecks(price);

                System.out.println(String.format("Товар %s с ценой %d %s %d %s успешно добавлен!",name, s[0], s[1], s[2], s[3]));
                break;
            }
            catch (Exception e)
            {
                System.out.println("Неверное значение! Попробуйте еще раз.");
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