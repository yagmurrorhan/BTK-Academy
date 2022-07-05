public class ProductManager {
    public void Add(Product product) {
        //JDBC ile veri tabanına kaydedilecek yer.
        System.out.println("Ürün eklendi " + product.name);
    }

    public void Add2(int id, String name, String description, int stockAmount, double price) {
/* Bu metod kullanımı doğru olmayan bir yöntemdir. Çünkü, birden fazla ekranda bu metodu kullandığımız bir senaryoda,
ürüne ekleyeceğimiz yeni bir değişiklik isteği gelmesi halinde, ilgili tüm ekranlara gidip tek tek değişikliği uygulamamız gerekir.
Gelen değişiklik isteklerine cevap vermesi açısından, Add2() metodu yerine Add() metodunun kullanılması daha doğrudur.
* */

    }
}
