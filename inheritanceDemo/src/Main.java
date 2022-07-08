public class Main {

    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        /*
        krediUI üzerinden istersek OgretmenKrediManager'ı istersek TarimKrediManager'i çağırabiliriz.
        Çağrımızı yaptıktan sonra kredi türünü hesaplayabiliriz.
        Çünkü biz KrediUI'a parametre olarak BaseKrediManager'ı verdik. Hem Ogretmen hem de Tarim KrediManager'ları BaseManager'i
        extend ettikleri için, KrediUI her iki krediManager'a BaseKrediManager üzerinden erişebiliyor.
         */
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
        /*
        Burada, polymorphism'in bir örneğini görüyoruz. Metot, aldığı parametreye göre farklı çıktı üretir.
         */
    }
}
