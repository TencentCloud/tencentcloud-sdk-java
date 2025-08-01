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

public class ModifyOwaspWhiteRuleRequest extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则匹配策略列表
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * 加白的规则ID列表
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 加白的类型，0:按照特定规则ID加白, 1:按照规则类型加白
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

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
    * 如果没有设置JobDateTime字段则用此字段，0表示永久生效，其它表示定时生效的截止时间（单位为秒）
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 规则状态，0：关闭、1：开启，默认为开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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
     * Get 规则匹配策略列表 
     * @return Strategies 规则匹配策略列表
     */
    public Strategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set 规则匹配策略列表
     * @param Strategies 规则匹配策略列表
     */
    public void setStrategies(Strategy [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get 加白的规则ID列表 
     * @return Ids 加白的规则ID列表
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 加白的规则ID列表
     * @param Ids 加白的规则ID列表
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 加白的类型，0:按照特定规则ID加白, 1:按照规则类型加白 
     * @return Type 加白的类型，0:按照特定规则ID加白, 1:按照规则类型加白
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 加白的类型，0:按照特定规则ID加白, 1:按照规则类型加白
     * @param Type 加白的类型，0:按照特定规则ID加白, 1:按照规则类型加白
     */
    public void setType(Long Type) {
        this.Type = Type;
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
     * Get 规则状态，0：关闭、1：开启，默认为开启 
     * @return Status 规则状态，0：关闭、1：开启，默认为开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态，0：关闭、1：开启，默认为开启
     * @param Status 规则状态，0：关闭、1：开启，默认为开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyOwaspWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOwaspWhiteRuleRequest(ModifyOwaspWhiteRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

