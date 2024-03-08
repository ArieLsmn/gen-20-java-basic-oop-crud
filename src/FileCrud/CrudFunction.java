
import java.io.*;
import java.util.*;

    public class CrudFunction {
        // deklarasi variabel global
        static String fileName;
        static ArrayList<String> todoLists;
        static boolean isEditing = false;
        static Scanner input;


        static void backToMenu() {
        }

        static void readTodoList() {
            try {
                File file = new File(fileName);
                Scanner fileReader = new Scanner(file);

                // load isi file ke dalam array todoLists
                todoLists.clear();
                while (fileReader.hasNextLine()) {
                    String data = fileReader.nextLine();
                    todoLists.add(data);
                }

            } catch (FileNotFoundException e) {
                System.out.println("Error karena: " + e.getMessage());
            }
        }

        static void showTodoList() {
            readTodoList();
            if (todoLists.size() > 0) {
                System.out.println("TODO LIST:");
                int index = 0;
                for (String data : todoLists) {
                    System.out.println(String.format("[%d] %s", index, data));
                    index++;
                }
            } else {
                System.out.println("Tidak ada data!");
            }

            if (!isEditing) {
                backToMenu();
            }
        }

        static void addTodoList() {

            System.out.println("Apa yang ingin kamu kerjakan?");
            System.out.print("Jawab: ");
            String newTodoList = input.nextLine();

            try {
                // tulis file
                FileWriter fileWriter = new FileWriter(fileName, true);
                fileWriter.append(String.format("%s%n", newTodoList));
                fileWriter.close();
                System.out.println("Berhasil ditambahkan!");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan karena: " + e.getMessage());
            }

            backToMenu();
        }

        static void editTodoList() {
            isEditing = true;
            showTodoList();

            try {
                System.out.println("-----------------");
                System.out.print("Pilih Indeks> ");
                int index = Integer.parseInt(input.nextLine());

                if (index > todoLists.size()) {
                    throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
                } else {

                    System.out.print("Data baru: ");
                    String newData = input.nextLine();

                    // update data
                    todoLists.set(index, newData);

                    System.out.println(todoLists.toString());

                    try {
                        FileWriter fileWriter = new FileWriter(fileName, false);

                        // write new data
                        for (String data : todoLists) {
                            fileWriter.append(String.format("%s%n", data));
                        }
                        fileWriter.close();

                        System.out.println("Berhasil diubah!");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            backToMenu();
        }

        static void deleteTodoList() {
        }

    }

