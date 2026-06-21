package processing;

import model.Electronics;
import model.Food;

import java.util.Objects;

public class PackagingTransformer {
    public static Transformer<Electronics, String> ELECTRONICS_TO_LABEL = e -> "[ELECTRONICS] " + e.getName() + " | " + e.getVoltage() + "V | " + e.getWeight() + "kg";
    public static Transformer<Food, Double> FOOD_WEIGHT_TO_GRAMS = f -> f.getWeight() * 1000.0;

    public static <T> Transformer<T, String> toStringTransformer() {
        return Objects::toString;
    }
}
