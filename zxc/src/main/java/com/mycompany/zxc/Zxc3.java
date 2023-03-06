/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.nigga.zxc;

/**
 *
 * @author Senbonzakura
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ois
 */
public class Zxc3 {

    public static void main(String[] args) throws IOException {
        HashMap<String, List<File>> map = new HashMap<>();
        final File catFolder = new File("C:\\Users\\Senbonzakura\\Desktop\\koteki");
        final File dogFolder = new File("C:\\Users\\Senbonzakura\\Desktop\\peseki");
        final File ponFolder = new File("C:\\Users\\Senbonzakura\\Desktop\\diemonkey");
        Desktop desktop = Desktop.getDesktop();
        //desktop.open(getListFilesForFolder(catFolder).get(0));
        map.put("Koteki", getListFilesForFolder(catFolder));
        map.put("Peseki", getListFilesForFolder(dogFolder));
        map.put("Monkeys", getListFilesForFolder(ponFolder));
        System.out.println("Выберите категорию из 3 доступных: Koteki|Peseki|Monkeys: ");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        System.out.println(key);
        System.out.println("Выберите номер от 0: ");
        int value = scanner.nextInt();
        System.out.println(map.get(key));
        if (map.get(key) != null) {
            try {
                desktop.open(map.get(key).get(value));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Картинки с таким номером не существует.");
            } catch (IOException e) {
                System.out.println("Такой категории не существует.");
            }
        
        }
    }
    public static List<File> getListFilesForFolder(final File folder) {
        List<File> images = new ArrayList<>();
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                getListFilesForFolder(fileEntry);
            } else {
                images.add(fileEntry);
            }
        }
        return images;
    }
}
