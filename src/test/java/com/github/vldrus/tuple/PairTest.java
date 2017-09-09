/*
 * Copyright 2017 vldrus
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.vldrus.tuple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PairTest {

    @Test
    public void createPairWithBothNull() {
        Pair<String, String> pair = Pair.of(null, null);
        assertNull(pair.getFirst());
        assertNull(pair.getSecond());
    }

    @Test
    public void createPairWithFirstNull() {
        Pair<String, String> pair = Pair.of(null, "second");
        assertNull(pair.getFirst());
        assertEquals("second", pair.getSecond());
    }

    @Test
    public void createPairWithSecondNull() {
        Pair<String, String> pair = Pair.of("first", null);
        assertEquals("first", pair.getFirst());
        assertNull(pair.getSecond());
    }

    @Test
    public void createPairWithBothValues() {
        Pair<String, String> pair = Pair.of("first", "second");
        assertEquals("first", pair.getFirst());
        assertEquals("second", pair.getSecond());
    }
}
