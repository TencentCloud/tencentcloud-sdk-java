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

public class AlertInfo extends AbstractModel {

    /**
    * 告警ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 告警名称
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
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 攻击者
    */
    @SerializedName("Attacker")
    @Expose
    private RoleInfo Attacker;

    /**
    * 受害者
    */
    @SerializedName("Victim")
    @Expose
    private RoleInfo Victim;

    /**
    * 证据数据(例如攻击内容等，base64编码)
    */
    @SerializedName("EvidenceData")
    @Expose
    private String EvidenceData;

    /**
    * 证据位置(例如协议端口)
    */
    @SerializedName("EvidenceLocation")
    @Expose
    private String EvidenceLocation;

    /**
    * 证据路径
    */
    @SerializedName("EvidencePath")
    @Expose
    private String EvidencePath;

    /**
    * 首次告警时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近告警时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 告警次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 紧急缓解建议
    */
    @SerializedName("UrgentSuggestion")
    @Expose
    private String UrgentSuggestion;

    /**
    * 根治建议
    */
    @SerializedName("RemediationSuggestion")
    @Expose
    private String RemediationSuggestion;

    /**
    * 处理状态
0：未处置，1：已忽略，2：已处置
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 告警处理类型
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * 告警大类
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 告警小类
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 下拉字段
    */
    @SerializedName("ExtraInfo")
    @Expose
    private AlertExtraInfo ExtraInfo;

    /**
    * 聚合字段
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 告警日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * appid
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * 账户名称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 账户ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 行为
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 风险排查
    */
    @SerializedName("RiskInvestigation")
    @Expose
    private String RiskInvestigation;

    /**
    * 风险处置
    */
    @SerializedName("RiskTreatment")
    @Expose
    private String RiskTreatment;

    /**
    * 日志类型
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 语句检索
    */
    @SerializedName("LogSearch")
    @Expose
    private String LogSearch;

    /**
     * Get 告警ID 
     * @return ID 告警ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 告警ID
     * @param ID 告警ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 告警名称 
     * @return Name 告警名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警名称
     * @param Name 告警名称
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
     * @return Source 告警来源
CFW:云防火墙
WAF:Web应用防火墙
CWP:主机安全
CSIP:云安全中心
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
     * @param Source 告警来源
CFW:云防火墙
WAF:Web应用防火墙
CWP:主机安全
CSIP:云安全中心
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
     * @return Level 告警等级
1:提示
2:低危
3:中危
4:高危
5:严重
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
     * @param Level 告警等级
1:提示
2:低危
3:中危
4:高危
5:严重
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 攻击者 
     * @return Attacker 攻击者
     */
    public RoleInfo getAttacker() {
        return this.Attacker;
    }

    /**
     * Set 攻击者
     * @param Attacker 攻击者
     */
    public void setAttacker(RoleInfo Attacker) {
        this.Attacker = Attacker;
    }

    /**
     * Get 受害者 
     * @return Victim 受害者
     */
    public RoleInfo getVictim() {
        return this.Victim;
    }

    /**
     * Set 受害者
     * @param Victim 受害者
     */
    public void setVictim(RoleInfo Victim) {
        this.Victim = Victim;
    }

    /**
     * Get 证据数据(例如攻击内容等，base64编码) 
     * @return EvidenceData 证据数据(例如攻击内容等，base64编码)
     */
    public String getEvidenceData() {
        return this.EvidenceData;
    }

    /**
     * Set 证据数据(例如攻击内容等，base64编码)
     * @param EvidenceData 证据数据(例如攻击内容等，base64编码)
     */
    public void setEvidenceData(String EvidenceData) {
        this.EvidenceData = EvidenceData;
    }

    /**
     * Get 证据位置(例如协议端口) 
     * @return EvidenceLocation 证据位置(例如协议端口)
     */
    public String getEvidenceLocation() {
        return this.EvidenceLocation;
    }

    /**
     * Set 证据位置(例如协议端口)
     * @param EvidenceLocation 证据位置(例如协议端口)
     */
    public void setEvidenceLocation(String EvidenceLocation) {
        this.EvidenceLocation = EvidenceLocation;
    }

