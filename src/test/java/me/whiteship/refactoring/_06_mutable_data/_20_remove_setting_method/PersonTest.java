package me.whiteship.refactoring._06_mutable_data._20_remove_setting_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void person() {
        Person person = new Person("호순이", 8);
        assertEquals(8, person.getId());
        assertEquals("호순이", person.getName());
    }

}
