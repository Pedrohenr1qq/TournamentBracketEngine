import data.core.Match;
import data.core.Team;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Team teamA = new Team(1, "IPJO");
        Team teamB = new Team(2, "IPC");
        Match match = new Match(1, teamA, teamB, "Pending");
        match.show();
    }
}