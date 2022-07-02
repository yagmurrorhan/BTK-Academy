public class Main {

    public static void main(String[] args) {
        sayiBulmaca(); // java'da main metodu çalışır ve çalışan diğer programlar main metodunun dallarıdır.
        // çalıştırmak istediğimiz metodu main metodunun içinde çağırmamız gerekir.
        //farklı ekranlarda çalışırken kodu sürekli olarak değiştirmek pratik bir çözüm değildir bu nedenle
        //her yerde kullanabileceğimiz ve değişikliklere cevap verebilecek fonksiyonlar yazarız; böylece kendimizi tekrar etmemiş oluruz.
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("Sayı Mevcuttur: " + aranacak);
        } else {
            mesajVer("Sayı Mevcut değildir: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
