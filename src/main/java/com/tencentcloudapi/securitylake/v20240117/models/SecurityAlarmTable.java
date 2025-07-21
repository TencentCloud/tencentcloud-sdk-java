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
package com.tencentcloudapi.securitylake.v20240117.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityAlarmTable extends AbstractModel {

    /**
    * 时间
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 告警名称
    */
    @SerializedName("AlarmName")
    @Expose
    private String AlarmName;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 告警id
    */
    @SerializedName("AlarmId")
    @Expose
    private Long AlarmId;

    /**
    * 安全性
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * 评分
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 分类
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 子分类
    */
    @SerializedName("SubCategory")
    @Expose
    private String SubCategory;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 有效载荷
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 可信度
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则主题
    */
    @SerializedName("RuleTopic")
    @Expose
    private String RuleTopic;

    /**
    * 处理时间
    */
    @SerializedName("HandleTime")
    @Expose
    private String HandleTime;

    /**
    * 建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 来源名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 事件时间
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * 规则类型
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 攻击次数
    */
    @SerializedName("AttackNum")
    @Expose
    private Long AttackNum;

    /**
    * 告警数量
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * ATT&CK子技术
    */
    @SerializedName("AttackSubTechnique")
    @Expose
    private String AttackSubTechnique;

    /**
    * ATT&CK技术
    */
    @SerializedName("AttackTechnique")
    @Expose
    private String AttackTechnique;

    /**
    * ATT&CK战术
    */
    @SerializedName("AttackTactic")
    @Expose
    private String AttackTactic;

    /**
    * ATT&CK子技术名称
    */
    @SerializedName("AttackSubTechniqueName")
    @Expose
    private String AttackSubTechniqueName;

    /**
    * ATT&CK技术名称
    */
    @SerializedName("AttackTechniqueName")
    @Expose
    private String AttackTechniqueName;

    /**
    * 凭证访问
    */
    @SerializedName("AttackTacticName")
    @Expose
    private String AttackTacticName;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 规则表达式
    */
    @SerializedName("RuleExpression")
    @Expose
    private String RuleExpression;

    /**
    * 表达式类型
    */
    @SerializedName("ExpressionType")
    @Expose
    private String ExpressionType;

    /**
    * 下钻表达式
    */
    @SerializedName("DrillDownExpression")
    @Expose
    private String DrillDownExpression;

    /**
    * 源IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 源端口
    */
    @SerializedName("SrcPort")
    @Expose
    private Long SrcPort;

    /**
    * 目的IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 目的端口
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * 主机IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 主机资产
    */
    @SerializedName("HostAsset")
    @Expose
    private String HostAsset;

    /**
    * 实例id
    */
    @SerializedName("SdlId")
    @Expose
    private String SdlId;

    /**
    * 自定义富化字段信息
    */
    @SerializedName("RichCustomInfos")
    @Expose
    private String [] RichCustomInfos;

    /**
    * 攻击者ip
    */
    @SerializedName("AttackerIp")
    @Expose
    private String AttackerIp;

    /**
    * 攻击者资产ID
    */
    @SerializedName("AttackerAsset")
    @Expose
    private String AttackerAsset;

    /**
    * 受害者ip
    */
    @SerializedName("VictimIp")
    @Expose
    private String VictimIp;

    /**
    * 受害者资产ID
    */
    @SerializedName("VictimAsset")
    @Expose
    private String VictimAsset;

    /**
    * 攻击方向
    */
    @SerializedName("AttackDirection")
    @Expose
    private String AttackDirection;

    /**
    * 流量方向
    */
    @SerializedName("TrafficDirection")
    @Expose
    private String TrafficDirection;

    /**
    * 测试
    */
    @SerializedName("SecurityGroupAlertInfos")
    @Expose
    private SecurityGroupAlertInfo [] SecurityGroupAlertInfos;

    /**
     * Get 时间 
     * @return Timestamp 时间
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间
     * @param Timestamp 时间
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 告警名称 
     * @return AlarmName 告警名称
     */
    public String getAlarmName() {
        return this.AlarmName;
    }

    /**
     * Set 告警名称
     * @param AlarmName 告警名称
     */
    public void setAlarmName(String AlarmName) {
        this.AlarmName = AlarmName;
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
     * Get 告警id 
     * @return AlarmId 告警id
     */
    public Long getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警id
     * @param AlarmId 告警id
     */
    public void setAlarmId(Long AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 安全性 
     * @return Severity 安全性
     */
    public Long getSeverity() {
        return this.Severity;
    }

    /**
     * Set 安全性
     * @param Severity 安全性
     */
    public void setSeverity(Long Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 评分 
     * @return Score 评分
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 评分
     * @param Score 评分
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 分类 
     * @return Category 分类
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 分类
     * @param Category 分类
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 子分类 
     * @return SubCategory 子分类
     */
    public String getSubCategory() {
        return this.SubCategory;
    }

    /**
     * Set 子分类
     * @param SubCategory 子分类
     */
    public void setSubCategory(String SubCategory) {
        this.SubCategory = SubCategory;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 有效载荷 
     * @return Payload 有效载荷
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 有效载荷
     * @param Payload 有效载荷
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 结果 
     * @return Result 结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果
     * @param Result 结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 可信度 
     * @return Confidence 可信度
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 可信度
     * @param Confidence 可信度
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
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
     * Get 规则主题 
     * @return RuleTopic 规则主题
     */
    public String getRuleTopic() {
        return this.RuleTopic;
    }

    /**
     * Set 规则主题
     * @param RuleTopic 规则主题
     */
    public void setRuleTopic(String RuleTopic) {
        this.RuleTopic = RuleTopic;
    }

    /**
     * Get 处理时间 
     * @return HandleTime 处理时间
     */
    public String getHandleTime() {
        return this.HandleTime;
    }

    /**
     * Set 处理时间
     * @param HandleTime 处理时间
     */
    public void setHandleTime(String HandleTime) {
        this.HandleTime = HandleTime;
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
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 来源名称 
     * @return SourceName 来源名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 来源名称
     * @param SourceName 来源名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get APPID 
     * @return AppId APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set APPID
     * @param AppId APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 事件时间 
     * @return EventTime 事件时间
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 事件时间
     * @param EventTime 事件时间
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
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
     * Get 攻击次数 
     * @return AttackNum 攻击次数
     */
    public Long getAttackNum() {
        return this.AttackNum;
    }

    /**
     * Set 攻击次数
     * @param AttackNum 攻击次数
     */
    public void setAttackNum(Long AttackNum) {
        this.AttackNum = AttackNum;
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
     * Get ATT&CK子技术 
     * @return AttackSubTechnique ATT&CK子技术
     */
    public String getAttackSubTechnique() {
        return this.AttackSubTechnique;
    }

    /**
     * Set ATT&CK子技术
     * @param AttackSubTechnique ATT&CK子技术
     */
    public void setAttackSubTechnique(String AttackSubTechnique) {
        this.AttackSubTechnique = AttackSubTechnique;
    }

    /**
     * Get ATT&CK技术 
     * @return AttackTechnique ATT&CK技术
     */
    public String getAttackTechnique() {
        return this.AttackTechnique;
    }

    /**
     * Set ATT&CK技术
     * @param AttackTechnique ATT&CK技术
     */
    public void setAttackTechnique(String AttackTechnique) {
        this.AttackTechnique = AttackTechnique;
    }

    /**
     * Get ATT&CK战术 
     * @return AttackTactic ATT&CK战术
     */
    public String getAttackTactic() {
        return this.AttackTactic;
    }

    /**
     * Set ATT&CK战术
     * @param AttackTactic ATT&CK战术
     */
    public void setAttackTactic(String AttackTactic) {
        this.AttackTactic = AttackTactic;
    }

    /**
     * Get ATT&CK子技术名称 
     * @return AttackSubTechniqueName ATT&CK子技术名称
     */
    public String getAttackSubTechniqueName() {
        return this.AttackSubTechniqueName;
    }

    /**
     * Set ATT&CK子技术名称
     * @param AttackSubTechniqueName ATT&CK子技术名称
     */
    public void setAttackSubTechniqueName(String AttackSubTechniqueName) {
        this.AttackSubTechniqueName = AttackSubTechniqueName;
    }

    /**
     * Get ATT&CK技术名称 
     * @return AttackTechniqueName ATT&CK技术名称
     */
    public String getAttackTechniqueName() {
        return this.AttackTechniqueName;
    }

    /**
     * Set ATT&CK技术名称
     * @param AttackTechniqueName ATT&CK技术名称
     */
    public void setAttackTechniqueName(String AttackTechniqueName) {
        this.AttackTechniqueName = AttackTechniqueName;
    }

    /**
     * Get 凭证访问 
     * @return AttackTacticName 凭证访问
     */
    public String getAttackTacticName() {
        return this.AttackTacticName;
    }

    /**
     * Set 凭证访问
     * @param AttackTacticName 凭证访问
     */
    public void setAttackTacticName(String AttackTacticName) {
        this.AttackTacticName = AttackTacticName;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 规则表达式 
     * @return RuleExpression 规则表达式
     */
    public String getRuleExpression() {
        return this.RuleExpression;
    }

    /**
     * Set 规则表达式
     * @param RuleExpression 规则表达式
     */
    public void setRuleExpression(String RuleExpression) {
        this.RuleExpression = RuleExpression;
    }

    /**
     * Get 表达式类型 
     * @return ExpressionType 表达式类型
     */
    public String getExpressionType() {
        return this.ExpressionType;
    }

    /**
     * Set 表达式类型
     * @param ExpressionType 表达式类型
     */
    public void setExpressionType(String ExpressionType) {
        this.ExpressionType = ExpressionType;
    }

    /**
     * Get 下钻表达式 
     * @return DrillDownExpression 下钻表达式
     */
    public String getDrillDownExpression() {
        return this.DrillDownExpression;
    }

    /**
     * Set 下钻表达式
     * @param DrillDownExpression 下钻表达式
     */
    public void setDrillDownExpression(String DrillDownExpression) {
        this.DrillDownExpression = DrillDownExpression;
    }

    /**
     * Get 源IP 
     * @return SrcIp 源IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 源IP
     * @param SrcIp 源IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 源端口 
     * @return SrcPort 源端口
     */
    public Long getSrcPort() {
        return this.SrcPort;
    }

    /**
     * Set 源端口
     * @param SrcPort 源端口
     */
    public void setSrcPort(Long SrcPort) {
        this.SrcPort = SrcPort;
    }

    /**
     * Get 目的IP 
     * @return DstIp 目的IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目的IP
     * @param DstIp 目的IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 目的端口 
     * @return DstPort 目的端口
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目的端口
     * @param DstPort 目的端口
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 主机IP 
     * @return HostIp 主机IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机IP
     * @param HostIp 主机IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 主机资产 
     * @return HostAsset 主机资产
     */
    public String getHostAsset() {
        return this.HostAsset;
    }

    /**
     * Set 主机资产
     * @param HostAsset 主机资产
     */
    public void setHostAsset(String HostAsset) {
        this.HostAsset = HostAsset;
    }

    /**
     * Get 实例id 
     * @return SdlId 实例id
     */
    public String getSdlId() {
        return this.SdlId;
    }

    /**
     * Set 实例id
     * @param SdlId 实例id
     */
    public void setSdlId(String SdlId) {
        this.SdlId = SdlId;
    }

    /**
     * Get 自定义富化字段信息 
     * @return RichCustomInfos 自定义富化字段信息
     */
    public String [] getRichCustomInfos() {
        return this.RichCustomInfos;
    }

    /**
     * Set 自定义富化字段信息
     * @param RichCustomInfos 自定义富化字段信息
     */
    public void setRichCustomInfos(String [] RichCustomInfos) {
        this.RichCustomInfos = RichCustomInfos;
    }

    /**
     * Get 攻击者ip 
     * @return AttackerIp 攻击者ip
     */
    public String getAttackerIp() {
        return this.AttackerIp;
    }

    /**
     * Set 攻击者ip
     * @param AttackerIp 攻击者ip
     */
    public void setAttackerIp(String AttackerIp) {
        this.AttackerIp = AttackerIp;
    }

    /**
     * Get 攻击者资产ID 
     * @return AttackerAsset 攻击者资产ID
     */
    public String getAttackerAsset() {
        return this.AttackerAsset;
    }

    /**
     * Set 攻击者资产ID
     * @param AttackerAsset 攻击者资产ID
     */
    public void setAttackerAsset(String AttackerAsset) {
        this.AttackerAsset = AttackerAsset;
    }

    /**
     * Get 受害者ip 
     * @return VictimIp 受害者ip
     */
    public String getVictimIp() {
        return this.VictimIp;
    }

    /**
     * Set 受害者ip
     * @param VictimIp 受害者ip
     */
    public void setVictimIp(String VictimIp) {
        this.VictimIp = VictimIp;
    }

    /**
     * Get 受害者资产ID 
     * @return VictimAsset 受害者资产ID
     */
    public String getVictimAsset() {
        return this.VictimAsset;
    }

    /**
     * Set 受害者资产ID
     * @param VictimAsset 受害者资产ID
     */
    public void setVictimAsset(String VictimAsset) {
        this.VictimAsset = VictimAsset;
    }

    /**
     * Get 攻击方向 
     * @return AttackDirection 攻击方向
     */
    public String getAttackDirection() {
        return this.AttackDirection;
    }

    /**
     * Set 攻击方向
     * @param AttackDirection 攻击方向
     */
    public void setAttackDirection(String AttackDirection) {
        this.AttackDirection = AttackDirection;
    }

    /**
     * Get 流量方向 
     * @return TrafficDirection 流量方向
     */
    public String getTrafficDirection() {
        return this.TrafficDirection;
    }

    /**
     * Set 流量方向
     * @param TrafficDirection 流量方向
     */
    public void setTrafficDirection(String TrafficDirection) {
        this.TrafficDirection = TrafficDirection;
    }

    /**
     * Get 测试 
     * @return SecurityGroupAlertInfos 测试
     */
    public SecurityGroupAlertInfo [] getSecurityGroupAlertInfos() {
        return this.SecurityGroupAlertInfos;
    }

    /**
     * Set 测试
     * @param SecurityGroupAlertInfos 测试
     */
    public void setSecurityGroupAlertInfos(SecurityGroupAlertInfo [] SecurityGroupAlertInfos) {
        this.SecurityGroupAlertInfos = SecurityGroupAlertInfos;
    }

    public SecurityAlarmTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityAlarmTable(SecurityAlarmTable source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.AlarmName != null) {
            this.AlarmName = new String(source.AlarmName);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.AlarmId != null) {
            this.AlarmId = new Long(source.AlarmId);
        }
        if (source.Severity != null) {
            this.Severity = new Long(source.Severity);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.SubCategory != null) {
            this.SubCategory = new String(source.SubCategory);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleTopic != null) {
            this.RuleTopic = new String(source.RuleTopic);
        }
        if (source.HandleTime != null) {
            this.HandleTime = new String(source.HandleTime);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.AttackNum != null) {
            this.AttackNum = new Long(source.AttackNum);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.AttackSubTechnique != null) {
            this.AttackSubTechnique = new String(source.AttackSubTechnique);
        }
        if (source.AttackTechnique != null) {
            this.AttackTechnique = new String(source.AttackTechnique);
        }
        if (source.AttackTactic != null) {
            this.AttackTactic = new String(source.AttackTactic);
        }
        if (source.AttackSubTechniqueName != null) {
            this.AttackSubTechniqueName = new String(source.AttackSubTechniqueName);
        }
        if (source.AttackTechniqueName != null) {
            this.AttackTechniqueName = new String(source.AttackTechniqueName);
        }
        if (source.AttackTacticName != null) {
            this.AttackTacticName = new String(source.AttackTacticName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RuleExpression != null) {
            this.RuleExpression = new String(source.RuleExpression);
        }
        if (source.ExpressionType != null) {
            this.ExpressionType = new String(source.ExpressionType);
        }
        if (source.DrillDownExpression != null) {
            this.DrillDownExpression = new String(source.DrillDownExpression);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.SrcPort != null) {
            this.SrcPort = new Long(source.SrcPort);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.HostAsset != null) {
            this.HostAsset = new String(source.HostAsset);
        }
        if (source.SdlId != null) {
            this.SdlId = new String(source.SdlId);
        }
        if (source.RichCustomInfos != null) {
            this.RichCustomInfos = new String[source.RichCustomInfos.length];
            for (int i = 0; i < source.RichCustomInfos.length; i++) {
                this.RichCustomInfos[i] = new String(source.RichCustomInfos[i]);
            }
        }
        if (source.AttackerIp != null) {
            this.AttackerIp = new String(source.AttackerIp);
        }
        if (source.AttackerAsset != null) {
            this.AttackerAsset = new String(source.AttackerAsset);
        }
        if (source.VictimIp != null) {
            this.VictimIp = new String(source.VictimIp);
        }
        if (source.VictimAsset != null) {
            this.VictimAsset = new String(source.VictimAsset);
        }
        if (source.AttackDirection != null) {
            this.AttackDirection = new String(source.AttackDirection);
        }
        if (source.TrafficDirection != null) {
            this.TrafficDirection = new String(source.TrafficDirection);
        }
        if (source.SecurityGroupAlertInfos != null) {
            this.SecurityGroupAlertInfos = new SecurityGroupAlertInfo[source.SecurityGroupAlertInfos.length];
            for (int i = 0; i < source.SecurityGroupAlertInfos.length; i++) {
                this.SecurityGroupAlertInfos[i] = new SecurityGroupAlertInfo(source.SecurityGroupAlertInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "AlarmName", this.AlarmName);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "SubCategory", this.SubCategory);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleTopic", this.RuleTopic);
        this.setParamSimple(map, prefix + "HandleTime", this.HandleTime);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "AttackNum", this.AttackNum);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "AttackSubTechnique", this.AttackSubTechnique);
        this.setParamSimple(map, prefix + "AttackTechnique", this.AttackTechnique);
        this.setParamSimple(map, prefix + "AttackTactic", this.AttackTactic);
        this.setParamSimple(map, prefix + "AttackSubTechniqueName", this.AttackSubTechniqueName);
        this.setParamSimple(map, prefix + "AttackTechniqueName", this.AttackTechniqueName);
        this.setParamSimple(map, prefix + "AttackTacticName", this.AttackTacticName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RuleExpression", this.RuleExpression);
        this.setParamSimple(map, prefix + "ExpressionType", this.ExpressionType);
        this.setParamSimple(map, prefix + "DrillDownExpression", this.DrillDownExpression);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "SrcPort", this.SrcPort);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "HostAsset", this.HostAsset);
        this.setParamSimple(map, prefix + "SdlId", this.SdlId);
        this.setParamArraySimple(map, prefix + "RichCustomInfos.", this.RichCustomInfos);
        this.setParamSimple(map, prefix + "AttackerIp", this.AttackerIp);
        this.setParamSimple(map, prefix + "AttackerAsset", this.AttackerAsset);
        this.setParamSimple(map, prefix + "VictimIp", this.VictimIp);
        this.setParamSimple(map, prefix + "VictimAsset", this.VictimAsset);
        this.setParamSimple(map, prefix + "AttackDirection", this.AttackDirection);
        this.setParamSimple(map, prefix + "TrafficDirection", this.TrafficDirection);
        this.setParamArrayObj(map, prefix + "SecurityGroupAlertInfos.", this.SecurityGroupAlertInfos);

    }
}

