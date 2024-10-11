public class Arithmetic {
    int Val1 = 0;
    int Val2 = 0;
    public Arithmetic(int ValTest1, int ValTest2){
        this.Val1 = ValTest1;
        this.Val2 = ValTest2;
        printSum();
        printMul();
        printMax();
        printMin();
    }
    public void printSum(){
        int sum = Val1 + Val2;
        System.out.println("Cумма чисел " + Val1+ " и " + Val2 + " равна:");
        System.out.println(sum);
    }
    public void printMul(){
        int mul = Val1 * Val2;
        System.out.println("Произведение чисел " + Val1+ " и " + Val2 + " равно:");
        System.out.println(mul);
    }
    public void printMax(){
        System.out.println("Максимальное из чисел " + Val1+ " и " + Val2 + " равно:");
        if(Val1 > Val2) {
            System.out.println(Val1);
        }
        else{
            System.out.println(Val2);
        }
    }
    public void printMin(){
        System.out.println("Минимальное из чисел " + Val1+ " и " + Val2 + " равно:");
        if(Val1 < Val2) {
            System.out.println(Val1);
        }
        else{
            System.out.println(Val2);
        }
    }
}
