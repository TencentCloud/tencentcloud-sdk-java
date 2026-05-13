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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filters extends AbstractModel {

    /**
    * 过滤条件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤条件值列表
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 是否精确匹配：1 精确匹配；默认模糊匹配
    */
    @SerializedName("ExactMatch")
    @Expose
    private String ExactMatch;

    /**
     * Get 过滤条件名称 
     * @return Name 过滤条件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤条件名称
     * @param Name 过滤条件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤条件值列表 
     * @return Values 过滤条件值列表
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤条件值列表
     * @param Values 过滤条件值列表
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 是否精确匹配：1 精确匹配；默认模糊匹配 
     * @return ExactMatch 是否精确匹配：1 精确匹配；默认模糊匹配
     */
    public String getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set 是否精确匹配：1 精确匹配；默认模糊匹配
     * @param ExactMatch 是否精确匹配：1 精确匹配；默认模糊匹配
     */
    public void setExactMatch(String ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public Filters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filters(Filters source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new String(source.ExactMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);

    }
}

