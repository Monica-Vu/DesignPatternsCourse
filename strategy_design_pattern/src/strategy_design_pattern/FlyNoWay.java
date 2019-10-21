package strategy_design_pattern;

public class FlyNoWay implements FlyBehavior{
	public void fly() {
		System.out.println("I can't fly!"); 
	}
}
