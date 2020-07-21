package ir.fassih.homework.core.database.dao;

public interface AbstractDao<E, I> {


    void save(E entity);

    E load(I id);


}
