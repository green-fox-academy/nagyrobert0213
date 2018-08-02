public class Cuboid {
    public static void main(String[] args){
        double side1 = 1.1;
        double side2 = 2.2;
        double side3 = 3.3;
        double surfaceareResult = 2*(side1+side2+side3);
        System.out.println("Surface area: " + surfaceareResult);

        double volumeResult = side1*side2*side3;
        System.out.println(volumeResult);
    }
}
