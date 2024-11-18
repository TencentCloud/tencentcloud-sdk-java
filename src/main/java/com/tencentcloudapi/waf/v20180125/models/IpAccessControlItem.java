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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpAccessControlItem extends AbstractModel {

    /**
    * mongo表自增Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 动作
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 更新时间戳
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * 有效截止时间戳
    */
    @SerializedName("ValidTs")
    @Expose
    private Long ValidTs;

    /**
    * 生效状态
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * 55000001
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * IP列表
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 规则创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 定时任务类型
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 周期任务类型
    */
    @SerializedName("CronType")
    @Expose
    private String CronType;

    /**
    * 定时任务配置详情
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
     * Get mongo表自增Id 
     * @return Id mongo表自增Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set mongo表自增Id
     * @param Id mongo表自增Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 动作 
     * @return ActionType 动作
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作
     * @param ActionType 动作
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get ip 
     * @return Ip ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ip
     * @param Ip ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 来源 
     * @return Source 来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 更新时间戳 
     * @return TsVersion 更新时间戳
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set 更新时间戳
     * @param TsVersion 更新时间戳
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get 有效截止时间戳 
     * @return ValidTs 有效截止时间戳
     */
    public Long getValidTs() {
        return this.ValidTs;
    }

    /**
     * Set 有效截止时间戳
     * @param ValidTs 有效截止时间戳
     */
    public void setValidTs(Long ValidTs) {
        this.ValidTs = ValidTs;
    }

    /**
     * Get 生效状态 
     * @return ValidStatus 生效状态
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set 生效状态
     * @param ValidStatus 生效状态
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    /**
     * Get 55000001 
     * @return RuleId 55000001
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 55000001
     * @param RuleId 55000001
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get IP列表 
     * @return IpList IP列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP列表
     * @param IpList IP列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 规则创建时间 
     * @return CreateTime 规则创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 规则创建时间
     * @param CreateTime 规则创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 定时任务类型 
     * @return JobType 定时任务类型
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 定时任务类型
     * @param JobType 定时任务类型
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 周期任务类型 
     * @return CronType 周期任务类型
     */
    public String getCronType() {
        return this.CronType;
    }

    /**
     * Set 周期任务类型
     * @param CronType 周期任务类型
     */
    public void setCronType(String CronType) {
        this.CronType = CronType;
    }

    /**
     * Get 定时任务配置详情 
     * @return JobDateTime 定时任务配置详情
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set 定时任务配置详情
     * @param JobDateTime 定时任务配置详情
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    public IpAccessControlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpAccessControlItem(IpAccessControlItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.ValidTs != null) {
            this.ValidTs = new Long(source.ValidTs);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.CronType != null) {
            this.CronType = new String(source.CronType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "ValidTs", this.ValidTs);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "CronType", this.CronType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);

    }
}

