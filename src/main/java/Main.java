import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator goodsCalc = new Calculator();
        //количество человек
        goodsCalc.setNumber();
        //добавление товаров
        goodsCalc.setProducts();
    }
}