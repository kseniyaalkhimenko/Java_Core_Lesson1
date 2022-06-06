public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[4];
        person[0] = new Person ("Jack", 2, 5000, 100);
        person[1] = new Person ("Alise", 1, 3000, 150 );
        person[2] = new Person ("Bob", 1, 3500, 75);
        person[3] = new Person("Megan", 2, 4000, 125);
        Team team = new Team("Juniors", person);

       Course course = new Course(1,4000,100);

        System.out.println("Information about team " + team.getName() + ":");
        for (int i = 0; i < person.length; i++ ){
        System.out.println((i +1) + " member " + person[i].getName()
                + ", can jump " + person[i].getCanJumpHeight()
                + " meters, can run " + person[i].getCanRunDistance()
                + " meters, can swim " + person[i].getCanSwimDistance() + " meters.");
        }
        
        String result = course.doCourse(team);

       System.out.println(result);

    }
}
