/**
 * 
 */
package gamecore.graph;

import gamecore.Avatar;
import gamecore.Game;
import gamecore.Settings;

/**
 * @author Andreas Stock
 *
 */
public class ItemMegaHealth extends Item {

	public ItemMegaHealth(Position p) {
		super(p, 35);
	}

	@Override
	public void applyBonusTo(Avatar a) {
		a.setHealth(Math.min(a.getHealth()+100,Settings.MAX_HEALTH));		
	}
	
}