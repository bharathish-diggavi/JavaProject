package selenium;

public class Browser {
	
	String url;
	
	public Browser() {
		System.out.println("Browser is created..");
	}

	public void goTo(String url) {
		System.out.println("Browser now navigates to : " + url);
		this.url = url;
	}
	
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	public void minimize() {
		System.out.println("Browser is minimized");
	}
	
	public void maximize() {
		System.out.println("Browser is maximized");
	}
	
	public String getCurrentUrl() {
		return url;
	}
	
	public void enterSomeInput(String value, String where) {
		System.out.println("Entering " + value + " inside the " + where);
	}
}
