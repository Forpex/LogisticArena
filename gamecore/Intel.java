/**
 * 
 */
package gamecore;

import java.util.ArrayList;

import gamecore.avatars.Avatar;
import gamecore.graph.Graph;
import gamecore.graph.items.Item;

/**
 * @author Andreas Stock
 *
 */
public class Intel {
	
	Avatar self;
	ArrayList<Avatar> visibleEnemyAvatars = new ArrayList<Avatar>(0);
	Graph graph;
	ArrayList<Item> visibleItems = new ArrayList<Item>(0);
	Score currentScore;
	Time currentTime;
	Settings settings;
	public boolean isGameOver;
	
	Intel(Game g, Avatar self){
		this.self = self;
		visibleEnemyAvatars = g.getVisibleAvatars(self);
		this.graph = g.graph;
		this.visibleItems = g.graph.getItemsInSight(self.getPosition());
		this.currentScore = g.score.clone();
		this.currentTime = g.currentTime.clone();
		this.settings = g.settings;
		this.isGameOver = g.isGameOver;
	}

	public int getNumOutgoingEdges() {
		return self.getPosition().getNumOutgoingEdges();
	}
	
}
