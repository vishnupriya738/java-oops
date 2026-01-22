class CPU {
    double price;

    // Constructor
    CPU(double price) {
        this.price = price;
    }

    // Inner class
    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void displayProcessorInfo() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    // Static nested class
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAMInfo() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create CPU object
        CPU cpu = new CPU(45000);

        // Create Processor object using CPU instance
        CPU.Processor processor = cpu.new Processor(8, "Intel");

        // Create RAM object (static nested class)
        CPU.RAM ram = new CPU.RAM(16, "Corsair");

        // Print information
        System.out.println("CPU Price: " + cpu.price);
        processor.displayProcessorInfo();
        ram.displayRAMInfo();
    }
}

