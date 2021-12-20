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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceScanFailedAssetListRequest extends AbstractModel{

    /**
    * 资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
    */
    @SerializedName("AssetTypeSet")
    @Expose
    private String [] AssetTypeSet;

    /**
    * 起始偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回的数据量，默认为10，最大为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询过滤器
    */
    @SerializedName("Filters")
    @Expose
    private ComplianceFilters [] Filters;

    /**
     * Get 资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产 
     * @return AssetTypeSet 资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
     */
    public String [] getAssetTypeSet() {
        return this.AssetTypeSet;
    }

    /**
     * Set 资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
     * @param AssetTypeSet 资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
     */
    public void setAssetTypeSet(String [] AssetTypeSet) {
        this.AssetTypeSet = AssetTypeSet;
    }

    /**
     * Get 起始偏移量，默认为0。 
     * @return Offset 起始偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始偏移量，默认为0。
     * @param Offset 起始偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回的数据量，默认为10，最大为100。 
     * @return Limit 返回的数据量，默认为10，最大为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回的数据量，默认为10，最大为100。
     * @param Limit 返回的数据量，默认为10，最大为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询过滤器 
     * @return Filters 查询过滤器
     */
    public ComplianceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询过滤器
     * @param Filters 查询过滤器
     */
    public void setFilters(ComplianceFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeComplianceScanFailedAssetListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceScanFailedAssetListRequest(DescribeComplianceScanFailedAssetListRequest source) {
        if (source.AssetTypeSet != null) {
            this.AssetTypeSet = new String[source.AssetTypeSet.length];
            for (int i = 0; i < source.AssetTypeSet.length; i++) {
                this.AssetTypeSet[i] = new String(source.AssetTypeSet[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ComplianceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ComplianceFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetTypeSet.", this.AssetTypeSet);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

