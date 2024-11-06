import javax.xml.bind.*;
import java.io.File;

public class PhoneXml {
    public static void main(String[] args) throws JAXBException {
        Memory memory = new Memory();
        memory.setCardMemorySize(100);
        Phone phone = new Phone("name", 1000, memory);

        File file = new File("C:\\Users\\Пользователь_Asus\\Downloads\\phone.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Phone.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(phone, file);
    }
}
