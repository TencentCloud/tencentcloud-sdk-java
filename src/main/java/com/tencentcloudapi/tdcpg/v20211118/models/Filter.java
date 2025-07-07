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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 过滤条件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤条件值数组
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * true:精确匹配(默认值) false:(模糊匹配)
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
     * Get 过滤条件名 
     * @return Name 过滤条件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤条件名
     * @param Name 过滤条件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤条件值数组 
     * @return Values 过滤条件值数组
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤条件值数组
     * @param Values 过滤条件值数组
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get true:精确匹配(默认值) false:(模糊匹配) 
     * @return ExactMatch true:精确匹配(默认值) false:(模糊匹配)
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set true:精确匹配(默认值) false:(模糊匹配)
     * @param ExactMatch true:精确匹配(默认值) false:(模糊匹配)
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
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
            this.ExactMatch = new Boolean(source.ExactMatch);
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

