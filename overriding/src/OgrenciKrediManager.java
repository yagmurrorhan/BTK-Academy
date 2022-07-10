public class OgrenciKrediManager extends BaseKrediManager {
    //BaseKrediManager'ın hesapla() metodu burada aynı imzayla yeniden yazılarak override edilmiştir.
    //Bu noktadan sonra OgrenciKrediManager türündeki bir nesne için buradaki hesapla() metodu çalışır, BaseKrediManager içerisindeki hrsapla() metodu çalışmaz.
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }
}
