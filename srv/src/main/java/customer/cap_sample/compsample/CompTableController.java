package customer.cap_sample.compsample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/compTable")
public class CompTableController {
    @Autowired 
    CompTableService compTableService; 

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getCompTable()  {
        return new  ResponseEntity<>(compTableService.getCompTable(), HttpStatus.OK);
    }
}
