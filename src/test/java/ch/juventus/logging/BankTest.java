package ch.juventus.logging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    public static final float AMOUNT = 10.0f;
    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    void shouldReturn0WhenInitialized() {
        // When
        float balance = bank.retrieveBalance();

        // Then
        assertEquals(0, balance, "Invalid unmodified balance");
    }

    @Test
    void shouldReturnMinusTenWhenWithdrawed() {
        // When
        bank.withdraw(AMOUNT);

        // Then
        float balance = bank.retrieveBalance();
        assertEquals(AMOUNT * -1, balance, "Invalid balance after withdrawal");
    }

    @Test
    void shouldReturnTenWhenDeposit() {
        // When
        int depositCount = 3;
        for (int i = 0; i < depositCount; i++)
        {
            bank.deposit(AMOUNT);
        }

        // Then
        float balance = bank.retrieveBalance();
        assertEquals(AMOUNT * 3, balance, "Invalid balance after deposition");
    }
}