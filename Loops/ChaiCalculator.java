public static void main(String[] args) {
        int pocketMoney = 100;
        int chaiCost = 15;
        int cupsDrank = 0;

        do {
            cupsDrank++;

            if(cupsDrank%3==0) {
                System.out.println("Cup " + cupsDrank + " is free!");
                continue;
            }
            pocketMoney -= chaiCost;

            if(pocketMoney < chaiCost) {
                System.out.println("Out of funds. Tab closed");
                break;
            }
        } while(pocketMoney >= chaiCost);

        System.out.println("Toatal cups drank : " + cupsDrank);
        System.out.println("Remaining pocket money : " + pocketMoney);
    }
