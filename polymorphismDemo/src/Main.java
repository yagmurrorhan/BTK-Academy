public class Main {

    public static void main(String[] args) {
     /*   BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        //BaseLogger tipinde bir dizi oluşturdum ve dizinin her bir elemanı aslında bir BaseLogger türündedir çünkü bu loggerlar BaseLogger'i extend etmişlerdir.
        //Bu şekilde bir array oluşturmak, istediğim zaman içerisinden bir elemanı çıkarmama ya da eklememe izin verir.
        //Polymorphism, base sınıflarla bu şekilde oluşturulur. Aynı zamanda interfaceler ile de oluşturulabilir.
        for (BaseLogger logger : loggers) {
            logger.Log("Log mesajı");
        }
      */

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}
