public static void main(String[] args) {
        int currentSubs = 500;
        int targetSubs = 10000;
        int monthsPassed = 0;

        while(currentSubs < targetSubs) {
            currentSubs += (currentSubs * 0.10);
            currentSubs += 50;
            monthsPassed++;
        }

        System.out.println("Milestone reached in " + monthsPassed + " months with " + currentSubs + " total subscribers!");
    }
