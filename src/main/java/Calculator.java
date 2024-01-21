import java.util.HashMap;

public class Calculator {

    private double sum = 0;
    private int number;
    Calculator(int n)
    {
        number = n;
    }
    HashMap<String, Double> map = new HashMap<>();
    public String rublesStr(int r)
    {
        if ((r % 10) == 1)
            return " рубль ";
        else if ((r % 10)>=2 && (r % 10)<=4)
            return " рубля ";
        else
            return " рублей ";
    }
    public void printAll()
    {
        System.out.println("Добавленные товары:");
        for (String key : map.keySet())
        {
            int r = (int)(map.get(key) - (map.get(key) % 1));
            String rr = rublesStr(r);

            System.out.println(key + " " + map.get(key) + rr);
        }
        System.out.println("Каждый человек должен заплатить " +
                String.format("%.2f", sum / number) + rublesStr((int)(sum / number)));
    }
    public double getPrice(String n)
    {
        return map.get(n);
    }
    public void changePrice(String n, double p) { map.put(n, p); }
    public void addProduct(String n, double p)
    {
        map.put(n, p);
        sum += p;
    }
    public double deleteProduct(String n) { return map.remove(n); }
    public double getSum() { return sum; }
}