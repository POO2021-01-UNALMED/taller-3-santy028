package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	static int numTV;
	Control control;
	
	public TV (Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	
	public void setMarca (Marca marca) {
		this.marca=marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl (Control control) {
		this.control=control;
	}
	public Control getControl() {
		return control;
	}
	
	public void setPrecio (int precio) {
		this.precio=precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setCanal (int canal) {
		if(canal <1 || canal >120 ) {
			return;
		}
		
		this.canal=canal;
	} 
	public int getCanal() {
		return canal;
	}
	public void setVolumen (int volumen) {
		this.volumen=volumen;
	}
	public int getVolumen() {
		return volumen;
	}
	public static void setNumTV (int nut) {
		nut=numTV;
	}
	public static int getNumTV() {
		return numTV;
	}

	public void turnOn() {
		this.estado=true;
	}
	
	public void turnOff() {
		this.estado=false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	public void canalUp() {
		if(estado=true) {
		if(this.canal<=120 || this.canal>=1) {
         this.canal++;
		}
		else {
			return;
		}
		}
		else {return;}
	}
	public void canalDown() {
		if(estado=true) {
		if(this.canal<=120 || this.canal>=1) {
		this.canal--;
		}
		else {
			return;
		}
		}
		else {return;}
	}
	public void volumenUp() {
		if(estado=true) {
		if(this.volumen<=7 || this.canal>=0) {
		this.volumen++;
		}
		else {
			return;
		}
		}
		else {return;}
	}
	public void volumenDown() {
		if(estado=true) {
		if(this.volumen<=7 || this.canal>=0) {
		this.volumen--;
	}
		else {
			return;
		}
		}
		else {return;}
	
	
	
	


}
}
