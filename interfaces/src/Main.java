public class Main {

    public static void main(String[] args) {
        // ICustomerDal customerDal = new OracleCustomerDal();
        //Interface, kendisini implement eden sınıfın referansını tutar. Yani, burada da polymorphism vardır.
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
