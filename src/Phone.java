import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@XmlRootElement
public class Phone implements Serializable {
    private final static long SerialVersionUID = 1L;

    private String name;
    private int cost;
    private Memory memory;
    private String model;

    @XmlElement
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Phone(String model) {
        this.model = model;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @XmlElement
    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Phone(String name, int cost, Memory memory) {
        this.name = name;
        this.cost = cost;
        this.memory = memory;
    }
}
