public class Main {

	public static void main(String[] args) {
		PhoneConfig config = PhoneConfig.getInstance();
		config.setBrightness(100);
		config.setStateBluetooth(true);
		config.setSound(2);

		PhoneConfig config2=PhoneConfig.getInstance();
		config2.setBrightness(50);
		config2.setStateBluetooth(false);
		config2.setSound(1);
		System.out.println(config.getBrightness());
		System.out.println(config.getSound());
		System.out.println(config.isCheckingOfBluetooth());
	}

}