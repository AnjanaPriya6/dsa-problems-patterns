public class patternsPrinting {

    public static void main(String args[]){
        pattern1();
        pattern2();
        pattern3();
        pattern4();
    }

    public static void pattern1(){
        int i=0;
        while(i<5){
            System.out.println("*****");
            i++;
        }
    }

    public static void pattern2(){
        int i = 1;
        int j = 0;
        while(j<5){
            System.out.println("*".repeat(i));
            i++;
            j++;
        }
    }

    public static void pattern3(){
        int j = 1;
        while(j<6){
            for (int i=1; i<=j; i++){
                System.out.print(i);
            }
            System.out.println("");
            j++;
        }
    }

    public static void pattern4(){
        int j = 1;
        while(j<6){
            for(int i=1; i<=j; i++){
                System.out.print(j);
            }
            System.out.println();
            j++;
        }
    }


}
