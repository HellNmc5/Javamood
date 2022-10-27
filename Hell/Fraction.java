package Hell;

public class Fraction {
    int num;
    int denom;

    //Конструктор по умолчанию
    public Fraction(){
        num=1;
        denom=1;
    }
    //Конструктор с параметрами
    public Fraction(int num, int denom) {
        this.num = num;
        if (denom!=0)
            this.denom = denom;
        else
            this.denom = 1;//не самый лучший способ
    }
    //первый способ вывода объекта на экран
    @Override
    public String toString() {
        return num + "/" +denom;
    }
    //второй способ вывода объекта на экран
    public void printFraction(){
        System.out.println(num + "/" +denom);
    }

    public void multyOnKoeff(int koeff){
        num*=koeff;
        if (koeff!=0)
            denom*=koeff;
    }

    public Fraction multyFraction(Fraction secondFactor){
        Fraction result = new Fraction();
        result.num = num * secondFactor.num;
        result.denom = num * secondFactor.denom;
        return result;
    }
    public Fraction DelFraction(Fraction secondFactor){
        Fraction result = new Fraction();
        result.num = num * secondFactor.denom;
        result.denom = denom * secondFactor.num;
        return result;
    }
    public Fraction SumOfFraction(Fraction secondFactor){
        int r=0;
        Fraction result = new Fraction();
        if (denom!= secondFactor.denom){
            num = num *secondFactor.denom;

            secondFactor.num= secondFactor.num *denom;

            result.denom= secondFactor.denom * denom;
        }
        else{
            result.denom=secondFactor.denom;
        }
        result.num= num + secondFactor.num;
        return result;
    }
    public Fraction MinsOfFraction(Fraction secondFactor){
        Fraction result = new Fraction();
        if (denom!= secondFactor.denom){
            secondFactor.num= secondFactor.num *denom;
            num = num *secondFactor.denom;
            result.denom= secondFactor.denom * denom;
        }
        else{
            result.denom=secondFactor.denom;
        }
        result.num= num - secondFactor.num;
        return result;
    }
}
