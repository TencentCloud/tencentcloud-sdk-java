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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSocCheckResultListRequest extends AbstractModel {

    /**
    * 查询参数,可支持的查询参数：
Name,Type,AssetType,Result,PloyName,PloyId
    */
    @SerializedName("Filter")
    @Expose
    private QueryFilter [] Filter;

    /**
    * 排序参数,可支持的排序参数：CheckStatus,RiskCount
    */
    @SerializedName("Sorter")
    @Expose
    private QuerySort [] Sorter;

    /**
    * 当前页码数据，默认值为10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前页面索引，默认值为0
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
     * Get 查询参数,可支持的查询参数：
Name,Type,AssetType,Result,PloyName,PloyId 
     * @return Filter 查询参数,可支持的查询参数：
Name,Type,AssetType,Result,PloyName,PloyId
     */
    public QueryFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询参数,可支持的查询参数：
Name,Type,AssetType,Result,PloyName,PloyId
     * @param Filter 查询参数,可支持的查询参数：
Name,Type,AssetType,Result,PloyName,PloyId
     */
    public void setFilter(QueryFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 排序参数,可支持的排序参数：CheckStatus,RiskCount 
     * @return Sorter 排序参数,可支持的排序参数：CheckStatus,RiskCount
     */
    public QuerySort [] getSorter() {
        return this.Sorter;
    }

    /**
     * Set 排序参数,可支持的排序参数：CheckStatus,RiskCount
     * @param Sorter 排序参数,可支持的排序参数：CheckStatus,RiskCount
     */
    public void setSorter(QuerySort [] Sorter) {
        this.Sorter = Sorter;
    }

    /**
     * Get 当前页码数据，默认值为10 
     * @return PageSize 当前页码数据，默认值为10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 当前页码数据，默认值为10
     * @param PageSize 当前页码数据，默认值为10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前页面索引，默认值为0 
     * @return PageIndex 当前页面索引，默认值为0
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 当前页面索引，默认值为0
     * @param PageIndex 当前页面索引，默认值为0
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 资产id 
     * @return AssetId 资产id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
     * @param AssetId 资产id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    public DescribeSocCheckResultListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSocCheckResultListRequest(DescribeSocCheckResultListRequest source) {
        if (source.Filter != null) {
            this.Filter = new QueryFilter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new QueryFilter(source.Filter[i]);
            }
        }
        if (source.Sorter != null) {
            this.Sorter = new QuerySort[source.Sorter.length];
            for (int i = 0; i < source.Sorter.length; i++) {
                this.Sorter[i] = new QuerySort(source.Sorter[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamArrayObj(map, prefix + "Sorter.", this.Sorter);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);

    }
}

