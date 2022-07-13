public interface ICustomerDal {
    void Add();
/*Bir interface'in üyeleri default olarak public'tir.
Interface, operasyonu implement edilmesi istenen durumlarda kullanılırlar.
Interface'ler, kendilerini implement eden sınıfların referanslarını tutarlar. Kendileri new'lenmez ama imza taşırlar.
Yazılımda 3 katman vardır: Data access->iş katmanı->arayüz katmanı. Bu katmanlar arasındaki geçişler interface'ler aracılığıyla yapılır. Bunun sebebi ise bağımlılıkları önlemektir.
Bir class birden fazla interface'i implement edebilirken yalnızca bir tane abstract class'ı extend edebilir.
Interface'lerin en öne çıkan özelliği referans tutucu olmasıdır.
 */
}
