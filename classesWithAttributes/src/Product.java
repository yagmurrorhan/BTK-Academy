public class Product {
    //Method overloading: Constructor ile sıklıkla yapılır. Aynı isimdeki metodu, parametrelerini değiştirerek kullanmak demektir. Buna aşırı yükleme denir.
    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.renk = renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product() {

    }

    //attribute | field
    private int id;
    String name;
    String description;
    double price;
    int stockAmount;
    String renk;
    String kod;

    /*
    Product sınıfı sadece attribute'ları tutmalıdır, yanı sıra metotları tutmamalıdır.
    Aksi durumda bu sınıf Solid prensiplerine aykırı şekilde oluşturulmuş olur.
    Her sınıfın, metodun, iş bloğunun sadece bir görevi olmalıdır.
    */

    /*
    Product sınıfına ve sınıfa ait verilere dışarıdan erişim mümkündür çünkü sınıf belirtildiği üzere public işaretlenmiştir.
    attributelar herhangi bir keyword ile işaretlenmemiştir fakat default olarak onlar da public'tir.
    private işaretlersek sadece tanımlandığı blokta geçerli kılar. Yani, private işaretlediğimiz alanı sadece "read only" yaparız.
    Kullanıcı o bilgiyi sadece okuyabilir, ama üzerine yazamaz veya değiştiremez anlamına gelir.
    Tüm bu özellikler, yani access modifierlar, bize ENCAPSULATION özelliğini gerçekler!!!
    */

    //getter
    //get() metodu read only özelliğine sahiptir.
    public int getId() {
        return id;
    }

    //setter
    //set() metodu write only özelliğine sahiptir. Düzenleme yapmamızı sağladığı için geriye değer döndürmez, o yüzden void bir metottur.
    public void setId(int id) {
        this.id = id;
        //this.id=içinde bulunduğu product sınıfına ait id attribute'udur.
        //id= metoda parametre olarak verdiğimiz id'dir.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
