/*
 * Copyright 2014 Alexander Oprisnik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oprisnik.semdroid.feature.value;

import com.oprisnik.semdroid.app.LocalVariable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocalVarTypeFVGTest {

    @Test
    public void testFeatureValueGenerator() throws Exception {
        LocalVarFeatureValueGenerator generator = new LocalVarTypeFVG();

        LocalVariable basic = new LocalVariable("hello", "B", null);
        LocalVariable composite = new LocalVariable("hello1", "Lcom/my/Clazz", null);

        assertEquals("B", generator.getFeatureValue(basic));
        assertEquals("Lcom/my/Clazz", generator.getFeatureValue(composite));
    }
}
