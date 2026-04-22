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

public class BatchCustomWhiteRule extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 规则名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 优先级
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * 策略详情
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * 加白的模块，owasp：Web防护-规则引擎、ai：Web防护-AI引擎、ip_auto_deny：IP封禁、geoip：访问控制-地域封禁、acl：访问控制-自定义规则、cc：CC防护、antileakage：信息防泄漏防护、bwip：IP黑白名单、botrpc：BOT防护、api：API安全、applet：小程序防护
    */
    @SerializedName("Bypass")
    @Expose
    private String [] Bypass;

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
    * 周期任务的类型
    */
    @SerializedName("CronType")
    @Expose
    private String CronType;

    /**
    * 域名列表，如果绑定的是批量域名
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 防护对象组ID列表，如果绑定的是防护对象组
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * 生效状态，1：生效中、0：未生效
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * 规则创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 规则开关状态，1：开启、0：关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 匹配条件的逻辑关系，支持and、or，分别表示多个逻辑匹配条件是与、或的关系
    */
    @SerializedName("LogicalOp")
    @Expose
    private String LogicalOp;

    /**
     * Get 规则ID 
     * @return ID 规则ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 规则ID
     * @param ID 规则ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 规则名 
     * @return Name 规则名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名
     * @param Name 规则名
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 加白的模块，owasp：Web防护-规则引擎、ai：Web防护-AI引擎、ip_auto_deny：IP封禁、geoip：访问控制-地域封禁、acl：访问控制-自定义规则、cc：CC防护、antileakage：信息防泄漏防护、bwip：IP黑白名单、botrpc：BOT防护、api：API安全、applet：小程序防护 
     * @return Bypass 加白的模块，owasp：Web防护-规则引擎、ai：Web防护-AI引擎、ip_auto_deny：IP封禁、geoip：访问控制-地域封禁、acl：访问控制-自定义规则、cc：CC防护、antileakage：信息防泄漏防护、bwip：IP黑白名单、botrpc：BOT防护、api：API安全、applet：小程序防护
     */
    public String [] getBypass() {
        return this.Bypass;
    }

    /**
     * Set 加白的模块，owasp：Web防护-规则引擎、ai：Web防护-AI引擎、ip_auto_deny：IP封禁、geoip：访问控制-地域封禁、acl：访问控制-自定义规则、cc：CC防护、antileakage：信息防泄漏防护、bwip：IP黑白名单、botrpc：BOT防护、api：API安全、applet：小程序防护
     * @param Bypass 加白的模块，owasp：Web防护-规则引擎、ai：Web防护-AI引擎、ip_auto_deny：IP封禁、geoip：访问控制-地域封禁、acl：访问控制-自定义规则、cc：CC防护、antileakage：信息防泄漏防护、bwip：IP黑白名单、botrpc：BOT防护、api：API安全、applet：小程序防护
     */
    public void setBypass(String [] Bypass) {
        this.Bypass = Bypass;
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
     * Get 周期任务的类型 
     * @return CronType 周期任务的类型
     */
    public String getCronType() {
        return this.CronType;
    }

    /**
     * Set 周期任务的类型
     * @param CronType 周期任务的类型
     */
    public void setCronType(String CronType) {
        this.CronType = CronType;
    }

    /**
     * Get 域名列表，如果绑定的是批量域名 
     * @return Domains 域名列表，如果绑定的是批量域名
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名列表，如果绑定的是批量域名
     * @param Domains 域名列表，如果绑定的是批量域名
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 防护对象组ID列表，如果绑定的是防护对象组 
     * @return GroupIds 防护对象组ID列表，如果绑定的是防护对象组
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 防护对象组ID列表，如果绑定的是防护对象组
     * @param GroupIds 防护对象组ID列表，如果绑定的是防护对象组
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 生效状态，1：生效中、0：未生效 
     * @return ValidStatus 生效状态，1：生效中、0：未生效
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set 生效状态，1：生效中、0：未生效
     * @param ValidStatus 生效状态，1：生效中、0：未生效
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    /**
     * Get 规则创建时间 
     * @return CreateTime 规则创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 规则创建时间
     * @param CreateTime 规则创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 规则更新时间 
     * @return UpdateTime 规则更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 规则更新时间
     * @param UpdateTime 规则更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 规则开关状态，1：开启、0：关闭 
     * @return Status 规则开关状态，1：开启、0：关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关状态，1：开启、0：关闭
     * @param Status 规则开关状态，1：开启、0：关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public BatchCustomWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCustomWhiteRule(BatchCustomWhiteRule source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SortId != null) {
            this.SortId = new Long(source.SortId);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.Bypass != null) {
            this.Bypass = new String[source.Bypass.length];
            for (int i = 0; i < source.Bypass.length; i++) {
                this.Bypass[i] = new String(source.Bypass[i]);
            }
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
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LogicalOp != null) {
            this.LogicalOp = new String(source.LogicalOp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamArraySimple(map, prefix + "Bypass.", this.Bypass);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "CronType", this.CronType);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LogicalOp", this.LogicalOp);

    }
}

