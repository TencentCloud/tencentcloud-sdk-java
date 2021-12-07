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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfoItem extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名字
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 集群操作系统
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * 集群类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群节点数
    */
    @SerializedName("ClusterNodeNum")
    @Expose
    private Long ClusterNodeNum;

    /**
    * 集群区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 监控组件的状态，为Defender_Uninstall、Defender_Normal、Defender_Error、Defender_Installing
    */
    @SerializedName("DefenderStatus")
    @Expose
    private String DefenderStatus;

    /**
    * 集群状态
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 集群的检测模式，为Cluster_Normal或者Cluster_Actived.
    */
    @SerializedName("ClusterCheckMode")
    @Expose
    private String ClusterCheckMode;

    /**
    * 是否自动定期检测
    */
    @SerializedName("ClusterAutoCheck")
    @Expose
    private Boolean ClusterAutoCheck;

    /**
    * 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示
    */
    @SerializedName("DefenderErrorReason")
    @Expose
    private String DefenderErrorReason;

    /**
    * 防御容器没有ready状态的节点数量
    */
    @SerializedName("UnreadyNodeNum")
    @Expose
    private Long UnreadyNodeNum;

    /**
    * 严重风险检查项的数量
    */
    @SerializedName("SeriousRiskCount")
    @Expose
    private Long SeriousRiskCount;

    /**
    * 高风险检查项的数量
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * 中风险检查项的数量
    */
    @SerializedName("MiddleRiskCount")
    @Expose
    private Long MiddleRiskCount;

    /**
    * 提示风险检查项的数量
    */
    @SerializedName("HintRiskCount")
    @Expose
    private Long HintRiskCount;

    /**
    * 检查失败原因
    */
    @SerializedName("CheckFailReason")
    @Expose
    private String CheckFailReason;

    /**
    * 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * 任务创建时间,检查时间
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名字 
     * @return ClusterName 集群名字
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名字
     * @param ClusterName 集群名字
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群版本 
     * @return ClusterVersion 集群版本
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本
     * @param ClusterVersion 集群版本
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 集群操作系统 
     * @return ClusterOs 集群操作系统
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set 集群操作系统
     * @param ClusterOs 集群操作系统
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get 集群类型 
     * @return ClusterType 集群类型
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
     * @param ClusterType 集群类型
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群节点数 
     * @return ClusterNodeNum 集群节点数
     */
    public Long getClusterNodeNum() {
        return this.ClusterNodeNum;
    }

    /**
     * Set 集群节点数
     * @param ClusterNodeNum 集群节点数
     */
    public void setClusterNodeNum(Long ClusterNodeNum) {
        this.ClusterNodeNum = ClusterNodeNum;
    }

    /**
     * Get 集群区域 
     * @return Region 集群区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 集群区域
     * @param Region 集群区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 监控组件的状态，为Defender_Uninstall、Defender_Normal、Defender_Error、Defender_Installing 
     * @return DefenderStatus 监控组件的状态，为Defender_Uninstall、Defender_Normal、Defender_Error、Defender_Installing
     */
    public String getDefenderStatus() {
        return this.DefenderStatus;
    }

    /**
     * Set 监控组件的状态，为Defender_Uninstall、Defender_Normal、Defender_Error、Defender_Installing
     * @param DefenderStatus 监控组件的状态，为Defender_Uninstall、Defender_Normal、Defender_Error、Defender_Installing
     */
    public void setDefenderStatus(String DefenderStatus) {
        this.DefenderStatus = DefenderStatus;
    }

    /**
     * Get 集群状态 
     * @return ClusterStatus 集群状态
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态
     * @param ClusterStatus 集群状态
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 集群的检测模式，为Cluster_Normal或者Cluster_Actived. 
     * @return ClusterCheckMode 集群的检测模式，为Cluster_Normal或者Cluster_Actived.
     */
    public String getClusterCheckMode() {
        return this.ClusterCheckMode;
    }

    /**
     * Set 集群的检测模式，为Cluster_Normal或者Cluster_Actived.
     * @param ClusterCheckMode 集群的检测模式，为Cluster_Normal或者Cluster_Actived.
     */
    public void setClusterCheckMode(String ClusterCheckMode) {
        this.ClusterCheckMode = ClusterCheckMode;
    }

    /**
     * Get 是否自动定期检测 
     * @return ClusterAutoCheck 是否自动定期检测
     */
    public Boolean getClusterAutoCheck() {
        return this.ClusterAutoCheck;
    }

    /**
     * Set 是否自动定期检测
     * @param ClusterAutoCheck 是否自动定期检测
     */
    public void setClusterAutoCheck(Boolean ClusterAutoCheck) {
        this.ClusterAutoCheck = ClusterAutoCheck;
    }

    /**
     * Get 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示 
     * @return DefenderErrorReason 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示
     */
    public String getDefenderErrorReason() {
        return this.DefenderErrorReason;
    }

    /**
     * Set 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示
     * @param DefenderErrorReason 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示
     */
    public void setDefenderErrorReason(String DefenderErrorReason) {
        this.DefenderErrorReason = DefenderErrorReason;
    }

    /**
     * Get 防御容器没有ready状态的节点数量 
     * @return UnreadyNodeNum 防御容器没有ready状态的节点数量
     */
    public Long getUnreadyNodeNum() {
        return this.UnreadyNodeNum;
    }

    /**
     * Set 防御容器没有ready状态的节点数量
     * @param UnreadyNodeNum 防御容器没有ready状态的节点数量
     */
    public void setUnreadyNodeNum(Long UnreadyNodeNum) {
        this.UnreadyNodeNum = UnreadyNodeNum;
    }

    /**
     * Get 严重风险检查项的数量 
     * @return SeriousRiskCount 严重风险检查项的数量
     */
    public Long getSeriousRiskCount() {
        return this.SeriousRiskCount;
    }

    /**
     * Set 严重风险检查项的数量
     * @param SeriousRiskCount 严重风险检查项的数量
     */
    public void setSeriousRiskCount(Long SeriousRiskCount) {
        this.SeriousRiskCount = SeriousRiskCount;
    }

    /**
     * Get 高风险检查项的数量 
     * @return HighRiskCount 高风险检查项的数量
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set 高风险检查项的数量
     * @param HighRiskCount 高风险检查项的数量
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get 中风险检查项的数量 
     * @return MiddleRiskCount 中风险检查项的数量
     */
    public Long getMiddleRiskCount() {
        return this.MiddleRiskCount;
    }

    /**
     * Set 中风险检查项的数量
     * @param MiddleRiskCount 中风险检查项的数量
     */
    public void setMiddleRiskCount(Long MiddleRiskCount) {
        this.MiddleRiskCount = MiddleRiskCount;
    }

    /**
     * Get 提示风险检查项的数量 
     * @return HintRiskCount 提示风险检查项的数量
     */
    public Long getHintRiskCount() {
        return this.HintRiskCount;
    }

    /**
     * Set 提示风险检查项的数量
     * @param HintRiskCount 提示风险检查项的数量
     */
    public void setHintRiskCount(Long HintRiskCount) {
        this.HintRiskCount = HintRiskCount;
    }

    /**
     * Get 检查失败原因 
     * @return CheckFailReason 检查失败原因
     */
    public String getCheckFailReason() {
        return this.CheckFailReason;
    }

    /**
     * Set 检查失败原因
     * @param CheckFailReason 检查失败原因
     */
    public void setCheckFailReason(String CheckFailReason) {
        this.CheckFailReason = CheckFailReason;
    }

    /**
     * Get 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error 
     * @return CheckStatus 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error
     * @param CheckStatus 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 任务创建时间,检查时间 
     * @return TaskCreateTime 任务创建时间,检查时间
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set 任务创建时间,检查时间
     * @param TaskCreateTime 任务创建时间,检查时间
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    public ClusterInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfoItem(ClusterInfoItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterOs != null) {
            this.ClusterOs = new String(source.ClusterOs);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterNodeNum != null) {
            this.ClusterNodeNum = new Long(source.ClusterNodeNum);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DefenderStatus != null) {
            this.DefenderStatus = new String(source.DefenderStatus);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.ClusterCheckMode != null) {
            this.ClusterCheckMode = new String(source.ClusterCheckMode);
        }
        if (source.ClusterAutoCheck != null) {
            this.ClusterAutoCheck = new Boolean(source.ClusterAutoCheck);
        }
        if (source.DefenderErrorReason != null) {
            this.DefenderErrorReason = new String(source.DefenderErrorReason);
        }
        if (source.UnreadyNodeNum != null) {
            this.UnreadyNodeNum = new Long(source.UnreadyNodeNum);
        }
        if (source.SeriousRiskCount != null) {
            this.SeriousRiskCount = new Long(source.SeriousRiskCount);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.MiddleRiskCount != null) {
            this.MiddleRiskCount = new Long(source.MiddleRiskCount);
        }
        if (source.HintRiskCount != null) {
            this.HintRiskCount = new Long(source.HintRiskCount);
        }
        if (source.CheckFailReason != null) {
            this.CheckFailReason = new String(source.CheckFailReason);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterOs", this.ClusterOs);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterNodeNum", this.ClusterNodeNum);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DefenderStatus", this.DefenderStatus);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ClusterCheckMode", this.ClusterCheckMode);
        this.setParamSimple(map, prefix + "ClusterAutoCheck", this.ClusterAutoCheck);
        this.setParamSimple(map, prefix + "DefenderErrorReason", this.DefenderErrorReason);
        this.setParamSimple(map, prefix + "UnreadyNodeNum", this.UnreadyNodeNum);
        this.setParamSimple(map, prefix + "SeriousRiskCount", this.SeriousRiskCount);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "MiddleRiskCount", this.MiddleRiskCount);
        this.setParamSimple(map, prefix + "HintRiskCount", this.HintRiskCount);
        this.setParamSimple(map, prefix + "CheckFailReason", this.CheckFailReason);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);

    }
}

