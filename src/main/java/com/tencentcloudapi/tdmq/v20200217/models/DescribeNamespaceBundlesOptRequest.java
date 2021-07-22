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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNamespaceBundlesOptRequest extends AbstractModel{

    /**
    * 物理集群名
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 虚拟集群（租户）ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 命名空间名
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 是否需要监控指标，若传false，则不需要传Limit和Offset分页参数
    */
    @SerializedName("NeedMetrics")
    @Expose
    private Boolean NeedMetrics;

    /**
    * 查询限制条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 物理集群名 
     * @return ClusterName 物理集群名
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 物理集群名
     * @param ClusterName 物理集群名
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 虚拟集群（租户）ID 
     * @return TenantId 虚拟集群（租户）ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 虚拟集群（租户）ID
     * @param TenantId 虚拟集群（租户）ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 命名空间名 
     * @return NamespaceName 命名空间名
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名
     * @param NamespaceName 命名空间名
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 是否需要监控指标，若传false，则不需要传Limit和Offset分页参数 
     * @return NeedMetrics 是否需要监控指标，若传false，则不需要传Limit和Offset分页参数
     */
    public Boolean getNeedMetrics() {
        return this.NeedMetrics;
    }

    /**
     * Set 是否需要监控指标，若传false，则不需要传Limit和Offset分页参数
     * @param NeedMetrics 是否需要监控指标，若传false，则不需要传Limit和Offset分页参数
     */
    public void setNeedMetrics(Boolean NeedMetrics) {
        this.NeedMetrics = NeedMetrics;
    }

    /**
     * Get 查询限制条数 
     * @return Limit 查询限制条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询限制条数
     * @param Limit 查询限制条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询偏移量 
     * @return Offset 查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量
     * @param Offset 查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeNamespaceBundlesOptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNamespaceBundlesOptRequest(DescribeNamespaceBundlesOptRequest source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.NeedMetrics != null) {
            this.NeedMetrics = new Boolean(source.NeedMetrics);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "NeedMetrics", this.NeedMetrics);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

