import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of = {"brand"})

public class Car {
    private String model, brand, color;
    private int year, quantity;
    private double price;
}