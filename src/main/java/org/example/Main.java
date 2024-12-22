package org.example;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, "Rafal", 200);
        Account account2 = new Account(2, "Micael", 200);
        try {
            account1.transfer(account2, 300);
        }
        catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e2) {
            System.out.println(e2.getMessage());
        }
        finally {
            System.out.println("Account1's balance: " + account1.getBalance());
            System.out.println("Account2's balance: " + account2.getBalance());
        }

    }
}