public class SkiJumper extends Athlete implements Flier{

	private int _numofjumps;
	
	public SkiJumper (String first, String last){
		super(first, last);
		_numofjumps = 0;
	}

	public void fly(){
		_numofjumps++;
	}

	public int getJumps(){
		return _numofjumps;
	}
	
	public void train(double time){
		_hours += time;
	}

	public String toString(){
		return super.toString() + " | Number of jumps: " + _numofjumps;
	}
	


}
