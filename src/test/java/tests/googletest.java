package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class googletest<Public> {




    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div")).click();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")).click();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")).click();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[1]/div/div")).click();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();




        Assertions.assertEquals(11, By.cssSelector("#search").findElements(driver).size());

        driver.quit();
    }



}
