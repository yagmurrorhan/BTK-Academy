public class Main {

    public static void main(String[] args) {
        String mesaj = "   Bugün hava çok güzel.   ";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("5'inci eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];// mesaj ın ilk 5 karakterini okumak için o karakterleri bir char[] 'a aktarıp oradan okuyoruz.
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));//indexOf, belirttiğimiz karakterin kaçıncı sırada olduğunu gösterir.İlk bulduğu a da aramayı bitirir.
        System.out.println(mesaj.lastIndexOf("a"));*/

        String yeniMesaj = mesaj.replace(' ', '-');//Boşluk olan yerlere - işaretini ekledi.
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5));//2'inci indexten itibaren 4'e kadar parçalayarak okuma yaptı.

        for (String kelime : mesaj.split(" ")) {// Split, belirtiğimiz karaktere göre ayırarak alt alta yazar.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());//Başındaki ve sonundaki boşlukları siler.
    }
}
