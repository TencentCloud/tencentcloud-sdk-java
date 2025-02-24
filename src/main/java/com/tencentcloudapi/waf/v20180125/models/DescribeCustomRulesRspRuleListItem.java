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

public class DescribeCustomRulesRspRuleListItem extends AbstractModel {

    /**
    * 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 跳过的策略
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 重定向地址
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * 策略ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 优先级
    */
    @SerializedName("SortId")
    @Expose
    private String SortId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 策略详情
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * 事件id
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 生效状态
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 定时任务类型
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 定时任务配置信息
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * 周期任务粒度
    */
    @SerializedName("CronType")
    @Expose
    private String CronType;

    /**
    * 自定义标签，风控规则用，用来表示是内置规则还是用户自定义的
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 拦截页面id
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系
    */
    @SerializedName("LogicalOp")
    @Expose
    private String LogicalOp;

    /**
     * Get 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验 
     * @return ActionType 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验
     * @param ActionType 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 跳过的策略 
     * @return Bypass 跳过的策略
     */
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set 跳过的策略
     * @param Bypass 跳过的策略
     */
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 重定向地址 
     * @return Redirect 重定向地址
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set 重定向地址
     * @param Redirect 重定向地址
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * Get 策略ID 
     * @return RuleId 策略ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 策略ID
     * @param RuleId 策略ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 优先级 
     * @return SortId 优先级
     */
    public String getSortId() {
        return this.SortId;
    }

    /**
     * Set 优先级
     * @param SortId 优先级
     */
    public void setSortId(String SortId) {
        this.SortId = SortId;
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
     * Get 策略详情 
     * @return Strategies 策略详情
     */
    public Strategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set 策略详情
     * @param Strategies 策略详情
     */
    public void setStrategies(Strategy [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get 事件id 
     * @return EventId 事件id
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
     * @param EventId 事件id
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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
     * Get 定时任务配置信息 
     * @return JobDateTime 定时任务配置信息
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set 定时任务配置信息
     * @param JobDateTime 定时任务配置信息
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    /**
     * Get 周期任务粒度 
     * @return CronType 周期任务粒度
     */
    public String getCronType() {
        return this.CronType;
    }

    /**
     * Set 周期任务粒度
     * @param CronType 周期任务粒度
     */
    public void setCronType(String CronType) {
        this.CronType = CronType;
    }

    /**
     * Get 自定义标签，风控规则用，用来表示是内置规则还是用户自定义的 
     * @return Label 自定义标签，风控规则用，用来表示是内置规则还是用户自定义的
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 自定义标签，风控规则用，用来表示是内置规则还是用户自定义的
     * @param Label 自定义标签，风控规则用，用来表示是内置规则还是用户自定义的
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 拦截页面id 
     * @return PageId 拦截页面id
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set 拦截页面id
     * @param PageId 拦截页面id
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系 
     * @return LogicalOp 匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系
     */
    public String getLogicalOp() {
        return this.LogicalOp;
    }

    /**
     * Set 匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系
     * @param LogicalOp 匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系
     */
    public void setLogicalOp(String LogicalOp) {
        this.LogicalOp = LogicalOp;
    }

    public DescribeCustomRulesRspRuleListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomRulesRspRuleListItem(DescribeCustomRulesRspRuleListItem source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.SortId != null) {
            this.SortId = new String(source.SortId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.CronType != null) {
            this.CronType = new String(source.CronType);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LogicalOp != null) {
            this.LogicalOp = new String(source.LogicalOp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "CronType", this.CronType);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "LogicalOp", this.LogicalOp);

    }
}

