package APP;

import Controller.ExchangeOperation;
import Model.Currency;
import Model.CurrencySet;
import View.persistence.CurrencySetLoader;
import View.userInterface.ExchangeDialog;
import View.userInterface.MoneyDisplay;
import java.io.IOException;

public class App {
    public static void App (String[] args) throws IOException {
        CurrencySet currencies = CurrencySet.getInstance();
        MoneyDisplay consoleMoneyDialog = new MoneyDisplay();
        ExchangeDialog consoleCurrencyDialog = new ExchangeDialog();
        ExchangeOperation control = new ExchangeOperation(currencies, consoleMoneyDialog, consoleCurrencyDialog);
        control.execute();
    }
}