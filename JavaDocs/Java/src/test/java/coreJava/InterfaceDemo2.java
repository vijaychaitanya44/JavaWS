package coreJava;

interface Cricket{
	
	int overs = 50; 
	String stadium = "Wankhade";
	void bowling();
	void batting();
	void upmiring();
}

interface Stats extends Sales{
	void runs();
	void wickets();
	void centuries();
}

interface Sales{
	
	void tickets();
}

class Player implements Cricket,Stats {

	@Override
	public void bowling() {
		System.out.println("Does Bowling");
		
	}

	@Override
	public void batting() {
		System.out.println("Does batting");
		
	}

	@Override
	public void upmiring() {
		System.out.println("NA");
		
	}

	@Override
	public void runs() {
		// TODO Auto-generated method stub
		System.out.println("batsmen Runs");
	}

	@Override
	public void wickets() {
		// TODO Auto-generated method stub
		System.out.println("bowler wickets");
	}

	@Override
	public void centuries() {
		// TODO Auto-generated method stub
		System.out.println("Centuries");
	}

	@Override
	public void tickets() {
		// TODO Auto-generated method stub
		System.out.println("VIP Tickets");
	}
	
	
}
	


public class InterfaceDemo2 {

	public static void main(String[] args) {

		Cricket c = new Player();
		c.batting();
		c.bowling();
		c.upmiring();
		System.out.println(c.stadium);
		System.out.println(c.overs);
		Stats st = new Player();
		
		st.centuries();
		st.runs();
		st.wickets();
		st.tickets();
		

	}

}
