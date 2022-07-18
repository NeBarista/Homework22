public class Main {
    public static void main(String[] args) {
        banLGBT(true, true);
        banLGBT(false, true);
        banLGBT(true, false);
    }
    public static void banLGBT(boolean woman, boolean man) {
        if (woman && man) {
            System.out.println("Love each other");
        } else{
            System.out.println("Go to USA");
        }
    }
}