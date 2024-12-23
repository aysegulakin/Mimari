package _22010310005_Aysegul_Akin_;
import java.util.ArrayList;


public class _22010310005_Signal {

	

	private boolean D0= false;
	private boolean D1=false;
	private boolean D2=false;
	private boolean D3=false;
	private boolean D4=false;
	private boolean D5=false;
	private boolean D6=false;
	private boolean D7=false;


	
	private boolean I= false;
	private boolean R=false;
	
	
	private boolean T0= false;
	private boolean T1= false;
	private boolean T2= false;
	private boolean T3= false;
	private boolean T4= false;
	private boolean T5= false;
	
	
	private boolean B0=false;
	private boolean B5=false;
	private boolean B6=false;
	private boolean B7=false;
	private boolean B9=false;
	private boolean B11=false;

	

	_22010310005_ControlDate kapi = new _22010310005_ControlDate();



	public _22010310005_Signal() {
		
	}

	public void SinyalAl(String[] kelimeler) {
		D0= D1= D2= D3= D4= D5= D6=D7= false;
		T0= T1= T2= T3= T4= T5= false;
		I=R= false;
		B0 =B5=B6=B7=B9=B11= false;
		
		for (String kelime : kelimeler) {
			
			if (kelime.equals("R")) {
				R = true;
			}  if (kelime.equals("R'")) {
				R = false;
			} if (kelime.equals("D0")) {
				D0 = true;
			}  if (kelime.equals("D1")) {
				D1 = true;
			}  if (kelime.equals("D2")) {
				D2 = true;
			}  if (kelime.equals("D3")) {
				D3 = true;
			}  if (kelime.equals("D4")) {
				D4 = true;
			}  if (kelime.equals("D5")) {
				D5 = true;
			} if (kelime.equals("D6")) {
				D6 = true;
			}  if (kelime.equals("D7")) {
				D7 = true;
			}  if (kelime.equals("D7'")) {
				D7 = false;
			}  if (kelime.equals("I")) {
				I = true;
			}  if (kelime.equals("I'")) {
				I = false;
			}  if (kelime.equals("T0")) {
				T0 = true;
			}  if (kelime.equals("T1")) {
				T1 = true;
			}  if (kelime.equals("T2")) {
				T2 = true;
			}  if (kelime.equals("T3")) {
				T3 = true;
			}  if (kelime.equals("T4")) {
				T4 = true;
			}  if (kelime.equals("T5")) {
				T5 = true;
			}   if (kelime.equals("B0")) {
				B0 = true;
			}   if (kelime.equals("B5")) {
				B5 = true;
			}  if (kelime.equals("B6")) {
				B6 = true;
			}  if (kelime.equals("B7")) {
				B7 = true;
			}   if (kelime.equals("B9")) {
				B9 = true;
			}  if (kelime.equals("B11")) {
				B11 = true;
			}

		}

		_22010310005_Register AR = new _22010310005_Register("AR");
		_22010310005_Register PC = new _22010310005_Register("PC");
		_22010310005_Register DR = new _22010310005_Register("DR");
		_22010310005_Register AC = new _22010310005_Register("AC");
		_22010310005_Register IR = new _22010310005_Register("IR");
		_22010310005_Register TR = new _22010310005_Register("TR");
		_22010310005_Register M = new _22010310005_Register("M[AR]");

		_22010310005_ControlDate kapi = new _22010310005_ControlDate();
		_22010310005_JKFlipFlop IEN = new _22010310005_JKFlipFlop();
		_22010310005_DFlipFlop S= new _22010310005_DFlipFlop();

		ArrayList <Boolean> Jk = new ArrayList<Boolean>();
		ArrayList <Boolean> D = new ArrayList<Boolean>();

		ArrayList<Boolean> Ar_LD = new ArrayList<Boolean>();
		ArrayList<Boolean> Pc_LD = new ArrayList<Boolean>();
		ArrayList<Boolean> Dr_LD = new ArrayList<Boolean>();
		ArrayList<Boolean> Ac_LD = new ArrayList<Boolean>();
		ArrayList<Boolean> Ir_LD = new ArrayList<Boolean>();
		ArrayList<Boolean> Tr_LD = new ArrayList<Boolean>();
		ArrayList<Boolean> M_LD = new ArrayList<Boolean>();

		ArrayList<Boolean> Ar_INR = new ArrayList<Boolean>();
		ArrayList<Boolean> Pc_INR = new ArrayList<Boolean>();
		ArrayList<Boolean> Dr_INR = new ArrayList<Boolean>();
		ArrayList<Boolean> Ac_INR = new ArrayList<Boolean>();
		
		ArrayList<Boolean> Ar_CLR = new ArrayList<Boolean>();
		ArrayList<Boolean> Pc_CLR = new ArrayList<Boolean>();
		ArrayList<Boolean> Ac_CLR = new ArrayList<Boolean>();
		
		
		if (!R && T0) {
			AR.LD();
			Ar_LD.add(kapi.Not(R));
			Ar_LD.add(T0);
			kapi.AND(Ar_LD);
			

		}else if (!R && T1) {
			Pc_INR.add(kapi.Not(R));
			Pc_INR.add(T1);
			kapi.AND(Pc_INR);

			Ir_LD.add(kapi.Not(R));
			Ir_LD.add(T1);
			kapi.AND(Pc_INR);

			PC.INR();
			IR.LD();

		} else if (!R && T2) {
			Ar_LD.add(kapi.Not(R));
			Ar_LD.add(T2);
			kapi.AND(Ar_LD);
			AR.LD();

		}  else if (R && T0) {
			Ar_CLR.add(R);
			Ar_CLR.add(T0);
			kapi.AND(Ar_CLR);

			AR.CLR();

			Tr_LD.add(R);
			Tr_LD.add(T0);
			kapi.AND(Tr_LD);
			TR.LD();

		} else if (R && T1) {
			Pc_CLR.add(R);
			Pc_CLR.add(T1);
			kapi.AND(Pc_CLR);

			PC.CLR();

			M_LD.add(R);
			M_LD.add(T1);
			kapi.AND(M_LD);

			M.LD();

		} else if (R && T2) {
			Pc_INR.add(R);
			Pc_INR.add(T2);
			kapi.AND(Pc_INR);
			PC.INR();

			Jk.add(R);
			Jk.add(T2);
			boolean K = kapi.AND(Jk);
			IEN.IEN(false, K);
			
		} else if (D0 && T4) {
			Dr_LD.add(D0);
			Dr_LD.add(T4);
			kapi.AND(Dr_LD);
			DR.LD();

		} else if (D0 && T5) {
			Ac_LD.add(D0);
			Ac_LD.add(T5);
			kapi.AND(Ac_LD);
			AC.LD();

		} else if (D1 && T4) {
			Dr_LD.add(D1);
			Dr_LD.add(T4);
			kapi.AND(Dr_LD);
			DR.LD();

		} else if (D1 && T5) {
			
			
			Ac_LD.add(D1);
			Ac_LD.add(T5);
			kapi.AND(Dr_LD);
			AC.LD();

		} else if (D2 && T4) {
			Dr_LD.add(D2);
			Dr_LD.add(T4);
			kapi.AND(Dr_LD);
			DR.LD();

		} else if (D2 && T5) {
			Ac_LD.add(D2);
			Ac_LD.add(T5);
			kapi.AND(Ac_LD);
			AC.LD();

		} else if (D3 && T4) {
			M_LD.add(D3);
			M_LD.add(T4);
			kapi.AND(M_LD);
			M.LD();

		} else if (D4 && T4) {
			Pc_LD.add(D4);
			Pc_LD.add(T4);
			kapi.AND(Pc_LD);
			PC.LD();

		} else if (D5 && T4) {
			Ar_INR.add(D5);
			Ar_INR.add(T4);
			kapi.AND(Ar_INR);
			AR.INR();

			M_LD.add(D5);
			M_LD.add(T4);
			kapi.AND(M_LD);
			M.LD();

		} else if (D5 && T5) {
			Pc_LD.add(D5);
			Pc_LD.add(T5);
			kapi.AND(Pc_LD);
			PC.LD();

		} else if (D6 && T4) {
			Dr_LD.add(D6);
			Dr_LD.add(T4);
			kapi.AND(Dr_LD);
			DR.LD();

		} else if (D6 && T5) {
			Dr_INR.add(D6);
			Dr_INR.add(T5);
			kapi.AND(Dr_INR);
			DR.INR();

		} else if (D7 && !I && T3 && B11) {
			Ac_CLR.add(D7);
			Ac_CLR.add(kapi.Not(I));
			Ac_CLR.add(T3);
			Ac_CLR.add(B11);
			kapi.AND(Ac_CLR);
			AC.CLR();

		}  else if (D7 && !I && T3 && B9) {
			Ac_LD.add(D7);
			Ac_LD.add(kapi.Not(I));
			Ac_LD.add(T3);
			Ac_LD.add(B9);
			kapi.AND(Ac_LD);
			AC.LD();

		}  else if (D7 && !I && T3 && B7) {
			Ac_LD.add(D7);
			Ac_LD.add(kapi.Not(I));
			Ac_LD.add(T3);
			Ac_LD.add(B7);
			kapi.AND(Ac_LD);
			AC.LD();
		} else if (D7 && !I && T3 && B6) {
			Ac_LD.add(D7);
			Ac_LD.add(kapi.Not(I));
			Ac_LD.add(T3);
			Ac_LD.add(B6);
			kapi.AND(Ac_LD);
			AC.LD();

		} else if (D7 && !I && T3 && B5) {
			Ac_INR.add(D7);
			Ac_INR.add(kapi.Not(I));
			Ac_INR.add(T3);
			Ac_INR.add(B5);
			kapi.AND(Ac_INR);
			AC.INR();

		} else if (D7 && !I && T3 && B0) {
		
			D.add(D7);
			D.add(kapi.Not(I));
			D.add(T3);
			D.add(B0);
			kapi.AND(D);
			S.D(0);
			

			

		} else if (D7 && I && T3 && B11) {
			Ac_LD.add(D7);
			Ac_LD.add(I);
			Ac_LD.add(T3);
			Ac_LD.add(B11);
			kapi.AND(Ac_LD);
			AC.LD();

		} else if (D7 && I && T3 && B7) {

			Jk.add(D7);
			Jk.add(I);
			Jk.add(T3);
			boolean p = kapi.AND(Jk);
			Jk.add(B7);
			boolean j = kapi.AND(Jk);

			IEN.IEN(j, false);

		} else if (D7 & I & T3 & B6) {

			Jk.add(D7);
			Jk.add(I);
			Jk.add(T3);
			boolean p = kapi.AND(Jk);
			Jk.add(B6);
			boolean K = kapi.AND(Jk);
			IEN.IEN(false, K);

		}else if (!D7 && I && T3) {
			Ar_LD.add(kapi.Not(D7));
			Ar_LD.add(I);
			Ar_LD.add(T3);
			kapi.AND(Ar_LD);
			AR.LD();

		}
		

	
	}

}
