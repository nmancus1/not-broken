import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();//trailing comment here
        int ASDFASDF = 0;
        int x = 23423;
        String value5 = """
            \u03bc\s""";

        switch(ASDFASDF){
            default:
                System.out.println("default!");
            case 1:
                System.out.println(ASDFASDF);
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0;j < 10;j++){
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        System.out.println("Too many nested loops!");
                    }
                }
            }
        }
    }
}
