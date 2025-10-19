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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionRule extends AbstractModel {

    /**
    * 规则ID。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则条件列表，列表项之间为或关系。
    */
    @SerializedName("FunctionRuleConditions")
    @Expose
    private FunctionRuleCondition [] FunctionRuleConditions;

    /**
    * 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>

    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 指定执行的函数 ID。当 TriggerType 为 direct 时有效。
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 指定执行的函数名称。
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 基于客户端 IP 国家/地区的函数选择配置。
    */
    @SerializedName("RegionMappingSelections")
    @Expose
    private FunctionRegionSelection [] RegionMappingSelections;

    /**
    * 基于权重的函数选择配置。
    */
    @SerializedName("WeightedSelections")
    @Expose
    private FunctionWeightedSelection [] WeightedSelections;

    /**
    * 函数触发规则优先级，数值越大，优先级越高。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 规则描述。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 规则ID。 
     * @return RuleId 规则ID。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID。
     * @param RuleId 规则ID。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则条件列表，列表项之间为或关系。 
     * @return FunctionRuleConditions 规则条件列表，列表项之间为或关系。
     */
    public FunctionRuleCondition [] getFunctionRuleConditions() {
        return this.FunctionRuleConditions;
    }

    /**
     * Set 规则条件列表，列表项之间为或关系。
     * @param FunctionRuleConditions 规则条件列表，列表项之间为或关系。
     */
    public void setFunctionRuleConditions(FunctionRuleCondition [] FunctionRuleConditions) {
        this.FunctionRuleConditions = FunctionRuleConditions;
    }

    /**
     * Get 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>
 
     * @return TriggerType 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>

     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>

     * @param TriggerType 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>

     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 指定执行的函数 ID。当 TriggerType 为 direct 时有效。 
     * @return FunctionId 指定执行的函数 ID。当 TriggerType 为 direct 时有效。
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 指定执行的函数 ID。当 TriggerType 为 direct 时有效。
     * @param FunctionId 指定执行的函数 ID。当 TriggerType 为 direct 时有效。
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 指定执行的函数名称。 
     * @return FunctionName 指定执行的函数名称。
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 指定执行的函数名称。
     * @param FunctionName 指定执行的函数名称。
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 基于客户端 IP 国家/地区的函数选择配置。 
     * @return RegionMappingSelections 基于客户端 IP 国家/地区的函数选择配置。
     */
    public FunctionRegionSelection [] getRegionMappingSelections() {
        return this.RegionMappingSelections;
    }

    /**
     * Set 基于客户端 IP 国家/地区的函数选择配置。
     * @param RegionMappingSelections 基于客户端 IP 国家/地区的函数选择配置。
     */
    public void setRegionMappingSelections(FunctionRegionSelection [] RegionMappingSelections) {
        this.RegionMappingSelections = RegionMappingSelections;
    }

    /**
     * Get 基于权重的函数选择配置。 
     * @return WeightedSelections 基于权重的函数选择配置。
     */
    public FunctionWeightedSelection [] getWeightedSelections() {
        return this.WeightedSelections;
    }

    /**
     * Set 基于权重的函数选择配置。
     * @param WeightedSelections 基于权重的函数选择配置。
     */
    public void setWeightedSelections(FunctionWeightedSelection [] WeightedSelections) {
        this.WeightedSelections = WeightedSelections;
    }

    /**
     * Get 函数触发规则优先级，数值越大，优先级越高。 
     * @return Priority 函数触发规则优先级，数值越大，优先级越高。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 函数触发规则优先级，数值越大，优先级越高。
     * @param Priority 函数触发规则优先级，数值越大，优先级越高。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 规则描述。 
     * @return Remark 规则描述。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 规则描述。
     * @param Remark 规则描述。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return CreateTime 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     * @param CreateTime 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return UpdateTime 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     * @param UpdateTime 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public FunctionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionRule(FunctionRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.FunctionRuleConditions != null) {
            this.FunctionRuleConditions = new FunctionRuleCondition[source.FunctionRuleConditions.length];
            for (int i = 0; i < source.FunctionRuleConditions.length; i++) {
                this.FunctionRuleConditions[i] = new FunctionRuleCondition(source.FunctionRuleConditions[i]);
            }
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.RegionMappingSelections != null) {
            this.RegionMappingSelections = new FunctionRegionSelection[source.RegionMappingSelections.length];
            for (int i = 0; i < source.RegionMappingSelections.length; i++) {
                this.RegionMappingSelections[i] = new FunctionRegionSelection(source.RegionMappingSelections[i]);
            }
        }
        if (source.WeightedSelections != null) {
            this.WeightedSelections = new FunctionWeightedSelection[source.WeightedSelections.length];
            for (int i = 0; i < source.WeightedSelections.length; i++) {
                this.WeightedSelections[i] = new FunctionWeightedSelection(source.WeightedSelections[i]);
            }
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "FunctionRuleConditions.", this.FunctionRuleConditions);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamArrayObj(map, prefix + "RegionMappingSelections.", this.RegionMappingSelections);
        this.setParamArrayObj(map, prefix + "WeightedSelections.", this.WeightedSelections);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

