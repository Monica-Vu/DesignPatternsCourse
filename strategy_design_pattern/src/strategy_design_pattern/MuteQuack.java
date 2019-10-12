package strategy_design_pattern;

public class MuteQuack implements QuackBehaviour {
	public void quack() {
		System.out.println("<< Silence >>"); 
	}
}
