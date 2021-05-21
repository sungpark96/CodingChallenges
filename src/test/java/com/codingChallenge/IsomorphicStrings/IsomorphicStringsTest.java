package com.codingChallenge.IsomorphicStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void positiveTest() {
        assertTrue(IsomorphicStrings.isIsomorphic("paper", "title"));
    }

    @Test
    void negativeTest() {
        assertFalse(IsomorphicStrings.isIsomorphic("foo", "bar"));
    }

}