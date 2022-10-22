package Project3;

public class ProjectTask3 {
    public static void main(String[] args) {
    Truck truck=new Truck("White",3000,1900);
    truck.calculateSalePrice(30000);
    Sedan sedan=new Sedan("Black",50000,15);
    sedan.calculateSalePrice(50000);


    }
}
class Car {
    double carPrice;
    String color;

    public Car(String color,double carPrice) {
    this.carPrice=carPrice;
    this.color=color;
    }

    public double calculateSalePrice() {

        return 0;
    }

        }
    class Truck extends Car {
        double weight;

        public Truck(String color,double carPrice, double weight) {
            super(color,carPrice);
            this.weight = weight;
        }

        public double calculateSalePrice(double carPrice) {
            if (weight > 2000) {
                System.out.println(color+" truck has discounted price of "+(carPrice - (carPrice * 0.1)));
            } else {
                System.out.println(color+" truck has discounted price of "+(carPrice - (carPrice * 0.2)));

            }
            return carPrice;
        }
    }


            class Sedan extends Car {
                double length;

                public Sedan(String color,double carPrice, double length) {
                    super(color,carPrice);
                    this.length = length;
                }

                public double calculateSalePrice(double carPrice) {

                    if (length > 20) {
                        System.out.println(color+" sedan has a discounted price of "+(carPrice - (carPrice * 0.05)));
                    } else {
                        System.out.println(color+" sedan has a discounted price of "+(carPrice - (carPrice * 0.1)));
                    }
                    return carPrice;
                }
            }



















