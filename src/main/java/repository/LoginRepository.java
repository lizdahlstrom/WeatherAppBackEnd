package repository;

import entities.sub_entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Liz on 2017-02-09.
 */
public interface LoginRepository extends CrudRepository<User, Long>{
    List<User> findAll();
    User findByNameIn(String name);
}