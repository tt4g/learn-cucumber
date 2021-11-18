package com.github.tt4g.lean.cucumber;

import io.cucumber.java8.En;

import static org.assertj.core.api.Assertions.assertThat;

public class IsItFridaySteps implements En {

    private String today;

    private String actualAnswer;

    public IsItFridaySteps() {
        Given("today is {string}", (String today) -> {
            this.today = today;
        });

        Given("today is Friday", () -> {
            this.today = "Friday";
        });

        When("I ask whether it's Friday yet", () -> {
            this.actualAnswer = IsItFriday.isItFriday(this.today);
        });

        Then("I should be told {string}", (String expectedAnswer) -> {
            assertThat(expectedAnswer).isEqualTo(this.actualAnswer);
        });
    }

}
