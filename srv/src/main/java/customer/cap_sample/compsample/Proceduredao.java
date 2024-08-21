package customer.cap_sample.compsample;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Component
@Repository
@Transactional
public class Proceduredao {
    @PersistenceContext
    private EntityManager entityManager;
    public Collection<CompTable> getCompaniesBySelectedFields() {
        try {
            StoredProcedureQuery spCompanies = entityManager
                    .createStoredProcedureQuery("GET_COMP_TABLE_ALL_DATA", "user_mapping");
            spCompanies.execute();
            @SuppressWarnings("unchecked")
            List<CompTable> results = spCompanies.getResultList();
            return results;
        } catch (Exception exception) {
            throw exception;
        }
    }
}
