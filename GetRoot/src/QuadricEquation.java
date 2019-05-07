public class QuadricEquation {
    private double a;
    private  double b;
    private  double c;

    public QuadricEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }

    public double getDiscriminant(){
        return b*b - 4*a*c;
    }

    public double getRoot1(){
        if(this.getDiscriminant() >= 0)
        {
            return (-b + Math.pow(this.getDiscriminant(),0.5)) / 2*a;
        }else
            return 0;
    }

    public double getRoot2(){
        if(this.getDiscriminant() >= 0)
        {
            return (-b - Math.pow(this.getDiscriminant(),0.5)) / 2*a;
        }else
            return 0;
    }

}
