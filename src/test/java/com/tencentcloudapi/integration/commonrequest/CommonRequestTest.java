package com.tencentcloudapi.integration.commonrequest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tencentcloudapi.common.CommonRequest;

import java.lang.reflect.Method;
import java.util.HashMap;

public class CommonRequestTest {

  @Test
  public void testNullJSON() {
    HashMap<String, String> map = new HashMap<>();
    String prefix = "TestPrefix";
    HashMap<String, String> expected = new HashMap<>();
    expected.put("TestPrefix.Filters", null);
    try {
      CommonRequest req = new CommonRequest("{\"Filters\":null}");
      Method toMap = CommonRequest.class.getDeclaredMethod("toMap", HashMap.class, String.class);
      toMap.setAccessible(true);
      toMap.invoke(req, map, prefix);
      assertEquals(map, expected);
    } catch (Exception e) {
      fail(e.getCause().toString());
    }
  }
}