package common.personalizedData.personalizedDataModel;

import com.fasterxml.jackson.annotation.JsonInclude;

public class RequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shopperId;
    private String category;
    private String brand;
    private int limit;

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
