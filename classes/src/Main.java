public class Main<sayi1> {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();//Bir sınıftan bir metod çağırırken öncelikle o sınıf türünde bir nesne yaratmak gerekir.Daha sonra, o nesneyi tanımlayan metotlar kullanılabilir.
        CustomerManager customerManager2 = new CustomerManager();
        // customerManager = customerManager2; customerManager, bellekte ilk oluşturulduğu referans numarasını göstermez, customerManager2'nin referans numarasını gösterir.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

/*Classlar reference type'dır. Bir dğeişken tanımlandığında bellekte o nesne için alan oluşturulur.
Yukarıda oluşturduğumuz customerManager nesnesi, oluşturulduğu andan itibaren stack'te yer(referans) tutmaya başlar başlar.
new CustomerManager ise stackte referansı tutulan customerManager nesnesini heap'te oluşturur.
Eğer, heapte var olan bir nesne stackteki bir referansı işaret etmiyorsa Garbage Collector devreye girer ve heapteki o nesneyi heapten siler.
Bellekte bir nesneyi oluşturmak(new'lemek) maaliyetlidir, dolayısıyla sadece ihtiyaç duyulduğunda bu yönteme başvurulmalıdır.
 */

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);


/*primitiveler(int,float,double..) value type'tır.
value typelar stackte oluşur heaple işleri yoktur.
int[] gibi diziler ise reference type'dır! Bu yüzden, 28'inci satırın çıktısı 10'dur!
 */

    }
}



