import java.io.File;
import java.util.Scanner;

public class DirectorySizeCalculator {
    public static long calculateDirectorySize(File directory) {
        if (directory == null || !directory.exists()) {
            return 0;
        }
        if (directory.isFile()) {
            return directory.length();
        }
        long totalSize = 0;
        File[] files = directory.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                totalSize += calculateDirectorySize(files[i]);
            }
        }
        return totalSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File dir = new File(path);
        System.out.println("Total size: " + calculateDirectorySize(dir) + " bytes");
        sc.close();
    }
}
