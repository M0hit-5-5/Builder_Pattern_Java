package laptop;

public class LaptopDirector {
    /**
     * @param lb
     * @param id
     * build Dall ruzen laptop
     */
    public void buildDallruzenLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("Dall");
        lb.CPU("ruzen 7");
        lb.ramGB(16);
        lb.diskGB(1024);
        lb.laptopID(id);
    }

    /**
     * @param lb
     * @param id
     * build Dall shintel laptop
     */
    public void buildDallshintelLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("Dall");
        lb.CPU("Care i7");
        lb.ramGB(16);
        lb.diskGB(1024);
        lb.laptopID(id);
    }

    /**
     * @param lb
     * @param id
     * build Ph ruzen laptop
     */
    public void buildPhruzenLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("Ph");
        lb.CPU("ruzen 5");
        lb.ramGB(8);
        lb.diskGB(512);
        lb.laptopID(id);
    }

    /**
     * @param lb
     * @param id
     * build Ph shintel laptop
     */
    public void buildPhshintelLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("Ph");
        lb.CPU("Care i5");
        lb.ramGB(8);
        lb.diskGB(512);
        lb.laptopID(id);
    }

    /**
     * @param lb
     * @param id
     * build a Asos gaming laptop
     */
    public void buildAsosGamingLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("Asos");
        lb.CPU("ruzen 9");
        lb.ramGB(32);
        lb.diskGB(2048);
        lb.laptopID(id);
    }
}
