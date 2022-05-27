package com.example.TaxisUser.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServices {
    @Autowired
    com.example.TaxisUser.Repository.UserServices Repository;

    public ArrayList<User> ObtenerUser(){return (ArrayList<User>) Repository.findAll(); }
}
}
