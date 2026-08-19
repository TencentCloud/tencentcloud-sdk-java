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

public class ClusterPodListItem extends AbstractModel {

    /**
    * <p>资产id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

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
    * <p>podip数组</p>
    */
    @SerializedName("PodIPs")
    @Expose
    private String [] PodIPs;

    /**
    * <p>pod状态</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>防护核数</p>
    */
    @SerializedName("DefendCoresCount")
    @Expose
    private Long DefendCoresCount;

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
    * <p>负载名称</p>
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * <p>负载类型</p>
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Pod唯一标识ID</p>
    */
    @SerializedName("UniqueID")
    @Expose
    private String UniqueID;

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
    * <p>严重告警数量</p>
    */
    @SerializedName("AlarmEventCriticalCount")
    @Expose
    private Long AlarmEventCriticalCount;

    /**
    * <p>高危告警数量</p>
    */
    @SerializedName("AlarmEventHighCount")
    @Expose
    private Long AlarmEventHighCount;

    /**
    * <p>中危告警数量</p>
    */
    @SerializedName("AlarmEventMiddleCount")
    @Expose
    private Long AlarmEventMiddleCount;

    /**
    * <p>低危告警数量</p>
    */
    @SerializedName("AlarmEventLowCount")
    @Expose
    private Long AlarmEventLowCount;

    /**
    * <p>关联容器列表</p>
    */
    @SerializedName("ContainerList")
    @Expose
    private ClusterContainerListItem [] ContainerList;

    /**
    * <p>关联告警数</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>核数</p><p>单位：毫核</p>
    */
    @SerializedName("CoresCount")
    @Expose
    private Long CoresCount;

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
     * Get <p>podip数组</p> 
     * @return PodIPs <p>podip数组</p>
     */
    public String [] getPodIPs() {
        return this.PodIPs;
    }

    /**
     * Set <p>podip数组</p>
     * @param PodIPs <p>podip数组</p>
     */
    public void setPodIPs(String [] PodIPs) {
        this.PodIPs = PodIPs;
    }

    /**
     * Get <p>pod状态</p> 
     * @return RunStatus <p>pod状态</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>pod状态</p>
     * @param RunStatus <p>pod状态</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>防护核数</p> 
     * @return DefendCoresCount <p>防护核数</p>
     * @deprecated
     */
    @Deprecated
    public Long getDefendCoresCount() {
        return this.DefendCoresCount;
    }

