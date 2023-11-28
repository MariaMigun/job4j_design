package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoxTest {
    @Test
    void isThisSphere() {
        Box box = new Box(0, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Sphere");
    }

    @Test
    void isThisCube() {
        Box box = new Box(8, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Cube");
    }

    @Test
    void getNumVert() {
        Box box = new Box(4, 10);
        int numOfVert = box.getNumberOfVertices();
        assertThat(numOfVert).isEqualTo(4);
    }

    @Test
    void getNumVert2() {
        Box box = new Box(0, 10);
        int numOfVert = box.getNumberOfVertices();
        assertThat(numOfVert).isEqualTo(0);
    }

    @Test
    void isExists() {
        Box box = new Box(4, 10);
        boolean exists = box.isExist();
        assertThat(exists).isEqualTo(true);
    }

    @Test
    void isExists2() {
        Box box = new Box(0, 10);
        boolean exists = box.isExist();
        assertThat(exists).isEqualTo(true);
    }

    @Test
    void getarea() {
        Box box = new Box(4, 10);
        double gerAr = box.getArea();
        assertThat(gerAr).isEqualTo(Math.sqrt(3) * 100);
    }

    @Test
    void getarea2() {
        Box box = new Box(0, 10);
        double gerAr = box.getArea();
        assertThat(gerAr).isEqualTo(4 * Math.PI * 100);
    }
}