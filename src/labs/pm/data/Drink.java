package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Drink extends Product{
	private LocalDate bestBefore;

	public LocalDate getBestBefore() {
		return LocalDate.now();
	}

	Drink(int id, String name, BigDecimal price, Rating rating) {
		super(id, name, price, rating);

		// TODO Auto-generated constructor stub
	}
	public BigDecimal getDiscount() {
		LocalTime now = LocalTime.now();
		return (now.isAfter(LocalTime.of(17, 15)) && 
				now.isBefore(LocalTime.of(18, 30))) ?
						super.getDiscount() :BigDecimal.ZERO;
	}

	
	
	@Override
	public String toString() {
		return super.toString()+ " ," + bestBefore;
	}

	@Override
	public Product applyRating(Rating newRating) {
		return new Drink(getId(), getName(), getPrice(),newRating);
	} 



}
