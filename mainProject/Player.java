package ma.mainProject;

public class Player {
	//fields
	int points = 0;
	String name;
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//method to add points
	public void addPoint(int point) {
		if (point !=0){
			System.out.println("You won the toss + 50 points");
		}else{
			System.out.println("Wrong guess! 0 points");
		}
		points += point;
	}

	@Override
	public String toString() {
		return name + " : " + points;
	}

}
