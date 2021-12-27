import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"));
            int totalNumberOfRecord = inputStream.readInt();
            System.out.println("The total number of records is " + totalNumberOfRecord);
            String [][] names = new String[totalNumberOfRecord][3];

            try{
                int row = 0;
                while(true){
                    String name = inputStream.readUTF();
                    int age = inputStream.readInt();
                    char gender = inputStream.readChar();

                    names[row][0] = name;
                    names[row][1] = Integer.toString(age);
                    names[row][2] = gender + " ";
                    row++;
                }
            } catch(EOFException e){
                System.out.println("Finish reading the file");
                for(int i = 0 ; i < names.length ; i ++){
                    for(int j = 0 ;  j < names.length  - 1;  j ++){
                        //Ali
                        //Abu
                        if (names[j][0].compareToIgnoreCase(names[j + 1][0]) > 0){
                            String [] temp = names[j];
                            names[j] = names[j+1];
                            names[j+1] = temp;
                        }
                    }
                }
                for(int i=0;i <names.length; i++){
                    System.out.println("Name is " + names[i][0]);
                    System.out.println("Age is " + names[i][1]);
                    System.out.println("Gender is " + names[i][2]);
                    System.out.println();
                }
            }

            inputStream.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
}
