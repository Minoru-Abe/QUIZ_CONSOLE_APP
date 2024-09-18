package quiz.question;

import java.util.Scanner;

public class QuestionService {
	
	private Question[] questions = new Question[5];
	private String[] selections = new String[5];
	
	public QuestionService() {
		questions[0] = new Question(1, "Size of int", "2", "4", "8", "16", "2");
		questions[1] = new Question(2, "Size of boolean", "2", "4", "8", "16", "2");
		questions[2] = new Question(3, "Size of byte", "2", "4", "8", "16", "2");
		questions[3] = new Question(4, "Size of float", "2", "4", "8", "16", "2");
		questions[4] = new Question(5, "Size of double", "2", "4", "8", "16", "2");
	}
	
	public void playQuiz() {
		int i = 0;
		for (Question q:questions) {
			System.out.println("Question No." + q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			Scanner sc = new Scanner(System.in);
			selections[i] = sc.nextLine();
			i++;
		}

		
		for (String s:selections) {
			System.out.println(s);
		}
	}
	
	public void printScore() {
		int score = 0;
		for (int i=0; i<questions.length; i++) {
			String actualAnswer = questions[i].getAnswer();
			String userAnswer = selections[i];
			if (actualAnswer.equals(userAnswer)) {
				score++;
			}
		}
		System.out.println("Your score is : " + score);
	}
	

}
