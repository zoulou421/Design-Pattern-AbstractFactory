package design_pattern_abstractFactory;

public class FactoryImplB implements AbstractFactory{

	@Override
	public AbstractPlugin getInstance() {
		// TODO Auto-generated method stub
		return new PluginImplB();
	}

}
