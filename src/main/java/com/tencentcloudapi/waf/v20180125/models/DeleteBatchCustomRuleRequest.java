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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBatchCustomRuleRequest extends AbstractModel {

    /**
    * 数据类型 
"custom-rule"-自定义规则、"custom-white-rule"-精准白名单

    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * 0-指定Id删除、1-删除全部（除部分排除的Id）

    */
    @SerializedName("IsDeleteAll")
    @Expose
    private Long IsDeleteAll;

    /**
    * 具体Ids 由IsDeleteAll而定
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 筛选条件
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
     * Get 数据类型 
"custom-rule"-自定义规则、"custom-white-rule"-精准白名单
 
     * @return DataType 数据类型 
"custom-rule"-自定义规则、"custom-white-rule"-精准白名单

     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型 
"custom-rule"-自定义规则、"custom-white-rule"-精准白名单

     * @param DataType 数据类型 
"custom-rule"-自定义规则、"custom-white-rule"-精准白名单

     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 0-指定Id删除、1-删除全部（除部分排除的Id）
 
     * @return IsDeleteAll 0-指定Id删除、1-删除全部（除部分排除的Id）

     */
    public Long getIsDeleteAll() {
        return this.IsDeleteAll;
    }

    /**
     * Set 0-指定Id删除、1-删除全部（除部分排除的Id）

     * @param IsDeleteAll 0-指定Id删除、1-删除全部（除部分排除的Id）

     */
    public void setIsDeleteAll(Long IsDeleteAll) {
        this.IsDeleteAll = IsDeleteAll;
    }

    /**
     * Get 具体Ids 由IsDeleteAll而定 
     * @return Ids 具体Ids 由IsDeleteAll而定
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 具体Ids 由IsDeleteAll而定
     * @param Ids 具体Ids 由IsDeleteAll而定
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 筛选条件 
     * @return Filters 筛选条件
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件
     * @param Filters 筛选条件
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DeleteBatchCustomRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBatchCustomRuleRequest(DeleteBatchCustomRuleRequest source) {
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.IsDeleteAll != null) {
            this.IsDeleteAll = new Long(source.IsDeleteAll);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "IsDeleteAll", this.IsDeleteAll);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

