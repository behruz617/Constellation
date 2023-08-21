import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the number of the month: " +
                "\n1.January \n2.February \n3.March " +
                "\n4.April \n5.May \n6.June \n7.July" +
                "\n8.August \n9.September \n10.October" +
                "\n11.November \n12.December ");

        int month = sc.nextInt();

        String horoscope = "";

        if (month > 0 && month < 13) {
            System.out.print("Enter the day ");
            int day = sc.nextInt();

            if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
                horoscope = "Capricorn";
            } else if (month == 1 || month == 2 && day <= 118) {
                horoscope = "Aquarius";
            } else if (month == 2 || month == 3 && day <= 20) {
                horoscope = "Pisces";
            } else if (month == 3 || month == 4 && day <= 20) {
                horoscope = "Aries";
            } else if (month == 4 || month == 5 && day <= 20) {
                horoscope = "Taurus";
            } else if (month == 5 || month == 6 && day <= 21) {
                horoscope = "Gemini";
            } else if (month == 6 || month == 7 && day <= 22) {
                horoscope = "Cancer";
            } else if (month == 7 || month == 8 && day <= 22) {
                horoscope = "Leo";
            } else if (month == 8 || month == 9 && day <= 22) {
                horoscope = "Virgo";
            } else if (month == 9 || month == 10 && day <= 23) {
                horoscope = "Libra";
            } else if (month == 10 || month == 11 && day <= 22) {
                horoscope = "Scorpio";
            } else if (month == 11 || day <= 21) {
                horoscope = "Sagittrius";
            }
            System.out.println("The horoscope sign : " + horoscope);

        } else {
            System.out.println("You entered wrong answer !");
        }
    }
}
