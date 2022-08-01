public class CustomerDal implements IEntityRepository<Customer> {

    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}

/*
IEntityRepository<CustomerDal> yazsaydık kabul etmeyecekti.
Çünkü CustomerDal bir IEntity değildir.
Ve biz IEntityRepository'nin  sadece IEntity olan sınıfları tür olarak alabileceği kısıtını
getirmiştik.
 */