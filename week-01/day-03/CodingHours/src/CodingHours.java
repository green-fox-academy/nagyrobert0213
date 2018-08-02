public class CodingHours {
    public static void main (String[] args){
        int weeks = 17;
        int workHoursWeekly = 52;
        int gfCoding = 6;
        int weekDays = weeks*5;
        int allGfCoding = weekDays*gfCoding;
        int allWorkHours = workHoursWeekly*weeks;

        System.out.println(allGfCoding);
        System.out.println(allWorkHours);
        float result = allGfCoding / (float)allWorkHours;

        System.out.format("%.2f",result*100);

    }
}
