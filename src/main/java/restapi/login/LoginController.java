package restapi.login;

import entities.sub_entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repository.LoginRepository;

import java.util.List;

/**
 * Created by Liz on 2/9/2017.
 *
 * Endpoints:
 *
 *    GET:
 *          "/login/findUser"
 *          "/login/findUser/id"
 *    POST:
 *          "/login/newUser"
 *    UPDATE:
 *          "/login/updateUser/id"
 *    DELETE:
 *          "login/deleteUser/id"
 *
 */
@RestController
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    public LoginController() {
    }

    // REST Calls
    @RequestMapping(value = "/login/users", method = RequestMethod.GET)
    public List<User> findUser(){
            return loginRepository.findAll();
    }

    //TODO: Add authentication

    @RequestMapping(value = "/login/findUser/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable long id){
            return loginRepository.findOne(id);
    }

    @RequestMapping(value = "/login/newUser", method = RequestMethod.POST)
    public void submitUser(User user){
        loginRepository.save(user);
    }

    @RequestMapping(value = "/login/findAndUpdateById/{id}", method = RequestMethod.PUT)
    public void updateUser(@PathVariable long id){
        User user = loginRepository.findOne(id);
        loginRepository.save(user);
    }

    @RequestMapping(value = "/login/deleteUser/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable long id){
        loginRepository.delete(id);
    }
}