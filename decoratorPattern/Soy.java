public class Soy extends CondimentDecorator {

	Beverage beverage; /* for wrapping */

	public Soy(Beverage beverage) {

		this.beverage = beverage;
	}

	public String getDescription() {

		return beverage.getDescription() + ", Soy";
	}

	public double cost() {

		return beverage.cost() + 0.15;
	}
}