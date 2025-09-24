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

public class AddCustomRuleRequest extends AbstractModel {

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 优先级
    */
    @SerializedName("SortId")
    @Expose
    private String SortId;

    /**
    * 策略详情
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * 需要添加策略的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 动作类型，1代表阻断，2代表人机识别，3代表观察，4代表重定向，5代表JS校验
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 如果动作是重定向，则表示重定向的地址；其他情况可以为空
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * 过期时间，单位为秒级时间戳，例如1677254399表示过期时间为2023-02-24 23:59:59. 0表示永不过期
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。默认是"geoip,cc,owasp,ai,antileakage"
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * 添加规则的来源，默认为空
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 规则执行的时间
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * 规则来源，判断是不是小程序的
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 规则标签，小程序规则用，标识是内置规则还是自定义规则
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 开关状态，小程序风控规则的时候传该值
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 拦截页面id
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * 匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系
    */
    @SerializedName("LogicalOp")
    @Expose
    private String LogicalOp;

    /**
    * 按照动作灰度的比例，默认是100
    */
    @SerializedName("ActionRatio")
    @Expose
    private Long ActionRatio;

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
     * Get 需要添加策略的域名 
     * @return Domain 需要添加策略的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要添加策略的域名
     * @param Domain 需要添加策略的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

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
     * Get 如果动作是重定向，则表示重定向的地址；其他情况可以为空 
     * @return Redirect 如果动作是重定向，则表示重定向的地址；其他情况可以为空
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set 如果动作是重定向，则表示重定向的地址；其他情况可以为空
     * @param Redirect 如果动作是重定向，则表示重定向的地址；其他情况可以为空
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * Get 过期时间，单位为秒级时间戳，例如1677254399表示过期时间为2023-02-24 23:59:59. 0表示永不过期 
     * @return ExpireTime 过期时间，单位为秒级时间戳，例如1677254399表示过期时间为2023-02-24 23:59:59. 0表示永不过期
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，单位为秒级时间戳，例如1677254399表示过期时间为2023-02-24 23:59:59. 0表示永不过期
     * @param ExpireTime 过期时间，单位为秒级时间戳，例如1677254399表示过期时间为2023-02-24 23:59:59. 0表示永不过期
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF 
     * @return Edition WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
     * @param Edition WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。默认是"geoip,cc,owasp,ai,antileakage" 
     * @return Bypass 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。默认是"geoip,cc,owasp,ai,antileakage"
     * @deprecated
     */
    @Deprecated
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。默认是"geoip,cc,owasp,ai,antileakage"
     * @param Bypass 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。默认是"geoip,cc,owasp,ai,antileakage"
     * @deprecated
     */
    @Deprecated
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get 添加规则的来源，默认为空 
     * @return EventId 添加规则的来源，默认为空
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 添加规则的来源，默认为空
     * @param EventId 添加规则的来源，默认为空
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
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
     * Get 规则执行的时间 
     * @return JobDateTime 规则执行的时间
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set 规则执行的时间
     * @param JobDateTime 规则执行的时间
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    /**
     * Get 规则来源，判断是不是小程序的 
     * @return Source 规则来源，判断是不是小程序的
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 规则来源，判断是不是小程序的
     * @param Source 规则来源，判断是不是小程序的
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 规则标签，小程序规则用，标识是内置规则还是自定义规则 
     * @return Label 规则标签，小程序规则用，标识是内置规则还是自定义规则
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 规则标签，小程序规则用，标识是内置规则还是自定义规则
     * @param Label 规则标签，小程序规则用，标识是内置规则还是自定义规则
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 开关状态，小程序风控规则的时候传该值 
     * @return Status 开关状态，小程序风控规则的时候传该值
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态，小程序风控规则的时候传该值
     * @param Status 开关状态，小程序风控规则的时候传该值
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 按照动作灰度的比例，默认是100 
     * @return ActionRatio 按照动作灰度的比例，默认是100
     */
    public Long getActionRatio() {
        return this.ActionRatio;
    }

    /**
     * Set 按照动作灰度的比例，默认是100
     * @param ActionRatio 按照动作灰度的比例，默认是100
     */
    public void setActionRatio(Long ActionRatio) {
        this.ActionRatio = ActionRatio;
    }

    public AddCustomRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCustomRuleRequest(AddCustomRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SortId != null) {
            this.SortId = new String(source.SortId);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "LogicalOp", this.LogicalOp);
        this.setParamSimple(map, prefix + "ActionRatio", this.ActionRatio);

    }
}

