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

public class DescribeMappingResultsRequest extends AbstractModel{

    /**
    * 过滤条件，FilterKey 取值范围：AssetId，AssetIp，PrivateIp，Protocol，Service，OS，Process，Component，AssetType，Domain，Port，LastMappingTime，MappingType，Disposal，Vpc
    */
    @SerializedName("Filter")
    @Expose
    private AssetQueryFilter [] Filter;

    /**
    * 排序条件，SortKey取值范围：CreateTime，LastMappingTime
    */
    @SerializedName("Sorter")
    @Expose
    private QuerySort [] Sorter;

    /**
    * 页码
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 页大小，默认大小20
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 过滤条件，FilterKey 取值范围：AssetId，AssetIp，PrivateIp，Protocol，Service，OS，Process，Component，AssetType，Domain，Port，LastMappingTime，MappingType，Disposal，Vpc 
     * @return Filter 过滤条件，FilterKey 取值范围：AssetId，AssetIp，PrivateIp，Protocol，Service，OS，Process，Component，AssetType，Domain，Port，LastMappingTime，MappingType，Disposal，Vpc
     */
    public AssetQueryFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件，FilterKey 取值范围：AssetId，AssetIp，PrivateIp，Protocol，Service，OS，Process，Component，AssetType，Domain，Port，LastMappingTime，MappingType，Disposal，Vpc
     * @param Filter 过滤条件，FilterKey 取值范围：AssetId，AssetIp，PrivateIp，Protocol，Service，OS，Process，Component，AssetType，Domain，Port，LastMappingTime，MappingType，Disposal，Vpc
     */
    public void setFilter(AssetQueryFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 排序条件，SortKey取值范围：CreateTime，LastMappingTime 
     * @return Sorter 排序条件，SortKey取值范围：CreateTime，LastMappingTime
     */
    public QuerySort [] getSorter() {
        return this.Sorter;
    }

    /**
     * Set 排序条件，SortKey取值范围：CreateTime，LastMappingTime
     * @param Sorter 排序条件，SortKey取值范围：CreateTime，LastMappingTime
     */
    public void setSorter(QuerySort [] Sorter) {
        this.Sorter = Sorter;
    }

    /**
     * Get 页码 
     * @return PageIndex 页码
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 页码
     * @param PageIndex 页码
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 页大小，默认大小20 
     * @return PageSize 页大小，默认大小20
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小，默认大小20
     * @param PageSize 页大小，默认大小20
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeMappingResultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMappingResultsRequest(DescribeMappingResultsRequest source) {
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
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

