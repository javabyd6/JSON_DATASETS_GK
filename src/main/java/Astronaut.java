public class Astronaut {

    String name;
    String craft;

    public Astronaut(String name, String craft) {
        this.name = name;
        this.craft = craft;
    }

    public Astronaut() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCraft() {
        return craft;
    }

    public void setCraft(String craft) {
        this.craft = craft;
    }

    @Override
    public String toString() {
        return "Astronaut{" +
                "name='" + name + '\'' +
                ", craft='" + craft + '\'' +
                '}';
    }



}


