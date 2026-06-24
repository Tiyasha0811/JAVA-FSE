class Computer {
    private String cpu; private String ram; private String storage; private String os;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.os = builder.os;
    }
    public void display() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Operating System: " + os);
        System.out.println();
    }
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String os;
        
          public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setOS(String os) {
            this.os = os;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}

public class Main {

    public static void main(String args[]) {

        Computer PC1 = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32 GB")
                .setStorage("2 TB SSD")
                .setOS("Windows 11")
                .build();

        Computer PC2 = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16 GB")
                .setStorage("512 GB SSD")
                .setOS("Windows 10")
                .build();

       PC1.display();
        PC2.display();
    }
}
