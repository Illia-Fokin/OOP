import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Car {
    private String model, brand, color;
    private int year, quantity;
    private double price;
}