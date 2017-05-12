package de.hska.muon.api;

import de.hska.muon.model.NewUser;
import de.hska.muon.model.User;

import de.hska.muon.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UsersApiController {

    @Autowired
    private UserRepo repo;

    @RequestMapping(value = "/users",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<Iterable<User>> usersGet() {
        return new ResponseEntity<Iterable<User>>(repo.findAll(), HttpStatus.OK);
    }


    @RequestMapping(value = "/users",
            produces = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<User> usersPost(@RequestBody NewUser newUser) {
        if(repo.findByUsername(newUser.getUsername()).iterator().hasNext()) {
            return new ResponseEntity<User>(HttpStatus.UNPROCESSABLE_ENTITY);
        } else {
            User user = new User();
            user.setFirstname(newUser.getFirstname());
            user.setName(newUser.getName());
            user.setPassword(newUser.getPassword());
            user.setRole(newUser.getRole());
            user.setUsername(newUser.getUsername());

            User save = repo.save(user);
            return new ResponseEntity<User>(save, HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/users/{userId}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<User> usersUserIdGet(@PathVariable("userId") Integer userId) {

        User user = repo.findOne(userId);
        if(user != null) {
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }


}
