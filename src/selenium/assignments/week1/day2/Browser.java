package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Browser brow=new Browser();
       //System.out.println("output : "+ 
       String ret = brow.launchBrowser("internet");
       System.out.println(ret + " Browser launched successfully");
        brow.loadUrl();
	}
	public String launchBrowser(String browserName) {
       //System.out.println("Browser installation initiated...");	
	   String val =  browserName + " explorer";
       return val;
	}
	public void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}
	
		
	}

