public class Team {

    private String name;
    private Person[] team;

    public Team(String name, Person[] team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public Person[] getTeam() {
        return team;
    }
}
