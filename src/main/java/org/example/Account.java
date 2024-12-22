package org.example;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
    private int accountNumber;
    private String Owner;
    private int balance;

    public void transfer(Account destination, int amount) throws NotEnoughMoneyException {
        if (balance >= amount) {
            balance -= amount;
            destination.balance += amount;
        } else {
            throw new NotEnoughMoneyException();
        }
    }

}
