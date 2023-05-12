package laptop;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class LaptopTest {
    private String CORRECT_MANUFACTURER = "Dall";
    private String CORRECT_CPU = "Razen 5";
    private int CORRECT_RAM_GB = 24;
    private int CORRECT_DISK_GB = 1024;
    private int CORRECT_ID = 123456; 

    private Laptop laptop;

    @BeforeEach
    public void boot() {
        laptop = new Laptop(CORRECT_MANUFACTURER, CORRECT_CPU, CORRECT_RAM_GB, CORRECT_DISK_GB, CORRECT_ID);
    }

    @Test
    public void testManufacturer(){
        assertEquals(CORRECT_MANUFACTURER, laptop.getManufacturer());
    }
    
    @Test
    public void testCpu(){
        assertEquals(CORRECT_CPU, laptop.getCPU());
    }

    @Test
    public void testRamGB(){
        assertEquals(CORRECT_RAM_GB, laptop.getRamGB());
    }

    @Test
    public void testDiskGB(){
        assertEquals(CORRECT_DISK_GB, laptop.getDiskGB());
    }

    @Test
    public void testID(){
        assertEquals(CORRECT_ID, laptop.getLaptopID());
    }
}
