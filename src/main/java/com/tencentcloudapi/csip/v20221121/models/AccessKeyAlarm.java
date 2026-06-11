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

public class AccessKeyAlarm extends AbstractModel {

    /**
    * <p>告警名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>告警等级<br>0-无效 1-提示 2-低危 3-中危 4-高危 5-严重</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>告警记录ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>告警规则ID</p>
    */
    @SerializedName("AlarmRuleID")
    @Expose
    private Long AlarmRuleID;

    /**
    * <p>告警类型<br>0 异常调用<br>1 泄漏监测</p>
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * <p>访问密钥</p>
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>访问密钥ID</p>
    */
    @SerializedName("AccessKeyID")
    @Expose
    private Long AccessKeyID;

    /**
    * <p>访问密钥备注</p>
    */
    @SerializedName("AccessKeyRemark")
    @Expose
    private String AccessKeyRemark;

    /**
    * <p>最后告警时间</p>
    */
    @SerializedName("LastAlarmTime")
    @Expose
    private String LastAlarmTime;

    /**
    * <p>告警状态<br>0-未处理 1-已处理 2-已忽略</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>聚合日期</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>告警标签</p>
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * <p>所属主账号Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>所属主账号昵称</p>
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * <p>所属子账号Uin</p>
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>所属子账号昵称</p>
    */
    @SerializedName("SubNickname")
    @Expose
    private String SubNickname;

    /**
    * <p>账号类型<br>0 主账号AK 1 子账号AK 2 临时密钥</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>所属appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>泄漏证据</p>
    */
    @SerializedName("LeakEvidence")
    @Expose
    private String [] LeakEvidence;

    /**
    * <p>是否支持编辑信任账号</p>
    */
    @SerializedName("IsSupportEditWhiteAccount")
    @Expose
    private Boolean IsSupportEditWhiteAccount;

    /**
    * <p>告警证据</p>
    */
    @SerializedName("Evidence")
    @Expose
    private String Evidence;

    /**
    * <p>告警规则标识</p>
    */
    @SerializedName("RuleKey")
    @Expose
    private String RuleKey;

    /**
    * <p>云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云</p>
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>告警AI分析状态<br>-1 分析失败<br>0 未分析<br>1 分析中<br>2 分析成功，真实告警<br>3 分析成功，可疑告警</p>
    */
    @SerializedName("AIStatus")
    @Expose
    private Long AIStatus;

    /**
    * <p>首次告警时间戳（秒级）</p>
    */
    @SerializedName("FirstAlarmTimestamp")
    @Expose
    private Long FirstAlarmTimestamp;

    /**
    * <p>最后告警时间戳（秒级）</p>
    */
    @SerializedName("LastAlarmTimestamp")
    @Expose
    private Long LastAlarmTimestamp;

    /**
    * <p>ai分析失败描述，未失败为空字符串</p>
    */
    @SerializedName("AIFailedReason")
    @Expose
    private String AIFailedReason;

    /**
     * Get <p>告警名称</p> 
     * @return Name <p>告警名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>告警名称</p>
     * @param Name <p>告警名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>告警等级<br>0-无效 1-提示 2-低危 3-中危 4-高危 5-严重</p> 
     * @return Level <p>告警等级<br>0-无效 1-提示 2-低危 3-中危 4-高危 5-严重</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>告警等级<br>0-无效 1-提示 2-低危 3-中危 4-高危 5-严重</p>
     * @param Level <p>告警等级<br>0-无效 1-提示 2-低危 3-中危 4-高危 5-严重</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>告警记录ID</p> 
     * @return ID <p>告警记录ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>告警记录ID</p>
     * @param ID <p>告警记录ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>告警规则ID</p> 
     * @return AlarmRuleID <p>告警规则ID</p>
     */
    public Long getAlarmRuleID() {
        return this.AlarmRuleID;
    }

    /**
     * Set <p>告警规则ID</p>
     * @param AlarmRuleID <p>告警规则ID</p>
     */
    public void setAlarmRuleID(Long AlarmRuleID) {
        this.AlarmRuleID = AlarmRuleID;
    }

