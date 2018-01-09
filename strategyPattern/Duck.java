/* absract classes can be 'subclassed', and may include abstract methods */

public abstract class Duck {

	/* Reference variables for behavior interface types
	inherited by all subclasses of Duck */
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	/* Constructor for our Duck */
	public Duck() {

	}
	/* abstract method for displaying our Duck */
	public abstract void display();

	/* method to call the specific fly() call
	 * for each duck */
	public void performFly() {

		/* this is "delegated" to the behavior class
		 * just another form of procedural abstraction */
		flyBehavior.fly();
	}

	public void performQuack() {

		/* same as above for quacking ducks */
		quackBehavior.quack();
	}

	public void swim() {

		System.out.println("All ducks float, even decoys!");
	}

	/* setters for FlyBehavior and QuackBehavior */
	public void setFlyBehavior(FlyBehavior fb) {

		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {

		quackBehavior = qb;
	}

}