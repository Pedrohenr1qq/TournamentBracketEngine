package data.core;

public class Match {
    private final int id;
    private Team teamA;
    private Team teamB;
    private String status;

    public Match(int id, Team teamA, Team teamB, String status) {
        this.id = id;
        this.teamA = teamA;
        this.teamB = teamB;
        this.status = status;
    }

    public void show(){
        System.out.println("==========================");
        System.out.println("Team A: " + teamA.getName());
        System.out.println("Team B: " + teamB.getName());
        System.out.println("Status: " + status);
    }
}
