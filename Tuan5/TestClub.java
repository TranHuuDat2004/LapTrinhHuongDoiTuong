public class TestClub {
    public static void main(String[] args) {
        Club club1 = new Club("Barcelona", 7, 2, 0);
        Club club2 = new Club(club1);
        
        System.out.println("Club 1: " + club1.toString());
        System.out.println("Club 2: " + club2.toString());
        
        System.out.println("Number of matches played by Club 1: " + club1.numMatchesPlayed());
        
        club1.setDraws(3);
        club1.setLosses(2);
        club2.setName("Real Madrid");
        
        System.out.println("Updated Club 1: " + club1.toString());
        System.out.println("Updated Club 2: " + club2.toString());
        
        System.out.println("Points of Club 1: " + club1.getPoints());
        System.out.println("Points of Club 2: " + club2.getPoints());
        
        System.out.println("Is Club 1 finished: " + club1.isFinish());
        System.out.println("Is Club 2 finished: " + club2.isFinish());
    }
}


