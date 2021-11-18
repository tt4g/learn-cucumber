package com.github.tt4g.lean.cucumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class IsItFridayTest {

    @Test
    public void isItFridayWhenFridayThenTGIF() {
        assertThat(IsItFriday.isItFriday("Friday")).isEqualTo("TGIF");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Saturday"})
    public void isItFridayWhenNotFridayThenNope(String today) {
        assertThat(IsItFriday.isItFriday(today)).isEqualTo("Nope");
    }

}
