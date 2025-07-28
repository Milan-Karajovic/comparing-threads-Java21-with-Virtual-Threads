package threads;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 *
 * @author Milan Karajovic <milan.karajovic.rs@gmail.com>
 *
 */

public class Example01CachedThreadPool {

    public void executeTasks(final int NUMBER_OF_TASKS) {

        final int BLOCKING_CALL = 1;
        System.out.println("Number of tasks which executed using 'newCachedThreadPool()' " + NUMBER_OF_TASKS + " tasks each.");

        long startTime = System.currentTimeMillis();

        try (var executor = Executors.newCachedThreadPool()) {

            IntStream.range(0, NUMBER_OF_TASKS).forEach(i -> {
                executor.submit(() -> {
                    // simulate a blicking call (e.g. I/O or db operation)
                    Thread.sleep(Duration.ofSeconds(BLOCKING_CALL));
                    return i;
                });
            });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("For executing " + NUMBER_OF_TASKS + " tasks duration is: " + (endTime - startTime) + " ms");
    }

}