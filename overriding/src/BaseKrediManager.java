public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }
}

//aksi belirtilmediği sürece overridible'dır.
//override edilmesini istemiyorsak metodun final keyword'ü ile işaretlenmesi gerekir.
