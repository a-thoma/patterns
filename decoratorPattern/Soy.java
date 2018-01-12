public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {

		this.beverage = beverage;
	}

	public String getDescription() {

		return beverage.getDescription() + ", Soy";
	}

	public double cost() {

		Size size = beverage.getSize();
		double cost = beverage.cost();

		if(size == Size.TALL) {

			cost += 0.10;
		}
		else if(size == Size.GRANDE) {

			cost += 0.15;
		}
		else if(size == Size.VENTI) {

			cost += 0.20;
		}

		return cost;
	}
}