    /**
     * Get <p>告警类型<br>0 异常调用<br>1 泄漏监测</p> 
     * @return AlarmType <p>告警类型<br>0 异常调用<br>1 泄漏监测</p>
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set <p>告警类型<br>0 异常调用<br>1 泄漏监测</p>
     * @param AlarmType <p>告警类型<br>0 异常调用<br>1 泄漏监测</p>
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get <p>访问密钥</p> 
     * @return AccessKey <p>访问密钥</p>
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>访问密钥</p>
     * @param AccessKey <p>访问密钥</p>
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>访问密钥ID</p> 
     * @return AccessKeyID <p>访问密钥ID</p>
     */
    public Long getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set <p>访问密钥ID</p>
     * @param AccessKeyID <p>访问密钥ID</p>
     */
    public void setAccessKeyID(Long AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

    /**
     * Get <p>访问密钥备注</p> 
     * @return AccessKeyRemark <p>访问密钥备注</p>
     */
    public String getAccessKeyRemark() {
        return this.AccessKeyRemark;
    }

    /**
     * Set <p>访问密钥备注</p>
     * @param AccessKeyRemark <p>访问密钥备注</p>
     */
    public void setAccessKeyRemark(String AccessKeyRemark) {
        this.AccessKeyRemark = AccessKeyRemark;
    }

    /**
     * Get <p>最后告警时间</p> 
     * @return LastAlarmTime <p>最后告警时间</p>
     */
    public String getLastAlarmTime() {
        return this.LastAlarmTime;
    }

    /**
     * Set <p>最后告警时间</p>
     * @param LastAlarmTime <p>最后告警时间</p>
     */
    public void setLastAlarmTime(String LastAlarmTime) {
        this.LastAlarmTime = LastAlarmTime;
    }

    /**
     * Get <p>告警状态<br>0-未处理 1-已处理 2-已忽略</p> 
     * @return Status <p>告警状态<br>0-未处理 1-已处理 2-已忽略</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>告警状态<br>0-未处理 1-已处理 2-已忽略</p>
     * @param Status <p>告警状态<br>0-未处理 1-已处理 2-已忽略</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>聚合日期</p> 
     * @return Date <p>聚合日期</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>聚合日期</p>
     * @param Date <p>聚合日期</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>告警标签</p> 
     * @return Tag <p>告警标签</p>
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>告警标签</p>
     * @param Tag <p>告警标签</p>
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>所属主账号Uin</p> 
     * @return Uin <p>所属主账号Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>所属主账号Uin</p>
     * @param Uin <p>所属主账号Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>所属主账号昵称</p> 
     * @return Nickname <p>所属主账号昵称</p>
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set <p>所属主账号昵称</p>
     * @param Nickname <p>所属主账号昵称</p>
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get <p>所属子账号Uin</p> 
     * @return SubUin <p>所属子账号Uin</p>
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>所属子账号Uin</p>
     * @param SubUin <p>所属子账号Uin</p>
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>所属子账号昵称</p> 
     * @return SubNickname <p>所属子账号昵称</p>
     */
    public String getSubNickname() {
        return this.SubNickname;
    }

    /**
     * Set <p>所属子账号昵称</p>
     * @param SubNickname <p>所属子账号昵称</p>
     */
    public void setSubNickname(String SubNickname) {
        this.SubNickname = SubNickname;
    }

    /**
     * Get <p>账号类型<br>0 主账号AK 1 子账号AK 2 临时密钥</p> 
     * @return Type <p>账号类型<br>0 主账号AK 1 子账号AK 2 临时密钥</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>账号类型<br>0 主账号AK 1 子账号AK 2 临时密钥</p>
     * @param Type <p>账号类型<br>0 主账号AK 1 子账号AK 2 临时密钥</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>所属appid</p> 
     * @return AppID <p>所属appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>所属appid</p>
     * @param AppID <p>所属appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>泄漏证据</p> 
     * @return LeakEvidence <p>泄漏证据</p>
     */
    public String [] getLeakEvidence() {
        return this.LeakEvidence;
    }

    /**
     * Set <p>泄漏证据</p>
     * @param LeakEvidence <p>泄漏证据</p>
     */
    public void setLeakEvidence(String [] LeakEvidence) {
        this.LeakEvidence = LeakEvidence;
    }

    /**
     * Get <p>是否支持编辑信任账号</p> 
     * @return IsSupportEditWhiteAccount <p>是否支持编辑信任账号</p>
     */
    public Boolean getIsSupportEditWhiteAccount() {
        return this.IsSupportEditWhiteAccount;
    }

    /**
     * Set <p>是否支持编辑信任账号</p>
     * @param IsSupportEditWhiteAccount <p>是否支持编辑信任账号</p>
     */
    public void setIsSupportEditWhiteAccount(Boolean IsSupportEditWhiteAccount) {
        this.IsSupportEditWhiteAccount = IsSupportEditWhiteAccount;
    }

    /**
     * Get <p>告警证据</p> 
     * @return Evidence <p>告警证据</p>
     */
    public String getEvidence() {
        return this.Evidence;
    }

    /**
     * Set <p>告警证据</p>
     * @param Evidence <p>告警证据</p>
     */
    public void setEvidence(String Evidence) {
        this.Evidence = Evidence;
    }

    /**
     * Get <p>告警规则标识</p> 
     * @return RuleKey <p>告警规则标识</p>
     */
    public String getRuleKey() {
        return this.RuleKey;
    }

    /**
     * Set <p>告警规则标识</p>
     * @param RuleKey <p>告警规则标识</p>
     */
    public void setRuleKey(String RuleKey) {
        this.RuleKey = RuleKey;
    }

    /**
     * Get <p>云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云</p> 
     * @return CloudType <p>云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云</p>
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云</p>
     * @param CloudType <p>云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云</p>
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>告警AI分析状态<br>-1 分析失败<br>0 未分析<br>1 分析中<br>2 分析成功，真实告警<br>3 分析成功，可疑告警</p> 
     * @return AIStatus <p>告警AI分析状态<br>-1 分析失败<br>0 未分析<br>1 分析中<br>2 分析成功，真实告警<br>3 分析成功，可疑告警</p>
     */
    public Long getAIStatus() {
        return this.AIStatus;
    }

    /**
     * Set <p>告警AI分析状态<br>-1 分析失败<br>0 未分析<br>1 分析中<br>2 分析成功，真实告警<br>3 分析成功，可疑告警</p>
     * @param AIStatus <p>告警AI分析状态<br>-1 分析失败<br>0 未分析<br>1 分析中<br>2 分析成功，真实告警<br>3 分析成功，可疑告警</p>
     */
    public void setAIStatus(Long AIStatus) {
        this.AIStatus = AIStatus;
    }

    /**
     * Get <p>首次告警时间戳（秒级）</p> 
     * @return FirstAlarmTimestamp <p>首次告警时间戳（秒级）</p>
     */
    public Long getFirstAlarmTimestamp() {
        return this.FirstAlarmTimestamp;
    }

    /**
     * Set <p>首次告警时间戳（秒级）</p>
     * @param FirstAlarmTimestamp <p>首次告警时间戳（秒级）</p>
     */
    public void setFirstAlarmTimestamp(Long FirstAlarmTimestamp) {
        this.FirstAlarmTimestamp = FirstAlarmTimestamp;
    }

    /**
     * Get <p>最后告警时间戳（秒级）</p> 
     * @return LastAlarmTimestamp <p>最后告警时间戳（秒级）</p>
     */
    public Long getLastAlarmTimestamp() {
        return this.LastAlarmTimestamp;
    }

    /**
     * Set <p>最后告警时间戳（秒级）</p>
     * @param LastAlarmTimestamp <p>最后告警时间戳（秒级）</p>
     */
    public void setLastAlarmTimestamp(Long LastAlarmTimestamp) {
        this.LastAlarmTimestamp = LastAlarmTimestamp;
    }

    /**
     * Get <p>ai分析失败描述，未失败为空字符串</p> 
     * @return AIFailedReason <p>ai分析失败描述，未失败为空字符串</p>
     */
    public String getAIFailedReason() {
        return this.AIFailedReason;
    }

    /**
     * Set <p>ai分析失败描述，未失败为空字符串</p>
     * @param AIFailedReason <p>ai分析失败描述，未失败为空字符串</p>
     */
    public void setAIFailedReason(String AIFailedReason) {
        this.AIFailedReason = AIFailedReason;
    }

    public AccessKeyAlarm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyAlarm(AccessKeyAlarm source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AlarmRuleID != null) {
            this.AlarmRuleID = new Long(source.AlarmRuleID);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new Long(source.AlarmType);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.AccessKeyID != null) {
            this.AccessKeyID = new Long(source.AccessKeyID);
        }
        if (source.AccessKeyRemark != null) {
            this.AccessKeyRemark = new String(source.AccessKeyRemark);
        }
        if (source.LastAlarmTime != null) {
            this.LastAlarmTime = new String(source.LastAlarmTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubNickname != null) {
            this.SubNickname = new String(source.SubNickname);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.LeakEvidence != null) {
            this.LeakEvidence = new String[source.LeakEvidence.length];
            for (int i = 0; i < source.LeakEvidence.length; i++) {
                this.LeakEvidence[i] = new String(source.LeakEvidence[i]);
            }
        }
        if (source.IsSupportEditWhiteAccount != null) {
            this.IsSupportEditWhiteAccount = new Boolean(source.IsSupportEditWhiteAccount);
        }
        if (source.Evidence != null) {
            this.Evidence = new String(source.Evidence);
        }
        if (source.RuleKey != null) {
            this.RuleKey = new String(source.RuleKey);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.AIStatus != null) {
            this.AIStatus = new Long(source.AIStatus);
        }
        if (source.FirstAlarmTimestamp != null) {
            this.FirstAlarmTimestamp = new Long(source.FirstAlarmTimestamp);
        }
        if (source.LastAlarmTimestamp != null) {
            this.LastAlarmTimestamp = new Long(source.LastAlarmTimestamp);
        }
        if (source.AIFailedReason != null) {
            this.AIFailedReason = new String(source.AIFailedReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AlarmRuleID", this.AlarmRuleID);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "AccessKeyID", this.AccessKeyID);
        this.setParamSimple(map, prefix + "AccessKeyRemark", this.AccessKeyRemark);
        this.setParamSimple(map, prefix + "LastAlarmTime", this.LastAlarmTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubNickname", this.SubNickname);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamArraySimple(map, prefix + "LeakEvidence.", this.LeakEvidence);
        this.setParamSimple(map, prefix + "IsSupportEditWhiteAccount", this.IsSupportEditWhiteAccount);
        this.setParamSimple(map, prefix + "Evidence", this.Evidence);
        this.setParamSimple(map, prefix + "RuleKey", this.RuleKey);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "AIStatus", this.AIStatus);
        this.setParamSimple(map, prefix + "FirstAlarmTimestamp", this.FirstAlarmTimestamp);
        this.setParamSimple(map, prefix + "LastAlarmTimestamp", this.LastAlarmTimestamp);
        this.setParamSimple(map, prefix + "AIFailedReason", this.AIFailedReason);

    }
}

