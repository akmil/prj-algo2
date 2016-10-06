package com.ykushch.prjalgo2.task4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistanceRecursiveTest {

    @Test
    public void shouldReturnCorrectSequenceWhenValidInputPassed() throws Exception {
        String inputA = "horizon";
        String inputB = "horizontal";

        int result = DistanceRecursive.computeEditDistance(inputA, inputB);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldFindLongestCommonSequenceWhenValidValuesPassed() throws Exception {
        String inputA = "world";
        String inputB = "fyord";
        String expected = "ord";

        String result = DistanceRecursive.findLongestCommonSequence(inputA, inputB);

        assertThat(result).isEqualTo(expected);
    }

}