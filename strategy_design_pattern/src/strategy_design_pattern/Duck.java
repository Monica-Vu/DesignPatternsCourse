package strategy_design_pattern;

public abstract class Duck {
	FlyBehavior flyBehavior; 
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	// delegate behavior class for performFly and perform Quack
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	// as expected, the setters will allow us to change the behaviour while the program is running
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb; 
	}
	
	public void setQuackBehaviour(QuackBehavior qb) {
		quackBehavior = qb; 
	}
}
