import java.util.Scanner;

class Calculate {
    float a;
    float b;

    void pr(){
        System.out.println(a+ " "+b);
    }
    float Sum(float a,float b){
        float total = a+b;
        return total;
    }

    float Subtract(float a , float b ){
        float total = a-b;
        return total;
    }
}

class Result{
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        float a = sc.nextFloat();
        System.out.println("enter b");

        float b = sc.nextFloat();

        float num = cal.Sum(a,b);

        System.out.println(num);



    }
}



