package gamecore;


public class Settings {
	
	public static Boolean isDebugOutputEnabled = false;
	
	//AVATAR
	public static final int MAX_HEALTH = 200;
	public static final int MAX_ARMOR = 200;
	public static final int START_HEALTH = 125;
	public static final int START_ARMOR = 0;
	public static final int ARMOR_BLEED_ABOVE = 100;
	public static final int HEALTH_BLEED_ABOVE = 100;

	//ITEMS
	public static int TOTAL_NUMBER_OF_ITEM_TYPES = 2;						//Item.values().length;
	
	//WEAPONS
	public static final int PISTOL_DPS = 10;
	public static final int PISTOL_RANGE = 6;
	public static final int RAILGUN_DPS = 24;
	public static final int RAILGUN_RANGE = Integer.MAX_VALUE;
	public static final int LIGHTNINGGUN_DPS = 42;
	public static final int LIGHTNINGGUN_RANGE = 4;
	public static final int SHOTGUN_DPS = 80;
	public static final int SHOTGUN_RANGE = 1;

	
	//Intel and Sight
	public static final int INTEL_DISTANCE = 10;

	//Graph Generation
	public static final int EDGE_SIMPLE_STANDART_LENGTH = 8;
	
	
	double timescale = 1000;
	public Boolean IS_DISPLAYED_TIME_INCREMENTING = true;
	public final Time gamelength = new Time(60*5);

	
}
