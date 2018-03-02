package gamecore;


public class Settings {
	
	public static Boolean isDebugOutputEnabled = false;
	
	public static final int MAX_HEALTH = 200;
	public static final int MAX_ARMOR = 200;
	public static final int START_HEALTH = 125;
	public static final int START_ARMOR = 0;


	public static final int MACHINEGUN_DPS = 20;
	public static final int MACHINEGUN_RANGE = Integer.MAX_VALUE;
	public static final int RAILGUN_DPS = 24;
	public static final int RAILGUN_RANGE = Integer.MAX_VALUE;
	public static final int LIGHTNINGGUN_DPS = 42;
	public static final int LIGHTNINGGUN_RANGE = 6;
	public static final int SHOTGUN_DPS = 80;
	public static final int SHOTGUN_RANGE = 2;
	
	
	double timescale = 1;
	public final Boolean IS_TIME_DECREMENTING = false;
	Time gamelength = new Time(60*5);
	
	
}
