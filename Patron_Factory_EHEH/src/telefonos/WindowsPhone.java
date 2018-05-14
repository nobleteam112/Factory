
package telefonos;

/**
 *
 * @author rabaj
 
public class WindowsPhone {
    public String Procesador;

    public WindowsPhone() {
    }
    
    
    

    public WindowsPhone(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getProcesador() {
        this.Procesador = "intel";
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }
    
    
    
}
* */

public class WindowsPhone implements Mobile{
	private String procesador;
	public WindowsPhone(String version){
		this.procesador = procesador;
	}
}
