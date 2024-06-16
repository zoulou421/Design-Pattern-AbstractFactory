package design_pattern_abstractFactory;

public class Application {

	public static void main(String[] args) {
		// Static instantiation
		AbstractFactory factory=new FactoryImplA();
		AbstractPlugin plugin=factory.getInstance();
		plugin.process();
		
		

	}

}
