package finalize.example;

public class TestFinalize {

    public static void main(String[] args) {
        TestFinalize tf=new TestFinalize();
        tf.Finalize();
        String st = new String("House");
        System.out.println(st);
        st=null;
        System.gc();
        System.out.println("End of main");
        System.gc();
    }

    public void Finalize(){
        System.out.println("Finalize method has been called..");

    }
}
