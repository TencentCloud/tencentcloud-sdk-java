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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFilter extends AbstractModel{

    /**
    * 过滤key
    */
    @SerializedName("FilterKey")
    @Expose
    private String FilterKey;

    /**
    * 操作符(只支持32位)
    */
    @SerializedName("FilterOperatorType")
    @Expose
    private Long FilterOperatorType;

    /**
    * 过滤value
    */
    @SerializedName("FilterValue")
    @Expose
    private String FilterValue;

    /**
     * Get 过滤key 
     * @return FilterKey 过滤key
     */
    public String getFilterKey() {
        return this.FilterKey;
    }

    /**
     * Set 过滤key
     * @param FilterKey 过滤key
     */
    public void setFilterKey(String FilterKey) {
        this.FilterKey = FilterKey;
    }

    /**
     * Get 操作符(只支持32位) 
     * @return FilterOperatorType 操作符(只支持32位)
     */
    public Long getFilterOperatorType() {
        return this.FilterOperatorType;
    }

    /**
     * Set 操作符(只支持32位)
     * @param FilterOperatorType 操作符(只支持32位)
     */
    public void setFilterOperatorType(Long FilterOperatorType) {
        this.FilterOperatorType = FilterOperatorType;
    }

    /**
     * Get 过滤value 
     * @return FilterValue 过滤value
     */
    public String getFilterValue() {
        return this.FilterValue;
    }

    /**
     * Set 过滤value
     * @param FilterValue 过滤value
     */
    public void setFilterValue(String FilterValue) {
        this.FilterValue = FilterValue;
    }

    public QueryFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFilter(QueryFilter source) {
        if (source.FilterKey != null) {
            this.FilterKey = new String(source.FilterKey);
        }
        if (source.FilterOperatorType != null) {
            this.FilterOperatorType = new Long(source.FilterOperatorType);
        }
        if (source.FilterValue != null) {
            this.FilterValue = new String(source.FilterValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterKey", this.FilterKey);
        this.setParamSimple(map, prefix + "FilterOperatorType", this.FilterOperatorType);
        this.setParamSimple(map, prefix + "FilterValue", this.FilterValue);

    }
}

