package threads;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author Milan Karajovic <milan.karajovic.rs@gmail.com>
 *
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Example01CachedThreadPoolTest {

    @Test
    @Order(1)
    public void test_1000_tasks() {
        Example01CachedThreadPool example01CachedThreadPool = new Example01CachedThreadPool();
        example01CachedThreadPool.executeTasks(1000);
    }

    @Test
    @Order(2)
    public void test_10_000_tasks() {
        Example01CachedThreadPool example01CachedThreadPool = new Example01CachedThreadPool();
        example01CachedThreadPool.executeTasks(10_000);
    }

    @Test
    @Order(3)
    public void test_100_000_tasks() {
        Example01CachedThreadPool example01CachedThreadPool = new Example01CachedThreadPool();
        example01CachedThreadPool.executeTasks(100_000);
    }

    @Test
    @Order(4)
    public void test_1_000_000_tasks() {
        Example01CachedThreadPool example01CachedThreadPool = new Example01CachedThreadPool();
        example01CachedThreadPool.executeTasks(1_000_000);
    }

}
