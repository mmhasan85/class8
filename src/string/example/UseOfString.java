package string.example;

public class UseOfString {
    public static void main(String[] args) {

        String st = "We are java programmer";
        String st1 = "We are c++ programmer";
        st1 = st1.toUpperCase();
        System.out.println(st.toLowerCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.indexOf(0));
        System.out.println(st.charAt(9));
        if(st.contains("a")){
            System.out.println("yes, we found it");
        }
        else{
            System.out.println("no, we did not find it");
        }
        if(st.equalsIgnoreCase(st1)){
            System.out.println("yes, they are equal");
        }
        else {
            System.out.println("no, they are not equal");
        }
    }
}
