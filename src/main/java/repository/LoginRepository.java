package repository;

import entities.sub.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Liz on 2017-02-09.
 */
public interface LoginRepository extends CrudRepository<User, Integer>{

}
