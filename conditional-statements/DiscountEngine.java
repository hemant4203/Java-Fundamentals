public static void main(String[] args) {
		double cartValue = 120.0;
		String membershipType = "Gold";
		double finalPrice = cartValue;
		double discount = 0;
		
		if(membershipType.equals("Premium")) {
		    discount = cartValue * 0.2;
		    finalPrice = cartValue - discount;
		}
		
		if(membershipType.equals("Gold") && cartValue > 100) {
		    discount = cartValue * 0.15;
		    finalPrice = cartValue - discount;
		} else {
		    discount = cartValue * 0.1;
		    finalPrice = cartValue - discount;
		}
		
		if(membershipType.equals("Regular") && cartValue > 150) {
		    discount = cartValue * 0.05;
		    finalPrice = cartValue - discount;
		}
		
		System.out.println("original value of cart is: " + cartValue);
		System.out.println("Discount applied of the values is: " + discount);
		System.out.println("Final price after discount is: " + finalPrice);
	}
