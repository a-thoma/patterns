import java.text.DecimalFormat;

public class StarbuzzCoffee {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.##"); /* format Soy's output */

		/* make some beverages and test their methods */
		Beverage beverage = new Espresso();
		System.out.println(beverage.getSize() + " " +
			beverage.getDescription() +
			" $" + beverage.cost());

		/* test the more complicated wrapping functionality */
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2); /* double mocha! */
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getSize() + " " +
			beverage2.getDescription() +
			" $" + beverage2.cost());

		/* again! */
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getSize() + " " +
			beverage3.getDescription() +
			" $" + beverage3.cost());

		/* test the sizing */
		Beverage beverage4 = new Decaf();
		// beverage4.setSize(Size.TALL);
		beverage4 = new Soy(beverage4);
		System.out.println(beverage4.getSize() + " " +
			beverage4.getDescription() +
			" $" + df.format(beverage4.cost()));
	}
}