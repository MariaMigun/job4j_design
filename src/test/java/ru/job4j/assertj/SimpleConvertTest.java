package ru.job4j.assertj;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;
import java.util.Map;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleConvertTest {
    @Test
    void checkArray() {
        SimpleConvert simpleConvert = new SimpleConvert();
        String[] array = simpleConvert.toArray("first", "second", "three", "four", "five");
        assertThat(array).hasSize(5)
                .contains("second")
                .contains("first", Index.atIndex(0))
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("first", Index.atIndex(1));
    }

    @Test
    void checkList() {
        SimpleConvert simpleConvert = new SimpleConvert();
        assertThat(simpleConvert.toList("first", "second", "three", "four", "five")).hasSize(5)
                .contains("second")
                .contains("first", Index.atIndex(0))
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("first", Index.atIndex(1));
    }

    @Test
    void checkSet() {
        SimpleConvert simpleConvert = new SimpleConvert();
        assertThat(simpleConvert.toSet("first", "second", "three", "four", "five")).hasSize(5)
                .contains("second")
                .containsAnyOf("zero", "second", "six");
    }

    @Test
    void assertMap() {
        Map<String, Integer> map = Map.of(
                "one", 1, "two", 2, "three", 3);
        SimpleConvert simpleConvert = new SimpleConvert();
        assertThat(simpleConvert.toMap("one", "two")).hasSize(2)
                /*содержит ключи*/
                .containsKeys("one")
                /*содержит значения*/
                .containsValues(1)
                /*не содержит ключ*/
                .doesNotContainKey("0")
                /*не содержит значение*/
                .doesNotContainValue(5)
                /*содержит пару ключ-значение*/
                .containsEntry("two", 1);
    }

}