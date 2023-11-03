public class Main {
    public static void main(String[] args) {
//        RectangleArea r1 = new RectangleArea();
//        r1.processRectangle();

        Car car1 = new Car("AMG", "Mercedes", "Blachfghfhk", 2021, 1, 68_320);
        Car car2 = new Car("da", "Mercedes", "Black", 2021, 1, 68_320);
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());

        System.out.println("Are these objects equal? : " + car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

    }
}