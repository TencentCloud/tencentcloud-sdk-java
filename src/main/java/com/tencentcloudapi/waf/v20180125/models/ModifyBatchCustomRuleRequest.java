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

public class ModifyBatchCustomRuleRequest extends AbstractModel {

    /**
    * 批量规则Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 如果没有设置JobDateTime字段则用此字段，0表示永久生效，其它表示定时生效的截止时间（单位为秒）
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 优先级
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 重定向地址
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 事件Id
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 策略详情列表
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * 加白模块
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * 域名列表
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 定时任务配置
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * 防护对象组ID列表
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * 匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系
    */
    @SerializedName("LogicalOp")
    @Expose
    private String LogicalOp;

    /**
    * 页面ID
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * 动作灰度的比例，1-100，默认是100
    */
    @SerializedName("ActionRatio")
    @Expose
    private Long ActionRatio;

    /**
     * Get 批量规则Id 
     * @return Id 批量规则Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 批量规则Id
     * @param Id 批量规则Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 如果没有设置JobDateTime字段则用此字段，0表示永久生效，其它表示定时生效的截止时间（单位为秒） 
     * @return ExpireTime 如果没有设置JobDateTime字段则用此字段，0表示永久生效，其它表示定时生效的截止时间（单位为秒）
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 如果没有设置JobDateTime字段则用此字段，0表示永久生效，其它表示定时生效的截止时间（单位为秒）
     * @param ExpireTime 如果没有设置JobDateTime字段则用此字段，0表示永久生效，其它表示定时生效的截止时间（单位为秒）
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 优先级 
     * @return SortId 优先级
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set 优先级
     * @param SortId 优先级
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验 
     * @return ActionType 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验
     * @param ActionType 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
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
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 事件Id 
     * @return EventId 事件Id
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件Id
     * @param EventId 事件Id
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 策略详情列表 
     * @return Strategies 策略详情列表
     */
    public Strategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set 策略详情列表
     * @param Strategies 策略详情列表
     */
    public void setStrategies(Strategy [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get 加白模块 
     * @return Bypass 加白模块
     * @deprecated
     */
    @Deprecated
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set 加白模块
     * @param Bypass 加白模块
     * @deprecated
     */
    @Deprecated
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get 域名列表 
     * @return Domains 域名列表
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名列表
     * @param Domains 域名列表
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 规则执行的方式，TimedJob为定时执行，CronJob为周期执行 
     * @return JobType 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
     * @param JobType 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 定时任务配置 
     * @return JobDateTime 定时任务配置
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set 定时任务配置
     * @param JobDateTime 定时任务配置
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    /**
     * Get 防护对象组ID列表 
     * @return GroupIds 防护对象组ID列表
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 防护对象组ID列表
     * @param GroupIds 防护对象组ID列表
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
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

    /**
     * Get 页面ID 
     * @return PageId 页面ID
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set 页面ID
     * @param PageId 页面ID
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 动作灰度的比例，1-100，默认是100 
     * @return ActionRatio 动作灰度的比例，1-100，默认是100
     */
    public Long getActionRatio() {
        return this.ActionRatio;
    }

    /**
     * Set 动作灰度的比例，1-100，默认是100
     * @param ActionRatio 动作灰度的比例，1-100，默认是100
     */
    public void setActionRatio(Long ActionRatio) {
        this.ActionRatio = ActionRatio;
    }

    public ModifyBatchCustomRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBatchCustomRuleRequest(ModifyBatchCustomRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.SortId != null) {
            this.SortId = new Long(source.SortId);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.LogicalOp != null) {
            this.LogicalOp = new String(source.LogicalOp);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.ActionRatio != null) {
            this.ActionRatio = new Long(source.ActionRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "LogicalOp", this.LogicalOp);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ActionRatio", this.ActionRatio);

    }
}

