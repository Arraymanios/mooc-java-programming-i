/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {
    
    private ArrayList<Integer> grades;
    private Scanner reader;
    
    public Statistics(){
        this.grades = new ArrayList<>();
        this.reader = new Scanner(System.in);
    }
    
    public void inputGrades(){
        int input;
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            input = Integer.valueOf(this.reader.nextLine());
            if(input == -1){
                break;
            } else if (input < 0 || input > 100){
                ;
            } else {
                this.grades.add(input);
            }
        }   
    }
    
    public void printGrades(){
        System.out.println("Grades registered:\n");
        for(Integer grade: this.grades){
            System.out.println(grade);
        }
    }
    
    public void averageAll(){
        int sum = 0;
        for(Integer grade: this.grades){
            sum += grade;
        }
        System.out.println("Point average (all): " + 1.0 * (sum/this.grades.size()));
    }
    
    public void averagePassing(){
        int sum = 0, size = 0;
        
        for(Integer grade: this.grades){
            if(grade >= 50){
                sum += grade;
                size++;
            }
        }
        if(sum == 0){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + 1.0 * (sum/size));
        }
    }
    
    public void passPercentage(){
        int passing = 0, participants = this.grades.size();
        
        for(Integer grade: this.grades){
            if(grade >= 50)passing++;
        }
        System.out.println("Pass percentage: " + 100 * (1.0 * passing/participants)); 
    }
    
    public void gradeDistribution(){
        int[] distribution = {0, 0, 0, 0, 0, 0};
        
        for(Integer grade: this.grades){
            if(grade < 0 || grade > 100){
                ;
            } else if (grade < 50){
                distribution[0] += 1;
            } else if (grade >= 50 && grade < 60){
                distribution[1] += 1;
            } else if (grade >= 60 && grade < 70){
                distribution[2] += 1;
            } else if (grade >= 70 && grade < 80){
                distribution[3] += 1;
            } else if (grade >= 80 && grade < 90){
                distribution[4] += 1;
            } else if (grade >= 90){
                distribution[5] += 1;
            }
        }
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--){
            System.out.println(i + ": " + "*".repeat(distribution[i]));
        }
    }
}
