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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDSPAClustersRequest extends AbstractModel {

    /**
    * 分页步长，默认为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤项。
支持的过滤项包括：DspaId、Status、Version、DspaName、Channel。
DspaId和DspaName支持模糊搜索。
Status支持的可选值：enabled、disabled。
Version支持的可选值：trial、official。
Channel支持的可选值：sp_cds_dsgc_pre（代表dsgc实例）、sp_cds_dsgc_wedata_dc（代表wedata实例）
    */
    @SerializedName("Filters")
    @Expose
    private DspaDataSourceMngFilter [] Filters;

    /**
    * Tag键值过滤
    */
    @SerializedName("TagFilter")
    @Expose
    private Tag [] TagFilter;

    /**
    * 展示模式。

目前只有两个值的处理逻辑：

空值：需要查询每个实例的配额信息，因为是串行查询，所以速度很慢，limit最大为100

"simple"：不需要查询每个实例的配额信息，速度快，limit最大为1000
    */
    @SerializedName("ListMode")
    @Expose
    private String ListMode;

    /**
     * Get 分页步长，默认为100。 
     * @return Limit 分页步长，默认为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页步长，默认为100。
     * @param Limit 分页步长，默认为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，默认为0。 
     * @return Offset 分页偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认为0。
     * @param Offset 分页偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤项。
支持的过滤项包括：DspaId、Status、Version、DspaName、Channel。
DspaId和DspaName支持模糊搜索。
Status支持的可选值：enabled、disabled。
Version支持的可选值：trial、official。
Channel支持的可选值：sp_cds_dsgc_pre（代表dsgc实例）、sp_cds_dsgc_wedata_dc（代表wedata实例） 
     * @return Filters 过滤项。
支持的过滤项包括：DspaId、Status、Version、DspaName、Channel。
DspaId和DspaName支持模糊搜索。
Status支持的可选值：enabled、disabled。
Version支持的可选值：trial、official。
Channel支持的可选值：sp_cds_dsgc_pre（代表dsgc实例）、sp_cds_dsgc_wedata_dc（代表wedata实例）
     */
    public DspaDataSourceMngFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤项。
支持的过滤项包括：DspaId、Status、Version、DspaName、Channel。
DspaId和DspaName支持模糊搜索。
Status支持的可选值：enabled、disabled。
Version支持的可选值：trial、official。
Channel支持的可选值：sp_cds_dsgc_pre（代表dsgc实例）、sp_cds_dsgc_wedata_dc（代表wedata实例）
     * @param Filters 过滤项。
支持的过滤项包括：DspaId、Status、Version、DspaName、Channel。
DspaId和DspaName支持模糊搜索。
Status支持的可选值：enabled、disabled。
Version支持的可选值：trial、official。
Channel支持的可选值：sp_cds_dsgc_pre（代表dsgc实例）、sp_cds_dsgc_wedata_dc（代表wedata实例）
     */
    public void setFilters(DspaDataSourceMngFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Tag键值过滤 
     * @return TagFilter Tag键值过滤
     */
    public Tag [] getTagFilter() {
        return this.TagFilter;
    }

    /**
     * Set Tag键值过滤
     * @param TagFilter Tag键值过滤
     */
    public void setTagFilter(Tag [] TagFilter) {
        this.TagFilter = TagFilter;
    }

    /**
     * Get 展示模式。

目前只有两个值的处理逻辑：

空值：需要查询每个实例的配额信息，因为是串行查询，所以速度很慢，limit最大为100

"simple"：不需要查询每个实例的配额信息，速度快，limit最大为1000 
     * @return ListMode 展示模式。

目前只有两个值的处理逻辑：

空值：需要查询每个实例的配额信息，因为是串行查询，所以速度很慢，limit最大为100

"simple"：不需要查询每个实例的配额信息，速度快，limit最大为1000
     */
    public String getListMode() {
        return this.ListMode;
    }

    /**
     * Set 展示模式。

目前只有两个值的处理逻辑：

空值：需要查询每个实例的配额信息，因为是串行查询，所以速度很慢，limit最大为100

"simple"：不需要查询每个实例的配额信息，速度快，limit最大为1000
     * @param ListMode 展示模式。

目前只有两个值的处理逻辑：

空值：需要查询每个实例的配额信息，因为是串行查询，所以速度很慢，limit最大为100

"simple"：不需要查询每个实例的配额信息，速度快，limit最大为1000
     */
    public void setListMode(String ListMode) {
        this.ListMode = ListMode;
    }

    public ListDSPAClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDSPAClustersRequest(ListDSPAClustersRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new DspaDataSourceMngFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new DspaDataSourceMngFilter(source.Filters[i]);
            }
        }
        if (source.TagFilter != null) {
            this.TagFilter = new Tag[source.TagFilter.length];
            for (int i = 0; i < source.TagFilter.length; i++) {
                this.TagFilter[i] = new Tag(source.TagFilter[i]);
            }
        }
        if (source.ListMode != null) {
            this.ListMode = new String(source.ListMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilter.", this.TagFilter);
        this.setParamSimple(map, prefix + "ListMode", this.ListMode);

    }
}

