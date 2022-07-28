import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sehirler = new ArrayList();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add(1);
        /*Default ArrayList parametre olarak Obje ister, tip güvenli değildir.
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Ankara");
        cities.add(1); Tip güvenli hale getirdiğimizde parametre olarak verdiğimiz parametre türünde bir nesneyi kabul eder. Bu satırı kabul etmez.
*/
        MyList<String> countries = new MyList<>();
        countries.add("Ankara");
        // countries.add(1);

        MyList<Customer> customers = new MyList<>();
        customers.add(new Customer());
        customers.add(new Customer());

    }
}
