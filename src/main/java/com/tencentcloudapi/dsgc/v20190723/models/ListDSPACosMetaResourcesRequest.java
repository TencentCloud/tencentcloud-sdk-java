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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDSPACosMetaResourcesRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 过滤数组。支持的Name：
Bucket - 桶名，支持模糊匹配

ResoureRegion - 资源所处地域，需要填写完整地域名称，不支持模糊匹配。

Valid -- 资源是否有效，"1" 表示有效，"0"表示无效。
    */
    @SerializedName("Filters")
    @Expose
    private DspaDataSourceMngFilter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资源绑定状态过滤，默认为全部
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
     * Get 实例Id 
     * @return DspaId 实例Id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set 实例Id
     * @param DspaId 实例Id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 过滤数组。支持的Name：
Bucket - 桶名，支持模糊匹配

ResoureRegion - 资源所处地域，需要填写完整地域名称，不支持模糊匹配。

Valid -- 资源是否有效，"1" 表示有效，"0"表示无效。 
     * @return Filters 过滤数组。支持的Name：
Bucket - 桶名，支持模糊匹配

ResoureRegion - 资源所处地域，需要填写完整地域名称，不支持模糊匹配。

Valid -- 资源是否有效，"1" 表示有效，"0"表示无效。
     */
    public DspaDataSourceMngFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤数组。支持的Name：
Bucket - 桶名，支持模糊匹配

ResoureRegion - 资源所处地域，需要填写完整地域名称，不支持模糊匹配。

Valid -- 资源是否有效，"1" 表示有效，"0"表示无效。
     * @param Filters 过滤数组。支持的Name：
Bucket - 桶名，支持模糊匹配

ResoureRegion - 资源所处地域，需要填写完整地域名称，不支持模糊匹配。

Valid -- 资源是否有效，"1" 表示有效，"0"表示无效。
     */
    public void setFilters(DspaDataSourceMngFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为100。 
     * @return Limit 返回数量，默认为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为100。
     * @param Limit 返回数量，默认为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 资源绑定状态过滤，默认为全部 
     * @return BindType 资源绑定状态过滤，默认为全部
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set 资源绑定状态过滤，默认为全部
     * @param BindType 资源绑定状态过滤，默认为全部
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    public ListDSPACosMetaResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDSPACosMetaResourcesRequest(ListDSPACosMetaResourcesRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.Filters != null) {
            this.Filters = new DspaDataSourceMngFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new DspaDataSourceMngFilter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "BindType", this.BindType);

    }
}

