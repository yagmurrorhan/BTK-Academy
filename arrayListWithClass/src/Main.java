import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>(); // Customer türünde bir ArrayList oluşturduk.

        customers.add(new Customer(1, "Yağmur", "Orhan"));
        customers.add(new Customer(2, "Engin", "Demiroğ"));
        customers.add(new Customer(3, "Derin", "Demiroğ"));

       /* customers.remove((new Customer(3,"Derin", "Demiroğ"));
       Bu satır hatalı bir kullanımdır ve belirtilen datayı listeden silmez.
       new dediğimizde yeni bir referans numarası ile silmeyi istediğimiz datayı oluşturmuş oluruz ve ardından oluşturduğumuz
       bu datayı silmeye çalışırız. O yüzden listeden bir eleman silinmiş olmaz.
       Bu yüzden, bir Customer oluştururken :
       Customer engin = new Customer(1,"Engin", "Demiroğ");
       şeklinde oluşturulmalıdır. Bu datayı silmeye çalıştığımızda:
       customer.remove(engin);
       deriz ve aynı referans numarasına sahip olan engin adındaki Customer listeden silinmiş olur.
        */

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }

    }
}

