import java.util.Scanner;

public class RectangleArea {
    final private Scanner scanner = new Scanner(System.in);
    private double lengthOfRectangle, widthOfRectangle, areaOfRectangle;

    public void setData() {
        this.lengthOfRectangle = validationChecking("Enter the length of a rectangle : ");
        this.widthOfRectangle = validationChecking("Enter the width of a rectangle : ");
    }
    private double validationChecking(String partOfRectangle)
    {
        double input;
        while (true){
            System.out.print(partOfRectangle);
            input = scanner.nextDouble();
            if(input > 0) {
                break;
            }
            else {
                System.out.println("Invalid input. Please enter a non-negative value.");
            }
        }
        return input;
    }
    void computeField() {
        areaOfRectangle = widthOfRectangle * lengthOfRectangle;
    }

    void fieldDisplay() {
        System.out.println("The length of rectangle is : " + lengthOfRectangle);
        System.out.println("The width of rectangle is : " + widthOfRectangle);
        System.out.println("The area of rectangle is : " + areaOfRectangle);
    }
    public void closeScanner() {
        scanner.close();
    }
    public void processRectangle() {
        setData();
        computeField();
        fieldDisplay();
        closeScanner();
    }
}