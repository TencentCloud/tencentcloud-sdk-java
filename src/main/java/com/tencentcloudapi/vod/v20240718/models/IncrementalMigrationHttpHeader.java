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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationHttpHeader extends AbstractModel {

    /**
    * Header 键。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Header 值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Header 键。 
     * @return Key Header 键。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Header 键。
     * @param Key Header 键。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Header 值。 
     * @return Value Header 值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Header 值。
     * @param Value Header 值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public IncrementalMigrationHttpHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpHeader(IncrementalMigrationHttpHeader source) {
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

