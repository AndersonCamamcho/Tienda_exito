package com.tiendaExito.controllers;

import com.tiendaExito.models.UserModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserController {

    private Properties properties = new Properties();
    private UserModel userEntity;

    public UserController(){
        userEntity = new UserModel();
    }

    public UserModel userGenerator() {
        // TODO Auto-generated catch block
        try {
            this.properties.load(new FileInputStream(new File("C:\\Users\\A R E X\\IdeaProjects\\x\\src\\main\\resources\\Utilities\\despensaData.properties")));

            userEntity.setCiudad(this.properties.get("CIUDAD").toString());
            userEntity.setAlmacen(this.properties.get("ALMACEN").toString());


            return userEntity;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return userEntity;
    }


}

