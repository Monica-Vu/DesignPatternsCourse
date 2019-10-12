package strategy_design_pattern;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehaviour = new Quack(); 
		flyBehaviour = new FlyWithWings(); 
	}
	
	public void display() {
		System.out.println("I'm a Mallard duck!");
	}
}