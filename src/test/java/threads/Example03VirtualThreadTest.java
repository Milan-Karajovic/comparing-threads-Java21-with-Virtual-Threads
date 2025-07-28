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
public class Example03VirtualThreadTest {

    @Test
    @Order(1)
    public void test_1000_tasks() {
        Example03VirtualThread example03VirtualThread = new Example03VirtualThread();
        example03VirtualThread.executeTasks(1000);
    }

    @Test
    @Order(2)
    public void test_10_000_tasks() {
        Example03VirtualThread example03VirtualThread = new Example03VirtualThread();
        example03VirtualThread.executeTasks(10_000);
    }

    @Test
    @Order(3)
    public void test_100_000_tasks() {
        Example03VirtualThread example03VirtualThread = new Example03VirtualThread();
        example03VirtualThread.executeTasks(100_000);
    }

    @Test
    @Order(4)
    public void test_1_000_000_tasks() {
        Example03VirtualThread example03VirtualThread = new Example03VirtualThread();
        example03VirtualThread.executeTasks(1_000_000);
    }

    @Test
    @Order(5)
    public void test_2_000_000_tasks() {
        Example03VirtualThread example03VirtualThread = new Example03VirtualThread();
        example03VirtualThread.executeTasks(2_000_000);
    }

}
