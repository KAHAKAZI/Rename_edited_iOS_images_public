package org.rename;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Path currentPath = getPath(args);
        if(currentPath == null)
            return;

        System.out.println("Replace all E letters with empty sign in current directory for current files.");
        System.out.println("Ex. IMG_E123.JPG to IMG_123.JPG");

        String path = currentPath.toAbsolutePath().toString();

        System.out.println("Current path:\n" + path);

        File directory = new File(path);
        File[] files = directory.listFiles();

        if(files != null) {
            System.out.println("No of files: " + files.length);

            int counter = 0;

            for (File file : files) {
                String name = file.getName();
                if(name.contains("IMG") && name.contains("E")){
                    counter++;
                    System.out.println("File: ");
                    System.out.println(name);
                    String newName = name.replace("E", "");
                    System.out.println("New: ");
                    System.out.println(newName);
                    File newFile = new File(newName);
                    file.renameTo(newFile);
                }
            }
            if(counter == 0) {
                System.out.println("Nothing to change");
            } else {
                System.out.println(counter + " files renamed.");
            }
        } else {
            System.out.println("Invalid path specified.");
        }

    }

    private static Path getPath(String[] args){
        // default "here" path
        Path currentPath = Paths.get("");
        if(args.length > 1){
            System.out.println("Invalid number of arguments: " + args.length + ". Expected 1.");
            return null;
        }
        if(args.length == 1){
            currentPath = Paths.get(args[0].toString());
        }
        return currentPath;
    }
}
