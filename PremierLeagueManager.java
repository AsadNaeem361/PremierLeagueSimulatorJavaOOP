
package w1736783_cw;
import java.util.*;


interface LeagueManager
{
    
}



public class PremierLeagueManager implements LeagueManager
{
    
     PremierLeagueManager()
    {
        
    }
     
    
//    PremierLeagueManager(char choice)
//    {
//
//        
//        switch(choice)
//        {
//            case 'A' : System.out.println("Create a new football club and add it in the premier league");
//   //                    AddCustomerToQ( );
//                       System.out.println("--------------------------------------------");
//            break;
//            case 'B' : System.out.println("Delete (relegate) an existing football club from the premier league");
//    //                   ViewPassengerQ( );
//                       System.out.println("--------------------------------------------");
//            break;             
//            case 'C' : System.out.println("Display the various statistics for a selected club");
//    //                   RemoveCustomerFromQ( );
//                       System.out.println("--------------------------------------------");
//            break;               
//            case 'D' : System.out.println("Display the Premier League Table");
//     //                  Store( );
//                       System.out.println("--------------------------------------------");
//            break;
//            case 'E' : System.out.println("Add a played match");
//     //                  Load( );
//                       System.out.println("--------------------------------------------");
//            break;
//            case 'F' : System.out.println("Save information in a file");
//    //                    RunInSimulation( );   
//                       System.out.println("--------------------------------------------");
//            break;
//            case 'G' : System.out.println("The next time the application starts it should read all the information saved in the\n" +
//                                          "previous file (resume/recover the previous state of the program) and continue its\n" +
//                                          "operation based on that with the user being able to enter new information or change\n" +
//                                          "the existing information. ");
//            break;
//            default  : System.out.println("You entered an invalid choice");
//                       System.out.println("--------------------------------------------");
//        } 
//        
//        
//        
//    }
   
    public void CreateLeagueClub()
    {
        
    }
      
    public void DeleteLeagueClub()
    {
        
    }
    
    public void DisplayClubStats()
    {
        
    }
    
    public static void showMenu()
    {
        System.out.println("This is our Premier League User Menu \n");
        System.out.println("A = Create a new football club and add it in the premier league");
        System.out.println("V = Delete (relegate) an existing football club from the premier league");
        System.out.println("D = Display the various statistics for a selected club");
        System.out.println("S = Display the Premier League Table");
        System.out.println("L = Add a played match");
        System.out.println("O = The next time the application starts it should read all the information saved in the\n" +
                                "previous file (resume/recover the previous state of the program) and continue its\n" +
                                "operation based on that with the user being able to enter new information or change\n" +
                                "the existing information. ");
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) 
    {
     showMenu();
     Scanner in = new Scanner(System.in);
     System.out.println("Choose an Option please:");
     char choice = in.next().toUpperCase().charAt(0);
           switch(choice)
        {
            case 'A' : System.out.println("Create a new football club and add it in the premier league");
                       //CreateLeagueClub();
                       FootballClub club = new FootballClub();
                      // club.setName();
                       System.out.println("--------------------------------------------");
            break;
            case 'B' : System.out.println("Delete (relegate) an existing football club from the premier league");
    //                   ViewPassengerQ( );
                       System.out.println("--------------------------------------------");
            break;             
            case 'C' : System.out.println("Display the various statistics for a selected club");
    //                   RemoveCustomerFromQ( );
                       System.out.println("--------------------------------------------");
            break;               
            case 'D' : System.out.println("Display the Premier League Table");
     //                  Store( );
                       System.out.println("--------------------------------------------");
            break;
            case 'E' : System.out.println("Add a played match");
     //                  Load( );
                       System.out.println("--------------------------------------------");
            break;
            case 'F' : System.out.println("Save information in a file");
    //                    RunInSimulation( );   
                       System.out.println("--------------------------------------------");
            break;
            case 'G' : System.out.println("The next time the application starts it should read all the information saved in the\n" +
                                          "previous file (resume/recover the previous state of the program) and continue its\n" +
                                          "operation based on that with the user being able to enter new information or change\n" +
                                          "the existing information. ");
            break;
            default  : System.out.println("You entered an invalid choice");
                       System.out.println("--------------------------------------------");
        } 
           FootballClub ManchesterUnited = new FootballClub();
           PremierLeagueManager x = new PremierLeagueManager();
           x.CreateLeagueClub();
    }
    
}
