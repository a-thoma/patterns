public abstract class DuckCall {

	/* these puppies still quack! but they don't fly... */
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public DuckCall() {

	}

	public abstract void display();

	public void performQuack() {

		quackBehavior.quack();
	}

	public void performFly() {

		flyBehavior.fly();
	}

}