package scannerClass;

public class Product {

	String productCode;
	String productName;
	double productPrice;
	
	
	public Product(String productCode,String productName,double productPrice)
	{this.productCode=productCode;
	this.productName=productName;
	this.productPrice=productPrice;
	
	
	}
	void displayProductDetails(){
		

		System.out.println(productCode);

		System.out.println(productName);
		System.out.println(productPrice);
		
		
		
		
	}

}
