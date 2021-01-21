public class PhoneConfig {
	
	private static PhoneConfig instance;
	private int brightness; 
	private boolean bluetooth;
	private enum State {Silent, Low, Hight };
	private int sound;
	private PhoneConfig() {
		
	}

	public static PhoneConfig getInstance() {
		if(instance==null) {
			instance= new PhoneConfig();
		}
		return instance;
	}
	
	public void setBrightness(int brightness) {
		if(brightness>=0 && brightness<=100) {
			this.brightness= brightness;
		}else {
			System.out.println("the brightness must in range form 0 to 100 ");
			this.brightness=0;
		}
	}
	
	public int getBrightness() {
		return brightness;
	}

	public boolean isCheckingOfBluetooth() {
		return bluetooth;
	}

	public void setStateBluetooth(boolean bluetooth) {
		if(bluetooth==true)
			System.out.println("bluetooth turn on");
		else
			System.out.println("bluetooth turn off");
		this.bluetooth = bluetooth;
	} 
	
	public void setSound(int i) {
		this.sound=i;
	}
	
	public  State getSound() {
		if(sound>=0 && sound<=2) {
			return State.values()[sound];
		}
		return State.values()[0];
		
	} 
	
	
	
}
/////////////
