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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuerySimpleFilter extends AbstractModel {

    /**
    * 字段名称
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 字段值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 模糊匹配，true-是，false否
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
     * Get 字段名称 
     * @return Names 字段名称
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 字段名称
     * @param Names 字段名称
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 字段值 
     * @return Values 字段值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 字段值
     * @param Values 字段值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 模糊匹配，true-是，false否 
     * @return ExactMatch 模糊匹配，true-是，false否
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set 模糊匹配，true-是，false否
     * @param ExactMatch 模糊匹配，true-是，false否
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public QuerySimpleFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySimpleFilter(QuerySimpleFilter source) {
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
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
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);

    }
}

