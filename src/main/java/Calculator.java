import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    private double sum = 0;
    private int number;

    ArrayList<Product> goods = new ArrayList<>();
    public void setNumber()
    {
        Scanner scanner = new Scanner(System.in);
        String temp;
        System.out.println("На скольких человек необходимо разделить счёт?");
        while (true) {
            try
            {
                temp = scanner.nextLine().trim();
                //System.out.println("1"+temp+"2");
                number = Integer.parseInt(temp);
                if (number <= 1 || !temp.matches("^[0-9]+$"))
                {
                    throw new Exception("Неверное значение! Попробуйте еще раз.");
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Неверное значение! Попробуйте еще раз.");
                continue;
            }
        }
    }
    public void setProducts()
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //1) Запросите у пользователя название товара и его стоимость. Стоимость должна быть в
            // формате рубли.копейки, например 10.45 или 11.40.

            Product product = new Product();
            product.setProduct();
            sum += product.getPrice();
            goods.add(product);

            System.out.println("Хотите ли Вы добавить еще один товар?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("завершить"))
            {
                this.printAll();
                break;
            }
        }
    }

    public void printAll()
    {
        Formatter f = new Formatter();

        System.out.println("Добавленные товары:");
        for (Product g: goods)
        {
            int r = (int)(g.getPrice() - (g.getPrice() % 1));
            String rr = f.getRubles(r);

            System.out.println(g.getName() + " " + g.getPrice() + rr);
        }
        System.out.println("Каждый человек должен заплатить " +
                String.format("%.2f", sum / number) + f.getRubles((int)(sum / number)));
    }

    public void addProduct(Product p)
    {
        goods.add(p);
        sum += p.getPrice();
    }
    public boolean deleteProduct(Product p) { return goods.remove(p); }
    public double getSum() { return sum; }
}