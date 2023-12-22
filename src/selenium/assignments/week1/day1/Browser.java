package Day1week1;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser lbrowser= new Browser();
		lbrowser.browserName();
		lbrowser.loadUrl();

	}
	public String launchBrowser(String browserName())
	{	  	
	System.out.println("Browser launched successfully");
	return browserName();
	

}
public void loadUrl()
{
	System.out.println("Application url loaded successfully");
}
}


