package _22010310005_Aysegul_Akin_;

public class _22010310005_Register {
	
	private String name;
	private boolean load;
	private boolean clear;
	private boolean increment;
	 
	public _22010310005_Register() {
		
	}
	public _22010310005_Register(String name) {
		this.name=name;
		this.load=false;
		this.clear=false;
		this.increment= false;
	}
	public void LD() {
		load= true;
		System.out.println(name+ " register’ının Load girişi aktif edilir");
	}
	public void INR() {
		increment= true;
		System.out.println(name+ " register’ının Increment girişi aktif edilir. ");
	}
	public void CLR() {
		clear= true;
		System.out.println(name+ " register’ının Clear girişi aktif edilir. ");
		
		
	}

}