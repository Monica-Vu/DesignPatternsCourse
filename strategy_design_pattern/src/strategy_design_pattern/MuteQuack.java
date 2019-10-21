package strategy_design_pattern;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>"); 
	}
}
