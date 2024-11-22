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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedisClustersRequest extends AbstractModel {

    /**
    * Redis独享集群 ID。请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)切换至**云服务管理**页面，在下拉框选择**云数据库 Redis**，可获取独享集群ID。
    */
    @SerializedName("RedisClusterIds")
    @Expose
    private String [] RedisClusterIds;

    /**
    * 集群状态。
- 1：流程。
- 2：运行中。
- 3：已隔离。
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 项目ID数组。请登录[项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 续费模式。
- 0：默认状态，手动续费。
- 1：自动续费。
- 2：明确不自动续费。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long [] AutoRenewFlag;

    /**
    * Redis 独享集群名称。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 搜索关键词：支持集群 ID、集群名称。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 分页限制返回大小，不传则默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，取Limit整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 本地专用集群 ID，请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)实例列表获取集群 ID。
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get Redis独享集群 ID。请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)切换至**云服务管理**页面，在下拉框选择**云数据库 Redis**，可获取独享集群ID。 
     * @return RedisClusterIds Redis独享集群 ID。请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)切换至**云服务管理**页面，在下拉框选择**云数据库 Redis**，可获取独享集群ID。
     */
    public String [] getRedisClusterIds() {
        return this.RedisClusterIds;
    }

    /**
     * Set Redis独享集群 ID。请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)切换至**云服务管理**页面，在下拉框选择**云数据库 Redis**，可获取独享集群ID。
     * @param RedisClusterIds Redis独享集群 ID。请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)切换至**云服务管理**页面，在下拉框选择**云数据库 Redis**，可获取独享集群ID。
     */
    public void setRedisClusterIds(String [] RedisClusterIds) {
        this.RedisClusterIds = RedisClusterIds;
    }

    /**
     * Get 集群状态。
- 1：流程。
- 2：运行中。
- 3：已隔离。 
     * @return Status 集群状态。
- 1：流程。
- 2：运行中。
- 3：已隔离。
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态。
- 1：流程。
- 2：运行中。
- 3：已隔离。
     * @param Status 集群状态。
- 1：流程。
- 2：运行中。
- 3：已隔离。
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 项目ID数组。请登录[项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。 
     * @return ProjectIds 项目ID数组。请登录[项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID数组。请登录[项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。
     * @param ProjectIds 项目ID数组。请登录[项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 续费模式。
- 0：默认状态，手动续费。
- 1：自动续费。
- 2：明确不自动续费。 
     * @return AutoRenewFlag 续费模式。
- 0：默认状态，手动续费。
- 1：自动续费。
- 2：明确不自动续费。
     */
    public Long [] getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 续费模式。
- 0：默认状态，手动续费。
- 1：自动续费。
- 2：明确不自动续费。
     * @param AutoRenewFlag 续费模式。
- 0：默认状态，手动续费。
- 1：自动续费。
- 2：明确不自动续费。
     */
    public void setAutoRenewFlag(Long [] AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Redis 独享集群名称。 
     * @return ClusterName Redis 独享集群名称。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Redis 独享集群名称。
     * @param ClusterName Redis 独享集群名称。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 搜索关键词：支持集群 ID、集群名称。 
     * @return SearchKey 搜索关键词：支持集群 ID、集群名称。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索关键词：支持集群 ID、集群名称。
     * @param SearchKey 搜索关键词：支持集群 ID、集群名称。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 分页限制返回大小，不传则默认为20。 
     * @return Limit 分页限制返回大小，不传则默认为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页限制返回大小，不传则默认为20。
     * @param Limit 分页限制返回大小，不传则默认为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，取Limit整数倍 
     * @return Offset 偏移量，取Limit整数倍
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取Limit整数倍
     * @param Offset 偏移量，取Limit整数倍
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 本地专用集群 ID，请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)实例列表获取集群 ID。 
     * @return DedicatedClusterId 本地专用集群 ID，请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)实例列表获取集群 ID。
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set 本地专用集群 ID，请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)实例列表获取集群 ID。
     * @param DedicatedClusterId 本地专用集群 ID，请登录[专用集群控制台](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1
)实例列表获取集群 ID。
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public DescribeRedisClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisClustersRequest(DescribeRedisClustersRequest source) {
        if (source.RedisClusterIds != null) {
            this.RedisClusterIds = new String[source.RedisClusterIds.length];
            for (int i = 0; i < source.RedisClusterIds.length; i++) {
                this.RedisClusterIds[i] = new String(source.RedisClusterIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long[source.AutoRenewFlag.length];
            for (int i = 0; i < source.AutoRenewFlag.length; i++) {
                this.AutoRenewFlag[i] = new Long(source.AutoRenewFlag[i]);
            }
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RedisClusterIds.", this.RedisClusterIds);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "AutoRenewFlag.", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

