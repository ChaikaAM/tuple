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

public class TripleTest {

    @Test
    public void createTripleWithAllNull() {
        Triple<String, String, String> triple = Triple.of(null, null, null);
        assertNull(triple.getFirst());
        assertNull(triple.getSecond());
        assertNull(triple.getThird());
    }

    @Test
    public void createTripleWithFirstValue() {
        Triple<String, String, String> triple = Triple.of("first", null, null);
        assertEquals("first", triple.getFirst());
        assertNull(triple.getSecond());
        assertNull(triple.getThird());
    }

    @Test
    public void createTripleWithSecondValue() {
        Triple<String, String, String> triple = Triple.of(null, "second", null);
        assertNull(triple.getFirst());
        assertEquals("second", triple.getSecond());
        assertNull(triple.getThird());
    }

    @Test
    public void createTripleWithThirdValue() {
        Triple<String, String, String> triple = Triple.of(null, null, "third");
        assertNull(triple.getFirst());
        assertNull(triple.getSecond());
        assertEquals("third", triple.getThird());
    }

    @Test
    public void createTripleWithFirstNull() {
        Triple<String, String, String> triple = Triple.of(null, "second", "third");
        assertNull(triple.getFirst());
        assertEquals("second", triple.getSecond());
        assertEquals("third", triple.getThird());
    }

    @Test
    public void createTripleWithSecondNull() {
        Triple<String, String, String> triple = Triple.of("first", null, "third");
        assertEquals("first", triple.getFirst());
        assertNull(triple.getSecond());
        assertEquals("third", triple.getThird());
    }

    @Test
    public void createTripleWithThirdNull() {
        Triple<String, String, String> triple = Triple.of("first", "second", null);
        assertEquals("first", triple.getFirst());
        assertEquals("second", triple.getSecond());
        assertNull(triple.getThird());
    }

    @Test
    public void createTripleWithAllValues() {
        Triple<String, String, String> triple = Triple.of("first", "second", "third");
        assertEquals("first", triple.getFirst());
        assertEquals("second", triple.getSecond());
        assertEquals("third", triple.getThird());
    }
}
