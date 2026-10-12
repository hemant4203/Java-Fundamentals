public static void main(String[] args) {
        int day = 29;
        int month = 2;
        int year = 2024;

        int nextDay = switch(month) {
            case 1,3,5,7,8,10,12 -> {
                if(day<1 || day>31) {
                    throw new IllegalArgumentException("Invalid day");
                }
                if(day == 31) {
                    yield 1;
                } else {
                    yield day+1;
                }
            }
            case 4,6,9,11 -> {
                if(day < 1 || day > 30) {
                    throw new IllegalArgumentException("Invalid day");
                }
                if(day==30) {
                    yield 1;
                } else {
                    yield day+1;
                }
            }
            case 2 -> {
                if(year%4==0 && (year%100!=0 || year%400==0)) {
                    if(day<1 || day>29) {
                        throw new IllegalArgumentException("Invalid day");
                    }
                    if(day == 29) {
                        yield 1;
                    } else {
                        yield day+1;
                    }
                } else {
                    if(day<1 || day>28) {
                        throw new IllegalArgumentException("Invalid day");
                    }
                    if(day == 28) {
                        yield 1;
                    } else {
                        yield day+1;
                    }
                }
            }
            default -> {
                System.out.println("Invalid month");
                throw new IllegalArgumentException("Invalid month");
            }
        };

        if(nextDay==1 && month==12) {
            month = 1;
            year +=1;
        } else if(nextDay == 1) {
            month +=1;
        }

        System.out.println("Next day is : " + nextDay + "/" + month + "/" + year);
    }
