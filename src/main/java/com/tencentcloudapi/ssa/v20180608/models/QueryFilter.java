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
    * 查询的字段
    */
    @SerializedName("FilterKey")
    @Expose
    private String FilterKey;

    /**
    * 查询的值
    */
    @SerializedName("FilterValue")
    @Expose
    private String FilterValue;

    /**
    * 匹配类型，1等于；2大于；3小于；4大于等于；5小于等于；6不等于；7in；8not in；9模糊匹配
    */
    @SerializedName("FilterOperatorType")
    @Expose
    private Long FilterOperatorType;

    /**
     * Get 查询的字段 
     * @return FilterKey 查询的字段
     */
    public String getFilterKey() {
        return this.FilterKey;
    }

    /**
     * Set 查询的字段
     * @param FilterKey 查询的字段
     */
    public void setFilterKey(String FilterKey) {
        this.FilterKey = FilterKey;
    }

    /**
     * Get 查询的值 
     * @return FilterValue 查询的值
     */
    public String getFilterValue() {
        return this.FilterValue;
    }

    /**
     * Set 查询的值
     * @param FilterValue 查询的值
     */
    public void setFilterValue(String FilterValue) {
        this.FilterValue = FilterValue;
    }

    /**
     * Get 匹配类型，1等于；2大于；3小于；4大于等于；5小于等于；6不等于；7in；8not in；9模糊匹配 
     * @return FilterOperatorType 匹配类型，1等于；2大于；3小于；4大于等于；5小于等于；6不等于；7in；8not in；9模糊匹配
     */
    public Long getFilterOperatorType() {
        return this.FilterOperatorType;
    }

    /**
     * Set 匹配类型，1等于；2大于；3小于；4大于等于；5小于等于；6不等于；7in；8not in；9模糊匹配
     * @param FilterOperatorType 匹配类型，1等于；2大于；3小于；4大于等于；5小于等于；6不等于；7in；8not in；9模糊匹配
     */
    public void setFilterOperatorType(Long FilterOperatorType) {
        this.FilterOperatorType = FilterOperatorType;
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
        if (source.FilterValue != null) {
            this.FilterValue = new String(source.FilterValue);
        }
        if (source.FilterOperatorType != null) {
            this.FilterOperatorType = new Long(source.FilterOperatorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterKey", this.FilterKey);
        this.setParamSimple(map, prefix + "FilterValue", this.FilterValue);
        this.setParamSimple(map, prefix + "FilterOperatorType", this.FilterOperatorType);

    }
}

