package _22010310005_Aysegul_Akin_;
import java.util.ArrayList;

public class _22010310005_ControlDate {
	

	
	_22010310005_ControlDate (){
		
	}
	
	
	public boolean AND(ArrayList<Boolean>and) {
		boolean result= true;
		
		for (boolean Sonuclar: and) {
			result = result&&  Sonuclar;
		}
		
		return result;
	}
	
	public boolean OR(ArrayList<Boolean>Sonuc) {
		boolean result = false;

		for (boolean Sonuclar: Sonuc) {
			result = result||  Sonuclar;
		}
		return result;
	}
	
	
	public boolean Not(boolean not) {
		
		return !not;
	}
	

}
