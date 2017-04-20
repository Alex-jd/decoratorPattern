/**
 * 
 */
package decorators;

import service.Beverage;
import service.CondimentDecorator;

/**
 * @author alex_jd
 *
 */
public class Mocha extends CondimentDecorator{
	
	Beverage beverage;
	
	public Mocha (Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .2 + beverage.cost();
	}

}
