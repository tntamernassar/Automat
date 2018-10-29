
public class Main {
	public static void main(String[] args) {

		Automat a = new Automat();

		Q q1 = new Q(1, false);
		Q q2 = new Q(2, false);
		Q q3 = new Q(3, false);
		Q q4 = new Q(4, true);

		q1.addArrow(Arrow.ca(q1, 'a'), Arrow.ca(q2, 'b'));
		q2.addArrow(Arrow.ca(q4, 'a'), Arrow.ca(q3, 'b'));
		q3.addArrow(Arrow.ca(q1, 'b'), Arrow.ca(q1, 'a'));
		q4.addArrow(Arrow.ca(q4, 'a'), Arrow.ca(q4, 'b'));

		a.addQ(q1, q2, q3, q4);
		a.setStartPoint(q1);
		
		System.out.println(a.start("abbabbbabaaaaaabbbbbaababab"));

	}
}