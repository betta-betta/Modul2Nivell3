
package rellotge;
import java.util.*;

public class Rellotge {

	public static void main(String[] args) {
		int hour=0;
		int minutes=0;
		int seconds=0;		
		
		for ( int i=hour;i<24;i++) {
			
			for(int j=minutes;j<60;j++) {
				
				for(int k=seconds;k<60;k++) {
					Formatter dobleHour = new Formatter();
					dobleHour.format("%02d",i);
					Formatter dobleMin = new Formatter();
					dobleMin.format("%02d",j);
					Formatter dobleSec = new Formatter();
					dobleSec.format("%02d",k);
					System.out.println(dobleHour+":"+dobleMin+":"+dobleSec);
					dobleHour.close();
					dobleMin.close();
					dobleSec.close();
					
					try {
						Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();	
						
						}   
					
				}
			}
		}
	}

}
