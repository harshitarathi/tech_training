package Day12;

	import java.util.*;

	class Question
	{

	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	String correctOption;
	public Question(String question, String option1, String option2,
	String option3, String option4, String correctOption) {
	super();
	this.question = question;
	this.option1 = option1;
	this.option2 = option2;
	this.option3 = option3;
	this.option4 = option4;
	this.correctOption = correctOption;
	}
	public String getQuestion() {
	return question;
	}
	public void setQuestion(String question) {
	this.question = question;
	}
	public String getOption1() {
	return option1;
	}
	public void setOption1(String option1) {
	this.option1 = option1;
	}
	public String getOption2() {
	return option2;
	}
	public void setOption2(String option2) {
	this.option2 = option2;
	}
	public String getOption3() {
	return option3;
	}
	public void setOption3(String option3) {
	this.option3 = option3;
	}
	public String getOption4() {
	return option4;
	}
	public void setOption4(String option4) {
	this.option4 = option4;
	}
	public String getCorrectOption() {
	return correctOption;
	}
	public void setCorrectOption(String correctOption) {
	this.correctOption = correctOption;
	}


	}
	public class QuizGame {

	public static void main(String[] args) {
		String input;
		do {
	Question q1=new Question("Who is Father of Nation","Gandhi","Subash Bosh","Terressa","Modi","Gandhi");
	Question q2=new Question("Which is a vegetable?","Rose","Lili","Dhalia","Potato","Potato");
	Question q3=new Question("Which is an animal?","Mango","Cat","Banana","Brinjal","Cat");
	HashMap map=new HashMap();
	map.put(1,q1);
	map.put(2,q2);
	map.put(3,q3);

	System.out.println("Enter question no: ( 1-3) ");
	Scanner sc=new Scanner(System.in);
	int qno=sc.nextInt();
	Question selected=(Question)map.get(qno);
	System.out.println(selected.getQuestion());
	System.out.println(selected.getOption1());
	System.out.println(selected.getOption2());
	System.out.println(selected.getOption3());
	System.out.println(selected.getOption4());
	System.out.println("Enter answer:");
	String answer=sc.next();
	if(answer.equals(selected.correctOption))
	System.out.println("Correct Answer");
	else
	{
	System.out.println("Wrong Answer");
	System.out.println("Correct Answer is:"+selected.correctOption);
	}
	System.out.println("Want more questions yes/no");
	 input=sc.next();

		}while(input.equals("yes"));
		System.out.println("thanks");
	}
	}

