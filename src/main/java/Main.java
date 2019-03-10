import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void whoIsInSpace(){

        ObjectMapper mapper = new ObjectMapper();

        try {
            PeopleInSpace peopleInSpace = mapper.readValue(new File("nowInSpace.json"), PeopleInSpace.class);
            System.out.println(peopleInSpace.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {

whoIsInSpace();

    }

}


