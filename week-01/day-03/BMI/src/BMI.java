public class BMI {
    public static void main(String[] args){
        double weightInKg = 71.2;
        double heightInMetre = 1.80;
        double squareHeight = heightInMetre*heightInMetre;

        System.out.println(weightInKg/squareHeight);
    }
}
