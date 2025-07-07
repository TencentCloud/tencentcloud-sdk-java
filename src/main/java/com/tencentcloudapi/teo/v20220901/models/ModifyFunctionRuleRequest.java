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

public class ModifyFunctionRuleRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 规则 ID。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。
    */
    @SerializedName("FunctionRuleConditions")
    @Expose
    private FunctionRuleCondition [] FunctionRuleConditions;

    /**
    * 函数 ID，命中触发规则条件后执行的函数，不填写保持原有配置。
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 规则描述，最大支持 60 个字符，不填写保持原有配置。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 规则 ID。 
     * @return RuleId 规则 ID。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 ID。
     * @param RuleId 规则 ID。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。 
     * @return FunctionRuleConditions 规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。
     */
    public FunctionRuleCondition [] getFunctionRuleConditions() {
        return this.FunctionRuleConditions;
    }

    /**
     * Set 规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。
     * @param FunctionRuleConditions 规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。
     */
    public void setFunctionRuleConditions(FunctionRuleCondition [] FunctionRuleConditions) {
        this.FunctionRuleConditions = FunctionRuleConditions;
    }

    /**
     * Get 函数 ID，命中触发规则条件后执行的函数，不填写保持原有配置。 
     * @return FunctionId 函数 ID，命中触发规则条件后执行的函数，不填写保持原有配置。
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数 ID，命中触发规则条件后执行的函数，不填写保持原有配置。
     * @param FunctionId 函数 ID，命中触发规则条件后执行的函数，不填写保持原有配置。
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 规则描述，最大支持 60 个字符，不填写保持原有配置。 
     * @return Remark 规则描述，最大支持 60 个字符，不填写保持原有配置。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 规则描述，最大支持 60 个字符，不填写保持原有配置。
     * @param Remark 规则描述，最大支持 60 个字符，不填写保持原有配置。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyFunctionRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFunctionRuleRequest(ModifyFunctionRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "FunctionRuleConditions.", this.FunctionRuleConditions);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

