package kodlama.io.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.northwind.core.utilities.results.DataResult;
import kodlama.io.northwind.core.utilities.results.Result;
import kodlama.io.northwind.entities.concrates.Product;
import kodlama.io.northwind.entities.dtos.ProductWithCategoryDto;

//entityrepository = JpaRepository
public interface ProductDao extends JpaRepository<Product,Integer> {
    DataResult<List<Product>> getAll();
    Result add(Product product);
   
    DataResult<Product> getByProductName(String productName);
	  
    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	  
    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	  
    DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	  
    DataResult<List<Product>> getByProductNameContains(String productName);
	  
    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
    
    @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto" + "(p.id, p.productName, c categoryName )" + "From Ctegory cInnerJoin c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();
    
}
	//select * from products where product_name=bisey and categpryId=bisey
 
	 
 
