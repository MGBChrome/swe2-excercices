package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {
    final Logger logger = LoggerFactory.getLogger(Bank.class);
    private float balance;

    public float retrieveBalance() {
        logger.debug("balance retrieved: {}", balance);
        return balance;
    }

    public void withdraw(float amount) {
        logger.debug("withdrawed amount: {}", amount);
        balance -= amount;
        if(balance < 0)
        {
            logger.warn("Balance is negative");
        }
    }

    public void deposit(float amount) {
        logger.debug("deposited amount: {}", amount);
        balance += amount;
        if(balance > 20)
        {
            logger.info("You can buy a lunch now!");
        }
    }
}
