/**
 * 
 */
package controls;

/**
 * This is an Automated Opponent.
 * Chooses Destinations randomly and should not stand still.
 * @author Andreas Stock
 *
 */
public class RabbitBot extends Bot {

	public RabbitBot(int id) {
		super(id);
		setName("RabbitBot");
	}

	synchronized void decide() {
		if (destination == null 
				|| super.lastIntelGotten.self.getPosition() == destination) {
			destination = lastIntelGotten.graph.getAllPositions().get((int) Math.random() * lastIntelGotten.graph.getAllPositions().size());
		} 
	}
}