
public class Arrow {
	private Q image;
	private char condition;

	private Arrow(Q image, char condition) {
		this.image = image;
		this.condition = condition;
	}

	public Q getImage() {
		return image;
	}

	public void setImage(Q image) {
		this.image = image;
	}

	public char getCondition() {
		return condition;
	}

	public void setCondition(char condition) {
		this.condition = condition;
	}

	public Q check(char s) {
		return s == this.condition ? this.image : null;
	}

	
	public static Arrow ca(Q image, char condition) {
		return new Arrow(image,condition);
	}
}