    /**
     * Get 证据路径 
     * @return EvidencePath 证据路径
     */
    public String getEvidencePath() {
        return this.EvidencePath;
    }

    /**
     * Set 证据路径
     * @param EvidencePath 证据路径
     */
    public void setEvidencePath(String EvidencePath) {
        this.EvidencePath = EvidencePath;
    }

    /**
     * Get 首次告警时间 
     * @return CreateTime 首次告警时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次告警时间
     * @param CreateTime 首次告警时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近告警时间 
     * @return UpdateTime 最近告警时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近告警时间
     * @param UpdateTime 最近告警时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 告警次数 
     * @return Count 告警次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 告警次数
     * @param Count 告警次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 紧急缓解建议 
     * @return UrgentSuggestion 紧急缓解建议
     */
    public String getUrgentSuggestion() {
        return this.UrgentSuggestion;
    }

    /**
     * Set 紧急缓解建议
     * @param UrgentSuggestion 紧急缓解建议
     */
    public void setUrgentSuggestion(String UrgentSuggestion) {
        this.UrgentSuggestion = UrgentSuggestion;
    }

    /**
     * Get 根治建议 
     * @return RemediationSuggestion 根治建议
     */
    public String getRemediationSuggestion() {
        return this.RemediationSuggestion;
    }

    /**
     * Set 根治建议
     * @param RemediationSuggestion 根治建议
     */
    public void setRemediationSuggestion(String RemediationSuggestion) {
        this.RemediationSuggestion = RemediationSuggestion;
    }

    /**
     * Get 处理状态
0：未处置，1：已忽略，2：已处置 
     * @return Status 处理状态
0：未处置，1：已忽略，2：已处置
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态
0：未处置，1：已忽略，2：已处置
     * @param Status 处理状态
0：未处置，1：已忽略，2：已处置
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 告警处理类型 
     * @return ProcessType 告警处理类型
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 告警处理类型
     * @param ProcessType 告警处理类型
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get 告警大类 
     * @return Type 告警大类
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 告警大类
     * @param Type 告警大类
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 告警小类 
     * @return SubType 告警小类
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 告警小类
     * @param SubType 告警小类
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 下拉字段 
     * @return ExtraInfo 下拉字段
     */
    public AlertExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 下拉字段
     * @param ExtraInfo 下拉字段
     */
    public void setExtraInfo(AlertExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 聚合字段 
     * @return Key 聚合字段
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 聚合字段
     * @param Key 聚合字段
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 告警日期 
     * @return Date 告警日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 告警日期
     * @param Date 告警日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get appid 
     * @return AppID appid
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set appid
     * @param AppID appid
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 账户名称 
     * @return NickName 账户名称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 账户名称
     * @param NickName 账户名称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 账户ID 
     * @return Uin 账户ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账户ID
     * @param Uin 账户ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 行为 
     * @return Action 行为
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 行为
     * @param Action 行为
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 风险排查 
     * @return RiskInvestigation 风险排查
     */
    public String getRiskInvestigation() {
        return this.RiskInvestigation;
    }

    /**
     * Set 风险排查
     * @param RiskInvestigation 风险排查
     */
    public void setRiskInvestigation(String RiskInvestigation) {
        this.RiskInvestigation = RiskInvestigation;
    }

    /**
     * Get 风险处置 
     * @return RiskTreatment 风险处置
     */
    public String getRiskTreatment() {
        return this.RiskTreatment;
    }

    /**
     * Set 风险处置
     * @param RiskTreatment 风险处置
     */
    public void setRiskTreatment(String RiskTreatment) {
        this.RiskTreatment = RiskTreatment;
    }

    /**
     * Get 日志类型 
     * @return LogType 日志类型
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
     * @param LogType 日志类型
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 语句检索 
     * @return LogSearch 语句检索
     */
    public String getLogSearch() {
        return this.LogSearch;
    }

    /**
     * Set 语句检索
     * @param LogSearch 语句检索
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

