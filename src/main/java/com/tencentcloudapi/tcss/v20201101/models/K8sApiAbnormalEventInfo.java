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

public class K8sApiAbnormalEventInfo extends AbstractModel {

    /**
    * <p>命中规则名称</p>
    */
    @SerializedName("MatchRuleName")
    @Expose
    private String MatchRuleName;

    /**
    * <p>命中规则类型</p>
    */
    @SerializedName("MatchRuleType")
    @Expose
    private String MatchRuleType;

    /**
    * <p>告警等级</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群运行状态，CSR_RUNNING-运行中，CSR_EXCEPTION-异常，CSR_CREATING-创建中</p>
    */
    @SerializedName("ClusterRunningStatus")
    @Expose
    private String ClusterRunningStatus;

    /**
    * <p>初次生成时间</p>
    */
    @SerializedName("FirstCreateTime")
    @Expose
    private String FirstCreateTime;

    /**
    * <p>最近一次生成时间</p>
    */
    @SerializedName("LastCreateTime")
    @Expose
    private String LastCreateTime;

    /**
    * <p>告警数量</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>状态<br>&quot;EVENT_UNDEAL&quot;:未处理<br>&quot;EVENT_DEALED&quot;: 已处理<br>&quot;EVENT_IGNORE&quot;: 忽略<br>&quot;EVENT_DEL&quot;: 删除<br>&quot;EVENT_ADD_WHITE&quot;: 加白</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>集群masterIP</p>
    */
    @SerializedName("ClusterMasterIP")
    @Expose
    private String ClusterMasterIP;

    /**
    * <p>k8s版本</p>
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * <p>运行时组件</p>
    */
    @SerializedName("RunningComponent")
    @Expose
    private String [] RunningComponent;

    /**
    * <p>描述</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>建议</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>请求信息</p>
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * <p>规则ID</p>
    */
    @SerializedName("MatchRuleID")
    @Expose
    private String MatchRuleID;

    /**
    * <p>高亮字段数组</p>
    */
    @SerializedName("HighLightFields")
    @Expose
    private String [] HighLightFields;

    /**
    * <p>命中规则</p>
    */
    @SerializedName("MatchRule")
    @Expose
    private K8sApiAbnormalRuleScopeInfo MatchRule;

    /**
    * <p>高亮字段对应的命中规则内容(JSON字符串, 如: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>参数格式：{&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p>
    */
    @SerializedName("HighLightFieldsVal")
    @Expose
    private String HighLightFieldsVal;

    /**
    * <p>规则中文</p>
    */
    @SerializedName("RuleTypeZH")
    @Expose
    private String RuleTypeZH;

    /**
     * Get <p>命中规则名称</p> 
     * @return MatchRuleName <p>命中规则名称</p>
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set <p>命中规则名称</p>
     * @param MatchRuleName <p>命中规则名称</p>
     */
    public void setMatchRuleName(String MatchRuleName) {
        this.MatchRuleName = MatchRuleName;
    }

    /**
     * Get <p>命中规则类型</p> 
     * @return MatchRuleType <p>命中规则类型</p>
     */
    public String getMatchRuleType() {
        return this.MatchRuleType;
    }

    /**
     * Set <p>命中规则类型</p>
     * @param MatchRuleType <p>命中规则类型</p>
     */
    public void setMatchRuleType(String MatchRuleType) {
        this.MatchRuleType = MatchRuleType;
    }

    /**
     * Get <p>告警等级</p> 
     * @return RiskLevel <p>告警等级</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>告警等级</p>
     * @param RiskLevel <p>告警等级</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterID <p>集群ID</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterID <p>集群ID</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群运行状态，CSR_RUNNING-运行中，CSR_EXCEPTION-异常，CSR_CREATING-创建中</p> 
     * @return ClusterRunningStatus <p>集群运行状态，CSR_RUNNING-运行中，CSR_EXCEPTION-异常，CSR_CREATING-创建中</p>
     */
    public String getClusterRunningStatus() {
        return this.ClusterRunningStatus;
    }

    /**
     * Set <p>集群运行状态，CSR_RUNNING-运行中，CSR_EXCEPTION-异常，CSR_CREATING-创建中</p>
     * @param ClusterRunningStatus <p>集群运行状态，CSR_RUNNING-运行中，CSR_EXCEPTION-异常，CSR_CREATING-创建中</p>
     */
    public void setClusterRunningStatus(String ClusterRunningStatus) {
        this.ClusterRunningStatus = ClusterRunningStatus;
    }

    /**
     * Get <p>初次生成时间</p> 
     * @return FirstCreateTime <p>初次生成时间</p>
     */
    public String getFirstCreateTime() {
        return this.FirstCreateTime;
    }

    /**
     * Set <p>初次生成时间</p>
     * @param FirstCreateTime <p>初次生成时间</p>
     */
    public void setFirstCreateTime(String FirstCreateTime) {
        this.FirstCreateTime = FirstCreateTime;
    }

    /**
     * Get <p>最近一次生成时间</p> 
     * @return LastCreateTime <p>最近一次生成时间</p>
     */
    public String getLastCreateTime() {
        return this.LastCreateTime;
    }

    /**
     * Set <p>最近一次生成时间</p>
     * @param LastCreateTime <p>最近一次生成时间</p>
     */
    public void setLastCreateTime(String LastCreateTime) {
        this.LastCreateTime = LastCreateTime;
    }

