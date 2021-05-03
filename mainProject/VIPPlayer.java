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
}
