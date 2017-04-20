/**
 * 
 */
package components;

import service.Beverage;

/**
 * @author alex_jd
 *
 */
public class Decaf extends Beverage{
	
	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}
