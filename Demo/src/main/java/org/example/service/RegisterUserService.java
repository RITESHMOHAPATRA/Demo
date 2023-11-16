package org.example.service;

import org.example.dao.Storage;
import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class RegisterUserService {

    public void registerUser(String userId, Storage s){
        s.getUsers().add(new User(userId));
    }

}
