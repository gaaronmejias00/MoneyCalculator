package View.userInterface;

import Model.Money;

public class MoneyViewer {

    public void show(Money money) {
        System.out.println(money.getAmount() + " " + money.getCurrency().getCode());
    }
}