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

public class DescribeAllTenantsRequest extends AbstractModel{

    /**
    * 查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询限制条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 物理集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 虚拟集群ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 虚拟集群名称
    */
    @SerializedName("TenantName")
    @Expose
    private String TenantName;

    /**
    * 协议类型数组
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * 排序字段名，支持createTime，updateTime
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 升序排列ASC，降序排列DESC
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

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
     * Get 物理集群名称 
     * @return ClusterName 物理集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 物理集群名称
     * @param ClusterName 物理集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 虚拟集群ID 
     * @return TenantId 虚拟集群ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 虚拟集群ID
     * @param TenantId 虚拟集群ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 虚拟集群名称 
     * @return TenantName 虚拟集群名称
     */
    public String getTenantName() {
        return this.TenantName;
    }

    /**
     * Set 虚拟集群名称
     * @param TenantName 虚拟集群名称
     */
    public void setTenantName(String TenantName) {
        this.TenantName = TenantName;
    }

    /**
     * Get 协议类型数组 
     * @return Types 协议类型数组
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set 协议类型数组
     * @param Types 协议类型数组
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get 排序字段名，支持createTime，updateTime 
     * @return SortBy 排序字段名，支持createTime，updateTime
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段名，支持createTime，updateTime
     * @param SortBy 排序字段名，支持createTime，updateTime
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 升序排列ASC，降序排列DESC 
     * @return SortOrder 升序排列ASC，降序排列DESC
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 升序排列ASC，降序排列DESC
     * @param SortOrder 升序排列ASC，降序排列DESC
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeAllTenantsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllTenantsRequest(DescribeAllTenantsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.TenantName != null) {
            this.TenantName = new String(source.TenantName);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "TenantName", this.TenantName);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

