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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sLabel extends AbstractModel{

    /**
    * Label的Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Label的Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Label的Key 
     * @return Key Label的Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Label的Key
     * @param Key Label的Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Label的Value 
     * @return Value Label的Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Label的Value
     * @param Value Label的Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public K8sLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sLabel(K8sLabel source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
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

