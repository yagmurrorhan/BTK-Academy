public abstract class GameCalculator {
    public abstract void hesapla();//Bu abstract class'ı implement eden her sınıf bu metodu override edip kendisine göre doldurmak zorundadır.

    public final void gameOver()
    //Bu abstract class'ı implement eden her sınıf bu metodu herkes olduğu gibi kullanmak zorundadır.
    {
        System.out.println("Oyun bitti.");
    }
}
