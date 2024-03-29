package common.dataTeam.repository;

import common.dataTeam.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <Product, String>{
    @Query("SELECT p FROM Product p JOIN ShopperProducts sp ON p.productId = sp.productId WHERE sp.shopperId = :shopperId AND p.category = :category AND p.brand = :brand")
    List<Product> findAllByShopperIdAndCategoryAndBrand(@Param("shopperId") String shopperId, @Param("category") String category, @Param("brand") String brand);
}
