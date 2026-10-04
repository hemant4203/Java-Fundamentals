public static void main(String[] args) {
		float weightInKG = 90f;
		float heightInM = 1.73f;
		String health = "";
		
		float bmi = weightInKG / (heightInM * heightInM);
		
		if(bmi < 18.5f) {
		    health = "Underweight";
		} else if(bmi < 25.0f) {
		    health = "Normal weight";
		} else if(bmi < 30.0f) {
		    health = " Overweight";
		} else {
		    health = "Obese";
		}
		
		System.out.println("Your health is: " + health);
	}
