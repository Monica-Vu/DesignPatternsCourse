package strategy_design_pattern;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck(); 
		mallard.performQuack(); 
		mallard.performFly();
		
		Duck model = new ModelDuck();
		
		// delegate to flyBehaviour object set in ModelDuck's constructor
		model.performFly(); 
		
		// invokes model's inherited behaviour setter model
		model.setFlyBehaviour(new FlyRocketPowered());
		
		model.performFly();
	}
}
