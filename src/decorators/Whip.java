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
public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip (Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .1 + beverage.cost();
	}

}
