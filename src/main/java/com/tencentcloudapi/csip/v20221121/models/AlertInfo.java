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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertInfo extends AbstractModel {

    /**
    * 告警ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 告警名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 告警来源
CFW:云防火墙
WAF:Web应用防火墙
CWP:主机安全
CSIP:云安全中心
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 告警等级
1:提示
2:低危
3:中危
4:高危
5:严重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 攻击者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attacker")
    @Expose
    private RoleInfo Attacker;

    /**
    * 受害者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Victim")
    @Expose
    private RoleInfo Victim;

    /**
    * 证据数据(例如攻击内容等)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvidenceData")
    @Expose
    private String EvidenceData;

    /**
    * 证据位置(例如协议端口)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvidenceLocation")
    @Expose
    private String EvidenceLocation;

    /**
    * 证据路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvidencePath")
    @Expose
    private String EvidencePath;

    /**
    * 首次告警时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近告警时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 告警次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 紧急缓解建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrgentSuggestion")
    @Expose
    private String UrgentSuggestion;

    /**
    * 根治建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemediationSuggestion")
    @Expose
    private String RemediationSuggestion;

    /**
    * 处理状态
0：未处置，1：已忽略，2：已处置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 告警处理类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * 告警大类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 告警小类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 下拉字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private AlertExtraInfo ExtraInfo;

    /**
    * 聚合字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 告警日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * 账户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 账户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 行为
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 风险排查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskInvestigation")
    @Expose
    private String RiskInvestigation;

    /**
    * 风险处置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskTreatment")
    @Expose
    private String RiskTreatment;

    /**
    * 日志类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 语句检索
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogSearch")
    @Expose
    private String LogSearch;

    /**
     * Get 告警ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 告警ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 告警ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 告警ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 告警名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 告警名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 告警名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 告警来源
CFW:云防火墙
WAF:Web应用防火墙
CWP:主机安全
CSIP:云安全中心
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 告警来源
CFW:云防火墙
WAF:Web应用防火墙
CWP:主机安全
CSIP:云安全中心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 告警来源
CFW:云防火墙
WAF:Web应用防火墙
CWP:主机安全
CSIP:云安全中心
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 告警来源
CFW:云防火墙
WAF:Web应用防火墙
CWP:主机安全
CSIP:云安全中心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 告警等级
1:提示
2:低危
3:中危
4:高危
5:严重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 告警等级
1:提示
2:低危
3:中危
4:高危
5:严重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 告警等级
1:提示
2:低危
3:中危
4:高危
5:严重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 告警等级
1:提示
2:低危
3:中危
4:高危
5:严重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 攻击者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attacker 攻击者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoleInfo getAttacker() {
        return this.Attacker;
    }

    /**
     * Set 攻击者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attacker 攻击者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttacker(RoleInfo Attacker) {
        this.Attacker = Attacker;
    }

    /**
     * Get 受害者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Victim 受害者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoleInfo getVictim() {
        return this.Victim;
    }

    /**
     * Set 受害者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Victim 受害者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVictim(RoleInfo Victim) {
        this.Victim = Victim;
    }

    /**
     * Get 证据数据(例如攻击内容等)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvidenceData 证据数据(例如攻击内容等)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvidenceData() {
        return this.EvidenceData;
    }

    /**
     * Set 证据数据(例如攻击内容等)
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvidenceData 证据数据(例如攻击内容等)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvidenceData(String EvidenceData) {
        this.EvidenceData = EvidenceData;
    }

    /**
     * Get 证据位置(例如协议端口)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvidenceLocation 证据位置(例如协议端口)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvidenceLocation() {
        return this.EvidenceLocation;
    }

    /**
     * Set 证据位置(例如协议端口)
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvidenceLocation 证据位置(例如协议端口)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvidenceLocation(String EvidenceLocation) {
        this.EvidenceLocation = EvidenceLocation;
    }

    /**
     * Get 证据路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvidencePath 证据路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvidencePath() {
        return this.EvidencePath;
    }

    /**
     * Set 证据路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvidencePath 证据路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvidencePath(String EvidencePath) {
        this.EvidencePath = EvidencePath;
    }

    /**
     * Get 首次告警时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 首次告警时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次告警时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 首次告警时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近告警时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最近告警时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近告警时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最近告警时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 告警次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 告警次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 告警次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 告警次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 紧急缓解建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrgentSuggestion 紧急缓解建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrgentSuggestion() {
        return this.UrgentSuggestion;
    }

    /**
     * Set 紧急缓解建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrgentSuggestion 紧急缓解建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrgentSuggestion(String UrgentSuggestion) {
        this.UrgentSuggestion = UrgentSuggestion;
    }

    /**
     * Get 根治建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemediationSuggestion 根治建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemediationSuggestion() {
        return this.RemediationSuggestion;
    }

    /**
     * Set 根治建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemediationSuggestion 根治建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemediationSuggestion(String RemediationSuggestion) {
        this.RemediationSuggestion = RemediationSuggestion;
    }

    /**
     * Get 处理状态
0：未处置，1：已忽略，2：已处置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 处理状态
0：未处置，1：已忽略，2：已处置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态
0：未处置，1：已忽略，2：已处置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 处理状态
0：未处置，1：已忽略，2：已处置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 告警处理类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessType 告警处理类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 告警处理类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessType 告警处理类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get 告警大类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 告警大类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 告警大类
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 告警大类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 告警小类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubType 告警小类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 告警小类
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubType 告警小类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 下拉字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 下拉字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlertExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 下拉字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 下拉字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(AlertExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 聚合字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 聚合字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 聚合字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 聚合字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 告警日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 告警日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 告警日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 告警日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 账户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickName 账户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 账户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickName 账户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 行为
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 行为
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 行为
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 行为
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 风险排查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskInvestigation 风险排查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskInvestigation() {
        return this.RiskInvestigation;
    }

    /**
     * Set 风险排查
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskInvestigation 风险排查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskInvestigation(String RiskInvestigation) {
        this.RiskInvestigation = RiskInvestigation;
    }

    /**
     * Get 风险处置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskTreatment 风险处置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskTreatment() {
        return this.RiskTreatment;
    }

    /**
     * Set 风险处置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskTreatment 风险处置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskTreatment(String RiskTreatment) {
        this.RiskTreatment = RiskTreatment;
    }

    /**
     * Get 日志类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogType 日志类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogType 日志类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 语句检索
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogSearch 语句检索
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogSearch() {
        return this.LogSearch;
    }

    /**
     * Set 语句检索
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogSearch 语句检索
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogSearch(String LogSearch) {
        this.LogSearch = LogSearch;
    }

    public AlertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertInfo(AlertInfo source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Attacker != null) {
            this.Attacker = new RoleInfo(source.Attacker);
        }
        if (source.Victim != null) {
            this.Victim = new RoleInfo(source.Victim);
        }
        if (source.EvidenceData != null) {
            this.EvidenceData = new String(source.EvidenceData);
        }
        if (source.EvidenceLocation != null) {
            this.EvidenceLocation = new String(source.EvidenceLocation);
        }
        if (source.EvidencePath != null) {
            this.EvidencePath = new String(source.EvidencePath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.UrgentSuggestion != null) {
            this.UrgentSuggestion = new String(source.UrgentSuggestion);
        }
        if (source.RemediationSuggestion != null) {
            this.RemediationSuggestion = new String(source.RemediationSuggestion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new AlertExtraInfo(source.ExtraInfo);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.RiskInvestigation != null) {
            this.RiskInvestigation = new String(source.RiskInvestigation);
        }
        if (source.RiskTreatment != null) {
            this.RiskTreatment = new String(source.RiskTreatment);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogSearch != null) {
            this.LogSearch = new String(source.LogSearch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamObj(map, prefix + "Attacker.", this.Attacker);
        this.setParamObj(map, prefix + "Victim.", this.Victim);
        this.setParamSimple(map, prefix + "EvidenceData", this.EvidenceData);
        this.setParamSimple(map, prefix + "EvidenceLocation", this.EvidenceLocation);
        this.setParamSimple(map, prefix + "EvidencePath", this.EvidencePath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "UrgentSuggestion", this.UrgentSuggestion);
        this.setParamSimple(map, prefix + "RemediationSuggestion", this.RemediationSuggestion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RiskInvestigation", this.RiskInvestigation);
        this.setParamSimple(map, prefix + "RiskTreatment", this.RiskTreatment);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogSearch", this.LogSearch);

    }
}

