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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributeMap extends AbstractModel{

    /**
    * 属性字典 key [a-zA-Z0-9-\.]*
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 属性字典 value
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 属性字典 key [a-zA-Z0-9-\.]* 
     * @return Key 属性字典 key [a-zA-Z0-9-\.]*
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 属性字典 key [a-zA-Z0-9-\.]*
     * @param Key 属性字典 key [a-zA-Z0-9-\.]*
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 属性字典 value 
     * @return Value 属性字典 value
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 属性字典 value
     * @param Value 属性字典 value
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public AttributeMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributeMap(AttributeMap source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

