public class Main
{
    public String getCourse()
    {
     //Given
        String Course;
     //When
        Course ="Pirate's Bay";
     //Then
     return Course;
    }
    public int newRound()
    {
        //Given
        int round = 0;
        //When
        ++round;
        //Then
        return round;
    }
    public String displayCurrentScore()
    {
        //Given
        String currScore= "3";
        //When
        System.out.println(currScore);
        //Then
        return currScore;
    }
}
