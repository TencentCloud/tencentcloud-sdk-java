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

public class DescribeNamespacesRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 指定命名空间，不填写默认查询所有命名空间
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 每页个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页面偏移（第几页）
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 列出所有命名空间
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 仅查询启用了 KMS 镜像签名的空间
    */
    @SerializedName("KmsSignPolicy")
    @Expose
    private Boolean KmsSignPolicy;

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
     * Get 指定命名空间，不填写默认查询所有命名空间 
     * @return NamespaceName 指定命名空间，不填写默认查询所有命名空间
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 指定命名空间，不填写默认查询所有命名空间
     * @param NamespaceName 指定命名空间，不填写默认查询所有命名空间
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 每页个数 
     * @return Limit 每页个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页个数
     * @param Limit 每页个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页面偏移（第几页） 
     * @return Offset 页面偏移（第几页）
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页面偏移（第几页）
     * @param Offset 页面偏移（第几页）
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 列出所有命名空间 
     * @return All 列出所有命名空间
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 列出所有命名空间
     * @param All 列出所有命名空间
     */
    public void setAll(Boolean All) {
        this.All = All;
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
     * Get 仅查询启用了 KMS 镜像签名的空间 
     * @return KmsSignPolicy 仅查询启用了 KMS 镜像签名的空间
     */
    public Boolean getKmsSignPolicy() {
        return this.KmsSignPolicy;
    }

    /**
     * Set 仅查询启用了 KMS 镜像签名的空间
     * @param KmsSignPolicy 仅查询启用了 KMS 镜像签名的空间
     */
    public void setKmsSignPolicy(Boolean KmsSignPolicy) {
        this.KmsSignPolicy = KmsSignPolicy;
    }

    public DescribeNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNamespacesRequest(DescribeNamespacesRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.KmsSignPolicy != null) {
            this.KmsSignPolicy = new Boolean(source.KmsSignPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "KmsSignPolicy", this.KmsSignPolicy);

    }
}

