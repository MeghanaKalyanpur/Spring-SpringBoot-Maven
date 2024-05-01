import java.util.Scanner;

public class QuestionService {
	Question question[] =new Question[5];
	int score=0;
	String[] answers=new String[5];

	public QuestionService() {
		super();
		// TODO Auto-generated constructor stub
		
		question[0]= new Question(1,"Q1",new String[] {"O1","O2","O3","O4"},"O1");
		question[1]= new Question(2,"Q2",new String[]{"O1","O2","O3","O4"},"O1");
		question[2]= new Question(3,"Q3",new String[]{"O1","O2","O3","O4"},"O1");
		question[3]= new Question(4,"Q4",new String[]{"O1","O2","O3","O4"},"O1");
		question[4]= new Question(5,"Q5",new String[]{"O1","O2","O3","O4"},"O1");
	}
	
	public void displayQuestions() {
		// TODO Auto-generated method stub
		for (Question question2 : question) {
			System.out.println(question2);
		}
	}
	
	public void playQuiz() {
		int i=0;
		for (Question question2 : question) {
			System.out.println(question2.getId());
			System.out.println(question2.getQuestion());
			for(String option:question2.getOption()) {
				System.out.println(option);
			}
			Scanner scanner= new Scanner(System.in);
			answers[i]=scanner.nextLine();
			if(answers[i].equals(question2.getAnswer()))
				score++;
			i++;
		}
		System.out.println("Your score is "+score);
	}
}
