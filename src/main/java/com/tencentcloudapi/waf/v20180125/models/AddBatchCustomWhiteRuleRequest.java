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

public class AddBatchCustomWhiteRuleRequest extends AbstractModel {

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
    * 域名列表，如果绑定的是批量域名，和GroupIds参数二选一
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一
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
     * Get 域名列表，如果绑定的是批量域名，和GroupIds参数二选一 
     * @return Domains 域名列表，如果绑定的是批量域名，和GroupIds参数二选一
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名列表，如果绑定的是批量域名，和GroupIds参数二选一
     * @param Domains 域名列表，如果绑定的是批量域名，和GroupIds参数二选一
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一 
     * @return GroupIds 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一
     * @param GroupIds 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一
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

    public AddBatchCustomWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddBatchCustomWhiteRuleRequest(AddBatchCustomWhiteRuleRequest source) {
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
        if (source.LogicalOp != null) {
            this.LogicalOp = new String(source.LogicalOp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamArraySimple(map, prefix + "Bypass.", this.Bypass);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "LogicalOp", this.LogicalOp);

    }
}

