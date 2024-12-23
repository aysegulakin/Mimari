package _22010310005_Aysegul_Akin_;

public class _22010310005_JKFlipFlop {
	
	
    private int IEN=0;

    public _22010310005_JKFlipFlop() {
       
    }
    public void IEN (boolean J, boolean K) {
         if (!J && K) {
        	 IEN=0;
           System.out.println("IEN = "+IEN+" yüklendi"); 
        } else if (J && !K) {
            IEN=1;
            System.out.println("IEN = "+IEN+" yüklendi"); 
        }
    }
   
    }

