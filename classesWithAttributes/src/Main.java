public class Main {

    public static void main(String[] args) {
        //6-arguments constructor kullandığımızda bu şekilde ilgili parametreleri doldururuz.
        Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Siyah");
    /*
        No-arguments constructor kullanmak istediğimizde ilgiili alanları bu şekilde belirtip doldurmamız gerekir.
        Product product= new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(500);
        product.setStockAmount(3);

     */

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
