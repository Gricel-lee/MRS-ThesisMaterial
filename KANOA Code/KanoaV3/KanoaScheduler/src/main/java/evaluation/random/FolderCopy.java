package evaluation.random;

import java.io.*;

public class FolderCopy {

    public static void main(String[] args) {
        File source = new File("sourceFolder");
        File destination = new File("destinationFolder");

        try {
            copyFolder(source, destination);
            System.out.println("Folder copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFolder(File source, File destination) throws IOException {
        if (source.isDirectory()) {
            // If destination directory doesn't exist, create it
            if (!destination.exists()) {
                destination.mkdir();
            }

            // List all files and subdirectories of the source directory
            String[] files = source.list();

            if (files != null) {
                for (String file : files) {
                    File srcFile = new File(source, file);
                    File destFile = new File(destination, file);
                    
                    // Recursive copy
                    copyFolder(srcFile, destFile);
                }
            }
        } else {
            // Copy the file
            InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(destination);
            byte[] buffer = new byte[1024];
            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            // Close streams
            in.close();
            out.close();
        }
    }
}
