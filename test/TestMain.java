import me.playwarrior.calculator.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestMain {

    @Test
    public void IsNotNullOrEmptyMethodCannotAcceptEmptyString() {
        //Arrange
        String s = "";

        //Act
        boolean isNotEmpty = Main.isNotNullOrEmpty(s);

        //Assert
        assertFalse(isNotEmpty);
    }

    @Test
    public void IsNotNullOrEmptyMethodCannotAcceptNull() {
        //Arrange
        String s = null;

        //Act
        boolean isNotEmpty = Main.isNotNullOrEmpty(s);

        //Assert
        assertFalse(isNotEmpty);
    }

    @Test
    public void IsNotNullOrEmptyMethodCanAcceptStringWithNums() {
        //Arrange
        String s = "1";

        //Act
        boolean isNotEmpty = Main.isNotNullOrEmpty(s);

        //Assert
        assertTrue(isNotEmpty);
    }

    @Test
    public void IsNotNullOrEmptyMethodCanAcceptStringWithLetters() {
        //Arrange
        String s = "A";

        //Act
        boolean isNotEmpty = Main.isNotNullOrEmpty(s);

        //Assert
        assertTrue(isNotEmpty);
    }

    @Test
    public void CanUseParseIntWithNumber() {
        //Arrange
        String s = "1";

        //Act
        int num = Main.parseInt(s);

        //Assert
        assertEquals(1, num);
    }

    @Test
    public void CannotUseParseIntWithLetters() {
        //Arrange
        String s = "A";

        //Act
        int num = Main.parseInt(s);

        //Assert
        assertEquals(-1, num);
    }

    @Test
    public void CanUseParseIntWithNegativeNumber() {
        //Arrange
        String s = "-2";

        //Act
        int num = Main.parseInt(s);

        //Assert
        assertEquals(-2, num);
    }

    @Test
    public void CanUseCalculateWithAddition() {
        //Arrange
        int num1 = 4, num2 = 3, answer = 7;

        //Act
        double calculated = Main.calculate(num1, num2, "+");

        //Assert
        assertEquals(answer, calculated);
    }

    @Test
    public void CanUseCalculateWithSubtraction() {
        //Arrange
        int num1 = 4, num2 = 3, answer = 1;

        //Act
        double calculated = Main.calculate(num1, num2, "-");

        //Assert
        assertEquals(answer, calculated);
    }

    @Test
    public void CanUseCalculateWithMultiplication() {
        //Arrange
        int num1 = 4, num2 = 3, answer = 12;

        //Act
        double calculated = Main.calculate(num1, num2, "*");

        //Assert
        assertEquals(answer, calculated);
    }

    @Test
    public void CanUseCalculateWithDivision() {
        //Arrange
        int num1 = 12, num2 = 3, answer = 4;

        //Act
        double calculated = Main.calculate(num1, num2, "/");

        //Assert
        assertEquals(answer, calculated);
    }
}
