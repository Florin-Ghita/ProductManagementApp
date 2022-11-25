package labs.pm.data;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.LocalDate;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;
import static labs.pm.data.Rating.*;

public abstract class Product implements Rateable<Product> {
	private int id;
	private String name;
	private BigDecimal price;
	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
	private  Rating rating;


	public int getId() {
		return id;
	}
	//	public void setId(int id) {
	//		this.id = id;
	//	}
	public String getName() {
		return name;
	}
	//	public void setName(String name) {
	//		this.name = name;
	//	}
	public BigDecimal getPrice() {
		return price;
	}
	//	public void setPrice(final BigDecimal price) {
	//		price=BigDecimal.ONE; 
	//		this.price = price;
	//	}
	public BigDecimal getDiscount(){
		return price.multiply(DISCOUNT_RATE).setScale(2,HALF_UP);
	}
	public Rating getRating() {
		return rating;
	}
	//	public void setRating(Rating rating) {
	//		this.rating = rating;
	//	}
	
	
	
	
	
	Product(int id, String name, BigDecimal price, Rating rating) { 
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	Product(int id, String name, BigDecimal price) {
		this(id,name,price,NOT_RATED);
	}
	//	 Product() {
	//
	//		this(0,"no name",BigDecimal.ZERO);
	//	}
	//	public abstract Product applyRating(Rating newRating) ;
	//	{
	//		return new Product(this.id, this.name, this.price, newRating);
	//	}
	public abstract LocalDate getBestBefore();

	@Override
	public String toString() {
		return +id + ", " + name + ", " + price + ", "+ getDiscount() +" ," + rating.getStars()+" "+getBestBefore() ;
	}

	public int hashCode() {
		int hash = 5;
		hash = 23 * hash + this.id;
		return hash;
	}
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Product) {
			final Product other = (Product)obj;
			return this.id == other.id;
		}
		return false;
	}



}
