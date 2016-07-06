import java.util.Scanner;

public class dayFinder {
    
    public static void main(String[] args) { 
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        int day, mon, yr;

        while(cont) {
            do{
            	System.out.println("Day?");
            	day = Integer.parseInt(sc.nextLine());
                if (day > 31 || day <= 0)
                    System.out.println("Not a valid day, must be in range of 1-31");
            } while(day > 31 || day <= 0);

            do{
                System.out.println("Month?");
                mon = Integer.parseInt(sc.nextLine());
                if (mon > 12 || mon <= 0)
                    System.out.println("Not a valid month, must be in range of 1-12");
            } while(mon > 12 || mon <= 0);

            do{
                System.out.println("Year?");
                yr = Integer.parseInt(sc.nextLine());
                if (yr <= 0)
                    System.out.println("Not a valid year, must be greater than 0");
            } while(yr <= 0);

            if (mon <= 2){
                mon += 12;
                yr -= 1;
            }

            int a = 13 * (mon + 1) / 5;
            int b = yr / 4;
            int c = 6 * (yr/100);
            int d = yr/400;

            int result = (a + b + c + d + day + yr) % 7;
            String weekday = "";
            switch (result) {
                case 0: weekday = "Saturday";
                        break;
                case 1: weekday = "Sunday";
                        break;
                case 2: weekday = "Monday";
                        break;
                case 3: weekday = "Tuesday";
                        break;
                case 4: weekday = "Wednesday";
                        break;
                case 5: weekday = "Thursday";
                        break;
                case 6: weekday = "Friday";
                        break;
            }

            System.out.println(weekday);    

            System.out.println("Type quit now if you would like to stop the program: ");
            if(sc.nextLine().equalsIgnoreCase("quit"))
                cont = false;
        }
        
    }
}
