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

public class K8sApiAbnormalEventListItem extends AbstractModel{

    /**
    * 事件ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 命中规则类型
    */
    @SerializedName("MatchRuleType")
    @Expose
    private String MatchRuleType;

    /**
    * 威胁等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群运行状态
    */
    @SerializedName("ClusterRunningStatus")
    @Expose
    private String ClusterRunningStatus;

    /**
    * 初次生成时间
    */
    @SerializedName("FirstCreateTime")
    @Expose
    private String FirstCreateTime;

    /**
    * 最近一次生成时间
    */
    @SerializedName("LastCreateTime")
    @Expose
    private String LastCreateTime;

    /**
    * 告警数量
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则类型
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 描述信息
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 解决方案
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 命中规则
    */
    @SerializedName("MatchRule")
    @Expose
    private K8sApiAbnormalRuleScopeInfo MatchRule;

    /**
     * Get 事件ID 
     * @return ID 事件ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 事件ID
     * @param ID 事件ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 命中规则类型 
     * @return MatchRuleType 命中规则类型
     */
    public String getMatchRuleType() {
        return this.MatchRuleType;
    }

    /**
     * Set 命中规则类型
     * @param MatchRuleType 命中规则类型
     */
    public void setMatchRuleType(String MatchRuleType) {
        this.MatchRuleType = MatchRuleType;
    }

    /**
     * Get 威胁等级 
     * @return RiskLevel 威胁等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 威胁等级
     * @param RiskLevel 威胁等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get 集群运行状态 
     * @return ClusterRunningStatus 集群运行状态
     */
    public String getClusterRunningStatus() {
        return this.ClusterRunningStatus;
    }

    /**
     * Set 集群运行状态
     * @param ClusterRunningStatus 集群运行状态
     */
    public void setClusterRunningStatus(String ClusterRunningStatus) {
        this.ClusterRunningStatus = ClusterRunningStatus;
    }

    /**
     * Get 初次生成时间 
     * @return FirstCreateTime 初次生成时间
     */
    public String getFirstCreateTime() {
        return this.FirstCreateTime;
    }

    /**
     * Set 初次生成时间
     * @param FirstCreateTime 初次生成时间
     */
    public void setFirstCreateTime(String FirstCreateTime) {
        this.FirstCreateTime = FirstCreateTime;
    }

    /**
     * Get 最近一次生成时间 
     * @return LastCreateTime 最近一次生成时间
     */
    public String getLastCreateTime() {
        return this.LastCreateTime;
    }

    /**
     * Set 最近一次生成时间
     * @param LastCreateTime 最近一次生成时间
     */
    public void setLastCreateTime(String LastCreateTime) {
        this.LastCreateTime = LastCreateTime;
    }

    /**
     * Get 告警数量 
     * @return AlarmCount 告警数量
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set 告警数量
     * @param AlarmCount 告警数量
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 描述信息 
     * @return Desc 描述信息
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述信息
     * @param Desc 描述信息
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 解决方案 
     * @return Suggestion 解决方案
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 解决方案
     * @param Suggestion 解决方案
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
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
     * Get 命中规则 
     * @return MatchRule 命中规则
     */
    public K8sApiAbnormalRuleScopeInfo getMatchRule() {
        return this.MatchRule;
    }

    /**
     * Set 命中规则
     * @param MatchRule 命中规则
     */
    public void setMatchRule(K8sApiAbnormalRuleScopeInfo MatchRule) {
        this.MatchRule = MatchRule;
    }

    public K8sApiAbnormalEventListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalEventListItem(K8sApiAbnormalEventListItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.MatchRuleType != null) {
            this.MatchRuleType = new String(source.MatchRuleType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterRunningStatus != null) {
            this.ClusterRunningStatus = new String(source.ClusterRunningStatus);
        }
        if (source.FirstCreateTime != null) {
            this.FirstCreateTime = new String(source.FirstCreateTime);
        }
        if (source.LastCreateTime != null) {
            this.LastCreateTime = new String(source.LastCreateTime);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MatchRule != null) {
            this.MatchRule = new K8sApiAbnormalRuleScopeInfo(source.MatchRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "MatchRuleType", this.MatchRuleType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterRunningStatus", this.ClusterRunningStatus);
        this.setParamSimple(map, prefix + "FirstCreateTime", this.FirstCreateTime);
        this.setParamSimple(map, prefix + "LastCreateTime", this.LastCreateTime);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamObj(map, prefix + "MatchRule.", this.MatchRule);

    }
}

