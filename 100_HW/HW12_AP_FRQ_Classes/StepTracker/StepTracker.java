public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int daysTracked;
    private int activeDays;

    public StepTracker(int min) {
        minSteps = min;
        totalSteps = 0;
        daysTracked = 0;
        activeDays = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps = totalSteps + steps;
        daysTracked++;

        if (steps >= minSteps) {
            activeDays++;
        }
    }


    public int activeDays() {
    return activeDays;
}

    public double averageSteps() {
    if (daysTracked == 0) {
        return 0.0;
    }

    return (double) totalSteps / daysTracked;
}






}