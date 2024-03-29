package common.personalizedData.personalizedDataModel;

import common.dataTeam.entity.Product;

import java.util.List;

public class ResponseDTO {

    private String Status;
    private List<Product> products;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
