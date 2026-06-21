package processing;

import container.Box;
import container.Pair;

public class InspectionUtils {

    public static <T> void logInspection(T item) {
        System.out.println("=== INSPECTION LOG ===");
        System.out.println("Type\t: " + item.getClass().getSimpleName());
        System.out.println("Value\t: " + item.toString());
        System.out.println("======================");
    }

    public static <T> Pair<String, T> label(String id, T item) {
        System.out.println("[LABEREL] " + item.toString());
        return new Pair(id, item);
    }

    public static <T> void transferBetweenBoxes(Box<T> source, Box<T> destination) {
        T item = source.getAndClear();
        destination.put(item);
        System.out.println("[TRANSFER] Moved: " + item.toString());
    }
}
