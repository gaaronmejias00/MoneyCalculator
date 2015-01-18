package Model;

import java.util.Calendar;

public class ExchangeRate {
    private final Currency fromCurrency;
    private final Currency toCurrency;
    private final float rate;
    private Calendar date;

    public ExchangeRate(Currency fromCurrency, Currency toCurrency, float rate, Calendar Date) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.rate = rate;
        this.date = date;
    }

    public ExchangeRate(Currency from, Currency to, Calendar date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Calendar getDate() {
        return date;
    }

    public float getRate() {
        return rate;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    @Override
    public String toString() {
        return "fromCurrency: " + this.fromCurrency
                + " toCurrency: " + this.toCurrency
                + " date: " + this.date.get(Calendar.YEAR) + "-" + this.date.get(Calendar.MONTH) + 1 + "-" + this.date.get(Calendar.DAY_OF_MONTH)
                + " rate: " + this.rate;
    }
    
    
}
