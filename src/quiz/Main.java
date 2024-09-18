package quiz;

import quiz.question.QuestionService;

public class Main {
	public static void main(String args[]) {
		QuestionService questionService = new QuestionService();
		questionService.playQuiz();
		questionService.printScore();
	}

}
