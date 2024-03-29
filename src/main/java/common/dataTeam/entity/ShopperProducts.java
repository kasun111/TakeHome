package common.dataTeam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shopperproducts")
public class ShopperProducts {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "productid")
    private String productId;
    @Column(name = "shopperid")
    private String shopperId;
    @Column(name = "relevancyScore")
    private String relevancyScore;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public String getRelevancyScore() {
        return relevancyScore;
    }

    public void setRelevancyScore(String relevancyScore) {
        this.relevancyScore = relevancyScore;
    }
}
