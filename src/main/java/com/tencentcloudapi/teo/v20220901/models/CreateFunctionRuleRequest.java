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

public class CreateFunctionRuleRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 规则条件列表，相同触发规则的不同条件匹配项之间为或关系。
    */
    @SerializedName("FunctionRuleConditions")
    @Expose
    private FunctionRuleCondition [] FunctionRuleConditions;

    /**
    * 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>
不填时默认为 direct 。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中至少包含一项 Regions 为 Default 的配置。
    */
    @SerializedName("RegionMappingSelections")
    @Expose
    private FunctionRegionSelection [] RegionMappingSelections;

    /**
    * 基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。
    */
    @SerializedName("WeightedSelections")
    @Expose
    private FunctionWeightedSelection [] WeightedSelections;

    /**
    * 规则描述，最大支持 60 个字符。
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
     * Get 规则条件列表，相同触发规则的不同条件匹配项之间为或关系。 
     * @return FunctionRuleConditions 规则条件列表，相同触发规则的不同条件匹配项之间为或关系。
     */
    public FunctionRuleCondition [] getFunctionRuleConditions() {
        return this.FunctionRuleConditions;
    }

    /**
     * Set 规则条件列表，相同触发规则的不同条件匹配项之间为或关系。
     * @param FunctionRuleConditions 规则条件列表，相同触发规则的不同条件匹配项之间为或关系。
     */
    public void setFunctionRuleConditions(FunctionRuleCondition [] FunctionRuleConditions) {
        this.FunctionRuleConditions = FunctionRuleConditions;
    }

    /**
     * Get 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>
不填时默认为 direct 。 
     * @return TriggerType 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>
不填时默认为 direct 。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>
不填时默认为 direct 。
     * @param TriggerType 函数选择配置类型：
<li> direct：直接指定执行函数；</li>
<li> weight：基于权重比选择函数；</li>
<li> region：基于客户端 IP 的国家/地区选择函数。</li>
不填时默认为 direct 。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。 
     * @return FunctionId 指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。
     * @param FunctionId 指定执行的函数 ID。当 TriggerType 为 direct 或 TriggerType 不填时生效。
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中至少包含一项 Regions 为 Default 的配置。 
     * @return RegionMappingSelections 基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中至少包含一项 Regions 为 Default 的配置。
     */
    public FunctionRegionSelection [] getRegionMappingSelections() {
        return this.RegionMappingSelections;
    }

    /**
     * Set 基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中至少包含一项 Regions 为 Default 的配置。
     * @param RegionMappingSelections 基于客户端 IP 国家/地区的函数选择配置，当 TriggerType 为 region 时生效且 RegionMappingSelections 必填。RegionMappingSelections 中至少包含一项 Regions 为 Default 的配置。
     */
    public void setRegionMappingSelections(FunctionRegionSelection [] RegionMappingSelections) {
        this.RegionMappingSelections = RegionMappingSelections;
    }

    /**
     * Get 基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。 
     * @return WeightedSelections 基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。
     */
    public FunctionWeightedSelection [] getWeightedSelections() {
        return this.WeightedSelections;
    }

    /**
     * Set 基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。
     * @param WeightedSelections 基于权重的函数选择配置，当 TriggerType 为 weight 时生效且 WeightedSelections 必填。WeightedSelections 中的所有权重之和需要为100。
     */
    public void setWeightedSelections(FunctionWeightedSelection [] WeightedSelections) {
        this.WeightedSelections = WeightedSelections;
    }

    /**
     * Get 规则描述，最大支持 60 个字符。 
     * @return Remark 规则描述，最大支持 60 个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 规则描述，最大支持 60 个字符。
     * @param Remark 规则描述，最大支持 60 个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateFunctionRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFunctionRuleRequest(CreateFunctionRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamArrayObj(map, prefix + "FunctionRuleConditions.", this.FunctionRuleConditions);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamArrayObj(map, prefix + "RegionMappingSelections.", this.RegionMappingSelections);
        this.setParamArrayObj(map, prefix + "WeightedSelections.", this.WeightedSelections);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

