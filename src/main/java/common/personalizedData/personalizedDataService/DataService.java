package common.personalizedData.personalizedDataService;

import common.personalizedData.personalizedDataModel.RequestDTO;
import common.personalizedData.personalizedDataModel.ResponseDTO;

public interface DataService {

    ResponseDTO productsByShopper(RequestDTO request);
}
