package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class data_pengguna extends Model {
	
    @Required
    public String nama;
    
    @Required
    public String alamat;
    
    @Required
    public String pekerjaan;
    
    @Required
    @Email
    public String email;
    
}

