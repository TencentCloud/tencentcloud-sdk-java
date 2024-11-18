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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartNodesRequest extends AbstractModel {

    /**
    * 集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点名称列表
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * 是否强制重启
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * 可选重启模式"in-place","blue-green"，分别表示重启，蓝绿重启；默认值为"in-place"
    */
    @SerializedName("RestartMode")
    @Expose
    private String RestartMode;

    /**
    * 节点状态，在蓝绿模式中使用；离线节点蓝绿有风险
    */
    @SerializedName("IsOffline")
    @Expose
    private Boolean IsOffline;

    /**
    * cvm延迟上架时间
    */
    @SerializedName("CvmDelayOnlineTime")
    @Expose
    private Long CvmDelayOnlineTime;

    /**
    * 分片迁移并发数
    */
    @SerializedName("ShardAllocationConcurrents")
    @Expose
    private Long ShardAllocationConcurrents;

    /**
    * 分片迁移并发速度
    */
    @SerializedName("ShardAllocationBytes")
    @Expose
    private Long ShardAllocationBytes;

    /**
    * 是否开启置放群组异步任务
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * 置放群组异步任务时间段
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
     * Get 集群实例ID 
     * @return InstanceId 集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID
     * @param InstanceId 集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点名称列表 
     * @return NodeNames 节点名称列表
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set 节点名称列表
     * @param NodeNames 节点名称列表
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get 是否强制重启 
     * @return ForceRestart 是否强制重启
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set 是否强制重启
     * @param ForceRestart 是否强制重启
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get 可选重启模式"in-place","blue-green"，分别表示重启，蓝绿重启；默认值为"in-place" 
     * @return RestartMode 可选重启模式"in-place","blue-green"，分别表示重启，蓝绿重启；默认值为"in-place"
     */
    public String getRestartMode() {
        return this.RestartMode;
    }

    /**
     * Set 可选重启模式"in-place","blue-green"，分别表示重启，蓝绿重启；默认值为"in-place"
     * @param RestartMode 可选重启模式"in-place","blue-green"，分别表示重启，蓝绿重启；默认值为"in-place"
     */
    public void setRestartMode(String RestartMode) {
        this.RestartMode = RestartMode;
    }

    /**
     * Get 节点状态，在蓝绿模式中使用；离线节点蓝绿有风险 
     * @return IsOffline 节点状态，在蓝绿模式中使用；离线节点蓝绿有风险
     */
    public Boolean getIsOffline() {
        return this.IsOffline;
    }

    /**
     * Set 节点状态，在蓝绿模式中使用；离线节点蓝绿有风险
     * @param IsOffline 节点状态，在蓝绿模式中使用；离线节点蓝绿有风险
     */
    public void setIsOffline(Boolean IsOffline) {
        this.IsOffline = IsOffline;
    }

    /**
     * Get cvm延迟上架时间 
     * @return CvmDelayOnlineTime cvm延迟上架时间
     */
    public Long getCvmDelayOnlineTime() {
        return this.CvmDelayOnlineTime;
    }

    /**
     * Set cvm延迟上架时间
     * @param CvmDelayOnlineTime cvm延迟上架时间
     */
    public void setCvmDelayOnlineTime(Long CvmDelayOnlineTime) {
        this.CvmDelayOnlineTime = CvmDelayOnlineTime;
    }

    /**
     * Get 分片迁移并发数 
     * @return ShardAllocationConcurrents 分片迁移并发数
     */
    public Long getShardAllocationConcurrents() {
        return this.ShardAllocationConcurrents;
    }

    /**
     * Set 分片迁移并发数
     * @param ShardAllocationConcurrents 分片迁移并发数
     */
    public void setShardAllocationConcurrents(Long ShardAllocationConcurrents) {
        this.ShardAllocationConcurrents = ShardAllocationConcurrents;
    }

    /**
     * Get 分片迁移并发速度 
     * @return ShardAllocationBytes 分片迁移并发速度
     */
    public Long getShardAllocationBytes() {
        return this.ShardAllocationBytes;
    }

    /**
     * Set 分片迁移并发速度
     * @param ShardAllocationBytes 分片迁移并发速度
     */
    public void setShardAllocationBytes(Long ShardAllocationBytes) {
        this.ShardAllocationBytes = ShardAllocationBytes;
    }

    /**
     * Get 是否开启置放群组异步任务 
     * @return EnableScheduleRecoverGroup 是否开启置放群组异步任务
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set 是否开启置放群组异步任务
     * @param EnableScheduleRecoverGroup 是否开启置放群组异步任务
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get 置放群组异步任务时间段 
     * @return EnableScheduleOperationDuration 置放群组异步任务时间段
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set 置放群组异步任务时间段
     * @param EnableScheduleOperationDuration 置放群组异步任务时间段
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
    }

    public RestartNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartNodesRequest(RestartNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
        if (source.RestartMode != null) {
            this.RestartMode = new String(source.RestartMode);
        }
        if (source.IsOffline != null) {
            this.IsOffline = new Boolean(source.IsOffline);
        }
        if (source.CvmDelayOnlineTime != null) {
            this.CvmDelayOnlineTime = new Long(source.CvmDelayOnlineTime);
        }
        if (source.ShardAllocationConcurrents != null) {
            this.ShardAllocationConcurrents = new Long(source.ShardAllocationConcurrents);
        }
        if (source.ShardAllocationBytes != null) {
            this.ShardAllocationBytes = new Long(source.ShardAllocationBytes);
        }
        if (source.EnableScheduleRecoverGroup != null) {
            this.EnableScheduleRecoverGroup = new Boolean(source.EnableScheduleRecoverGroup);
        }
        if (source.EnableScheduleOperationDuration != null) {
            this.EnableScheduleOperationDuration = new EnableScheduleOperationDuration(source.EnableScheduleOperationDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);
        this.setParamSimple(map, prefix + "RestartMode", this.RestartMode);
        this.setParamSimple(map, prefix + "IsOffline", this.IsOffline);
        this.setParamSimple(map, prefix + "CvmDelayOnlineTime", this.CvmDelayOnlineTime);
        this.setParamSimple(map, prefix + "ShardAllocationConcurrents", this.ShardAllocationConcurrents);
        this.setParamSimple(map, prefix + "ShardAllocationBytes", this.ShardAllocationBytes);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroup", this.EnableScheduleRecoverGroup);
        this.setParamObj(map, prefix + "EnableScheduleOperationDuration.", this.EnableScheduleOperationDuration);

    }
}

