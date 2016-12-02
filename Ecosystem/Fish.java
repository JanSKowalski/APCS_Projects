public class Fish extends Animal{

    // constructor
    public Fish (Ecosystem eco, int pos){
	super(eco,pos);
    }

    // override 
    public String toString(){
	return "F";
    }


    public void move()  {
        int Movement = (int) (Math.random() * 5) - 2;//[-2,2]
        int newPos = _pos - Movement;
        if ((newPos >= 0 && newPos < _eco.getRiver().length) && _eco.getRiver()[newPos] == null){
                _eco.getRiver()[newPos] = this;
                _eco.getRiver()[_pos] = null;
                _pos = newPos;
        }
        
    }

}
