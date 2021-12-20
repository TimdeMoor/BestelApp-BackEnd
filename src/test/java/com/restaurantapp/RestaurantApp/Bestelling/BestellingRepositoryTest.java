package com.restaurantapp.RestaurantApp.Bestelling;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BestellingRepositoryTest {

    @Autowired
    private BestellingRepository underTest;

    @AfterEach
    void tearDown(){
        underTest.deleteAll();
    }

    @Test
    void getIncompleteTest() {
        //Arrange
        //Setup testData
        Bestelling stubBestelling1 = new Bestelling(1L, false);
        Bestelling stubBestelling2 = new Bestelling(2L, true);
        Bestelling stubBestelling3 = new Bestelling(3L, false);
        Bestelling stubBestelling4 = new Bestelling(4L, true);

        //Insert testdata in table
        underTest.save(stubBestelling1);
        underTest.save(stubBestelling2);
        underTest.save(stubBestelling3);
        underTest.save(stubBestelling4);

        //Define expected result
        List<Bestelling> expected = new ArrayList<>();
        expected.add(stubBestelling1);
        expected.add(stubBestelling3);

        //Act
        List<Bestelling> results = underTest.getIncomplete();

        //Assert
        assertThat(results).isEqualTo(expected);
    }

    @Test
    void TestGetSingle(){
        //Arrange
        //Setup testData
        Bestelling stubBestelling1 = new Bestelling(1L, false);
        Bestelling stubBestelling2 = new Bestelling(2L, true);
        Bestelling stubBestelling3 = new Bestelling(3L, false);
        Bestelling stubBestelling4 = new Bestelling(4L, true);

        //Insert testdata in table
        underTest.save(stubBestelling1);
        underTest.save(stubBestelling2);
        underTest.save(stubBestelling3);
        underTest.save(stubBestelling4);

        //Act
        Bestelling result = underTest.getById(1L);

        //Assert
        assertThat(result).isEqualTo(stubBestelling1);
    }
}