    /**
     * Get <p>告警数量</p> 
     * @return AlarmCount <p>告警数量</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>告警数量</p>
     * @param AlarmCount <p>告警数量</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get <p>状态<br>&quot;EVENT_UNDEAL&quot;:未处理<br>&quot;EVENT_DEALED&quot;: 已处理<br>&quot;EVENT_IGNORE&quot;: 忽略<br>&quot;EVENT_DEL&quot;: 删除<br>&quot;EVENT_ADD_WHITE&quot;: 加白</p> 
     * @return Status <p>状态<br>&quot;EVENT_UNDEAL&quot;:未处理<br>&quot;EVENT_DEALED&quot;: 已处理<br>&quot;EVENT_IGNORE&quot;: 忽略<br>&quot;EVENT_DEL&quot;: 删除<br>&quot;EVENT_ADD_WHITE&quot;: 加白</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态<br>&quot;EVENT_UNDEAL&quot;:未处理<br>&quot;EVENT_DEALED&quot;: 已处理<br>&quot;EVENT_IGNORE&quot;: 忽略<br>&quot;EVENT_DEL&quot;: 删除<br>&quot;EVENT_ADD_WHITE&quot;: 加白</p>
     * @param Status <p>状态<br>&quot;EVENT_UNDEAL&quot;:未处理<br>&quot;EVENT_DEALED&quot;: 已处理<br>&quot;EVENT_IGNORE&quot;: 忽略<br>&quot;EVENT_DEL&quot;: 删除<br>&quot;EVENT_ADD_WHITE&quot;: 加白</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>集群masterIP</p> 
     * @return ClusterMasterIP <p>集群masterIP</p>
     */
    public String getClusterMasterIP() {
        return this.ClusterMasterIP;
    }

    /**
     * Set <p>集群masterIP</p>
     * @param ClusterMasterIP <p>集群masterIP</p>
     */
    public void setClusterMasterIP(String ClusterMasterIP) {
        this.ClusterMasterIP = ClusterMasterIP;
    }

    /**
     * Get <p>k8s版本</p> 
     * @return K8sVersion <p>k8s版本</p>
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set <p>k8s版本</p>
     * @param K8sVersion <p>k8s版本</p>
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get <p>运行时组件</p> 
     * @return RunningComponent <p>运行时组件</p>
     */
    public String [] getRunningComponent() {
        return this.RunningComponent;
    }

    /**
     * Set <p>运行时组件</p>
     * @param RunningComponent <p>运行时组件</p>
     */
    public void setRunningComponent(String [] RunningComponent) {
        this.RunningComponent = RunningComponent;
    }

    /**
     * Get <p>描述</p> 
     * @return Desc <p>描述</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>描述</p>
     * @param Desc <p>描述</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get <p>建议</p> 
     * @return Suggestion <p>建议</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>建议</p>
     * @param Suggestion <p>建议</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>请求信息</p> 
     * @return Info <p>请求信息</p>
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set <p>请求信息</p>
     * @param Info <p>请求信息</p>
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get <p>规则ID</p> 
     * @return MatchRuleID <p>规则ID</p>
     */
    public String getMatchRuleID() {
        return this.MatchRuleID;
    }

    /**
     * Set <p>规则ID</p>
     * @param MatchRuleID <p>规则ID</p>
     */
    public void setMatchRuleID(String MatchRuleID) {
        this.MatchRuleID = MatchRuleID;
    }

    /**
     * Get <p>高亮字段数组</p> 
     * @return HighLightFields <p>高亮字段数组</p>
     */
    public String [] getHighLightFields() {
        return this.HighLightFields;
    }

    /**
     * Set <p>高亮字段数组</p>
     * @param HighLightFields <p>高亮字段数组</p>
     */
    public void setHighLightFields(String [] HighLightFields) {
        this.HighLightFields = HighLightFields;
    }

    /**
     * Get <p>命中规则</p> 
     * @return MatchRule <p>命中规则</p>
     */
    public K8sApiAbnormalRuleScopeInfo getMatchRule() {
        return this.MatchRule;
    }

    /**
     * Set <p>命中规则</p>
     * @param MatchRule <p>命中规则</p>
     */
    public void setMatchRule(K8sApiAbnormalRuleScopeInfo MatchRule) {
        this.MatchRule = MatchRule;
    }

    /**
     * Get <p>高亮字段对应的命中规则内容(JSON字符串, 如: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>参数格式：{&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p> 
     * @return HighLightFieldsVal <p>高亮字段对应的命中规则内容(JSON字符串, 如: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>参数格式：{&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p>
     */
    public String getHighLightFieldsVal() {
        return this.HighLightFieldsVal;
    }

    /**
     * Set <p>高亮字段对应的命中规则内容(JSON字符串, 如: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>参数格式：{&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p>
     * @param HighLightFieldsVal <p>高亮字段对应的命中规则内容(JSON字符串, 如: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>参数格式：{&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p>
     */
    public void setHighLightFieldsVal(String HighLightFieldsVal) {
        this.HighLightFieldsVal = HighLightFieldsVal;
    }

    /**
     * Get <p>规则中文</p> 
     * @return RuleTypeZH <p>规则中文</p>
     */
    public String getRuleTypeZH() {
        return this.RuleTypeZH;
    }

    /**
     * Set <p>规则中文</p>
     * @param RuleTypeZH <p>规则中文</p>
     */
    public void setRuleTypeZH(String RuleTypeZH) {
        this.RuleTypeZH = RuleTypeZH;
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
        if (source.HighLightFieldsVal != null) {
            this.HighLightFieldsVal = new String(source.HighLightFieldsVal);
        }
        if (source.RuleTypeZH != null) {
            this.RuleTypeZH = new String(source.RuleTypeZH);
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
        this.setParamSimple(map, prefix + "HighLightFieldsVal", this.HighLightFieldsVal);
        this.setParamSimple(map, prefix + "RuleTypeZH", this.RuleTypeZH);

    }
}

