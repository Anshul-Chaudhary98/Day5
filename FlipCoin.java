package day5assignments;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float headspercentage=0,tailspercentage = 0,tails=0,heads=0;
        int numberoftime=0;
	    while(numberoftime <= 1000) {
    	    numberoftime++;  
		    float flip = (float) (Math.random());

		    if(flip<0.5) {
			    tails += 1;
       		}
		    else {
//			    heads += 1;
		    }
	    	tailspercentage = tails/10;
	        headspercentage = 100 - tailspercentage;
	    }
		System.out.println("Tails Percentage: " + tailspercentage);
		System.out.println("Heads Percentage: " + headspercentage);
	}
}
