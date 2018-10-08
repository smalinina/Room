package talks.room.dao;

import talks.room.entity.Room;

import java.util.List;

public interface BasicDao<T> {

    /**
     * method for add entity
     *
     * @param entity - new entity for creation
     * @return created entity
     */
    T create(T entity);

    /**
     * method for getting entity by specific id
     *
     * @param id - entity's id
     * @return entity by id
     */
    T getById(long id);

    /**
     * method for getting all data from entity
     *
     * @return data list from entity
     */
    List<T> getList();

    /**
     * method for update entity
     *
     * @param entity - updating entity
     * @return updated entity
     */
    T update(T entity);

    /**
     * method for delete entity by specific id
     *
     * @param entity for delete
     */
    T delete(T entity);

    T getByName(String name);
}
