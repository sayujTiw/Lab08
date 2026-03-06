package com.example.lab08;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CustomList list;
    private City calgary;

    @BeforeEach
    public void setUp() {
        list = new CustomList();
        calgary = new City("Calgary", "AB");
    }

    @Test
    public void testHasCityReturnsTrue() {
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testHasCityReturnsFalse() {
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCityRemovesCity() {
        list.addCity(calgary);
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCityNotInList() {
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }
    @Test
    public void testCountCitiesEmpty() {
        assertEquals(0, list.countCities());
    }

    @Test
    public void testCountCitiesAfterAdd() {
        list.addCity(calgary);
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(2, list.countCities());
    }
}