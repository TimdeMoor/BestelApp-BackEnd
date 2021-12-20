package com.restaurantapp.RestaurantApp.Bestelling;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.openMocks;

class BestellingContainerTest {

    @Mock private BestellingRepository repo;
    private BestellingContainer underTest;
    private AutoCloseable closeable;

    @BeforeEach
    void setUp(){
        //Deze methode functioneert als de Arrange van elke test in deze class
        closeable = MockitoAnnotations.openMocks(this);
        underTest = new BestellingContainer(repo);
    }

    @AfterEach
    void tearDown() throws Exception{
        closeable.close();
    }

    @Test
    void testGetAll() {
        //Act
        underTest.getAll();

        //Assert
        verify(repo).findAll();
    }

    @Test
    void testAdd() {
        //Arrange
        Bestelling testBestelling = new Bestelling(1L, false);

        //Act
        underTest.add(testBestelling);

        //Assert
        ArgumentCaptor<Bestelling> bestellingArgumentCaptor =
                ArgumentCaptor.forClass(Bestelling.class);

        //Check of de save method van de repository wordt aangeroepen
        verify(repo).save(bestellingArgumentCaptor.capture());

        //Extract de bestelling die meegegeven wordt...
        Bestelling captured = bestellingArgumentCaptor.getValue();

        //...en check of deze overeenkomt met de testbestelling
        assertThat(captured).isEqualTo(testBestelling);
    }

    @Test
    void testDelete() {
        //Act
        underTest.delete(1L);

        //Assert
        verify(repo).deleteById(1L);
    }

    @Test
    void testGetIncomplete() {
        //Act
        underTest.getIncomplete();

        //Assert
        verify(repo).getIncomplete();
    }


    @Test
    void testComplete() {
        //TODO: Implement
    }
}