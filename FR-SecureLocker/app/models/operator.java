package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;
 
 
@Entity
public class operator extends Model {
	@Required
	public String id_operator;
	
	@Required
	public String nama_operator;
	
	@Required
	public String password;
 	
}