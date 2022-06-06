public class Person {
    private String name;
    private int canJumpHeight;
    private int canRunDistance;
    private int canSwimDistance;

    public Person(String name, int canJumpHeight, int canRunDistance, int canSwimDistance) {
        this.name = name;
        this.canJumpHeight = canJumpHeight;
        this.canRunDistance = canRunDistance;
        this.canSwimDistance = canSwimDistance;
    }

    public String getName() {
        return name;
    }

    public int getCanJumpHeight() {
        return canJumpHeight;
    }

    public int getCanRunDistance() {
        return canRunDistance;
    }

    public int getCanSwimDistance() {
        return canSwimDistance;
    }


}
