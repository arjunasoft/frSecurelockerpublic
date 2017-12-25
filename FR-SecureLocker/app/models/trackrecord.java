package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;
 
 
@Entity

public class trackrecord extends Model {
	@Required
	public String id_pengguna_trackrecord;
	
	@Required
	public String nama_trackrecord;
	
	@Required
	public String alamat_trackrecord;
	
	@Required
	public String no_loker_trackrecord;
	
	@Required
	public String waktu_akses_trackrecord;
	
	@Required
	public String akses_trackrecord;
}