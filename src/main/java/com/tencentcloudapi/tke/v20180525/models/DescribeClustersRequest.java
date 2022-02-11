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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClustersRequest extends AbstractModel{

    /**
    * 集群ID列表(为空时，
表示获取账号下所有集群)
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大输出条数，默认20，最大为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * ·  ClusterName
    按照【集群名】进行过滤。
    类型：String
    必选：否

·  ClusterType
    按照【集群类型】进行过滤。
    类型：String
    必选：否

·  ClusterStatus
    按照【集群状态】进行过滤。
    类型：String
    必选：否

·  Tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  vpc-id
    按照【VPC】进行过滤。
    类型：String
    必选：否

·  tag-key
    按照【标签键】进行过滤。
    类型：String
    必选：否

·  tag-value
    按照【标签值】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 集群类型，例如：MANAGED_CLUSTER
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get 集群ID列表(为空时，
表示获取账号下所有集群) 
     * @return ClusterIds 集群ID列表(为空时，
表示获取账号下所有集群)
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 集群ID列表(为空时，
表示获取账号下所有集群)
     * @param ClusterIds 集群ID列表(为空时，
表示获取账号下所有集群)
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
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
     * Get 最大输出条数，默认20，最大为100 
     * @return Limit 最大输出条数，默认20，最大为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大输出条数，默认20，最大为100
     * @param Limit 最大输出条数，默认20，最大为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get ·  ClusterName
    按照【集群名】进行过滤。
    类型：String
    必选：否

·  ClusterType
    按照【集群类型】进行过滤。
    类型：String
    必选：否

·  ClusterStatus
    按照【集群状态】进行过滤。
    类型：String
    必选：否

·  Tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  vpc-id
    按照【VPC】进行过滤。
    类型：String
    必选：否

·  tag-key
    按照【标签键】进行过滤。
    类型：String
    必选：否

·  tag-value
    按照【标签值】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否 
     * @return Filters ·  ClusterName
    按照【集群名】进行过滤。
    类型：String
    必选：否

·  ClusterType
    按照【集群类型】进行过滤。
    类型：String
    必选：否

·  ClusterStatus
    按照【集群状态】进行过滤。
    类型：String
    必选：否

·  Tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  vpc-id
    按照【VPC】进行过滤。
    类型：String
    必选：否

·  tag-key
    按照【标签键】进行过滤。
    类型：String
    必选：否

·  tag-value
    按照【标签值】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set ·  ClusterName
    按照【集群名】进行过滤。
    类型：String
    必选：否

·  ClusterType
    按照【集群类型】进行过滤。
    类型：String
    必选：否

·  ClusterStatus
    按照【集群状态】进行过滤。
    类型：String
    必选：否

·  Tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  vpc-id
    按照【VPC】进行过滤。
    类型：String
    必选：否

·  tag-key
    按照【标签键】进行过滤。
    类型：String
    必选：否

·  tag-value
    按照【标签值】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否
     * @param Filters ·  ClusterName
    按照【集群名】进行过滤。
    类型：String
    必选：否

·  ClusterType
    按照【集群类型】进行过滤。
    类型：String
    必选：否

·  ClusterStatus
    按照【集群状态】进行过滤。
    类型：String
    必选：否

·  Tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  vpc-id
    按照【VPC】进行过滤。
    类型：String
    必选：否

·  tag-key
    按照【标签键】进行过滤。
    类型：String
    必选：否

·  tag-value
    按照【标签值】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 集群类型，例如：MANAGED_CLUSTER 
     * @return ClusterType 集群类型，例如：MANAGED_CLUSTER
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，例如：MANAGED_CLUSTER
     * @param ClusterType 集群类型，例如：MANAGED_CLUSTER
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public DescribeClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClustersRequest(DescribeClustersRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

