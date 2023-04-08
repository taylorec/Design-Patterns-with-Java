/*
The purpose of this design pattern is to ensure there is only one instance of
the class, and it must be externally accessible.

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/ebd34ade-8980-403b-9141-9fae359953ba.png
 */

public class CreateBankAccount {

    private static CreateBankAccount newAccount;

    // constructor
    private CreateBankAccount() {

    }

    public static CreateBankAccount getNewAccount() {
        if (newAccount == null) {
            newAccount = new CreateBankAccount();
            System.out.println("New Account created.");
        } else {
            System.out.println("Account already opened.");
        }
        return newAccount;
    }
}
