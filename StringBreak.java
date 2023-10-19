public class StringBreak {
    public static void main(String[] args) {
        String str = "IAmGoodProgrammer";

        for (int i = 0;i<str.length();i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                System.out.println();
            }
            System.out.print(str.charAt(i));
        }
    }
}
