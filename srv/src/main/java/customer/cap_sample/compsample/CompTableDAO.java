package customer.cap_sample.compsample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface CompTableDAO 
extends JpaRepository<CompTable, Long>, JpaSpecificationExecutor<CompTable> {
    
}
