package common.personalizedData.personalizedDataService.personalizedDataServiceImpl;

import common.dataTeam.entity.Product;
import common.dataTeam.repository.ProductRepository;
import common.personalizedData.personalizedDataModel.RequestDTO;
import common.personalizedData.personalizedDataModel.ResponseDTO;
import common.personalizedData.personalizedDataService.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ResponseDTO productsByShopper(RequestDTO request) {
        ResponseDTO responseDTO = new ResponseDTO();
        try {
            Pageable pageable = PageRequest.of(0, 100);
            List<Product> productsList = productRepository.findAllByShopperIdAndCategoryAndBrand(request.getShopperId(),
                    request.getCategory(), request.getBrand(), pageable);
            responseDTO.setStatus("SUCCESS");
            responseDTO.setProducts(productsList);
        } catch (Exception e) {
            responseDTO.setStatus("ERROR");
        }
        return responseDTO;
    }
}
