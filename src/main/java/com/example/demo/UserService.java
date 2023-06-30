package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepositry userRepositry;


    public String addUser(User user){

        userRepositry.save(user);
        return "User saved successfully";
    }


    public User getUserById(Integer userId){


        try{
            User user = userRepositry.findById(userId).get();
            return user;
        }catch (Exception e){
            System.out.println("We are in the exception and message is "+e.getMessage());
            return null;
        }
    }

}
