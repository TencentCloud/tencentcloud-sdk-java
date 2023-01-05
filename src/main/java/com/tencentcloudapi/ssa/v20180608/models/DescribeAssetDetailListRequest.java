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

public class DescribeAssetDetailListRequest extends AbstractModel{

    /**
    * 查询条件，可支持的查询字段：AssetUniqid,AssetName,AssetIpAll,AssetVpcid,Tag
    */
    @SerializedName("Filter")
    @Expose
    private AssetQueryFilter [] Filter;

    /**
    * 排序条件，可支持的排序字段：
AssetCspmRiskNum,AssetVulNum,AssetEventNum,SsaAssetDiscoverTime
    */
    @SerializedName("Sorter")
    @Expose
    private QuerySort [] Sorter;

    /**
    * 风险标签
    */
    @SerializedName("RiskTags")
    @Expose
    private String [] RiskTags;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 页
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 查询条件，可支持的查询字段：AssetUniqid,AssetName,AssetIpAll,AssetVpcid,Tag 
     * @return Filter 查询条件，可支持的查询字段：AssetUniqid,AssetName,AssetIpAll,AssetVpcid,Tag
     */
    public AssetQueryFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询条件，可支持的查询字段：AssetUniqid,AssetName,AssetIpAll,AssetVpcid,Tag
     * @param Filter 查询条件，可支持的查询字段：AssetUniqid,AssetName,AssetIpAll,AssetVpcid,Tag
     */
    public void setFilter(AssetQueryFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 排序条件，可支持的排序字段：
AssetCspmRiskNum,AssetVulNum,AssetEventNum,SsaAssetDiscoverTime 
     * @return Sorter 排序条件，可支持的排序字段：
AssetCspmRiskNum,AssetVulNum,AssetEventNum,SsaAssetDiscoverTime
     */
    public QuerySort [] getSorter() {
        return this.Sorter;
    }

    /**
     * Set 排序条件，可支持的排序字段：
AssetCspmRiskNum,AssetVulNum,AssetEventNum,SsaAssetDiscoverTime
     * @param Sorter 排序条件，可支持的排序字段：
AssetCspmRiskNum,AssetVulNum,AssetEventNum,SsaAssetDiscoverTime
     */
    public void setSorter(QuerySort [] Sorter) {
        this.Sorter = Sorter;
    }

    /**
     * Get 风险标签 
     * @return RiskTags 风险标签
     */
    public String [] getRiskTags() {
        return this.RiskTags;
    }

    /**
     * Set 风险标签
     * @param RiskTags 风险标签
     */
    public void setRiskTags(String [] RiskTags) {
        this.RiskTags = RiskTags;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 页 
     * @return PageIndex 页
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 页
     * @param PageIndex 页
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 页大小 
     * @return PageSize 页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
     * @param PageSize 页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeAssetDetailListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetDetailListRequest(DescribeAssetDetailListRequest source) {
        if (source.Filter != null) {
            this.Filter = new AssetQueryFilter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new AssetQueryFilter(source.Filter[i]);
            }
        }
        if (source.Sorter != null) {
            this.Sorter = new QuerySort[source.Sorter.length];
            for (int i = 0; i < source.Sorter.length; i++) {
                this.Sorter[i] = new QuerySort(source.Sorter[i]);
            }
        }
        if (source.RiskTags != null) {
            this.RiskTags = new String[source.RiskTags.length];
            for (int i = 0; i < source.RiskTags.length; i++) {
                this.RiskTags[i] = new String(source.RiskTags[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamArrayObj(map, prefix + "Sorter.", this.Sorter);
        this.setParamArraySimple(map, prefix + "RiskTags.", this.RiskTags);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

