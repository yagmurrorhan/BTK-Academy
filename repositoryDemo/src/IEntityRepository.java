public interface IEntityRepository<T extends IEntity> {
    void add(T entity);

    void delete(T entity);

    void update(T entity);
}

/*
IEntityRepository sınıfının türünü sadece Repository sınıflarının
kullanabilmesi için generic constraint(generic kısıt) oluşturduk.
Bunu da IEntity interface'i aracılığıyla gerçekleştirdik.
IEntity interface'ini implement eden her bir sınıf IEntityRepository
sınıfı içerisine dahil edilebilecek bir tür olmuştur böylece.
 */
