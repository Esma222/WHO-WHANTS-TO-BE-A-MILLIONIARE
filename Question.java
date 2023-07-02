
public class Question {
	String category;
	String text;
	String choice1;
	String choice2;
	String choice3;
	String choice4;
	String cloud;
	char answer;
	int difficulty;
	int answered;
	boolean showed;

	Question(String category, String text, String choice1, String choice2, String choice3, String choice4,
			char answer, int difficulty) {
		this.category = category;
		this.text = text;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.answer = answer;
		this.difficulty = difficulty;
		this.answered = 0;
		this.showed = false;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setCloud(String cloud) {
		this.cloud = cloud;
	}

	public void setAnswered() {
		this.answered++;
	}

	public int getAnswered() {
		return this.answered;
	}

	public void setShowed(boolean flag) {
        this.showed = flag;
    }
	
	public boolean isShowed() {
		return this.showed;
	}
}
