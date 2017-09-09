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
 * A simple immutable pair for two values
 *
 * @param <F> the first value type
 * @param <S> the second value type
 */
@Data
public class Pair<F, S> implements Serializable {

    /**
     * Serialization version number
     */
    private static final long serialVersionUID = 1469265266602763007L;

    /**
     * First value
     */
    private final F first;

    /**
     * Second value
     */
    private final S second;

    /**
     * Creates an immutable pair of two values
     *
     * @param first  the first value
     * @param second the second value
     * @param <F>    the first value type
     * @param <S>    the second value type
     * @return An immutable pair of two values
     */
    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<F, S>(first, second);
    }
}
