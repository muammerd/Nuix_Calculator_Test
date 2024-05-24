
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calculator {

    WebDriver driver = new ChromeDriver();
    String url = "https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html";

    //  Addition Test Scenario:
    //  Open the calculator web page.
    //  Enter a number first input field.
    //  Click on the addition (+) button.
    //  Enter another number to add to the first number.
    //  Click on the equal (=) button.
    //  Verify that the result displayed is the sum of the two numbers entered.

    @Test
    public void testingAddition() throws InterruptedException {


        // Open the calculator web page
        driver.get(url);
        Thread.sleep(3000);

        // Enter number, clicking 5
        WebElement firstInput = driver.findElement(By.cssSelector("input[value='5']"));
        firstInput.click();
        Thread.sleep(3000);
        // Click add button
        WebElement addButton = driver.findElement(By.id("add"));
        addButton.click();
        Thread.sleep(3000);

        // Enter numbers, clicking 3
        WebElement secondInput = driver.findElement(By.cssSelector("input[value='3']"));
        secondInput.click();
        Thread.sleep(3000);

        // Perform addition clicking equal button
        WebElement equButton = driver.findElement(By.xpath("//input[@value=\"=\"]"));
        equButton.click();
        Thread.sleep(3000);

        // Verify result
        WebElement resultField = driver.findElement(By.id("display"));
        System.out.println("Addition result is " + resultField.getText());
        Assert.assertEquals("8", resultField.getText());
        driver.close();
    }

    //  Subtraction Test Scenario:
    //  Open the calculator web page.
    //  Enter a number first input field.
    //  Click on the subtraction (-) button.
    //  Enter another number to subtract from the first number.
    //  Click on the equal (=) button.
    //  Verify that the result displayed is the difference between the two numbers you entered

    @Test
    public void testingSubtraction() throws InterruptedException {

        // Open the calculator web page
        driver.get(url);
        Thread.sleep(3000);

        // Enter numbers, clicking 9
        WebElement firstInput = driver.findElement(By.cssSelector("input[value='9']"));
        firstInput.click();
        Thread.sleep(3000);

        // Click subtraction button
        WebElement subButton = driver.findElement(By.id("subtract"));
        subButton.click();
        Thread.sleep(3000);

        // Enter numbers, clicking 4
        WebElement secondInput = driver.findElement(By.cssSelector("input[value='4']"));
        secondInput.click();
        Thread.sleep(3000);


        // Perform subtraction clicking equal button
        WebElement equButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/input[3]"));
        equButton.click();
        Thread.sleep(3000);

        // Verify result
        WebElement resultField = driver.findElement(By.id("display"));
        System.out.println("Subtraction result is " + resultField.getText());
        Assert.assertEquals("5", resultField.getText());
        driver.close();
    }


    //  Multiplication Test Scenario:
    //  Open the calculator web page.
    //  Enter a number first input field.
    //  Click on the multiplication (x) button.
    //  Enter another number to multiply by the first number.
    //  Click on the equal (=) button.
    //  Verify that the result displayed is the product of the two numbers you entered.

    @Test
    public void testingMultiplication() throws InterruptedException {
        // Open the calculator web page
        driver.get(url);
        Thread.sleep(3000);

        // Enter numbers, clicking 7
        WebElement firstInput = driver.findElement(By.cssSelector("input[value='7']"));
        firstInput.click();
        Thread.sleep(3000);

        // Click multiplication button
        WebElement multiplyButton = driver.findElement(By.id("multiply"));
        multiplyButton.click();
        Thread.sleep(3000);

        // Enter numbers, clicking 6
        WebElement secondInput = driver.findElement(By.cssSelector("input[value='6']"));
        secondInput.click();
        Thread.sleep(3000);


        // Perform subtraction clicking equal button
        WebElement equButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/input[3]"));
        equButton.click();
        Thread.sleep(3000);

        // Verify result
        WebElement resultField = driver.findElement(By.id("display"));
        System.out.println("Multiplication result is " + resultField.getText());
        Assert.assertEquals("42", resultField.getText());
        driver.close();
    }


    //  Division Test Scenario:
    //  Open the calculator web page.
    //  Enter a number first input field.
    //  Click on the division (÷) button.
    //  Enter another number to divide by the first number.
    //  Click on the equal (=) button.
    //  Verify that the result displayed is the quotient of the two numbers you entered.
    @Test
    public void testingDivision() throws InterruptedException {

        // Open the calculator web page
        driver.get(url);
        Thread.sleep(3000);

        // Enter numbers, clicking 8
        WebElement firstInput = driver.findElement(By.cssSelector("input[value='8']"));
        firstInput.click();
        Thread.sleep(3000);

        // Click division button
        WebElement divisionButton = driver.findElement(By.id("divide"));
        divisionButton.click();
        Thread.sleep(3000);

        // Enter numbers, clicking 4
        WebElement secondInput = driver.findElement(By.cssSelector("input[value='4']"));
        secondInput.click();
        Thread.sleep(3000);


        // Perform subtraction clicking equal button
        WebElement equButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/input[3]"));
        equButton.click();
        Thread.sleep(3000);

        // Verify result
        WebElement resultField = driver.findElement(By.id("display"));
        System.out.println("Division result is " + resultField.getText());
        Assert.assertEquals("2", resultField.getText());
        driver.close();
    }
}