 public class For {
    public static void main (String [] args) {
        int num = 1;
        for (int i = 2; i < 10; i++){
            System.out.println("Outermost loop i= " + i);
        }
        for (int j = 3; j < 10; j++) {
            System.out.println("\tInnermost Loop j=" + j);
            System.out.println("\t\t Total number of loops=" + (++num));
        }

     }
 }