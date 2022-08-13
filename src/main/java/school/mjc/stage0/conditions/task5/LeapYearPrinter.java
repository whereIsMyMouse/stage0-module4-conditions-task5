package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year) {
            case 1700:
            case 1800:
            case 1900:
            case 2100:
            case 2200:
            case 2300:
                System.out.println("not leap");
                break;
            default:
                switch (year % 4) {
                    case 0:
                        System.out.println("leap");
                        break;
                    default:
                        System.out.println("not leap");
                        break;
                }


        }
    }
}
