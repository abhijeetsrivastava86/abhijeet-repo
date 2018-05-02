/**
 * 
 */
package selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author abhijeets
 *
 */
public class Jenkins_Demo {

	@Test

	public void testgooglrsearch() {

		WebDriver driver = new FirefoxDriver();

		// it will open the goggle page

		driver.get("http://google.in");

		// we expect the title “Google “ should be present

		String Expectedtitle = "Google";

		// it will fetch the actual title

		String actualTitle = driver.getTitle();

		System.out.println("Before Assetion " + Expectedtitle + actualTitle);

		// it will compare actual title and expected title

		Assert.assertEquals(actualTitle, Expectedtitle);

		// print out the result

		System.out.println("After Assertion " + Expectedtitle + actualTitle + " Title matched ");

	}

}
