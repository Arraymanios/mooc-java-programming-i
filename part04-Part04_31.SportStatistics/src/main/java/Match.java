/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
public class Match {
    
    private String home, visitors;
    private int homePoints, visitorsPoints;
    
    public Match(String home, String visitors, int homePoints, int visitorsPoints){
        this.home = home;
        this.visitors = visitors;
        this.homePoints = homePoints;
        this.visitorsPoints = visitorsPoints;
    }
    
    public String getHome(){
        return this.home;
    }
    
    public String getVisitors(){
        return this.visitors;
    }
    
    public int getHomePoints(){
        return this.homePoints;
    }
    
    public int getVisitorsPoints(){
        return this.visitorsPoints;
    }
    
    public String toString(){
        return this.home + "," + this.visitors + "," + this.homePoints + "," + this.visitorsPoints; 
    }
}
