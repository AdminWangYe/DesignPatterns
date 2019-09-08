package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonDirectorTest {

    @Test
    void createPerson() {
        PersonThinBuilder thinBuilder = new PersonThinBuilder("瘦小明");
        PersonDirector personDirector = new PersonDirector(thinBuilder);
        personDirector.createPerson();
    }
}