/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputStructParam extends AbstractModel{

    /**
    * 对应输出json中的key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 可以填json-path也可以支持常量或者内置关键字date类型
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * value的数据类型, 可选值: STRING, NUMBER,BOOLEAN,NULL,SYS_VARIABLE,JSONPATH
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
     * Get 对应输出json中的key 
     * @return Key 对应输出json中的key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 对应输出json中的key
     * @param Key 对应输出json中的key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 可以填json-path也可以支持常量或者内置关键字date类型 
     * @return Value 可以填json-path也可以支持常量或者内置关键字date类型
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 可以填json-path也可以支持常量或者内置关键字date类型
     * @param Value 可以填json-path也可以支持常量或者内置关键字date类型
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get value的数据类型, 可选值: STRING, NUMBER,BOOLEAN,NULL,SYS_VARIABLE,JSONPATH 
     * @return ValueType value的数据类型, 可选值: STRING, NUMBER,BOOLEAN,NULL,SYS_VARIABLE,JSONPATH
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set value的数据类型, 可选值: STRING, NUMBER,BOOLEAN,NULL,SYS_VARIABLE,JSONPATH
     * @param ValueType value的数据类型, 可选值: STRING, NUMBER,BOOLEAN,NULL,SYS_VARIABLE,JSONPATH
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    public OutputStructParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputStructParam(OutputStructParam source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);

    }
}

