package firstlab;

import java.io.Serializable;

public class QuartersDTO implements Serializable {
    private String name;
    private String address;

    public QuartersDTO() {

    }

    public QuartersDTO(String name, String address ) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "QuartersDTO{" +
                "class'" + this.getClass().getName() + "' "+
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
