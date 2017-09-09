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

import lombok.Data;

import java.io.Serializable;

/**
 * A simple immutable triple for three values
 *
 * @param <F> the first value type
 * @param <S> the second value type
 * @param <T> the third value type
 */
@Data
public class Triple<F, S, T> implements Serializable {

    /**
     * Serialization version number
     */
    private static final long serialVersionUID = -2000349813586248909L;

    /**
     * First value
     */
    private final F first;

    /**
     * Second value
     */
    private final S second;

    /**
     * Third value
     */
    private final T third;

    /**
     * Creates an immutable triple of three values
     *
     * @param first  the first value
     * @param second the second value
     * @param third  the third value
     * @param <F>    the first value type
     * @param <S>    the second value type
     * @param <T>    the third value type
     * @return An immutable triple of three values
     */
    public static <F, S, T> Triple<F, S, T> of(F first, S second, T third) {
        return new Triple<F, S, T>(first, second, third);
    }
}
