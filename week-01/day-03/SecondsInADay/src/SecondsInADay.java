public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int currentTimeInSeconds = currentHours*60*60+currentMinutes*60+42;
        int secondsInADay = 86400;
        int result = secondsInADay - currentTimeInSeconds;
        System.out.println(result);

    }
}