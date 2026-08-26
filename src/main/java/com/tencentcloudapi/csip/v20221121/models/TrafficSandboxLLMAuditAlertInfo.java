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

public class TrafficSandboxLLMAuditAlertInfo extends AbstractModel {

    /**
    * <p>告警记录 ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>命中的用户规则 ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>命中的用户规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>命中的 LLM 审计系统规则名称</p>
    */
    @SerializedName("SystemRuleName")
    @Expose
    private String SystemRuleName;

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>集群 ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>容器 ID</p>
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
    * <p>命中风险描述</p>
    */
    @SerializedName("HitPayload")
    @Expose
    private String HitPayload;

    /**
    * <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>首次告警时间</p>
    */
    @SerializedName("FirstAlertTime")
    @Expose
    private String FirstAlertTime;

    /**
    * <p>最后告警时间</p>
    */
    @SerializedName("LastAlertTime")
    @Expose
    private String LastAlertTime;

    /**
     * Get <p>告警记录 ID</p> 
     * @return ID <p>告警记录 ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>告警记录 ID</p>
     * @param ID <p>告警记录 ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p> 
     * @return BelongAssetType <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     * @param BelongAssetType <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>命中的用户规则 ID</p> 
     * @return RuleID <p>命中的用户规则 ID</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>命中的用户规则 ID</p>
     * @param RuleID <p>命中的用户规则 ID</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>命中的用户规则名称</p> 
     * @return RuleName <p>命中的用户规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>命中的用户规则名称</p>
     * @param RuleName <p>命中的用户规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>命中的 LLM 审计系统规则名称</p> 
     * @return SystemRuleName <p>命中的 LLM 审计系统规则名称</p>
     */
    public String getSystemRuleName() {
        return this.SystemRuleName;
    }

    /**
     * Set <p>命中的 LLM 审计系统规则名称</p>
     * @param SystemRuleName <p>命中的 LLM 审计系统规则名称</p>
     */
    public void setSystemRuleName(String SystemRuleName) {
        this.SystemRuleName = SystemRuleName;
    }

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceId <p>实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceId <p>实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>集群 ID</p> 
     * @return ClusterId <p>集群 ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID</p>
     * @param ClusterId <p>集群 ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>容器 ID</p> 
     * @return ContainerId <p>容器 ID</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>容器 ID</p>
     * @param ContainerId <p>容器 ID</p>
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
     * Get <p>命中风险描述</p> 
     * @return HitPayload <p>命中风险描述</p>
     */
    public String getHitPayload() {
        return this.HitPayload;
    }

    /**
     * Set <p>命中风险描述</p>
     * @param HitPayload <p>命中风险描述</p>
     */
    public void setHitPayload(String HitPayload) {
        this.HitPayload = HitPayload;
    }

    /**
     * Get <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p> 
     * @return RuleAction <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
     * @param RuleAction <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p> 
     * @return Level <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     * @param Level <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p> 
     * @return Status <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p>
     * @param Status <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>首次告警时间</p> 
     * @return FirstAlertTime <p>首次告警时间</p>
     */
    public String getFirstAlertTime() {
        return this.FirstAlertTime;
    }

    /**
     * Set <p>首次告警时间</p>
     * @param FirstAlertTime <p>首次告警时间</p>
     */
    public void setFirstAlertTime(String FirstAlertTime) {
        this.FirstAlertTime = FirstAlertTime;
    }

    /**
     * Get <p>最后告警时间</p> 
     * @return LastAlertTime <p>最后告警时间</p>
     */
    public String getLastAlertTime() {
        return this.LastAlertTime;
    }

    /**
     * Set <p>最后告警时间</p>
     * @param LastAlertTime <p>最后告警时间</p>
     */
    public void setLastAlertTime(String LastAlertTime) {
        this.LastAlertTime = LastAlertTime;
    }

    public TrafficSandboxLLMAuditAlertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxLLMAuditAlertInfo(TrafficSandboxLLMAuditAlertInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.SystemRuleName != null) {
            this.SystemRuleName = new String(source.SystemRuleName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.HitPayload != null) {
            this.HitPayload = new String(source.HitPayload);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FirstAlertTime != null) {
            this.FirstAlertTime = new String(source.FirstAlertTime);
        }
        if (source.LastAlertTime != null) {
            this.LastAlertTime = new String(source.LastAlertTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "SystemRuleName", this.SystemRuleName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "HitPayload", this.HitPayload);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FirstAlertTime", this.FirstAlertTime);
        this.setParamSimple(map, prefix + "LastAlertTime", this.LastAlertTime);

    }
}

