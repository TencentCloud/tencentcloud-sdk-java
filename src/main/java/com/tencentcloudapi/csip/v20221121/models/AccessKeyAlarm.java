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
    * 告警名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 告警等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 告警记录ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 告警规则ID
    */
    @SerializedName("AlarmRuleID")
    @Expose
    private Long AlarmRuleID;

    /**
    * 告警类型
0 异常调用
1 泄漏监测
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * 访问密钥
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 访问密钥ID
    */
    @SerializedName("AccessKeyID")
    @Expose
    private Long AccessKeyID;

    /**
    * 访问密钥备注
    */
    @SerializedName("AccessKeyRemark")
    @Expose
    private String AccessKeyRemark;

    /**
    * 最后告警时间
    */
    @SerializedName("LastAlarmTime")
    @Expose
    private String LastAlarmTime;

    /**
    * 告警状态
0-未处理 1-已处理 2-已忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 聚合日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 告警标签
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * 所属主账号Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 所属主账号昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 所属子账号Uin
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 所属子账号昵称
    */
    @SerializedName("SubNickname")
    @Expose
    private String SubNickname;

    /**
    * 账号类型
0 主账号AK 1 子账号AK 2 临时密钥
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 所属appid
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 泄漏证据
    */
    @SerializedName("LeakEvidence")
    @Expose
    private String [] LeakEvidence;

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
     * Get 告警等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重 
     * @return Level 告警等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 告警等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重
     * @param Level 告警等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 告警记录ID 
     * @return ID 告警记录ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 告警记录ID
     * @param ID 告警记录ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 告警规则ID 
     * @return AlarmRuleID 告警规则ID
     */
    public Long getAlarmRuleID() {
        return this.AlarmRuleID;
    }

    /**
     * Set 告警规则ID
     * @param AlarmRuleID 告警规则ID
     */
    public void setAlarmRuleID(Long AlarmRuleID) {
        this.AlarmRuleID = AlarmRuleID;
    }

    /**
     * Get 告警类型
0 异常调用
1 泄漏监测 
     * @return AlarmType 告警类型
0 异常调用
1 泄漏监测
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 告警类型
0 异常调用
1 泄漏监测
     * @param AlarmType 告警类型
0 异常调用
1 泄漏监测
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 访问密钥 
     * @return AccessKey 访问密钥
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 访问密钥
     * @param AccessKey 访问密钥
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 访问密钥ID 
     * @return AccessKeyID 访问密钥ID
     */
    public Long getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set 访问密钥ID
     * @param AccessKeyID 访问密钥ID
     */
    public void setAccessKeyID(Long AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

    /**
     * Get 访问密钥备注 
     * @return AccessKeyRemark 访问密钥备注
     */
    public String getAccessKeyRemark() {
        return this.AccessKeyRemark;
    }

    /**
     * Set 访问密钥备注
     * @param AccessKeyRemark 访问密钥备注
     */
    public void setAccessKeyRemark(String AccessKeyRemark) {
        this.AccessKeyRemark = AccessKeyRemark;
    }

    /**
     * Get 最后告警时间 
     * @return LastAlarmTime 最后告警时间
     */
    public String getLastAlarmTime() {
        return this.LastAlarmTime;
    }

    /**
     * Set 最后告警时间
     * @param LastAlarmTime 最后告警时间
     */
    public void setLastAlarmTime(String LastAlarmTime) {
        this.LastAlarmTime = LastAlarmTime;
    }

    /**
     * Get 告警状态
0-未处理 1-已处理 2-已忽略 
     * @return Status 告警状态
0-未处理 1-已处理 2-已忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 告警状态
0-未处理 1-已处理 2-已忽略
     * @param Status 告警状态
0-未处理 1-已处理 2-已忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 聚合日期 
     * @return Date 聚合日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 聚合日期
     * @param Date 聚合日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 告警标签 
     * @return Tag 告警标签
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set 告警标签
     * @param Tag 告警标签
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 所属主账号Uin 
     * @return Uin 所属主账号Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 所属主账号Uin
     * @param Uin 所属主账号Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 所属主账号昵称 
     * @return Nickname 所属主账号昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 所属主账号昵称
     * @param Nickname 所属主账号昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 所属子账号Uin 
     * @return SubUin 所属子账号Uin
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 所属子账号Uin
     * @param SubUin 所属子账号Uin
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 所属子账号昵称 
     * @return SubNickname 所属子账号昵称
     */
    public String getSubNickname() {
        return this.SubNickname;
    }

    /**
     * Set 所属子账号昵称
     * @param SubNickname 所属子账号昵称
     */
    public void setSubNickname(String SubNickname) {
        this.SubNickname = SubNickname;
    }

    /**
     * Get 账号类型
0 主账号AK 1 子账号AK 2 临时密钥 
     * @return Type 账号类型
0 主账号AK 1 子账号AK 2 临时密钥
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 账号类型
0 主账号AK 1 子账号AK 2 临时密钥
     * @param Type 账号类型
0 主账号AK 1 子账号AK 2 临时密钥
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 所属appid 
     * @return AppID 所属appid
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 所属appid
     * @param AppID 所属appid
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 泄漏证据 
     * @return LeakEvidence 泄漏证据
     */
    public String [] getLeakEvidence() {
        return this.LeakEvidence;
    }

    /**
     * Set 泄漏证据
     * @param LeakEvidence 泄漏证据
     */
    public void setLeakEvidence(String [] LeakEvidence) {
        this.LeakEvidence = LeakEvidence;
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

    }
}

