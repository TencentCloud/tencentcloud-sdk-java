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

public class K8sApiAbnormalEventInfo extends AbstractModel{

    /**
    * 命中规则名称
    */
    @SerializedName("MatchRuleName")
    @Expose
    private String MatchRuleName;

    /**
    * 命中规则类型
    */
    @SerializedName("MatchRuleType")
    @Expose
    private String MatchRuleType;

    /**
    * 告警等级
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
"EVENT_UNDEAL":未处理
"EVENT_DEALED": 已处理
"EVENT_IGNORE": 忽略
"EVENT_DEL": 删除
"EVENT_ADD_WHITE": 加白
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 集群masterIP
    */
    @SerializedName("ClusterMasterIP")
    @Expose
    private String ClusterMasterIP;

    /**
    * k8s版本
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * 运行时组件
    */
    @SerializedName("RunningComponent")
    @Expose
    private String [] RunningComponent;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 请求信息
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 规则ID
    */
    @SerializedName("MatchRuleID")
    @Expose
    private String MatchRuleID;

    /**
    * 高亮字段数组
    */
    @SerializedName("HighLightFields")
    @Expose
    private String [] HighLightFields;

    /**
    * 命中规则
    */
    @SerializedName("MatchRule")
    @Expose
    private K8sApiAbnormalRuleScopeInfo MatchRule;

    /**
     * Get 命中规则名称 
     * @return MatchRuleName 命中规则名称
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set 命中规则名称
     * @param MatchRuleName 命中规则名称
     */
    public void setMatchRuleName(String MatchRuleName) {
        this.MatchRuleName = MatchRuleName;
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
     * Get 告警等级 
     * @return RiskLevel 告警等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 告警等级
     * @param RiskLevel 告警等级
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
"EVENT_UNDEAL":未处理
"EVENT_DEALED": 已处理
"EVENT_IGNORE": 忽略
"EVENT_DEL": 删除
"EVENT_ADD_WHITE": 加白 
     * @return Status 状态
"EVENT_UNDEAL":未处理
"EVENT_DEALED": 已处理
"EVENT_IGNORE": 忽略
"EVENT_DEL": 删除
"EVENT_ADD_WHITE": 加白
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
"EVENT_UNDEAL":未处理
"EVENT_DEALED": 已处理
"EVENT_IGNORE": 忽略
"EVENT_DEL": 删除
"EVENT_ADD_WHITE": 加白
     * @param Status 状态
"EVENT_UNDEAL":未处理
"EVENT_DEALED": 已处理
"EVENT_IGNORE": 忽略
"EVENT_DEL": 删除
"EVENT_ADD_WHITE": 加白
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 集群masterIP 
     * @return ClusterMasterIP 集群masterIP
     */
    public String getClusterMasterIP() {
        return this.ClusterMasterIP;
    }

    /**
     * Set 集群masterIP
     * @param ClusterMasterIP 集群masterIP
     */
    public void setClusterMasterIP(String ClusterMasterIP) {
        this.ClusterMasterIP = ClusterMasterIP;
    }

    /**
     * Get k8s版本 
     * @return K8sVersion k8s版本
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set k8s版本
     * @param K8sVersion k8s版本
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get 运行时组件 
     * @return RunningComponent 运行时组件
     */
    public String [] getRunningComponent() {
        return this.RunningComponent;
    }

    /**
     * Set 运行时组件
     * @param RunningComponent 运行时组件
     */
    public void setRunningComponent(String [] RunningComponent) {
        this.RunningComponent = RunningComponent;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 建议 
     * @return Suggestion 建议
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议
     * @param Suggestion 建议
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 请求信息 
     * @return Info 请求信息
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 请求信息
     * @param Info 请求信息
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 规则ID 
     * @return MatchRuleID 规则ID
     */
    public String getMatchRuleID() {
        return this.MatchRuleID;
    }

    /**
     * Set 规则ID
     * @param MatchRuleID 规则ID
     */
    public void setMatchRuleID(String MatchRuleID) {
        this.MatchRuleID = MatchRuleID;
    }

    /**
     * Get 高亮字段数组 
     * @return HighLightFields 高亮字段数组
     */
    public String [] getHighLightFields() {
        return this.HighLightFields;
    }

    /**
     * Set 高亮字段数组
     * @param HighLightFields 高亮字段数组
     */
    public void setHighLightFields(String [] HighLightFields) {
        this.HighLightFields = HighLightFields;
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

    public K8sApiAbnormalEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalEventInfo(K8sApiAbnormalEventInfo source) {
        if (source.MatchRuleName != null) {
            this.MatchRuleName = new String(source.MatchRuleName);
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
        if (source.ClusterMasterIP != null) {
            this.ClusterMasterIP = new String(source.ClusterMasterIP);
        }
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.RunningComponent != null) {
            this.RunningComponent = new String[source.RunningComponent.length];
            for (int i = 0; i < source.RunningComponent.length; i++) {
                this.RunningComponent[i] = new String(source.RunningComponent[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.MatchRuleID != null) {
            this.MatchRuleID = new String(source.MatchRuleID);
        }
        if (source.HighLightFields != null) {
            this.HighLightFields = new String[source.HighLightFields.length];
            for (int i = 0; i < source.HighLightFields.length; i++) {
                this.HighLightFields[i] = new String(source.HighLightFields[i]);
            }
        }
        if (source.MatchRule != null) {
            this.MatchRule = new K8sApiAbnormalRuleScopeInfo(source.MatchRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchRuleName", this.MatchRuleName);
        this.setParamSimple(map, prefix + "MatchRuleType", this.MatchRuleType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterRunningStatus", this.ClusterRunningStatus);
        this.setParamSimple(map, prefix + "FirstCreateTime", this.FirstCreateTime);
        this.setParamSimple(map, prefix + "LastCreateTime", this.LastCreateTime);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterMasterIP", this.ClusterMasterIP);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamArraySimple(map, prefix + "RunningComponent.", this.RunningComponent);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "MatchRuleID", this.MatchRuleID);
        this.setParamArraySimple(map, prefix + "HighLightFields.", this.HighLightFields);
        this.setParamObj(map, prefix + "MatchRule.", this.MatchRule);

    }
}

