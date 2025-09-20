package week2.day1;

public class Browser {
	public void launchBrowser(String browserName){
		System.out.println(browserName);
	}
	public void loadUrl(){
		System.out.println("https://www.google.com/");
	}
	public static void main(String[] args) {
		Browser browseOptions = new Browser();
		browseOptions.launchBrowser("Google Chrome");
		browseOptions.loadUrl();
	}
}
