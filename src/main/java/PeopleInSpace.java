import java.util.List;

public class PeopleInSpace {
    private List<Astronaut> people;
    private int number;
    private String message;

    public PeopleInSpace(List<Astronaut> people, int number, String message) {
        this.people = people;
        this.number = number;
        this.message = message;
    }

    public List<Astronaut> getPeople() {
        return people;
    }

    public void setPeople(List<Astronaut> people) {
        this.people = people;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PeopleInSpace() {

    }

    @Override
    public String toString() {
        return "PeopleInSpace{" +
                "people=" + people +
                ", number=" + number +
                ", message='" + message + '\'' +
                '}';
    }
}
