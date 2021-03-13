package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void enlazar (TV tv) {
	this.tv=tv;
	tv.control=this;
	
	
}
	public void setTv (TV t) {
		t=this.tv;
	}
	public TV getTv() {
		return tv;
	}
	
	public void setCanal (int can) {
		if(can <1 || can >120 || this.tv.getEstado() == false) {
			return;
		}
		this.tv.setCanal(can);
	} 
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	


public void canalUp() {
this.tv.canalUp();
}
public void canalDown() {
	this.tv.canalDown();
}
public void volumenUp() {
	this.tv.volumenUp();
}
public void volumenDown() {
this.tv.volumenDown();
}






}
