import java.util.ArrayList;

public class Formatter
{
    public String getRubles(int r)
    {
        if ((r % 10) == 1)
            return " рубль ";
        else if ((r % 10)>=2 && (r % 10)<=4)
            return " рубля ";
        else
            return " рублей ";
    }
    public String[] getRublesAndKopecks(double price)
    {
        int rInNum; String rInWords;
        int kInNum; String kInWOrds;
        String partOne;
        String partTwo;

        String[] parsesParts = String.valueOf(price).split("\\.");
        rInNum = Integer.parseInt(parsesParts[0]);
        if (!parsesParts[1].substring(0,1).equals("0"))
        {
            kInNum = Integer.parseInt(parsesParts[1])*10;
        }
        else
        {
            kInNum = Integer.parseInt(parsesParts[1]);
        }

        if ((rInNum % 10) == 1)
            rInWords = " рубль ";
        else if ((rInNum % 10)>=2 && (rInNum % 10)<=4)
            rInWords = " рубля ";
        else
            rInWords = " рублей ";

        if ((kInNum % 10) == 1)
            kInWOrds = " копейка ";
        else if ((kInNum % 10)>=2 && kInNum % 10 <=4)
            kInWOrds = " копейки ";
        else
            kInWOrds = " копеек ";

        String[] res = {Integer.toString(rInNum), rInWords, Integer.toString(kInNum), kInWOrds};
        return res;
    }
}
