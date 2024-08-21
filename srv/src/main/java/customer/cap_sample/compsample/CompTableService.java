package customer.cap_sample.compsample;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompTableService {
    @Autowired
     private Proceduredao proceduredao; 

     public Collection<CompTable> getCompTable(){
      
      return proceduredao.getCompaniesBySelectedFields();
     
     }
}
