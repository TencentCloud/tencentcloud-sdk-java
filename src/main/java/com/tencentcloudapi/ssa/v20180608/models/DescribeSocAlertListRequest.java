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

public class DescribeSocAlertListRequest extends AbstractModel{

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 业务场景 参考ScenesType
    */
    @SerializedName("Scenes")
    @Expose
    private Long Scenes;

    /**
    * 查询参数
    */
    @SerializedName("Filter")
    @Expose
    private QueryFilter [] Filter;

    /**
    * 排序参数
    */
    @SerializedName("Sorter")
    @Expose
    private QuerySort [] Sorter;

    /**
    * 是否导出
    */
    @SerializedName("ExportFlag")
    @Expose
    private Boolean ExportFlag;

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
     * Get 业务场景 参考ScenesType 
     * @return Scenes 业务场景 参考ScenesType
     */
    public Long getScenes() {
        return this.Scenes;
    }

    /**
     * Set 业务场景 参考ScenesType
     * @param Scenes 业务场景 参考ScenesType
     */
    public void setScenes(Long Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get 查询参数 
     * @return Filter 查询参数
     */
    public QueryFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询参数
     * @param Filter 查询参数
     */
    public void setFilter(QueryFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 排序参数 
     * @return Sorter 排序参数
     */
    public QuerySort [] getSorter() {
        return this.Sorter;
    }

    /**
     * Set 排序参数
     * @param Sorter 排序参数
     */
    public void setSorter(QuerySort [] Sorter) {
        this.Sorter = Sorter;
    }

    /**
     * Get 是否导出 
     * @return ExportFlag 是否导出
     */
    public Boolean getExportFlag() {
        return this.ExportFlag;
    }

    /**
     * Set 是否导出
     * @param ExportFlag 是否导出
     */
    public void setExportFlag(Boolean ExportFlag) {
        this.ExportFlag = ExportFlag;
    }

    public DescribeSocAlertListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSocAlertListRequest(DescribeSocAlertListRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.Scenes != null) {
            this.Scenes = new Long(source.Scenes);
        }
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
        if (source.ExportFlag != null) {
            this.ExportFlag = new Boolean(source.ExportFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "Scenes", this.Scenes);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamArrayObj(map, prefix + "Sorter.", this.Sorter);
        this.setParamSimple(map, prefix + "ExportFlag", this.ExportFlag);

    }
}

