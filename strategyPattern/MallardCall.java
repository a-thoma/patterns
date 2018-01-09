public class MallardCall extends DuckCall {

	public MallardCall() {

		quackBehavior = new Quack(); // same as a MallardDuck...
		flyBehavior = new FlyNoWay();
	}

	public void display() {

		System.out.println("I'm a hunter with a Mallard Call. Shh... it's duck season.");
	}

}