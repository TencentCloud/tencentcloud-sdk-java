/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CamTag extends AbstractModel {

    /**
    * tag键值
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * tag值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get tag键值 
     * @return Key tag键值
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set tag键值
     * @param Key tag键值
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get tag值 
     * @return Value tag值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set tag值
     * @param Value tag值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public CamTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CamTag(CamTag source) {
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

