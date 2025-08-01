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

public class OwaspWhiteRule extends AbstractModel {

    /**
    * 白名单的规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 加白的规则ID列表
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 白名单规则的状态，0：关闭、1：开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 加白的类型，0:按照特定规则ID加白、1:按照规则类型加白
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 规则匹配策略列表
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 定时任务类型
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
    * 周期任务粒度
    */
    @SerializedName("CronType")
    @Expose
    private String CronType;

    /**
    * 当前是否有效
    */
    @SerializedName("ValidStatus")
    @Expose
    private Boolean ValidStatus;

    /**
     * Get 白名单的规则ID 
     * @return RuleId 白名单的规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 白名单的规则ID
     * @param RuleId 白名单的规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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
     * Get 白名单规则的状态，0：关闭、1：开启 
     * @return Status 白名单规则的状态，0：关闭、1：开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 白名单规则的状态，0：关闭、1：开启
     * @param Status 白名单规则的状态，0：关闭、1：开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 加白的类型，0:按照特定规则ID加白、1:按照规则类型加白 
     * @return Type 加白的类型，0:按照特定规则ID加白、1:按照规则类型加白
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 加白的类型，0:按照特定规则ID加白、1:按照规则类型加白
     * @param Type 加白的类型，0:按照特定规则ID加白、1:按照规则类型加白
     */
    public void setType(Long Type) {
        this.Type = Type;
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
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get 当前是否有效 
     * @return ValidStatus 当前是否有效
     */
    public Boolean getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set 当前是否有效
     * @param ValidStatus 当前是否有效
     */
    public void setValidStatus(Boolean ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    public OwaspWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwaspWhiteRule(OwaspWhiteRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
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
        if (source.ValidStatus != null) {
            this.ValidStatus = new Boolean(source.ValidStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "CronType", this.CronType);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);

    }
}

