package customer.cap_sample.compsample;
import org.springframework.stereotype.Component;
 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
import java.util.Date;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
 
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@SqlResultSetMapping(name = "user_mapping", classes = @ConstructorResult(targetClass = CompTable.class, columns = {
        @ColumnResult(name = "Comp_ID", type = Long.class),
        @ColumnResult(name = "Comp_Name", type = String.class),
        @ColumnResult(name = "Comp_dept", type = String.class)
       
}))

@Entity
@Getter
@Setter
public class CompTable {
    @Id
  
    private Long CompID;

 
    private String CompName;

  
    private String Compdept;


public CompTable(Long CompID,String CompName,String Compdept)
{
    this.CompID = CompID;
     this.CompName = CompName;
     this.Compdept = Compdept;
}
}
