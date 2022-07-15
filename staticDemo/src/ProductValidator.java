public class ProductValidator {
    static {
        System.out.println("Static yapıcı blok çalıştı.");
    }

    //Yapıcı bloklar new'lenerek çalışırlar. Bir yapıcı bloğu new'lemeden çalıştırmak istiyorsak static yapıcı blok kullanırız.
    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı.");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public void bisey() {

    }

    /*Ana class asla static olamaz. Bir sınıfın static olmasını istiyorsak ana class içerisine static olan bir inner class açabiliriz.
    public static class Class {
        public static void Sil() {

        }
    }

     */
}
