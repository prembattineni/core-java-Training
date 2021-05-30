package com.vm.training.java.Exceptions;

class Training{
	void train() throws Exception{
		System.out.println("zero knowledge");
	}
	
	void trainAllSubjects() throws Exception{
		specificTraining();
		System.out.println("can train all subjects");
	}
	void specificTraining() throws Exception{
		train();
		System.out.println("can only train in java and angular");
	}
}
public class ThrowsKeyword {
	public static void main(String[] args) throws Exception {
		Training training=new Training();
		training.trainAllSubjects();
	}

}
