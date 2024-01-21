import java.util.HashMap;

public class Calculator {

    private double sum = 0;
    HashMap<String, Double> map = new HashMap<>();
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
