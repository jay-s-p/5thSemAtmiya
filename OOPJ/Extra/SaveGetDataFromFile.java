import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class MyObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public MyObject() {
    }

    public MyObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SaveGetDataFromFile {

    private static final Scanner sc = new Scanner(System.in);
    private static MyObject data = new MyObject();

    public static void main(String[] args) {
        if (sc.nextInt() == 1) {
            sc.nextLine();
            System.out.print("Enter name : ");
            data.setName(sc.nextLine());
            System.out.print("Enter id   : ");
            data.setId(Integer.parseInt(sc.nextLine()));
            saveData();
        } else {
            getData();
            System.out.println("Name : " + data.getName());
            System.out.println("Id : " + data.getId());
        }

    }

    private static final void getData() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data.txt"));
            data = (MyObject) inputStream.readObject(); // get the object from the file
            inputStream.close(); // close the stream
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static final void saveData() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("data.txt"));
            outputStream.writeObject(data); // save the object to the file
            outputStream.close(); // close the stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
