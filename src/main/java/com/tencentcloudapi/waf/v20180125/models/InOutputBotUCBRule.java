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

public class InOutputBotUCBRule extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * UCB的具体规则项
    */
    @SerializedName("Rule")
    @Expose
    private InOutputUCBRuleEntry [] Rule;

    /**
    * 处置动作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 规则开关
    */
    @SerializedName("OnOff")
    @Expose
    private String OnOff;

    /**
    * 规则类型
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 规则优先级
    */
    @SerializedName("Prior")
    @Expose
    private Long Prior;

    /**
    * 修改时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 入参ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 生效时间
    */
    @SerializedName("ValidTime")
    @Expose
    private Long ValidTime;

    /**
    * 传入的appid
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 额外参数
    */
    @SerializedName("AdditionArg")
    @Expose
    private String AdditionArg;

    /**
    * 规则描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * true-系统预设规则 false-自定义规则
    */
    @SerializedName("PreDefine")
    @Expose
    private Boolean PreDefine;

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
    * 生效截止时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 生效-1,失效-0
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * 自定义拦截页面ID
    */
    @SerializedName("BlockPageId")
    @Expose
    private Long BlockPageId;

    /**
    * 当Action=intercept时，此字段必填
    */
    @SerializedName("ActionList")
    @Expose
    private UCBActionProportion [] ActionList;

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
     * Get UCB的具体规则项 
     * @return Rule UCB的具体规则项
     */
    public InOutputUCBRuleEntry [] getRule() {
        return this.Rule;
    }

    /**
     * Set UCB的具体规则项
     * @param Rule UCB的具体规则项
     */
    public void setRule(InOutputUCBRuleEntry [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 处置动作 
     * @return Action 处置动作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 处置动作
     * @param Action 处置动作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 规则开关 
     * @return OnOff 规则开关
     */
    public String getOnOff() {
        return this.OnOff;
    }

    /**
     * Set 规则开关
     * @param OnOff 规则开关
     */
    public void setOnOff(String OnOff) {
        this.OnOff = OnOff;
    }

    /**
     * Get 规则类型 
     * @return RuleType 规则类型
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型
     * @param RuleType 规则类型
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则优先级 
     * @return Prior 规则优先级
     */
    public Long getPrior() {
        return this.Prior;
    }

    /**
     * Set 规则优先级
     * @param Prior 规则优先级
     */
    public void setPrior(Long Prior) {
        this.Prior = Prior;
    }

    /**
     * Get 修改时间戳 
     * @return Timestamp 修改时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 修改时间戳
     * @param Timestamp 修改时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 标签 
     * @return Label 标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 标签
     * @param Label 标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 入参ID 
     * @return Id 入参ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 入参ID
     * @param Id 入参ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 场景ID 
     * @return SceneId 场景ID
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景ID
     * @param SceneId 场景ID
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 生效时间 
     * @return ValidTime 生效时间
     */
    public Long getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set 生效时间
     * @param ValidTime 生效时间
     */
    public void setValidTime(Long ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get 传入的appid 
     * @return Appid 传入的appid
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 传入的appid
     * @param Appid 传入的appid
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 额外参数 
     * @return AdditionArg 额外参数
     */
    public String getAdditionArg() {
        return this.AdditionArg;
    }

    /**
     * Set 额外参数
     * @param AdditionArg 额外参数
     */
    public void setAdditionArg(String AdditionArg) {
        this.AdditionArg = AdditionArg;
    }

    /**
     * Get 规则描述 
     * @return Desc 规则描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 规则描述
     * @param Desc 规则描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get true-系统预设规则 false-自定义规则 
     * @return PreDefine true-系统预设规则 false-自定义规则
     */
    public Boolean getPreDefine() {
        return this.PreDefine;
    }

    /**
     * Set true-系统预设规则 false-自定义规则
     * @param PreDefine true-系统预设规则 false-自定义规则
     */
    public void setPreDefine(Boolean PreDefine) {
        this.PreDefine = PreDefine;
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
     * Get 生效截止时间 
     * @return ExpireTime 生效截止时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 生效截止时间
     * @param ExpireTime 生效截止时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 生效-1,失效-0 
     * @return ValidStatus 生效-1,失效-0
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set 生效-1,失效-0
     * @param ValidStatus 生效-1,失效-0
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    /**
     * Get 自定义拦截页面ID 
     * @return BlockPageId 自定义拦截页面ID
     */
    public Long getBlockPageId() {
        return this.BlockPageId;
    }

    /**
     * Set 自定义拦截页面ID
     * @param BlockPageId 自定义拦截页面ID
     */
    public void setBlockPageId(Long BlockPageId) {
        this.BlockPageId = BlockPageId;
    }

    /**
     * Get 当Action=intercept时，此字段必填 
     * @return ActionList 当Action=intercept时，此字段必填
     */
    public UCBActionProportion [] getActionList() {
        return this.ActionList;
    }

    /**
     * Set 当Action=intercept时，此字段必填
     * @param ActionList 当Action=intercept时，此字段必填
     */
    public void setActionList(UCBActionProportion [] ActionList) {
        this.ActionList = ActionList;
    }

    public InOutputBotUCBRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InOutputBotUCBRule(InOutputBotUCBRule source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new InOutputUCBRuleEntry[source.Rule.length];
            for (int i = 0; i < source.Rule.length; i++) {
                this.Rule[i] = new InOutputUCBRuleEntry(source.Rule[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.OnOff != null) {
            this.OnOff = new String(source.OnOff);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Prior != null) {
            this.Prior = new Long(source.Prior);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new Long(source.ValidTime);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.AdditionArg != null) {
            this.AdditionArg = new String(source.AdditionArg);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.PreDefine != null) {
            this.PreDefine = new Boolean(source.PreDefine);
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
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
        if (source.BlockPageId != null) {
            this.BlockPageId = new Long(source.BlockPageId);
        }
        if (source.ActionList != null) {
            this.ActionList = new UCBActionProportion[source.ActionList.length];
            for (int i = 0; i < source.ActionList.length; i++) {
                this.ActionList[i] = new UCBActionProportion(source.ActionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "OnOff", this.OnOff);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Prior", this.Prior);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "AdditionArg", this.AdditionArg);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "PreDefine", this.PreDefine);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "BlockPageId", this.BlockPageId);
        this.setParamArrayObj(map, prefix + "ActionList.", this.ActionList);

    }
}

