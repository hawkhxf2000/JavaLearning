package IfStatementPractices;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 22, workExperience = 5;
		double rebate;
		boolean isAStudent = true;
		
		rebate = (age < 10 || age > 70)? 20: ((age < 20) && isAStudent && (workExperience > 4)? 15: 0);
			System.out.println(rebate);
	}

}
