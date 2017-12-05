package controllers;

import play.mvc.*;
import play.data.validation.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        Date now = new Date();
        render(now);
    }
    
    public static void list() {
        List<data_pengguna> data_penggunas = data_pengguna.find("order by alamat, nama").fetch();
        render(data_penggunas);
    }
    
    public static void form(Long id) {
        if(id == null) {
            render();
        }
        data_pengguna data_penggunax = data_pengguna.findById(id);
        render(data_penggunax);
    }
    
    public static void save(@Valid data_pengguna data_pengguna) {
        if(validation.hasErrors()) {
            if(request.isAjax()) error("Invalid value");
            render("@form", data_pengguna);
        }
        data_pengguna.save();
        list();
    }

}