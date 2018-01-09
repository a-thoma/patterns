public class MiniDuckSimulator {

	public static void main(String[] args) {

		/* test on a MallardDuck */
		Duck mallard = new MallardDuck();

		/* show what kind of Duck we're dealing with */
		mallard.display();

		/* now make it do stuff */
		mallard.performQuack();
		mallard.performFly();

		/* now on a ModelDuck */
		Duck model = new ModelDuck();
		model.display();
		model.performFly();

		/* this time, let's try dyamically changing the FlyBehavior */
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly(); // this should be different now

		/* let's test out a duck call */
		DuckCall mallardCall = new MallardCall();
		mallardCall.display();
		mallardCall.performQuack();

		/* try as you might to fly, i'll _call_ your bluff */
		mallardCall.performFly();
	}
}