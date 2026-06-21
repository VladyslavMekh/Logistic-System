package transfer;

import container.Box;

public class DockTransfer {

    public static <T> void transfer(Box<? extends T> source, Box<? super T> destination) {
        if (source.isEmpty()) throw new IllegalStateException("Source is empty.");
        T item = source.getAndClear();
        destination.put(item);
        System.out.println("[DOCK] Transferred: " + item.toString());
    }

    public static <T> void copy(Box<? extends T> source, Box<? super T> destination) {
        if (source.isEmpty()) throw new IllegalStateException("Source is empty.");
        T item = source.get();
        destination.put(item);
        System.out.println("[DOCK] Copied: " + item.toString());
    }
}
