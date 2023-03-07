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

public class ModifyBaselineRuleRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("Data")
    @Expose
    private BaselineRule Data;

    /**
    * 是否过滤全选
    */
    @SerializedName("SelectAll")
    @Expose
    private Long SelectAll;

    /**
    * <li>ItemName - string - 是否必填：否 - 项名称</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 无 
     * @return Data 无
     */
    public BaselineRule getData() {
        return this.Data;
    }

    /**
     * Set 无
     * @param Data 无
     */
    public void setData(BaselineRule Data) {
        this.Data = Data;
    }

    /**
     * Get 是否过滤全选 
     * @return SelectAll 是否过滤全选
     */
    public Long getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set 是否过滤全选
     * @param SelectAll 是否过滤全选
     */
    public void setSelectAll(Long SelectAll) {
        this.SelectAll = SelectAll;
    }

    /**
     * Get <li>ItemName - string - 是否必填：否 - 项名称</li> 
     * @return Filters <li>ItemName - string - 是否必填：否 - 项名称</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>ItemName - string - 是否必填：否 - 项名称</li>
     * @param Filters <li>ItemName - string - 是否必填：否 - 项名称</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ModifyBaselineRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselineRuleRequest(ModifyBaselineRuleRequest source) {
        if (source.Data != null) {
            this.Data = new BaselineRule(source.Data);
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Long(source.SelectAll);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

