package fr.insalyon.telecom.mgl.RomanNumberConverter;

public class RomanNumberConverter {

  public String convertTen(int x, String I,String V, String X) {
	String res="";
    if ((x!=(int)x)) {
      throw new IllegalArgumentException("invalid enter");
    }
    if (x>10) {
      throw new IllegalArgumentException("number should < 10");
    }
    else{
		
		switch(x){
			
			case 1: res=res+I;
				break;
			case 2: res=res+I+I;
				break;
			case 3: res=res+I+I+I;
				break;
			case 4: res=res+I+V;
				break;
			case 5: res=res+V;
				break;
			case 6: res=res+V+I;
				break;
			case 7: res=res+V+I+I;
				break;
			case 8: res=res+V+I+I+I;
				break;
			case 9: res=res+I+X;
				break;
			case 10: res=X;
			
		}
			
		
	}
    return res;
  }
  
  
}
