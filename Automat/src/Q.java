import java.util.LinkedList;

import javax.management.RuntimeErrorException;

public class Q {

	private int _id;
	private LinkedList<Arrow> Arrows;
	private boolean _accepting;

	public Q(int id, boolean accepting) {
		_id = id;
		_accepting = accepting;
		Arrows = new LinkedList<>();
	}
	
	public void addArrow(Arrow ...arrows) {
		for(Arrow r : arrows)
			Arrows.add(r);
	}

	public boolean procced(String s, int index) {
		
		if(index == s.length()) {
			return _accepting;
		}

		for(Arrow r : Arrows) {
			if(r.check(s.charAt(index))!=null)
				return r.getImage().procced(s,index+1);
		}
		
		throw new RuntimeErrorException(null, "Alphabet error");

	}

}
