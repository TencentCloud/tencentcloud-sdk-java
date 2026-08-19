/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterContainerListItem extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>资产id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>容器id</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>容器名称</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>运行状态</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>节点id</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点类型</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>pod唯一id</p>
    */
    @SerializedName("PodUid")
    @Expose
    private String PodUid;

    /**
    * <p>pod名称</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>镜像名称</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>隔离状态</p>
    */
    @SerializedName("IsolateStatus")
    @Expose
    private String IsolateStatus;

    /**
    * <p>严重风险数量</p>
    */
    @SerializedName("RiskEventCriticalCount")
    @Expose
    private Long RiskEventCriticalCount;

    /**
    * <p>高危风险数量</p>
    */
    @SerializedName("RiskEventHighCount")
    @Expose
    private Long RiskEventHighCount;

    /**
    * <p>中危风险数量</p>
    */
    @SerializedName("RiskEventMiddleCount")
    @Expose
    private Long RiskEventMiddleCount;

    /**
    * <p>低危风险数量</p>
    */
    @SerializedName("RiskEventLowCount")
    @Expose
    private Long RiskEventLowCount;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>关联告警数</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
     * Get <p>appid</p> 
     * @return AppID <p>appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>appid</p>
     * @param AppID <p>appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>资产id</p> 
     * @return AssetId <p>资产id</p>
     * @deprecated
     */
    @Deprecated
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产id</p>
     * @param AssetId <p>资产id</p>
     * @deprecated
     */
    @Deprecated
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>容器id</p> 
     * @return ContainerId <p>容器id</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>容器id</p>
     * @param ContainerId <p>容器id</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>容器名称</p> 
     * @return ContainerName <p>容器名称</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>容器名称</p>
     * @param ContainerName <p>容器名称</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>运行状态</p> 
     * @return RunStatus <p>运行状态</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>运行状态</p>
     * @param RunStatus <p>运行状态</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>节点id</p> 
     * @return NodeId <p>节点id</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点id</p>
     * @param NodeId <p>节点id</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点类型</p> 
     * @return NodeType <p>节点类型</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型</p>
     * @param NodeType <p>节点类型</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>pod唯一id</p> 
     * @return PodUid <p>pod唯一id</p>
     */
    public String getPodUid() {
        return this.PodUid;
    }

    /**
     * Set <p>pod唯一id</p>
     * @param PodUid <p>pod唯一id</p>
     */
    public void setPodUid(String PodUid) {
        this.PodUid = PodUid;
    }

    /**
     * Get <p>pod名称</p> 
     * @return PodName <p>pod名称</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>pod名称</p>
     * @param PodName <p>pod名称</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>镜像id</p> 
     * @return ImageId <p>镜像id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageId <p>镜像id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>镜像名称</p> 
     * @return ImageName <p>镜像名称</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像名称</p>
     * @param ImageName <p>镜像名称</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>隔离状态</p> 
     * @return IsolateStatus <p>隔离状态</p>
     */
    public String getIsolateStatus() {
        return this.IsolateStatus;
    }

    /**
     * Set <p>隔离状态</p>
     * @param IsolateStatus <p>隔离状态</p>
     */
    public void setIsolateStatus(String IsolateStatus) {
        this.IsolateStatus = IsolateStatus;
    }

    /**
     * Get <p>严重风险数量</p> 
     * @return RiskEventCriticalCount <p>严重风险数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventCriticalCount() {
        return this.RiskEventCriticalCount;
    }

    /**
     * Set <p>严重风险数量</p>
     * @param RiskEventCriticalCount <p>严重风险数量</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventCriticalCount(Long RiskEventCriticalCount) {
        this.RiskEventCriticalCount = RiskEventCriticalCount;
    }

    /**
     * Get <p>高危风险数量</p> 
     * @return RiskEventHighCount <p>高危风险数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventHighCount() {
        return this.RiskEventHighCount;
    }

    /**
     * Set <p>高危风险数量</p>
     * @param RiskEventHighCount <p>高危风险数量</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventHighCount(Long RiskEventHighCount) {
        this.RiskEventHighCount = RiskEventHighCount;
    }

    /**
     * Get <p>中危风险数量</p> 
     * @return RiskEventMiddleCount <p>中危风险数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventMiddleCount() {
        return this.RiskEventMiddleCount;
    }

    /**
     * Set <p>中危风险数量</p>
     * @param RiskEventMiddleCount <p>中危风险数量</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventMiddleCount(Long RiskEventMiddleCount) {
        this.RiskEventMiddleCount = RiskEventMiddleCount;
    }

    /**
     * Get <p>低危风险数量</p> 
     * @return RiskEventLowCount <p>低危风险数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventLowCount() {
        return this.RiskEventLowCount;
    }

    /**
     * Set <p>低危风险数量</p>
     * @param RiskEventLowCount <p>低危风险数量</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventLowCount(Long RiskEventLowCount) {
        this.RiskEventLowCount = RiskEventLowCount;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>关联告警数</p> 
     * @return AlarmCount <p>关联告警数</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>关联告警数</p>
     * @param AlarmCount <p>关联告警数</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    public ClusterContainerListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterContainerListItem(ClusterContainerListItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.PodUid != null) {
            this.PodUid = new String(source.PodUid);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.IsolateStatus != null) {
            this.IsolateStatus = new String(source.IsolateStatus);
        }
        if (source.RiskEventCriticalCount != null) {
            this.RiskEventCriticalCount = new Long(source.RiskEventCriticalCount);
        }
        if (source.RiskEventHighCount != null) {
            this.RiskEventHighCount = new Long(source.RiskEventHighCount);
        }
        if (source.RiskEventMiddleCount != null) {
            this.RiskEventMiddleCount = new Long(source.RiskEventMiddleCount);
        }
        if (source.RiskEventLowCount != null) {
            this.RiskEventLowCount = new Long(source.RiskEventLowCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "PodUid", this.PodUid);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "IsolateStatus", this.IsolateStatus);
        this.setParamSimple(map, prefix + "RiskEventCriticalCount", this.RiskEventCriticalCount);
        this.setParamSimple(map, prefix + "RiskEventHighCount", this.RiskEventHighCount);
        this.setParamSimple(map, prefix + "RiskEventMiddleCount", this.RiskEventMiddleCount);
        this.setParamSimple(map, prefix + "RiskEventLowCount", this.RiskEventLowCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);

    }
}

