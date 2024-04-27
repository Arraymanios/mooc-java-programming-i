public class Main {

    public static void main(String[] args) {
       Statistics dataSet = new Statistics();
       
       dataSet.inputGrades();
       dataSet.averageAll();
       dataSet.averagePassing();
       dataSet.passPercentage();
       dataSet.gradeDistribution();
    }
}