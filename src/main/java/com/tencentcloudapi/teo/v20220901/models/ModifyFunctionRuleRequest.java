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
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>规则 ID。您可以先通过 DescribeFunctionRules 接口来获取需要修改的规则的 RuleId，然后传入修改后的规则内容，原规则内容会被覆盖式更新。</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。</p>
    */
    @SerializedName("FunctionRuleConditions")
    @Expose
    private FunctionRuleCondition [] FunctionRuleConditions;

    /**
    * <p>函数选择配置类型：</p><li> direct：直接指定执行函数；</li><li> weight：基于权重比选择函数；</li><li> region：基于客户端 IP 的国家/地区选择函数。</li>不填时默认为 direct 。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。</p>
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * <p>基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中必须包含一项 Regions 为 Default 的配置，同时还需至少配置一项其他具体的 Region。</p>
    */
    @SerializedName("RegionMappingSelections")
    @Expose
    private FunctionRegionSelection [] RegionMappingSelections;

    /**
    * <p>基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。</p>
    */
    @SerializedName("WeightedSelections")
    @Expose
    private FunctionWeightedSelection [] WeightedSelections;

    /**
    * <p>规则描述，最大支持 60 个字符，不填写保持原有配置。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>规则 ID。您可以先通过 DescribeFunctionRules 接口来获取需要修改的规则的 RuleId，然后传入修改后的规则内容，原规则内容会被覆盖式更新。</p> 
     * @return RuleId <p>规则 ID。您可以先通过 DescribeFunctionRules 接口来获取需要修改的规则的 RuleId，然后传入修改后的规则内容，原规则内容会被覆盖式更新。</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则 ID。您可以先通过 DescribeFunctionRules 接口来获取需要修改的规则的 RuleId，然后传入修改后的规则内容，原规则内容会被覆盖式更新。</p>
     * @param RuleId <p>规则 ID。您可以先通过 DescribeFunctionRules 接口来获取需要修改的规则的 RuleId，然后传入修改后的规则内容，原规则内容会被覆盖式更新。</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。</p> 
     * @return FunctionRuleConditions <p>规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。</p>
     */
    public FunctionRuleCondition [] getFunctionRuleConditions() {
        return this.FunctionRuleConditions;
    }

    /**
     * Set <p>规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。</p>
     * @param FunctionRuleConditions <p>规则条件列表，相同触发规则的不同条件匹配项之间为或关系，不填写保持原有配置。</p>
     */
    public void setFunctionRuleConditions(FunctionRuleCondition [] FunctionRuleConditions) {
        this.FunctionRuleConditions = FunctionRuleConditions;
    }

    /**
     * Get <p>函数选择配置类型：</p><li> direct：直接指定执行函数；</li><li> weight：基于权重比选择函数；</li><li> region：基于客户端 IP 的国家/地区选择函数。</li>不填时默认为 direct 。 
     * @return TriggerType <p>函数选择配置类型：</p><li> direct：直接指定执行函数；</li><li> weight：基于权重比选择函数；</li><li> region：基于客户端 IP 的国家/地区选择函数。</li>不填时默认为 direct 。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>函数选择配置类型：</p><li> direct：直接指定执行函数；</li><li> weight：基于权重比选择函数；</li><li> region：基于客户端 IP 的国家/地区选择函数。</li>不填时默认为 direct 。
     * @param TriggerType <p>函数选择配置类型：</p><li> direct：直接指定执行函数；</li><li> weight：基于权重比选择函数；</li><li> region：基于客户端 IP 的国家/地区选择函数。</li>不填时默认为 direct 。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。</p> 
     * @return FunctionId <p>指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。</p>
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set <p>指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。</p>
     * @param FunctionId <p>指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。</p>
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get <p>基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中必须包含一项 Regions 为 Default 的配置，同时还需至少配置一项其他具体的 Region。</p> 
     * @return RegionMappingSelections <p>基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中必须包含一项 Regions 为 Default 的配置，同时还需至少配置一项其他具体的 Region。</p>
     */
    public FunctionRegionSelection [] getRegionMappingSelections() {
        return this.RegionMappingSelections;
    }

    /**
     * Set <p>基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中必须包含一项 Regions 为 Default 的配置，同时还需至少配置一项其他具体的 Region。</p>
     * @param RegionMappingSelections <p>基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中必须包含一项 Regions 为 Default 的配置，同时还需至少配置一项其他具体的 Region。</p>
     */
    public void setRegionMappingSelections(FunctionRegionSelection [] RegionMappingSelections) {
        this.RegionMappingSelections = RegionMappingSelections;
    }

    /**
     * Get <p>基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。</p> 
     * @return WeightedSelections <p>基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。</p>
     */
    public FunctionWeightedSelection [] getWeightedSelections() {
        return this.WeightedSelections;
    }

    /**
     * Set <p>基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。</p>
     * @param WeightedSelections <p>基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。</p>
     */
    public void setWeightedSelections(FunctionWeightedSelection [] WeightedSelections) {
        this.WeightedSelections = WeightedSelections;
    }

    /**
     * Get <p>规则描述，最大支持 60 个字符，不填写保持原有配置。</p> 
     * @return Remark <p>规则描述，最大支持 60 个字符，不填写保持原有配置。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>规则描述，最大支持 60 个字符，不填写保持原有配置。</p>
     * @param Remark <p>规则描述，最大支持 60 个字符，不填写保持原有配置。</p>
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
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
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
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamArrayObj(map, prefix + "RegionMappingSelections.", this.RegionMappingSelections);
        this.setParamArrayObj(map, prefix + "WeightedSelections.", this.WeightedSelections);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

