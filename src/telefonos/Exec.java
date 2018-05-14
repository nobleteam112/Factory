package telefonos;

public class Exec {
	 public static void main(String[] args) {
		Mobile Sg = MobileFactory.createMobile(Mobile.SAMSUNG);
                Mobile Ip = MobileFactory.createMobile(Mobile.IPHONE);
                Mobile Sn = MobileFactory.createMobile(Mobile.SONY);
                Mobile An = MobileFactory.createMobile(Mobile.ANDROID);
                Mobile Wp = MobileFactory.createMobile(Mobile.WINDOWSPHONE);
                Mobile Ai = MobileFactory.createMobile(Mobile.AIPHONE);
                
                   
                System.out.println(Sg);
                System.out.println(Ip);
                System.out.println(Sn);
                System.out.println(An);
                System.out.println(Wp);
                System.out.println(Ai);
	}
}
