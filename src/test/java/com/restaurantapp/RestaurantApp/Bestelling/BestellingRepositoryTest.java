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
        Bestelling stubBestelling1 = new Bestelling(100L,1L, false);
        Bestelling stubBestelling2 = new Bestelling(200L,2L, false);
        Bestelling stubBestelling3 = new Bestelling(300L,3L, false);
        Bestelling stubBestelling4 = new Bestelling(400L,4L, false);

        //Insert testdata in table
        underTest.save(stubBestelling1);
        underTest.save(stubBestelling2);
        underTest.save(stubBestelling3);
        underTest.save(stubBestelling4);

        //Define expected result
        List<Bestelling> expected = new ArrayList<>();
        expected.add(stubBestelling1);
        expected.add(stubBestelling2);
        expected.add(stubBestelling3);
        expected.add(stubBestelling4);

        //Act
        List<Bestelling> results = underTest.getIncomplete();

        //Assert
        assertThat(results.get(0).id).isEqualTo(stubBestelling1.id);
        assertThat(results.get(0).isComplete).isEqualTo(stubBestelling1.isComplete);
        assertThat(results.get(0).totalPrice).isEqualTo(stubBestelling1.totalPrice);
        assertThat(results.get(0).tableId).isEqualTo(stubBestelling1.tableId);

        assertThat(results.get(1).id).isEqualTo(stubBestelling2.id);
        assertThat(results.get(1).isComplete).isEqualTo(stubBestelling2.isComplete);
        assertThat(results.get(1).totalPrice).isEqualTo(stubBestelling2.totalPrice);
        assertThat(results.get(1).tableId).isEqualTo(stubBestelling2.tableId);

        assertThat(results.get(2).id).isEqualTo(stubBestelling3.id);
        assertThat(results.get(2).isComplete).isEqualTo(stubBestelling3.isComplete);
        assertThat(results.get(2).totalPrice).isEqualTo(stubBestelling3.totalPrice);
        assertThat(results.get(2).tableId).isEqualTo(stubBestelling3.tableId);

        assertThat(results.get(3).id).isEqualTo(stubBestelling4.id);
        assertThat(results.get(3).isComplete).isEqualTo(stubBestelling4.isComplete);
        assertThat(results.get(3).totalPrice).isEqualTo(stubBestelling4.totalPrice);
        assertThat(results.get(3).tableId).isEqualTo(stubBestelling4.tableId);
    }

    @Test
    void TestGetSingle(){
        //Arrange
        //Setup testData
        Bestelling stubBestelling1 = new Bestelling(100L,1L, false);
        Bestelling stubBestelling2 = new Bestelling(200L,2L, true);
        Bestelling stubBestelling3 = new Bestelling(300L,3L, false);
        Bestelling stubBestelling4 = new Bestelling(400L,4L, true);

        //Insert testdata in table
        underTest.save(stubBestelling1);
        underTest.save(stubBestelling2);
        underTest.save(stubBestelling3);
        underTest.save(stubBestelling4);

        //Act
        Bestelling result = underTest.getById(100L);

        //Assert
        assertThat(result.id).isEqualTo(stubBestelling1.id);
        assertThat(result.tableId).isEqualTo(stubBestelling1.tableId);
        assertThat(result.isComplete).isEqualTo(stubBestelling1.isComplete);
        assertThat(result.totalPrice).isEqualTo(stubBestelling1.totalPrice);
    }
}