package entities;

public class CurrencyConverter {
    public static final double iof = 1.06;

    public static double converter(double dolar, double dolares){
        return dolar * dolares * iof;
    }
}
