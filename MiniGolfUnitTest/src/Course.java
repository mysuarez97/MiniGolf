import javafx.beans.binding.When;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Course
{
    @Test
    public String playersName()
    {
        //Given
        String name;
        Scanner inputName = new Scanner(System.in);
        //When
        name = inputName.next();
        //Then
        return name;
    }
    @Test
    public int numOfHole()
    {
        //Given
        int currHole = 0;
        //When
        ++currHole;
        //Then
        return currHole;
    }
    @Test
    public int parForEacHole()
    {
        //Given
        int par = 0;
        //When
        ++par;
        //Then
        return par;
    }
}
