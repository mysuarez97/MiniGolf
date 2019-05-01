import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Round
{
    @Test
    public int enterStrokes()
        {
            //Given
            int Strokes;
            Scanner inputStrokes = new Scanner(System.in);
            //When
            Strokes = inputStrokes.nextInt();
            //Then
            return Strokes;
        }
    @Test
    public int NumOfHolesCompleted()
    {
        //Given
        int [] Holes = new int[18];
        //When
        Scanner inputHole = new Scanner(System.in);
        Holes[] = inputHole.nextLine();
        //Then
        return Holes;
    }
    @Test
    public int currentScore()
    {
        //Given
        int Score=0;
        int currScore=0;
        //When
        currScore = currScore+Score;
        //Then
        return currScore;
    }

}
