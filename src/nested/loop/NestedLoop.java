package nested.loop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){ //outer loop start
            System.out.print(i + "--->");
            for(int j=0; j<=20; j++){ //inner loop start
                System.out.print(j);

            }//inner loop stop

            System.out.println();

        }
    }//outer loop stop
}
