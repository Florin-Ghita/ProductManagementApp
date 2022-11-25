 package labs.pm.app;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.Locale;

import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

public class Shop {

	public static void main(String[] args) {

		ProductManager pm = new ProductManager(Locale.US);
		Product p1 = pm.createProduct(101,"Tea",BigDecimal.valueOf(1.99) , Rating.NOT_RATED);
		pm.printProductReport();
		p1 = pm.reviewProduct(p1,Rating.FOUR_STAR, "Nice hot cup of tea");
		
		p1 = pm.reviewProduct(p1,Rating.THREE_STAR, "Nice hot cup of tea");
		p1 = pm.reviewProduct(p1,Rating.ONE_STAR, "Nice hot cup of tea");
		p1 = pm.reviewProduct(p1,Rating.FIVE_STAR, "Nice hot cup of tea");
		p1 = pm.reviewProduct(p1,Rating.ONE_STAR, "Nice hot cup of tea");
		p1 = pm.reviewProduct(p1,Rating.ONE_STAR, "Nice hot cup of tea");
		p1 = pm.reviewProduct(p1,Rating.ONE_STAR, "Nice hot cup of tea");
		pm.printProductReport();
//		Product p2 = pm.createProduct(102,"Coffe",BigDecimal.valueOf(1.99),Rating.FOUR_STAR);
//		Product p3 = pm.createProduct(103,"Cake",BigDecimal.valueOf(3.99),Rating.FIVE_STAR,LocalDate.now().plusDays(2));
//		Product p4 = pm.createProduct(105,"Cookie",BigDecimal.valueOf(3,99),Rating.TWO_STAR,LocalDate.now());
////		Product p5 = pm.createProduct(Rating.THREE_STAR);
//		Product p6 = pm.createProduct(104, "Chocolate",BigDecimal.valueOf(2.99),Rating.FIVE_STAR);
//		Product p7 = pm.createProduct(104, "Chocolate",BigDecimal.valueOf(2.99),Rating.FIVE_STAR,LocalDate.now().plusDays(2));
////		Product p8 = pm.createProduct(Rating.FIVE_STAR);
////		Product p9 = pm.createProduct(Rating.TWO_STAR);
//		System.out.println(p6.equals(p7));
////		p3.getBestBefore();
////		p3 = p3.applyRating(Rating.THREE_STAR);
//		//		p1.setId(101);
//		//		p1.setName("Tea");
//		//		p1.setPrice(BigDecimal.valueOf(1.99)); 
////		System.out.println(p1.getId()+ " " + p1.getName()+ " " + p1.getPrice()
////		+ " " + p1.getDiscount()+ " "+ p1.getRating().getStars()) ;
////		System.out.println(p2.getId()+ " " + p2.getName()+ " " + p2.getPrice()
////		+ " " + p2.getDiscount()+ " "+ p2.getRating().getStars()) ;
////		System.out.println(p3.getId()+ " " + p3.getName()+ " " + p3.getPrice()
////		+ " " + p3.getDiscount()+ " " + p3.getRating().getStars()) ;
////		
////		System.out.println(p4.getId()+ " " + p4.getName()+ " " + p4.getPrice()
////		+ " " + p4.getDiscount()+ " " + p4.getRating().getStars()) ;
////		System.out.println(p5.getId()+ " " + p5.getName()+ " " + p5.getPrice()
////		+ " " + p5.getDiscount()+ " " + p5.getRating().getStars()) ;
//	System.out.println(p1);
//	System.out.println(p2);
//	System.out.println(p3);
//	System.out.println(p4);
////	System.out.println(p5);
//	System.out.println(p6);
//	System.out.println(p7);
////	System.out.println(p8);
////	System.out.println(p9);
	}

}