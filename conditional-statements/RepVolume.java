public static void main(String[] args) {
        String workoutType = "Legs";
        int totalReps = 190;

        String repVolume = switch(workoutType) {
            case "Push" -> {
                if(totalReps < 100) {
                    yield "Increase volume";
                } else if(totalReps > 150) {
                    yield "Risl of overtraining";
                } else {
                    yield "Optimal volume";
                }
            }
            case "Pull" -> {
                if(totalReps < 80) {
                    yield "Increase volume";
                } else if(totalReps > 120) {
                    yield "Risk of overtraining";
                } else {
                    yield "Optimal volume";
                }
            }
            case "Legs" -> {
                if(totalReps < 120) {
                    yield "Increase volume";
                } else if(totalReps > 180) {
                    yield "Risk of overtrianing";
                } else {
                    yield "Optimal volume";
                }
            }
            default -> {
                throw new IllegalArgumentException("Invalid workout type");
            }
        };

        System.out.println(repVolume);
    }
