
package telefonos;

/**
 *
 * @author rabaj

public class Aiphone {
    public String Procesador;
    public String Memoria;
    public String Camara;

    public Aiphone(String Procesador, String Memoria, String Camara) {
        this.Procesador = Procesador;
        this.Memoria = Memoria;
        this.Camara = Camara;
    }

    public Aiphone() {
    }

    

    public String getProcesador() {
        this.Procesador = "A1 ";
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getMemoria() {
        this.Memoria = "86 GB ";
        return Memoria;
    }

    public void setMemoria(String Memoria) {
        this.Memoria = Memoria;
    }

    public String getCamara() {
        this.Camara = "16MPx ";
        return Camara;
    }

    public void setCamara(String Camara) {
        this.Camara = Camara;
    }
    
    
}
*  */

public class Aiphone implements Mobile{
	private String procesador;
	private String memoria;
        private String camara;
	public Aiphone(String prosesador, String memoria, String camara){
		this.procesador = procesador;
		this.memoria = memoria;
                this.camara = camara;
	}

    @Override
    public String toString() {
        return "Aiphone{" + "procesador=" + procesador + ", memoria=" + memoria + ", camara=" + camara + '}';
    }
        
        
}
