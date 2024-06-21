package carmenromano.spring_data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("topping")
@Getter
@Setter
public class Topping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int calories;
	private double price;

	public Topping() {
	}

	public Topping(String name, int calories, double price) {
		this.name = name;
		this.calories = calories;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Topping{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}
