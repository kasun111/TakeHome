package common.personalizedData.personalizedDataController;

import common.personalizedData.personalizedDataModel.RequestDTO;
import common.personalizedData.personalizedDataModel.ResponseDTO;
import common.personalizedData.personalizedDataService.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/data")
public class DataController {
    @Autowired
    DataService dataService;

    @RequestMapping(value = "/shopper", method = RequestMethod.POST)
    public ResponseEntity<ResponseDTO> shopperDetails(@RequestBody RequestDTO requestData) {
        return ResponseEntity.ok(dataService.productsByShopper(requestData));
    }
}
