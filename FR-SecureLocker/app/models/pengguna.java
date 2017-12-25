package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;
 
 
@Entity

public class pengguna extends Model {
	@Required
	public String id_pengguna;
	
	@Required
	public String nama_pengguna;
	
	@Required
	public String alamat_pengguna;
	
	@Required
	public String no_loker_pengguna;
 	
}