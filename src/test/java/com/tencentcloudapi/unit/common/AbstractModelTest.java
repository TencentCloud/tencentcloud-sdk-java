package com.tencentcloudapi.unit.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.tencentcloudapi.common.AbstractModel;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertTrue;

public class AbstractModelTest {
    @Test
    public void fromJsonStringTest() {
        TestModel testModel = new TestModel();
        TestModel.fromJsonString("{}", TestModel.class);
    }

    @Test
    public void getMultipartRequestParamsTest() throws Exception {
        TestModel testModel = new TestModel();
        Map<String, byte[]> map = Whitebox.invokeMethod(testModel, "getMultipartRequestParams");
        assertTrue(map == null || map.isEmpty());
    }

    @Test
    public void setParamSimpleTest() throws Exception {
        TestModel testModel = new TestModel();
        String key = "key";
        Map<String, String> map = new HashMap<>();
        Whitebox.invokeMethod(testModel, "setParamSimple", map, key, 123);
    }

    @Test
    public void setParamArraySimpleTest() throws Exception {
        TestModel testModel = new TestModel();
        String key = "key";
        Map<String, String> map = new HashMap<>();
        String[] V = new String[]{"a", "b"};
        Whitebox.invokeMethod(testModel, "setParamArraySimple", map, key, V);
    }

    @Test
    public void setParamObjTest() throws Exception {
        TestModel testModel = new TestModel();
        String prefix = "prefix";
        Map<String, String> map = new HashMap<>();
        Whitebox.invokeMethod(testModel, "setParamObj", map, prefix, testModel);
    }

    @Test
    public void setParamArrayObjTest() throws Exception {
        TestModel testModel = new TestModel();
        String prefix = "prefix";
        Map<String, String> map = new HashMap<>();
        TestModel[] array = new TestModel[]{testModel};
        Whitebox.invokeMethod(testModel, "setParamArrayObj", map, prefix, array);
    }
}

class TestModel extends AbstractModel {
    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
    }
}