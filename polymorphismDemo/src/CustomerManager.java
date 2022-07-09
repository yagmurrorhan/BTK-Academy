public class CustomerManager {
    /*
    BaseLogger'ı burada tanımlayarak ve constructor'unu oluşturarak,
    ardından parametre olarak verdikten sonra CustomerManager
    çalıştırıldığında parametreyi vererek istediğimiz BaseLogger türündeki bir log işlemini
    bağımlılığı ortadan kaldırarak yapmış oluruz.
    */
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı");//çağırılan BaseLogger hangisiyse onun log'u çalışır.
       /* DatabaseLogger logger = new DatabaseLogger();
        logger.Log("Log mesajı");
        Bir class içerisinde new diyerek bir nesne oluşturmak, tightly coupled bir yapı
        kurmamıza neden olur ve biz bunu istemeyiz. Şuan Database'e bağlıyken yarın File'a bağlı olmak isteği gelebilir.
        Bunu karşılamak için bağımlılığı kaldırmamız ve daha esnek bir yapı kurmamız gerekir.
        */

    }
}
