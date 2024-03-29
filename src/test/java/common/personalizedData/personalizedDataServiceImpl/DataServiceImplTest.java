package common.personalizedData.personalizedDataServiceImpl;

import common.dataTeam.entity.Product;
import common.dataTeam.repository.ProductRepository;
import common.personalizedData.personalizedDataModel.RequestDTO;
import common.personalizedData.personalizedDataService.personalizedDataServiceImpl.DataServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class DataServiceImplTest {

    @InjectMocks
    DataServiceImpl dataService;

    @Mock
    ProductRepository productRepository;

    @Test
    public void productByShopperNominalTest() {
        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setBrand("Asus");
        requestDTO.setShopperId("sh001");
        requestDTO.setCategory("Motherboard");

        Product product = new Product();
        product.setProductId("MB-000001");
        product.setCategory("Motherboard");
        product.setBrand("Asus");

        List<Product> mockProducts = new ArrayList<>();
        mockProducts.add(product);

        Mockito.when(productRepository.findByShopperIdAndCategoryAndBrand("sh001",
                        "Motherboard", "Asus"))
                .thenReturn(mockProducts);

        dataService.productsByShopper(requestDTO);
    }
}
