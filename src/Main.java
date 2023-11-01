public class Main {
    public static void main(String[] args) {
        RectangleArea r1 = new RectangleArea();
        r1.processRectangle();

        Car car1 = new Car("AMG", "Mercedes", "Black", 2021, 1, 68_320);
        Car car2 = new Car("X","BMW","Blue-Yellow",2023,1,89_900);
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
        car1.setColor("Brown");
        car2.setColor("Purple");
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
    }
}