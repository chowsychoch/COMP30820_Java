package ma.mainProject;

public class LimitedPlayer extends Player{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name +" (Limited Player)";
    }
    //method to add points
    @Override
    public void addPoint(int point) {
        if (point !=0){
            System.out.println("You won the game, Limited Player get a half point, which is " +  point / 2 + " points");
        }else{
            System.out.println("Wrong guess! added " +point + " points");
        }
        points += point / 2;
    }

}
