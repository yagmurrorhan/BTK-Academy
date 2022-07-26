public class Main {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap = " + manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap = " + manager.getBalance());
        try {
            manager.withdraw(90);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap = " + manager.getBalance());
        try {
            manager.withdraw(20);//Bu noktada hesaptan para çekildiğinde -10 TL kalmaması gerekir.Bunu exception ile hallederiz.
        } catch (BalanceInsufficientException e) {
            e.getMessage();
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap = " + manager.getBalance());

    }
}
