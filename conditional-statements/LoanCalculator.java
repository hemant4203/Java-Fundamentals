public static void main(String[] args) {
        double bikePrice = 350000;
        double downPayment = 40000;
        int creditScore = 680;
        double interestRate = 0;
        double principalLoanAmt = bikePrice - downPayment;

        if(downPayment < (bikePrice * 0.15)) {
            System.out.println("Indufficient down payment");
            return;
        }

        if(creditScore < 650) {
            System.out.println("Credit score too low");
            return;
        }

        if(creditScore >= 750) {
            interestRate = 6;
        } else if(creditScore >= 650) {
            interestRate = 8;
        }

        if(downPayment >= (bikePrice * 0.40)) {
            interestRate -= 1;
        }

        System.out.println("Loan Approve");
        System.out.println("Total interest rate is : " + interestRate);
        System.out.println("Principal Loan amount is : " + principalLoanAmt);
    }