    /**
     * Set <p>防护核数</p>
     * @param DefendCoresCount <p>防护核数</p>
     * @deprecated
     */
    @Deprecated
    public void setDefendCoresCount(Long DefendCoresCount) {
        this.DefendCoresCount = DefendCoresCount;
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
     * Get <p>负载名称</p> 
     * @return WorkloadName <p>负载名称</p>
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set <p>负载名称</p>
     * @param WorkloadName <p>负载名称</p>
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get <p>负载类型</p> 
     * @return WorkloadType <p>负载类型</p>
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set <p>负载类型</p>
     * @param WorkloadType <p>负载类型</p>
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    /**
     * Get <p>命名空间</p> 
     * @return Namespace <p>命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
     * @param Namespace <p>命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
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
     * Get <p>Pod唯一标识ID</p> 
     * @return UniqueID <p>Pod唯一标识ID</p>
     */
    public String getUniqueID() {
        return this.UniqueID;
    }

    /**
     * Set <p>Pod唯一标识ID</p>
     * @param UniqueID <p>Pod唯一标识ID</p>
     */
    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
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
     * Get <p>严重告警数量</p> 
     * @return AlarmEventCriticalCount <p>严重告警数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventCriticalCount() {
        return this.AlarmEventCriticalCount;
    }

    /**
     * Set <p>严重告警数量</p>
     * @param AlarmEventCriticalCount <p>严重告警数量</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventCriticalCount(Long AlarmEventCriticalCount) {
        this.AlarmEventCriticalCount = AlarmEventCriticalCount;
    }

    /**
     * Get <p>高危告警数量</p> 
     * @return AlarmEventHighCount <p>高危告警数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventHighCount() {
        return this.AlarmEventHighCount;
    }

    /**
     * Set <p>高危告警数量</p>
     * @param AlarmEventHighCount <p>高危告警数量</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventHighCount(Long AlarmEventHighCount) {
        this.AlarmEventHighCount = AlarmEventHighCount;
    }

    /**
     * Get <p>中危告警数量</p> 
     * @return AlarmEventMiddleCount <p>中危告警数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventMiddleCount() {
        return this.AlarmEventMiddleCount;
    }

    /**
     * Set <p>中危告警数量</p>
     * @param AlarmEventMiddleCount <p>中危告警数量</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventMiddleCount(Long AlarmEventMiddleCount) {
        this.AlarmEventMiddleCount = AlarmEventMiddleCount;
    }

    /**
     * Get <p>低危告警数量</p> 
     * @return AlarmEventLowCount <p>低危告警数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventLowCount() {
        return this.AlarmEventLowCount;
    }

    /**
     * Set <p>低危告警数量</p>
     * @param AlarmEventLowCount <p>低危告警数量</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventLowCount(Long AlarmEventLowCount) {
        this.AlarmEventLowCount = AlarmEventLowCount;
    }

    /**
     * Get <p>关联容器列表</p> 
     * @return ContainerList <p>关联容器列表</p>
     */
    public ClusterContainerListItem [] getContainerList() {
        return this.ContainerList;
    }

    /**
     * Set <p>关联容器列表</p>
     * @param ContainerList <p>关联容器列表</p>
     */
    public void setContainerList(ClusterContainerListItem [] ContainerList) {
        this.ContainerList = ContainerList;
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

    /**
     * Get <p>核数</p><p>单位：毫核</p> 
     * @return CoresCount <p>核数</p><p>单位：毫核</p>
     */
    public Long getCoresCount() {
        return this.CoresCount;
    }

    /**
     * Set <p>核数</p><p>单位：毫核</p>
     * @param CoresCount <p>核数</p><p>单位：毫核</p>
     */
    public void setCoresCount(Long CoresCount) {
        this.CoresCount = CoresCount;
    }

    public ClusterPodListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterPodListItem(ClusterPodListItem source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.PodUid != null) {
            this.PodUid = new String(source.PodUid);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIPs != null) {
            this.PodIPs = new String[source.PodIPs.length];
            for (int i = 0; i < source.PodIPs.length; i++) {
                this.PodIPs[i] = new String(source.PodIPs[i]);
            }
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.DefendCoresCount != null) {
            this.DefendCoresCount = new Long(source.DefendCoresCount);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UniqueID != null) {
            this.UniqueID = new String(source.UniqueID);
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
        if (source.AlarmEventCriticalCount != null) {
            this.AlarmEventCriticalCount = new Long(source.AlarmEventCriticalCount);
        }
        if (source.AlarmEventHighCount != null) {
            this.AlarmEventHighCount = new Long(source.AlarmEventHighCount);
        }
        if (source.AlarmEventMiddleCount != null) {
            this.AlarmEventMiddleCount = new Long(source.AlarmEventMiddleCount);
        }
        if (source.AlarmEventLowCount != null) {
            this.AlarmEventLowCount = new Long(source.AlarmEventLowCount);
        }
        if (source.ContainerList != null) {
            this.ContainerList = new ClusterContainerListItem[source.ContainerList.length];
            for (int i = 0; i < source.ContainerList.length; i++) {
                this.ContainerList[i] = new ClusterContainerListItem(source.ContainerList[i]);
            }
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.CoresCount != null) {
            this.CoresCount = new Long(source.CoresCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "PodUid", this.PodUid);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamArraySimple(map, prefix + "PodIPs.", this.PodIPs);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "DefendCoresCount", this.DefendCoresCount);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UniqueID", this.UniqueID);
        this.setParamSimple(map, prefix + "RiskEventCriticalCount", this.RiskEventCriticalCount);
        this.setParamSimple(map, prefix + "RiskEventHighCount", this.RiskEventHighCount);
        this.setParamSimple(map, prefix + "RiskEventMiddleCount", this.RiskEventMiddleCount);
        this.setParamSimple(map, prefix + "RiskEventLowCount", this.RiskEventLowCount);
        this.setParamSimple(map, prefix + "AlarmEventCriticalCount", this.AlarmEventCriticalCount);
        this.setParamSimple(map, prefix + "AlarmEventHighCount", this.AlarmEventHighCount);
        this.setParamSimple(map, prefix + "AlarmEventMiddleCount", this.AlarmEventMiddleCount);
        this.setParamSimple(map, prefix + "AlarmEventLowCount", this.AlarmEventLowCount);
        this.setParamArrayObj(map, prefix + "ContainerList.", this.ContainerList);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "CoresCount", this.CoresCount);

    }
}

