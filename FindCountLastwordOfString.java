public class FindCountLastwordOfString {
    public static void main(String[] args) {

        String str1 = "My name is mr Bhati  ";
        int  n = str1.length()-1;
        int c = 0 ;
        int check=0;
        for (int i=n; i>=0; i--) {
            // System.out.print("first");
            char a = str1.charAt(i);
            if ( a == ' ' ) {
                // check=true;
                if(check>0){
                    break;
                }
            }
            else if (a>='a' && a<='z'  || a>= 'A' && a<='Z') {

                check=1;
                c+=1;
            }

        }
        System.out.print(c);

    }
}
