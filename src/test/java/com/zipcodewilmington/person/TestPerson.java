package com.zipcodewilmington.person;

import com.sun.xml.internal.ws.model.AbstractSEIModelImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHeight() {
        Person newPerson = new Person();
        Double expected = 5.4;

        //When
        newPerson.setHeight(expected);

        //Then

        Double actual = newPerson.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setWeight() {
        Person newPerson = new Person();
        Double expected = 150.4;

        //When
        newPerson.setWeight(expected);

        //Then

        Double actual = newPerson.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHairColor() {
        // Given
        Person person = new Person();
        String expected = "Black";

        // When
        person.setHairColor(expected);
        String actual = person.getHairColor();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGender() {
        // Given
        Person person = new Person();
        char expected = 'M';

        // When
        person.setGender(expected);
        char actual = person.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setEyeColor(expected);
        String actual = person.getEyeColor();

        // Then
        Assert.assertEquals(expected, actual);
    }

}


