package java.org.inheritance.example;

public class Dell implements Laptop{

    private String processor;
    private String operatingSystem;
    private String ram;
    private String rom;

    @Override
    public void setConfiguration(String processor, String operatingSystem, String ram, String rom) {
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.rom = rom;
    }

    @Override
    public Dell getConfiguration() {
        return new Dell(this.processor, this.operatingSystem, this.ram, this.rom);
    }

    public Dell(){}

    public Dell(String processor,String operatingSystem, String ram, String rom ){
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.rom = rom;
    }
    @Override
    public String toString() {
        return "Dell{" +
                "processor='" + processor + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                '}';
    }
}
