package laptop;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LaptopBuilderTest {
    private String CORRECT_MANUFACTURER = "Dall";
    private String CORRECT_CPU = "Razen 5";
    private int CORRECT_RAM_GB = 24;
    private int CORRECT_DISK_GB = 1024;
    private int CORRECT_ID = 123456; 

    private LaptopBuilder lb;

    

    public LaptopBuilder makeLaptop(LaptopBuilder build, String man, String cpu, int ram, int disk, int id){
        build.manufacturer(man);
        build.CPU(cpu);
        build.ramGB(ram);
        build.diskGB(disk);
        build.laptopID(id);

        return build;
    }

    public boolean equals(Laptop l1, Laptop l2){
        if(l1.getManufacturer().equals(l2.getManufacturer()) && l1.getCPU().equals(l2.getCPU()) && l1.getRamGB() == l2.getRamGB() && l1.getDiskGB() == l2.getDiskGB()){
            return true;
        }
        return false;
    }

    @BeforeEach
    public void initialize(){
        lb = new LaptopBuilder();
        lb = makeLaptop(lb, CORRECT_MANUFACTURER, CORRECT_CPU, CORRECT_RAM_GB, CORRECT_DISK_GB, CORRECT_ID);
    }

    @Test
    public void testBuild(){
        Laptop toTest = lb.build();
        Laptop compare = new Laptop(CORRECT_MANUFACTURER, CORRECT_CPU, CORRECT_RAM_GB, CORRECT_DISK_GB, CORRECT_DISK_GB);
        assertTrue(equals(toTest, compare));
    }
}
