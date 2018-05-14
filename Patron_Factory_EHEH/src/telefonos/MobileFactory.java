package telefonos;

public class MobileFactory {
	public static Mobile createMobile(String type){
            switch (type) {
                case Mobile.IPHONE:
                    return new IPhone(2, "A9", "A9 GPu");
                case Mobile.SONY:
                    return new Sony(2,"ARM");
                case Mobile.SAMSUNG:
                    return new Samsung("Intel");
                case Mobile.ANDROID:
                    return new Android("6.0", "2");
                case Mobile.WINDOWSPHONE:
                    return new WindowsPhone("Intel");
                case Mobile.AIPHONE:
                    return new Aiphone("AMD", "2gb", "13mp");
                default:
                    return null;
            }
	}
}
