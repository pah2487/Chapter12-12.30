import java.io.File;
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args){
        Scanner commandLine = new Scanner(System.in);
        boolean foundFile = false;
        System.out.println("Please enter the name of the file you would like checked:(must be in same folder" +
                ")");
        while(!foundFile) {
            try {
                File file = new File(commandLine.nextLine());
                Scanner fileScan = new Scanner(file).useDelimiter("buksub,jz.oie lifhns,rdgjka;dslkf,");
                String originalString = "";
                while (fileScan.hasNext()) {
                    int[] counts = new int[(int) Character.MAX_VALUE];
                    originalString = (fileScan.next()).toLowerCase();
                    for (int i = 0; i < originalString.length(); i++) {
                        char charAt = originalString.charAt(i);
                        counts[(int) charAt]++;
                    }
                    for (int i = 0; i < counts.length; i++) {
                        if (counts[i] > 0) {
                            System.out.println("Number of " + (char) i + ": " + counts[i]);
                        }
                    }
                    foundFile = true;
                }
            }
            catch(Exception ex){
                System.out.println("Couldn't find that file. Try another one?");
                foundFile = false;
            }
        }
    }
}
