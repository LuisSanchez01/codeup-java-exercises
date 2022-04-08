import fileio.FileManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLectureExercise {
    public static void main(String[] args) throws IOException {
        String directory = "data";
//
////        The file path
        Path filePath = Paths.get("data");

        System.out.println("filePath.toAbsolutePath() = " + filePath.toAbsolutePath());
//        System.out.println("filePath.toString() = " + filePath.toString());

//        String directory2  = "moreData";
//        String directory3 = "evenMoreData";
//        String fileName = "file/file.text";
//        Adding the file/ is to find the Absolute Path in the Absolute Path Method
        Path threeArgumentsPath = Paths.get("directory2", "directory3", "file.text");


//        Path secondFilePath = Paths.get(directory2, directory3, fileName);
//
//        System.out.println("secondFilePath.getFileName() = " + secondFilePath.getFileName());
//        System.out.println("secondFilePath.toString() = " + secondFilePath.toString());

        Path absolutePath = Paths.get("/", "User");
        System.out.println("absolutePath.isAbsolute() = " + absolutePath.isAbsolute());

        Path anotherAbsolutePath = Paths.get("./", "user");

        System.out.println("anotherAbsolutePath.isAbsolute() = " + anotherAbsolutePath.isAbsolute());


//        Get path to the dishes files
        Path dishesPath = Paths.get("data", "dishes.txt");
        Path dishesDirPath = Paths.get("data");

        List<String> fileData = null;

        try {
            if (Files.notExists(dishesDirPath)) Files.createDirectories(dishesDirPath);
            if (Files.notExists(dishesPath)) Files.createFile(dishesPath);

//            Read the contents of the file
            fileData = Files.readAllLines(dishesPath);

            throw new IOException();
//        Store
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File or Directory could not be created");
        }



        for (String line : fileData) {
//                    print out the lines from the file
            System.out.println(line);
        }

        FileManager dishesFile = new FileManager("dishes.txt", "data");
        dishesFile.printLines();


                fileData.add("additional item");
                fileData.add("additional item2");

        try {
            Files.write(dishesPath, fileData);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error creating files " + dishesPath.getFileName());
        }

        List<String> moreDishes = Arrays.asList("dish 1", "dish 2", "dish 3");
        System.out.println(moreDishes.toString());

        try {
            Files.write(dishesPath, moreDishes, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error creating files " + dishesPath.getFileName());
        }

        try {
            fileData = Files.readAllLines(dishesPath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File or directory could not be created");
        }

        for (String line : fileData) {
            System.out.println(line);
        }



    }
}
