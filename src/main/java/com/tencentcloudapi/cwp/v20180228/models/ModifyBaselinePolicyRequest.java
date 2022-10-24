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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBaselinePolicyRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("Data")
    @Expose
    private BaselinePolicy Data;

    /**
    * <li>RuleName - String - 是否必填：否 - 规则名称</li>
<li>CategoryId - int64 - 是否必填：否 自定义筛选为-1 - 规则分类</li>
<li>RuleType - int - 是否必填：否 0:系统 1:自定义 - 规则类型</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 是否按照过滤的全选
    */
    @SerializedName("SelectAll")
    @Expose
    private Long SelectAll;

    /**
     * Get 无 
     * @return Data 无
     */
    public BaselinePolicy getData() {
        return this.Data;
    }

    /**
     * Set 无
     * @param Data 无
     */
    public void setData(BaselinePolicy Data) {
        this.Data = Data;
    }

    /**
     * Get <li>RuleName - String - 是否必填：否 - 规则名称</li>
<li>CategoryId - int64 - 是否必填：否 自定义筛选为-1 - 规则分类</li>
<li>RuleType - int - 是否必填：否 0:系统 1:自定义 - 规则类型</li> 
     * @return Filters <li>RuleName - String - 是否必填：否 - 规则名称</li>
<li>CategoryId - int64 - 是否必填：否 自定义筛选为-1 - 规则分类</li>
<li>RuleType - int - 是否必填：否 0:系统 1:自定义 - 规则类型</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>RuleName - String - 是否必填：否 - 规则名称</li>
<li>CategoryId - int64 - 是否必填：否 自定义筛选为-1 - 规则分类</li>
<li>RuleType - int - 是否必填：否 0:系统 1:自定义 - 规则类型</li>
     * @param Filters <li>RuleName - String - 是否必填：否 - 规则名称</li>
<li>CategoryId - int64 - 是否必填：否 自定义筛选为-1 - 规则分类</li>
<li>RuleType - int - 是否必填：否 0:系统 1:自定义 - 规则类型</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否按照过滤的全选 
     * @return SelectAll 是否按照过滤的全选
     */
    public Long getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set 是否按照过滤的全选
     * @param SelectAll 是否按照过滤的全选
     */
    public void setSelectAll(Long SelectAll) {
        this.SelectAll = SelectAll;
    }

    public ModifyBaselinePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselinePolicyRequest(ModifyBaselinePolicyRequest source) {
        if (source.Data != null) {
            this.Data = new BaselinePolicy(source.Data);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Long(source.SelectAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);

    }
}

