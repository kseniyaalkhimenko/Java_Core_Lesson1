public class Course {

    String result;
    private int jumpHeight;
    private int runDistance;
    private int swimDistance;

    public Course(int jumpHeight, int runDistance, int swimDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public String doCourse (Team team){


        result = "Let's start the competition. Team " + team.getName() + ": " + '\n';

        for (Person person: team.getTeam()){
            result += "Team member " + person.getName() + " " + '\n';
            int value1 = person.getCanJumpHeight();
            int value2 = person.getCanRunDistance();
            int value3 = person.getCanSwimDistance();
            testJumpHeight(value1);
            testRunDistance(value2);
            testSwimDistance(value3);

        }

        return result;

    }


    private void testJumpHeight(int value1){
        if(value1 < jumpHeight) result += "Can't jump to the set height" + '\n';
        else result += "Successfully jumped to the set height" + '\n';
    }

    private void testRunDistance(int value2){
        if(value2 < runDistance) result += "Can't run so long distance" + '\n';
        else result += "Successfully ran the set distance" + '\n';
    }

    private void testSwimDistance(int value3){
        if(value3 < swimDistance) result += "Can't swim so long distance" + '\n';
        else result += "Successfully swam the set distance" + '\n';
    }



}
