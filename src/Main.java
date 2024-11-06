import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Memory memory = new Memory();
        memory.setCardMemorySize(100);
        Phone phone = new Phone("name", 1000, memory);

        File file = new File("C:\\Users\\Пользователь_Asus\\Downloads\\phone.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(phone);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Пользователь_Asus\\Downloads\\phone.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Phone newPhone = (Phone) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(newPhone.getName() + "\n" +
                newPhone.getCost() + "\n" +
                newPhone.getMemory().getCardMemorySize());





    }
}