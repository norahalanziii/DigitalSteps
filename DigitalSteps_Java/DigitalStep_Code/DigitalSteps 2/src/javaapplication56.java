
public class  javaapplication56 {
    private static int pointsCounter1 = 0;
    private static int pointsCounter2= 0;
    private static int pointsCounter3= 0;
    private static int pointsCounterScore= 0;
     
    
    //======================================================================
    private static int QuizCounter= 0;
     private static int QuizPlayerCounter= 0;

    public static int getQuizCounter() {
        return QuizCounter;
    }

    public static void setQuizCounter(int QuizCounter) {
        javaapplication56.QuizCounter = QuizCounter;
    }

    public static int getQuizPlayerCounter() {
        return QuizPlayerCounter;
    }

    public static void setQuizPlayerCounter(int QuizPlayerCounter) {
        javaapplication56.QuizPlayerCounter = QuizPlayerCounter;
    }
     public static void QuizPlayerCounterIncrease() {
        QuizPlayerCounter++;
    }
   public static void QuizCounterIncrease() {
        QuizCounter++;
    }
    //========================================================================
    
    
    
private String nickname2;

    public String getNickname2() {
        return nickname2;
    }

    public void setNickname2(String nickname2) {
        this.nickname2 = nickname2;
    }

   
    public static void incrementPoints() {
        pointsCounter1++;
    }

    public static int getPointsCounterScore() {
        return pointsCounterScore;
    }

    public static void setPointsCounterScore(int pointsCounterScore) {
        javaapplication56.pointsCounterScore = pointsCounterScore;
    }

     public static void IncreasepointsCounterScore() {
        pointsCounterScore++;
    }
    public static int getPoints1() {
        return pointsCounter1;
    }
    
    
    public static void incrementPoints2() {
        pointsCounter2++;
    }

    public static int getPoints2() {
        return pointsCounter2;
    }
    
    

    public static void incrementPoints3() {
        pointsCounter3++;
    }

    public static int getPoints3() {
        return pointsCounter3;
    }
}
