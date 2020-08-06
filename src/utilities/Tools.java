package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

	public class Tools {
		public static void cerrarBanner(WebDriver driver) {
			if (driver instanceof JavascriptExecutor) {
			    ((JavascriptExecutor)driver).executeScript("document.getElementById(\"qcCmpUi\").classList.remove(\"qc-cmp-ui\")");
			} else {
			    throw new IllegalStateException("This driver does not support JavaScript!");
			}
		}
}
