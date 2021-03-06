/**
 * 
 */
package controls.bots;

import controls.Player;
import gamecore.Intel;

/**
 * This is an Automated Opponent.
 * In this early Version it chooses paths randomly and does not stand still.
 * @author Andreas Stock
 *
 */
public abstract class Bot extends Player {

	public Bot(int id) {
		super(id);
	}
	
	public synchronized final void post(Intel intel) {
		super.intel = intel;
		decide();
	}

	abstract void decide();
}