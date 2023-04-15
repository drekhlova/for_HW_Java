package for_HW_Java.Homework6;

public class notebook {
        private String brand;
        private String model;
        private int RAM;
        private int HDD;
        private String OS;
        private String color;
        private double price;
        
        public notebook(String brand, String model, int RAM, int HDD, String OS, String color, double price) {
            this.brand = brand;
            this.model = model;
            this.RAM = RAM;
            this.HDD = HDD;
            this.OS = OS;
            this.color = color;
            this.price = price;
        }
              
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }
        
        public void setModel(String model) {
            this.model = model;
        }       
               
        public int getRAM() {
            return RAM;
        }
        
        public void setRAM(int RAM) {
            this.RAM = RAM;
        }
        
        public int getHDD() {
            return HDD;
        }
        
        public void setHDD(int HDD) {
            this.HDD = HDD;
        }
        
        public String getOS() {
            return OS;
        }
        
        public void setOs(String OS) {
            this.OS = OS;
        }
        
        public String getColor() {
            return color;
        }
        
        public void setColor(String color) {
            this.color = color;
        }
        
        public double getPrice() {
            return price;
        }
        
        public void setPrice(double price) {
            this.price = price;       
        }
}