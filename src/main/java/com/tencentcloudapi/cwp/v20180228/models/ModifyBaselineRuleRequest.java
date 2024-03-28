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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBaselineRuleRequest extends AbstractModel {

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
    * 0:检测项，1:检测项分类
    */
    @SerializedName("IdType")
    @Expose
    private Long IdType;

    /**
    * 需要排除的检测项id
    */
    @SerializedName("ExcludeIds")
    @Expose
    private Long [] ExcludeIds;

    /**
    * 勾选的检测项分类
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

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

    /**
     * Get 0:检测项，1:检测项分类 
     * @return IdType 0:检测项，1:检测项分类
     */
    public Long getIdType() {
        return this.IdType;
    }

    /**
     * Set 0:检测项，1:检测项分类
     * @param IdType 0:检测项，1:检测项分类
     */
    public void setIdType(Long IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 需要排除的检测项id 
     * @return ExcludeIds 需要排除的检测项id
     */
    public Long [] getExcludeIds() {
        return this.ExcludeIds;
    }

    /**
     * Set 需要排除的检测项id
     * @param ExcludeIds 需要排除的检测项id
     */
    public void setExcludeIds(Long [] ExcludeIds) {
        this.ExcludeIds = ExcludeIds;
    }

    /**
     * Get 勾选的检测项分类 
     * @return CategoryIds 勾选的检测项分类
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set 勾选的检测项分类
     * @param CategoryIds 勾选的检测项分类
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
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
        if (source.IdType != null) {
            this.IdType = new Long(source.IdType);
        }
        if (source.ExcludeIds != null) {
            this.ExcludeIds = new Long[source.ExcludeIds.length];
            for (int i = 0; i < source.ExcludeIds.length; i++) {
                this.ExcludeIds[i] = new Long(source.ExcludeIds[i]);
            }
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new Long[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new Long(source.CategoryIds[i]);
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
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamArraySimple(map, prefix + "ExcludeIds.", this.ExcludeIds);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);

    }
}

