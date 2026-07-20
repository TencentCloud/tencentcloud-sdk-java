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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCustomRuleListItem extends AbstractModel {

    /**
    * <p>规则Id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验</p>
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * <p>加白模块</p>
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * <p>有效期</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>重定向地址</p>
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * <p>优先级</p>
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * <p>开关状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>域名列表</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>策略列表</p>
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * <p>事件Id</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>生效状态</p>
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>规则执行的方式，TimedJob为定时执行，CronJob为周期执行</p>
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * <p>定时任务配置</p>
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * <p>周期任务粒度</p>
    */
    @SerializedName("CronType")
    @Expose
    private String CronType;

    /**
    * <p>标签</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>页面ID</p>
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * <p>匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系</p>
    */
    @SerializedName("LogicalOp")
    @Expose
    private String LogicalOp;

    /**
    * <p>动作灰度的比例</p>
    */
    @SerializedName("ActionRatio")
    @Expose
    private Long ActionRatio;

    /**
    * <p>防护对象组ID</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
     * Get <p>规则Id</p> 
     * @return Id <p>规则Id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>规则Id</p>
     * @param Id <p>规则Id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验</p> 
     * @return ActionType <p>动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验</p>
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验</p>
     * @param ActionType <p>动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验</p>
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>加白模块</p> 
     * @return Bypass <p>加白模块</p>
     */
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set <p>加白模块</p>
     * @param Bypass <p>加白模块</p>
     */
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get <p>有效期</p> 
     * @return ExpireTime <p>有效期</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>有效期</p>
     * @param ExpireTime <p>有效期</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>规则名称</p> 
     * @return Name <p>规则名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>规则名称</p>
     * @param Name <p>规则名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>重定向地址</p> 
     * @return Redirect <p>重定向地址</p>
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set <p>重定向地址</p>
     * @param Redirect <p>重定向地址</p>
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * Get <p>优先级</p> 
     * @return SortId <p>优先级</p>
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set <p>优先级</p>
     * @param SortId <p>优先级</p>
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get <p>开关状态</p> 
     * @return Status <p>开关状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开关状态</p>
     * @param Status <p>开关状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>域名列表</p> 
     * @return Domains <p>域名列表</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>域名列表</p>
     * @param Domains <p>域名列表</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>策略列表</p> 
     * @return Strategies <p>策略列表</p>
     */
    public Strategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set <p>策略列表</p>
     * @param Strategies <p>策略列表</p>
     */
    public void setStrategies(Strategy [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get <p>事件Id</p> 
     * @return EventId <p>事件Id</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件Id</p>
     * @param EventId <p>事件Id</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>生效状态</p> 
     * @return ValidStatus <p>生效状态</p>
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set <p>生效状态</p>
     * @param ValidStatus <p>生效状态</p>
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>规则执行的方式，TimedJob为定时执行，CronJob为周期执行</p> 
     * @return JobType <p>规则执行的方式，TimedJob为定时执行，CronJob为周期执行</p>
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set <p>规则执行的方式，TimedJob为定时执行，CronJob为周期执行</p>
     * @param JobType <p>规则执行的方式，TimedJob为定时执行，CronJob为周期执行</p>
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get <p>定时任务配置</p> 
     * @return JobDateTime <p>定时任务配置</p>
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set <p>定时任务配置</p>
     * @param JobDateTime <p>定时任务配置</p>
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    /**
     * Get <p>周期任务粒度</p> 
     * @return CronType <p>周期任务粒度</p>
     */
    public String getCronType() {
        return this.CronType;
    }

    /**
     * Set <p>周期任务粒度</p>
     * @param CronType <p>周期任务粒度</p>
     */
    public void setCronType(String CronType) {
        this.CronType = CronType;
    }

    /**
     * Get <p>标签</p> 
     * @return Label <p>标签</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>标签</p>
     * @param Label <p>标签</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>页面ID</p> 
     * @return PageId <p>页面ID</p>
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set <p>页面ID</p>
     * @param PageId <p>页面ID</p>
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get <p>匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系</p> 
     * @return LogicalOp <p>匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系</p>
     */
    public String getLogicalOp() {
        return this.LogicalOp;
    }

    /**
     * Set <p>匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系</p>
     * @param LogicalOp <p>匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系</p>
     */
    public void setLogicalOp(String LogicalOp) {
        this.LogicalOp = LogicalOp;
    }

    /**
     * Get <p>动作灰度的比例</p> 
     * @return ActionRatio <p>动作灰度的比例</p>
     */
    public Long getActionRatio() {
        return this.ActionRatio;
    }

    /**
     * Set <p>动作灰度的比例</p>
     * @param ActionRatio <p>动作灰度的比例</p>
     */
    public void setActionRatio(Long ActionRatio) {
        this.ActionRatio = ActionRatio;
    }

    /**
     * Get <p>防护对象组ID</p> 
     * @return GroupIds <p>防护对象组ID</p>
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>防护对象组ID</p>
     * @param GroupIds <p>防护对象组ID</p>
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public BatchCustomRuleListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCustomRuleListItem(BatchCustomRuleListItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
        if (source.SortId != null) {
            this.SortId = new Long(source.SortId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        if (source.LogicalOp != null) {
            this.LogicalOp = new String(source.LogicalOp);
        }
        if (source.ActionRatio != null) {
            this.ActionRatio = new Long(source.ActionRatio);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "CronType", this.CronType);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "LogicalOp", this.LogicalOp);
        this.setParamSimple(map, prefix + "ActionRatio", this.ActionRatio);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);

    }
}

