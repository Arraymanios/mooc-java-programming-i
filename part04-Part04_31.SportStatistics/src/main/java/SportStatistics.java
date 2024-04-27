
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Match> Data = new ArrayList<>();
        int gamesPlayed = 0, wins = 0, losses = 0;
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                
                String [] statistics = line.split(",");
                String home = statistics[0];
                String visitors = statistics[1];
                int homePoints = Integer.valueOf(statistics[2]);
                int visitorsPoints = Integer.valueOf(statistics[3]);
                
                Data.add(new Match(home, visitors, homePoints, visitorsPoints));
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        for(Match match: Data){
            if(match.getHome().equals(team) || match.getVisitors().equals(team)){
                gamesPlayed++;
            }
            
            if(match.getHome().equals(team)){
                if(match.getHomePoints() > match.getVisitorsPoints()){
                    wins++;
                } else{
                    losses++;
                }
            }
            
            if(match.getVisitors().equals(team)){
                if(match.getVisitorsPoints() > match.getHomePoints()){
                    wins++;
                } else{
                    losses++;
                }
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Games: " + gamesPlayed);
    }
}