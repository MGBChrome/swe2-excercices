package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankApp {
    final static Logger logger = LoggerFactory.getLogger(BankApp.class);
    public static final float AMOUNT = 10.0f;

    public static void main(String[] args) {
        logger.info("App started");

        Bank bank = new Bank();

        bank.withdraw(AMOUNT);

        float balance = bank.retrieveBalance();

        int depositCount = 3;
        for (int i = 0; i < depositCount; i++)
        {
            bank.deposit(AMOUNT);
        }

        bank.retrieveBalance();

        logger.info("App finished");
    }
}
