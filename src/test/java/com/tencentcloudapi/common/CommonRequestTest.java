/*
 * Copyright (c) 2018 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.common;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Tests for {@link CommonRequest}.
 *
 * <p>{@link CommonRequest} wraps a JSON string into an {@link AbstractModel}
 * by deserialising it into a {@code HashMap<String, Object>} and feeding each
 * entry into {@code set(key, value)}. Its {@code toMap} then recursively
 * flattens nested maps/lists into dot-prefixed string keys.
 */
public class CommonRequestTest {

    // =================================================================
    //  Constructor / deserialisation
    // =================================================================

    /**
     * The constructor deserialises the JSON and writes each top-level entry
     * into {@code any()} (the parent's {@code customizedParams}).
     */
    @Test
    public void testConstructorPopulatesAnyFromJson() {
        CommonRequest req = new CommonRequest("{\"Region\":\"ap-guangzhou\",\"Limit\":10}");
        HashMap<String, Object> any = req.any();
        assertEquals("ap-guangzhou", any.get("Region"));
        // LONG_OR_DOUBLE strategy: integer → Long
        assertTrue("Limit should be a Long under LONG_OR_DOUBLE strategy, got "
                + (any.get("Limit") == null ? "null" : any.get("Limit").getClass().getName()),
                any.get("Limit") instanceof Long);
        assertEquals(10L, any.get("Limit"));
    }

    /**
     * LONG_OR_DOUBLE number strategy: a number with a decimal point becomes
     * {@code Double}; an integer becomes {@code Long}.
     */
    @Test
    public void testNumberStrategyLongOrDouble() {
        CommonRequest req = new CommonRequest("{\"Int\":1,\"Float\":1.5}");
        HashMap<String, Object> any = req.any();
        assertTrue("integer should be Long", any.get("Int") instanceof Long);
        assertTrue("float should be Double", any.get("Float") instanceof Double);
        assertEquals(1L, any.get("Int"));
        assertEquals(1.5d, (Double) any.get("Float"), 0.0);
    }

    // =================================================================
    //  toMap flattening — invoked via the protected method from same package
    // =================================================================

    /**
     * Calls {@link CommonRequest#toMap(HashMap, String)} with an empty prefix
     * and returns the resulting flat map.
     */
    private static HashMap<String, String> flatten(CommonRequest req) {
        HashMap<String, String> map = new HashMap<String, String>();
        req.toMap(map, "");
        return map;
    }

    /** Top-level scalar key/value pairs flatten directly with no prefix. */
    @Test
    public void testToMapFlatScalars() {
        CommonRequest req = new CommonRequest("{\"Region\":\"ap-guangzhou\",\"Limit\":10}");
        HashMap<String, String> map = flatten(req);
        assertEquals("ap-guangzhou", map.get("Region"));
        assertEquals("10", map.get("Limit"));
        assertEquals(2, map.size());
    }

    /** Nested map keys are joined with a dot. */
    @Test
    public void testToMapNestedMapUsesDotPrefix() {
        CommonRequest req = new CommonRequest(
                "{\"Filters\":{\"Name\":\"zone\",\"Values\":\"ap-gz1\"}}");
        HashMap<String, String> map = flatten(req);
        assertEquals("zone", map.get("Filters.Name"));
        assertEquals("ap-gz1", map.get("Filters.Values"));
    }

    /** List elements are indexed positionally with a dot before the index. */
    @Test
    public void testToMapListUsesIndexPrefix() {
        CommonRequest req = new CommonRequest(
                "{\"Zones\":[\"ap-gz1\",\"ap-gz2\",\"ap-gz3\"]}");
        HashMap<String, String> map = flatten(req);
        assertEquals("ap-gz1", map.get("Zones.0"));
        assertEquals("ap-gz2", map.get("Zones.1"));
        assertEquals("ap-gz3", map.get("Zones.2"));
        assertEquals(3, map.size());
    }

    /** Mixed nested map/list structures flatten with combined prefixes. */
    @Test
    public void testToMapMixedNestedStructure() {
        CommonRequest req = new CommonRequest(
                "{\"Filters\":[{\"Name\":\"zone\",\"Values\":[\"ap-gz1\",\"ap-gz2\"]}]}");
        HashMap<String, String> map = flatten(req);
        assertEquals("Filters.0.Name", "zone", map.get("Filters.0.Name"));
        assertEquals("ap-gz1", map.get("Filters.0.Values.0"));
        assertEquals("ap-gz2", map.get("Filters.0.Values.1"));
        assertEquals(3, map.size());
    }

    /**
     * A null value anywhere in the structure is skipped — {@code toMapFromObject}
     * returns early for null layers.
     */
    @Test
    public void testToMapNullValuesAreSkipped() {
        CommonRequest req = new CommonRequest(
                "{\"Keep\":\"v\",\"Drop\":null,\"Nested\":{\"A\":1,\"B\":null}}");
        HashMap<String, String> map = flatten(req);
        assertEquals("v", map.get("Keep"));
        assertNull("null top-level value should be skipped", map.get("Drop"));
        assertEquals("1", map.get("Nested.A"));
        assertNull("null nested value should be skipped", map.get("Nested.B"));
        assertEquals(2, map.size());
    }

    /**
     * A non-empty prefix is prepended to every key (used when the parent
     * calls toMap with a field-name prefix).
     */
    @Test
    public void testToMapWithNonEmptyPrefix() {
        CommonRequest req = new CommonRequest("{\"A\":1,\"B\":2}");
        HashMap<String, String> map = new HashMap<String, String>();
        req.toMap(map, "Root");
        assertEquals("1", map.get("Root.A"));
        assertEquals("2", map.get("Root.B"));
        assertEquals(2, map.size());
    }

    /**
     * Boolean leaf values are stringified via {@code toString()} → "true"/"false".
     */
    @Test
    public void testToMapBooleanLeafStringified() {
        CommonRequest req = new CommonRequest("{\"Enabled\":true,\"Disabled\":false}");
        HashMap<String, String> map = flatten(req);
        assertEquals("true", map.get("Enabled"));
        assertEquals("false", map.get("Disabled"));
    }
}
