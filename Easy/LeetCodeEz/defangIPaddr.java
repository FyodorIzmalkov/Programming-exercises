package LeetCodeEz;

public class defangIPaddr {

    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
