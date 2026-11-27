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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectionFilter extends AbstractModel {

    /**
    * <p>需要过滤的字段名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>对应字段的过滤值。</p>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * <p>是否启用模糊查询。</p>
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get <p>需要过滤的字段名。</p> 
     * @return Name <p>需要过滤的字段名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>需要过滤的字段名。</p>
     * @param Name <p>需要过滤的字段名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>对应字段的过滤值。</p> 
     * @return Values <p>对应字段的过滤值。</p>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>对应字段的过滤值。</p>
     * @param Values <p>对应字段的过滤值。</p>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get <p>是否启用模糊查询。</p> 
     * @return Fuzzy <p>是否启用模糊查询。</p>
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set <p>是否启用模糊查询。</p>
     * @param Fuzzy <p>是否启用模糊查询。</p>
     */
    public void setFuzzy(Boolean Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    public ProtectionFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectionFilter(ProtectionFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Fuzzy != null) {
            this.Fuzzy = new Boolean(source.Fuzzy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);

    }
}

