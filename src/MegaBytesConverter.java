import java.sql.SQLOutput;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if(kiloBytes < 0){
        System.out.println( "Invalid Value");
        } else {
            int megaByte = Math.round(kiloBytes / 1024);
            int kiloByte = Math.round(kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + kiloByte + " KB");
        }
    }

}

