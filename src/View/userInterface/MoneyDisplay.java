package View.userInterface;

import Model.MyNumber;
import Model.Money;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MoneyDisplay implements MoneyDialog {

    private Money money;
    
    public void execute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (money == null) {
            System.out.println("Insert amount: ");
            String amount = " ";
            while (amount.equals(" ")) {
                try {
                    amount = reader.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(MoneyDisplay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            CurrencyDialog currencyDialog = new ExchangeDialog();
            currencyDialog.execute();
            MyNumber number = new MyNumber(Float.parseFloat(amount));
            money = new Money(number, currencyDialog.getCurrency());
        }
    }

    
    public Money getMoney() {
        return this.money;
    }
}