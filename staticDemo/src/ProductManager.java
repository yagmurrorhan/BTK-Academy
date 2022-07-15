public class ProductManager {
    public void add(Product product) {
        // ProductValidator validator = new ProductValidator();
        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi.");
        } else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }

        // ProductValidator productValidator = new ProductValidator();
        //productValidator.bisey();

    }
    /* 4'üncü satırdaki if (ProductValidator.isValid(product) satırında
    ProductValidator.isValid diyebilmemiz için ProductValidator sınıfındaki metodu static yapmak zorundayız.
    static ifadesi bu nesnenin örneğini oluşturur fakat bir defa oluşturur. Araç amacıyla kullanacağımız
    yapılarda static keyword'ü sıklıkla kullanılır.
    static ifadeler uygulama sonlandırılana kadar bellekte kalır.
    ilk çağıran kullanıcı nesneyi oluşturur ve sonraki tüm kullanıcılar aynı nesneyi kullanıyor anlamına gelir.
    Manager sınıfları static yapılmazken araç olarak kullandığımız sınıflar static yapılır.
    bir metodu static yaptığımızda o metot class ismiyle direkt çağrılır.
     */

}
