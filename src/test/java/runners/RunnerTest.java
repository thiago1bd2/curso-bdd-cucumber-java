package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        tags = "@SeuBarriga",
        glue = "steps",
        plugin = {"pretty","html:target/reports/report-html.html"},
        monochrome = true
)
public class RunnerTest {

    @BeforeClass
    public static void reset(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/");
        driver.findElement(By.id("email")).sendKeys("st@st.com");
        driver.findElement(By.id("senha")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.linkText("reset")).click();
        driver.quit();
    }
}
