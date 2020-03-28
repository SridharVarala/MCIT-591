package test5;

public class Lamp {
	
	private boolean isOn = false;
	
	public Lamp(boolean isOn) {
		
		this.isOn =isOn;
		int x;
		int y;
	}
	
	public void turnOnLamp() {
		
		
		this.isOn =true;
	}
	
	
	public static void main(String args[]) {
		
		
		Lamp []lamps = new Lamp[4];
		
		
		
		for ( int i =0 ; i < lamps.length ; i++) {
			
			lamps[i] = new Lamp(false);
			
		System.out.println(lamps[i].isOn);	
		
		lamps[i].turnOnLamp();
		
		System.out.println(lamps[i].isOn);	
	
}
}
}