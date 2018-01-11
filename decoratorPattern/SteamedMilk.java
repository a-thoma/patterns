public class SteamedMilk extends CondimentDecorator {

	Beverage beverage; /* for wrapping */

	public SteamedMilk(Beverage beverage) {

		this.beverage = beverage;
	}

	public String getDescription() {

		return beverage.getDescription() + ", Steamed Milk";
	}

	public double cost() {

		return beverage.cost() + 0.10;
	}
}