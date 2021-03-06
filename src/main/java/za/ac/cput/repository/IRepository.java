package za.ac.cput.repository;

public interface IRepository<T,ID> {
    T creat(T t);
    T read(ID d);
    T update(T t);
    boolean delete(ID id);
}
