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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusClusterAgentsRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 用于通过集群id过滤被绑定集群
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 用于通过集群类型过滤被绑定集群
    */
    @SerializedName("ClusterTypes")
    @Expose
    private String [] ClusterTypes;

    /**
    * 用于通过名称搜索被绑定集群
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 用于通过集群id过滤被绑定集群 
     * @return ClusterIds 用于通过集群id过滤被绑定集群
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 用于通过集群id过滤被绑定集群
     * @param ClusterIds 用于通过集群id过滤被绑定集群
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 用于通过集群类型过滤被绑定集群 
     * @return ClusterTypes 用于通过集群类型过滤被绑定集群
     */
    public String [] getClusterTypes() {
        return this.ClusterTypes;
    }

    /**
     * Set 用于通过集群类型过滤被绑定集群
     * @param ClusterTypes 用于通过集群类型过滤被绑定集群
     */
    public void setClusterTypes(String [] ClusterTypes) {
        this.ClusterTypes = ClusterTypes;
    }

    /**
     * Get 用于通过名称搜索被绑定集群 
     * @return ClusterName 用于通过名称搜索被绑定集群
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 用于通过名称搜索被绑定集群
     * @param ClusterName 用于通过名称搜索被绑定集群
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public DescribePrometheusClusterAgentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusClusterAgentsRequest(DescribePrometheusClusterAgentsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.ClusterTypes != null) {
            this.ClusterTypes = new String[source.ClusterTypes.length];
            for (int i = 0; i < source.ClusterTypes.length; i++) {
                this.ClusterTypes[i] = new String(source.ClusterTypes[i]);
            }
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "ClusterTypes.", this.ClusterTypes);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

