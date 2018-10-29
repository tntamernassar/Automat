import java.util.LinkedList;

public class Automat {

	private LinkedList<Q> Q;

	private Q start;

	public Automat() {
		Q = new LinkedList<>();
	}

	public void setStartPoint(Q start) {
		this.start = start;
	}

	public void addQ(Q... qs) {
		for (Q q : qs)
			Q.add(q);
	}
	

	public boolean start(String w) {
		return start.procced(w, 0);
	}

}
