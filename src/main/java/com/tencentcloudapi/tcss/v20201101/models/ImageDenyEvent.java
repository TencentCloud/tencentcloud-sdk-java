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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageDenyEvent extends AbstractModel {

    /**
    * 事件类型 EVENT_RISK:风险事件类型，EVENT_PRIVILEGE:特权
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则RuleID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * 规则类型
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 规则启用状态 0:开启，1:关闭
    */
    @SerializedName("RuleStatus")
    @Expose
    private Long RuleStatus;

    /**
    * 规则策略状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
    */
    @SerializedName("RuleEffectStatus")
    @Expose
    private String RuleEffectStatus;

    /**
    * 规则内容
    */
    @SerializedName("RuleInfo")
    @Expose
    private String [] RuleInfo;

    /**
    * 规则描述
    */
    @SerializedName("RuleDescription")
    @Expose
    private String RuleDescription;

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 内网IP
    */
    @SerializedName("NodeIP")
    @Expose
    private String NodeIP;

    /**
    * 主机Quuid
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * 首次生成时间
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * 最近生成时间
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * 事件数量
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 执行动作:
BEHAVIOR_ALERT:告警，
BEHAVIOR_HOLDUP_SUCCESSED:拦截
    */
    @SerializedName("DealBehavior")
    @Expose
    private String DealBehavior;

    /**
    * 事件ID
    */
    @SerializedName("EventID")
    @Expose
    private Long EventID;

    /**
    * 外网IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 节点ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 超级节点唯一id
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * pod ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 镜像仓库信息
    */
    @SerializedName("ImageRegistryInfo")
    @Expose
    private ImageRegistryInfo ImageRegistryInfo;

    /**
     * Get 事件类型 EVENT_RISK:风险事件类型，EVENT_PRIVILEGE:特权 
     * @return EventType 事件类型 EVENT_RISK:风险事件类型，EVENT_PRIVILEGE:特权
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型 EVENT_RISK:风险事件类型，EVENT_PRIVILEGE:特权
     * @param EventType 事件类型 EVENT_RISK:风险事件类型，EVENT_PRIVILEGE:特权
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则RuleID 
     * @return RuleID 规则RuleID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则RuleID
     * @param RuleID 规则RuleID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 规则类型 
     * @return RuleType 规则类型
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型
     * @param RuleType 规则类型
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则启用状态 0:开启，1:关闭 
     * @return RuleStatus 规则启用状态 0:开启，1:关闭
     */
    public Long getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 规则启用状态 0:开启，1:关闭
     * @param RuleStatus 规则启用状态 0:开启，1:关闭
     */
    public void setRuleStatus(Long RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 规则策略状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中 
     * @return RuleEffectStatus 规则策略状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
     */
    public String getRuleEffectStatus() {
        return this.RuleEffectStatus;
    }

    /**
     * Set 规则策略状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
     * @param RuleEffectStatus 规则策略状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
     */
    public void setRuleEffectStatus(String RuleEffectStatus) {
        this.RuleEffectStatus = RuleEffectStatus;
    }

    /**
     * Get 规则内容 
     * @return RuleInfo 规则内容
     */
    public String [] getRuleInfo() {
        return this.RuleInfo;
    }

    /**
     * Set 规则内容
     * @param RuleInfo 规则内容
     */
    public void setRuleInfo(String [] RuleInfo) {
        this.RuleInfo = RuleInfo;
    }

    /**
     * Get 规则描述 
     * @return RuleDescription 规则描述
     */
    public String getRuleDescription() {
        return this.RuleDescription;
    }

    /**
     * Set 规则描述
     * @param RuleDescription 规则描述
     */
    public void setRuleDescription(String RuleDescription) {
        this.RuleDescription = RuleDescription;
    }

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 内网IP 
     * @return NodeIP 内网IP
     */
    public String getNodeIP() {
        return this.NodeIP;
    }

    /**
     * Set 内网IP
     * @param NodeIP 内网IP
     */
    public void setNodeIP(String NodeIP) {
        this.NodeIP = NodeIP;
    }

    /**
     * Get 主机Quuid 
     * @return QUUID 主机Quuid
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set 主机Quuid
     * @param QUUID 主机Quuid
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get 首次生成时间 
     * @return FoundTime 首次生成时间
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set 首次生成时间
     * @param FoundTime 首次生成时间
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get 最近生成时间 
     * @return LatestFoundTime 最近生成时间
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set 最近生成时间
     * @param LatestFoundTime 最近生成时间
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get 事件数量 
     * @return EventCount 事件数量
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 事件数量
     * @param EventCount 事件数量
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 执行动作:
BEHAVIOR_ALERT:告警，
BEHAVIOR_HOLDUP_SUCCESSED:拦截 
     * @return DealBehavior 执行动作:
BEHAVIOR_ALERT:告警，
BEHAVIOR_HOLDUP_SUCCESSED:拦截
     */
    public String getDealBehavior() {
        return this.DealBehavior;
    }

    /**
     * Set 执行动作:
BEHAVIOR_ALERT:告警，
BEHAVIOR_HOLDUP_SUCCESSED:拦截
     * @param DealBehavior 执行动作:
BEHAVIOR_ALERT:告警，
BEHAVIOR_HOLDUP_SUCCESSED:拦截
     */
    public void setDealBehavior(String DealBehavior) {
        this.DealBehavior = DealBehavior;
    }

    /**
     * Get 事件ID 
     * @return EventID 事件ID
     */
    public Long getEventID() {
        return this.EventID;
    }

    /**
     * Set 事件ID
     * @param EventID 事件ID
     */
    public void setEventID(Long EventID) {
        this.EventID = EventID;
    }

    /**
     * Get 外网IP 
     * @return PublicIP 外网IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 外网IP
     * @param PublicIP 外网IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get 节点ID 
     * @return NodeID 节点ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 节点ID
     * @param NodeID 节点ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 节点类型 
     * @return NodeType 节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
     * @param NodeType 节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 超级节点唯一id 
     * @return NodeUniqueID 超级节点唯一id
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 超级节点唯一id
     * @param NodeUniqueID 超级节点唯一id
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get pod ip 
     * @return PodIP pod ip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set pod ip
     * @param PodIP pod ip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get pod name 
     * @return PodName pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod name
     * @param PodName pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 镜像仓库信息 
     * @return ImageRegistryInfo 镜像仓库信息
     */
    public ImageRegistryInfo getImageRegistryInfo() {
        return this.ImageRegistryInfo;
    }

    /**
     * Set 镜像仓库信息
     * @param ImageRegistryInfo 镜像仓库信息
     */
    public void setImageRegistryInfo(ImageRegistryInfo ImageRegistryInfo) {
        this.ImageRegistryInfo = ImageRegistryInfo;
    }

    public ImageDenyEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageDenyEvent(ImageDenyEvent source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new Long(source.RuleStatus);
        }
        if (source.RuleEffectStatus != null) {
            this.RuleEffectStatus = new String(source.RuleEffectStatus);
        }
        if (source.RuleInfo != null) {
            this.RuleInfo = new String[source.RuleInfo.length];
            for (int i = 0; i < source.RuleInfo.length; i++) {
                this.RuleInfo[i] = new String(source.RuleInfo[i]);
            }
        }
        if (source.RuleDescription != null) {
            this.RuleDescription = new String(source.RuleDescription);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeIP != null) {
            this.NodeIP = new String(source.NodeIP);
        }
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.DealBehavior != null) {
            this.DealBehavior = new String(source.DealBehavior);
        }
        if (source.EventID != null) {
            this.EventID = new Long(source.EventID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ImageRegistryInfo != null) {
            this.ImageRegistryInfo = new ImageRegistryInfo(source.ImageRegistryInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "RuleEffectStatus", this.RuleEffectStatus);
        this.setParamArraySimple(map, prefix + "RuleInfo.", this.RuleInfo);
        this.setParamSimple(map, prefix + "RuleDescription", this.RuleDescription);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeIP", this.NodeIP);
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "DealBehavior", this.DealBehavior);
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamObj(map, prefix + "ImageRegistryInfo.", this.ImageRegistryInfo);

    }
}

