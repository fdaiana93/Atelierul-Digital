package lab1;

public class Main {

    private static int semester= 2;

    public static void main (String[] args) {
        int var = 2020;
        System.out.println("Atelierul Digital" + ++var);
        int a = 5;
        //var =a>2?(a<4?10:8):7;
        if (a > 2)
            if (a < 4) {
                var = 10;
            } else
                var = 8;
    }else{var=7}
        System.out.println("Var=" + var);
    }
}
