package strategy_design_pattern;

public abstract class Duck {
	FlyBehaviour flyBehaviour; 
	QuackBehaviour quackBehaviour;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	// delegate behaviour class for performFly and perform Quack
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	// as expected, the setters will allow us to change the behaviour while the program is running
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb; 
	}
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb; 
	}
}
