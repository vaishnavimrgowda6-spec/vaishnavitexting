package pqr;

	public class pqr {
	    public static void main(String[] args) {

	        for (int i = 1; i <= 5; i++) {
	            int stars = (i <= 4) ? i : 4;

	            for (int j = 1; j <= 4 - stars; j++) {
	                System.out.print("  ");
	            }

	            for (int j = 1; j <= stars; j++) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
	    }
	}


