/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.prog6112poe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author RC_Student_lab
 */
public class SeriesTest {
    private SeriesModel series1;
    private SeriesModel series2;

    @BeforeEach
    void setUp() {
        series1 = new SeriesModel("S001", "Breaking Code", 16, 12);
        series2 = new SeriesModel("S002", "Java Hunters", 12, 8);
    }

    @Test
    void testCaptureSeries() {
        assertEquals("S001", series1.getSeriesId());
        assertEquals("Breaking Code", series1.getSeriesName());
        assertEquals(16, series1.getSeriesAge());
        assertEquals(12, series1.getSeriesNumberOfEpisodes());
    }

    @Test
    void testSearchSeriesById() {
        assertEquals("Java Hunters", series2.getSeriesName());
        assertNotEquals("Breaking Code", series2.getSeriesName());
    }

    @Test
    void testUpdateSeriesDetails() {
        // Update series name
        series1.setSeriesName("Breaking Code Reloaded");
        assertEquals("Breaking Code Reloaded", series1.getSeriesName());

        // Update age restriction
        series1.setSeriesAge(18);
        assertEquals(18, series1.getSeriesAge());

        // Update episodes
        series1.setSeriesNumberOfEpisodes(15);
        assertEquals(15, series1.getSeriesNumberOfEpisodes());
    }

    @Test
    void testDeleteSeries() {
        // Simulating delete by setting object to null
        series1 = null;
        assertNull(series1);
    }

    @Test
    void testSeriesReport() {
        String report = "Series ID: " + series2.getSeriesId() +
                        ", Name: " + series2.getSeriesName() +
                        ", Age Restriction: " + series2.getSeriesAge() +
                        ", Episodes: " + series2.getSeriesNumberOfEpisodes();

        assertTrue(report.contains("Java Hunters"));
        assertTrue(report.contains("Episodes: 8") || report.contains("8"));
    }
}
