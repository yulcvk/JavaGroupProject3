package Project3;

public class ProjectTask2 {
    public static void main(String[] args) {
    A a=new A(78,90,87);
    a.getPercentage();
    B b=new B(78,90,87,77);
    b.getPercentage();
    }
}
abstract class Marks{
    double math;
    double literature;
    double biology;
    Marks(double math,double literature,double biology){
        this.math=math;
        this.literature=literature;
        this.biology=biology;
    }

    abstract void getPercentage();

    }
    class A extends Marks {

        A(double math, double literature, double biology) {
            super(math,literature,biology);

        }
        @Override
        public void getPercentage() {
            System.out.println("Average score for 3 subjects is "+(math+literature+biology)/3);
        }
        }

        class B extends Marks {
        double chemistry;

            B(double math, double literature, double biology, double chemistry) {
            super(math,literature,chemistry);
                this.chemistry=chemistry;

            }
            @Override
            public void getPercentage() {
                System.out.println("Average score for 4 subjects is "+(math+literature+biology+chemistry)/4);
            }
        }
