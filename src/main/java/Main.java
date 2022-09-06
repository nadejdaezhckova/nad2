
import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            Random rd = new Random();
            int[] L = new int[7];
            int[] Y = new int[5];
            int z = 0;
            int g = 0;
            int k = 0;
            System.out.println("Массив L:");
            for(int i=0; i<L.length; i++){
                L[i]= rd.nextInt(11);
                System.out.print(L[i]+" ");
            }
            System.out.println();
            System.out.println("Массив l:");
            for(int i=0; i<Y.length; i++){
                Y[i]= rd.nextInt(11);
                System.out.print(Y[i]+" ");
            }
            for(int i=0; i<L.length; i++){
                g = g + ((L[i]*L[i])/(L[i]+1));
            }
            for(int i=0; i<Y.length; i++){
                k = (int) (k + (Math.pow(Y[i], 3)));
            }
            System.out.println();
            System.out.println("Число z:");
            z = g-L[0]*L[6]*k;
            System.out.println(z);
        }
    }


