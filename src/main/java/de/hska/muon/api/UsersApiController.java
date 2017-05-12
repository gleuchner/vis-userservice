package de.hska.muon.api;

import de.hska.muon.model.NewUser;
import de.hska.muon.model.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-04T12:49:09.193Z")

@Controller
public class UsersApiController {

    @RequestMapping(value = "/users",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<Void> usersGet() {

        return null;
    }


    @RequestMapping(value = "/users",
            produces = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<User> usersPost(@RequestBody NewUser newUser) {

        return null;
    }

    @RequestMapping(value = "/users/{userId}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<User> usersUserIdGet(@PathVariable("userId") Integer userId) {

        return null;
    }


}
