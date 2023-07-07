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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceAccountsRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 列出所有服务级账号
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 是否填充策略
    */
    @SerializedName("EmbedPermission")
    @Expose
    private Boolean EmbedPermission;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大输出条数，默认20，最大为100（超出最大值，调整到最大值）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 列出所有服务级账号 
     * @return All 列出所有服务级账号
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 列出所有服务级账号
     * @param All 列出所有服务级账号
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 是否填充策略 
     * @return EmbedPermission 是否填充策略
     */
    public Boolean getEmbedPermission() {
        return this.EmbedPermission;
    }

    /**
     * Set 是否填充策略
     * @param EmbedPermission 是否填充策略
     */
    public void setEmbedPermission(Boolean EmbedPermission) {
        this.EmbedPermission = EmbedPermission;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量,默认0 
     * @return Offset 偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大输出条数，默认20，最大为100（超出最大值，调整到最大值） 
     * @return Limit 最大输出条数，默认20，最大为100（超出最大值，调整到最大值）
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大输出条数，默认20，最大为100（超出最大值，调整到最大值）
     * @param Limit 最大输出条数，默认20，最大为100（超出最大值，调整到最大值）
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeServiceAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceAccountsRequest(DescribeServiceAccountsRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.EmbedPermission != null) {
            this.EmbedPermission = new Boolean(source.EmbedPermission);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamSimple(map, prefix + "EmbedPermission", this.EmbedPermission);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

