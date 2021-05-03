package ma.mainProject;

public class VIPPlayer extends Player{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name +" (VIP)";
    }

    //method to add points
    @Override
    public void addPoint(int point) {
        if (point !=0){
            System.out.println("You won the game, VIP Player get a double point, which is " + 2 * point + " points");
        }else{
            System.out.println("Wrong guess! added " +point + " points");
        }
        points += point * 2;
    }
}
