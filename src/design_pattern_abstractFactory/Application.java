package design_pattern_abstractFactory;

public class Application {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// Static instantiation
		AbstractFactory factory=new FactoryImplA();
		AbstractPlugin plugin=factory.getInstance();
		plugin.process();
		
		// Dynamic instantiation
				AbstractFactory factoryB=(AbstractFactory) 
						Class.forName("design_pattern_abstractFactory.FactoryImplB")
						.newInstance();
				AbstractPlugin plugin2=factoryB.getInstance();
				plugin2.process();
		
		

	}

}
