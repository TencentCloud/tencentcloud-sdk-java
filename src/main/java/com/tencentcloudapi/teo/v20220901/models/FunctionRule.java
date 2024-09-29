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
    * 函数 ID，命中触发规则条件后执行的函数。
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 规则描述。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 函数名称。
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数触发规则优先级，数值越大，优先级越高。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

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
     * Get 函数 ID，命中触发规则条件后执行的函数。 
     * @return FunctionId 函数 ID，命中触发规则条件后执行的函数。
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数 ID，命中触发规则条件后执行的函数。
     * @param FunctionId 函数 ID，命中触发规则条件后执行的函数。
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
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
     * Get 函数名称。 
     * @return FunctionName 函数名称。
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称。
     * @param FunctionName 函数名称。
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
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
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
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
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

