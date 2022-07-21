public class Main {

    public static void main(String[] args) {
        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[4]);//kod compile olur fakat çalışma anında hata alırız. Bu noktada kodları hata yönetimiyle beslememiz gerekir.
        } catch (Exception exception) {
            System.out.println("Hata oluştu.");
            System.out.println("Loglandı: " + exception);
        } finally {
            System.out.println("Ben her türlü çalışırım.");
            /*Finally bloğu her şekilde çalışır.
            Veritabanına bağlandık ve hata oluştu diyelim. Yine de veritabanına
            bağlandıktan sonra bağlantıyı kapatmak gerekir. Bu işlemi finally bloğu
            ile gerçekleştiririz(hata olsa da olmasa da).*/
        }
    }
}
/*
Exception Handling: Uygulama çalışırken alınacak hatalardır.
Kod build olur, ortaya çalışan bir byte code oluşur fakat çalışma anında
belli değerlere göre sıkıntılar oluşuyorsa hata yönetimine ihtiyaç duyarız.
 */
