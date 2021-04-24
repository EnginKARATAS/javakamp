package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		//persistency = veri taban�, txt dosyas�//bir dosyay� yazmak ve saklayabilmek i�in database yazmak persistancy dir
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "Lenovo V114";
		product1.detail = "16 gb ram";
		product1.unitPrice = 15000;
		
		Product product2 = new Product();
		product2.id = 1;
		product2.name = "Lenovo V145";
		product2.detail = "32 gb ram";
		product2.unitPrice = 16000;

		
		Product product3 = new Product(1, "lenavo v14", "16 gb ram", 1600);
		product3.id = 1;
		product3.name = "Lenovo V12";
		product3.detail = "16 gb ram";
		product3.unitPrice = 16000;

		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "bilgisayar";
		
		Category category2 = new Category();
		category2.id = 1;
		category2.name = "bilgisayar";
		
		Category[] categories = {category1, category2};
		
		for(Category category : categories) {
			System.out.println(category.id);
 		}
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		
		
	}

}
