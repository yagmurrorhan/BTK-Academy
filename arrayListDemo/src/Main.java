import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3};
   /* numbers[3] = 4;
   Burada hata alırız çünkü dizilerin boyutu ilk oluşturulduklarında belirtilir ve bu boyutu aşmak mümkün değildir.
   Bu türde bir kullanıma ihtiyacımız varsa collectionları kullanırız.
   Collectionlar içerisinde yer alan ArrayList, Array'lerden oluşan bir topluluktur ve arka planda bu array'leri yönetir.
   Daha önceden tanımlanan array'i yedekte tutar ve yeni bir istek doğrultusunda yedekte tuttuğu array'e ekleme yaparak yeni bir array oluşturur.
    */
        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //ArrayList, içerisine her türden objeyi alabilir, tek tip objeler barındıran bir yapı değildir.
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2));
        // sayilar.set(0,100);
        // sayilar.remove(0);
        //System.out.println(sayilar.get(0));//0'ıncı indexteki objeyi siler, dizideki kalan objeler bir index kadar sola kayar.
        //sayilar.clear(); // tüm elemanları siler.

        for (Object i : sayilar) {
            System.out.println(i);
        }
    }
}
