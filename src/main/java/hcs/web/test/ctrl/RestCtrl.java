package hcs.web.test.ctrl;

import hcs.core.rest.Response;
import hcs.web.test.model.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by Leon on 2015/12/30.
 */
@RestController
public class RestCtrl {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/authCheck")
    public Response authCheck(){
        UserEntity user = new UserEntity();
        System.err.println("Auth check");
        Optional.ofNullable(user).ifPresent(userEntity -> {
            System.err.println(user.getPwd());
            System.err.println(user.getUser());
            if (user.getPwd().equals(user.getUser()));{
                user.setValid(true);
            }
        });

        if (user.isValid()){
            return new Response().success("Hi");
        }else {
            return new Response().failure("Bye");
        }
    }

    @RequestMapping(value = "/guessUlike",method = RequestMethod.GET)
    public Response guessUlike(){
        System.err.println("Guess guess");
        return new Response().success("Hey");
    }
}
