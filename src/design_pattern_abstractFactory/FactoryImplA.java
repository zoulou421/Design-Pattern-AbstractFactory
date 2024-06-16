package design_pattern_abstractFactory;

public class FactoryImplA implements AbstractFactory{

	@Override
	public AbstractPlugin getInstance() {
		// TODO Auto-generated method stub
		return new PluginImplA();
	}

}
