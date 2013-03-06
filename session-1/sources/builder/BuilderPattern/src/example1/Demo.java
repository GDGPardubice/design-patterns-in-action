package example1;


public class Demo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Haters ").append("gonna ").append("hate!");
        String message = stringBuilder.toString();

        System.out.println(message);
    }
}
