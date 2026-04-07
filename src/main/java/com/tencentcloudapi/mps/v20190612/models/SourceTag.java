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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceTag extends AbstractModel {

    /**
    * sourcetag的key，支持1-50位的大写字母、数字、下划线、中划线
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * sourcetag的value，支持1-200位的字母、数字下划线、中划线、英文句号、百分号（%）
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get sourcetag的key，支持1-50位的大写字母、数字、下划线、中划线 
     * @return Key sourcetag的key，支持1-50位的大写字母、数字、下划线、中划线
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set sourcetag的key，支持1-50位的大写字母、数字、下划线、中划线
     * @param Key sourcetag的key，支持1-50位的大写字母、数字、下划线、中划线
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get sourcetag的value，支持1-200位的字母、数字下划线、中划线、英文句号、百分号（%） 
     * @return Value sourcetag的value，支持1-200位的字母、数字下划线、中划线、英文句号、百分号（%）
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set sourcetag的value，支持1-200位的字母、数字下划线、中划线、英文句号、百分号（%）
     * @param Value sourcetag的value，支持1-200位的字母、数字下划线、中划线、英文句号、百分号（%）
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public SourceTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceTag(SourceTag source) {
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

