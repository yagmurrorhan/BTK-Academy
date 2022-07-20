import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>();
        //Key,Value değerleri String,String--String,Integer--Integer,String--Integer,Ingeter olabilir.
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        System.out.println(sozluk.size());

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman-" + item + " Değer-" + sozluk.get(item));
        }

        sozluk.remove("table");
        sozluk.clear();

        System.out.println(sozluk);
        System.out.println(sozluk.get("table"));
    }
}
