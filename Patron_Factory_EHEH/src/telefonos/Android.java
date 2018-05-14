
package telefonos;
/**
public class Android {
    public String Version;
    public String RAM;

    public Android(String Version, String RAM) {
        this.Version = Version;
        this.RAM = RAM;
    }

    public Android() {
    }

   

    public String getVersion() {
        this.Version = "Android 6.0 ";
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getRAM() {
        this.RAM = "2.6GB ";
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
    
    
    
}
**/

public class Android implements Mobile{
	private String version;
	private String ram;
	public Android(String version, String ram){
		this.version = version;
		this.ram = ram;
	}

    @Override
    public String toString() {
        return "Android{" + "version=" + version + ", ram=" + ram + '}';
    }
        
        
}
