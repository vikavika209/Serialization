import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@XmlRootElement
public class Memory implements Serializable {
    private int cardMemorySize;

    @XmlElement
    public int getCardMemorySize() {
        return cardMemorySize;
    }

    public void setCardMemorySize(int cardMemorySize) {
        this.cardMemorySize = cardMemorySize;
    }
}
