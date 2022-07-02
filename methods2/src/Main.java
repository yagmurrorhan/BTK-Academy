public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        //mesaj.substring(0,2); Bu haliyle konsolda bir mesaj göremeyiz, oluşturduğumuz mesajın bir mesaj olduğunu belirtmemiz ve atamasını yapmamız gerekir:
        // String yeniMesaj = mesaj.substring(0,2);// substring bir değer return eder. topla() String bir değer döndürseydi ide bize kızmazdı.
        //  System.out.println(yeniMesaj);
        //String yeniMesaj = topla(); Bu satırda ide bize kızar çünkü topla() int değer döndürürken yeniMesaj String bir ifade bekler.
        String yeniMesaj2 = sehirVer(); // Bu satırda ide bize kızmaz çünkü sehirVer String bir ifade döndürür ve yeniMesaj2 String bir ifade bekler.
        System.out.println(yeniMesaj2);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        int toplam = topla2(2, 3, 4, 5, 10);//istediğimiz kadar parametre belirtebiliriz.
        System.out.println(toplam);
    }

    //void metodlar geriye değer döndürmez, sadece yapmasını istediğimiz işi yaparlar. Aşağıdaki örnekte, ekrana birşey yazdıktan sonra bize bir değer vermezler.
    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void güncelle() {
        System.out.println("Güncellendi");

    }

    //bu bir void metot değildir, int metottur. Yani, bu metot, int türünde bir değer return eder demektir.
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2; // programı bitirirken 5 değerini döndürür ve sonlandırır. Sonlandırdıktan sonra bu metot farklı bir iş yapmaz.

    }

    //variable argument: metodun belirlediğimiz parametre sayısı kadar ile çalışması yerine o an ihtiyacımız doğrultusundaki kadar parametre
    //ile çalışabilmesini sağlar. Bunu da metodun parametresini belirlemek yerine türünü(aşağıdaki örnekte int) verip bitişiğine 3 nokta(...)
    //ekleyerek belirtiriz: int...
    //bu yapı aslında bir int[] gibi çalışır.
    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }

}
