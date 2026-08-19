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

public class ConfigGroupFunctionTrigger extends AbstractModel {

    /**
    * <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件。</a></p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>函数选择配置类型：</p><p>枚举值：</p><ul><li>direct： 直接指定执行函数</li><li>weight： 基于权重比选择函数</li><li>region： 基于客户端 IP 的国家/地区选择函数</li></ul>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * <p>基于客户端 IP 国家/地区的函数选择配置。</p>
    */
    @SerializedName("RegionMappingSelections")
    @Expose
    private ConfigGroupFunctionRegionSelection [] RegionMappingSelections;

    /**
    * <p>基于权重的函数选择配置。</p>
    */
    @SerializedName("WeightedSelections")
    @Expose
    private ConfigGroupFunctionWeightedSelection [] WeightedSelections;

    /**
    * <p>规则描述。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件。</a></p> 
     * @return Condition <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件。</a></p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件。</a></p>
     * @param Condition <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件。</a></p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>函数选择配置类型：</p><p>枚举值：</p><ul><li>direct： 直接指定执行函数</li><li>weight： 基于权重比选择函数</li><li>region： 基于客户端 IP 的国家/地区选择函数</li></ul> 
     * @return TriggerType <p>函数选择配置类型：</p><p>枚举值：</p><ul><li>direct： 直接指定执行函数</li><li>weight： 基于权重比选择函数</li><li>region： 基于客户端 IP 的国家/地区选择函数</li></ul>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>函数选择配置类型：</p><p>枚举值：</p><ul><li>direct： 直接指定执行函数</li><li>weight： 基于权重比选择函数</li><li>region： 基于客户端 IP 的国家/地区选择函数</li></ul>
     * @param TriggerType <p>函数选择配置类型：</p><p>枚举值：</p><ul><li>direct： 直接指定执行函数</li><li>weight： 基于权重比选择函数</li><li>region： 基于客户端 IP 的国家/地区选择函数</li></ul>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p> 
     * @return Function <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
     * @param Function <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get <p>基于客户端 IP 国家/地区的函数选择配置。</p> 
     * @return RegionMappingSelections <p>基于客户端 IP 国家/地区的函数选择配置。</p>
     */
    public ConfigGroupFunctionRegionSelection [] getRegionMappingSelections() {
        return this.RegionMappingSelections;
    }

    /**
     * Set <p>基于客户端 IP 国家/地区的函数选择配置。</p>
     * @param RegionMappingSelections <p>基于客户端 IP 国家/地区的函数选择配置。</p>
     */
    public void setRegionMappingSelections(ConfigGroupFunctionRegionSelection [] RegionMappingSelections) {
        this.RegionMappingSelections = RegionMappingSelections;
    }

    /**
     * Get <p>基于权重的函数选择配置。</p> 
     * @return WeightedSelections <p>基于权重的函数选择配置。</p>
     */
    public ConfigGroupFunctionWeightedSelection [] getWeightedSelections() {
        return this.WeightedSelections;
    }

    /**
     * Set <p>基于权重的函数选择配置。</p>
     * @param WeightedSelections <p>基于权重的函数选择配置。</p>
     */
    public void setWeightedSelections(ConfigGroupFunctionWeightedSelection [] WeightedSelections) {
        this.WeightedSelections = WeightedSelections;
    }

    /**
     * Get <p>规则描述。</p> 
     * @return Remark <p>规则描述。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>规则描述。</p>
     * @param Remark <p>规则描述。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ConfigGroupFunctionTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupFunctionTrigger(ConfigGroupFunctionTrigger source) {
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.RegionMappingSelections != null) {
            this.RegionMappingSelections = new ConfigGroupFunctionRegionSelection[source.RegionMappingSelections.length];
            for (int i = 0; i < source.RegionMappingSelections.length; i++) {
                this.RegionMappingSelections[i] = new ConfigGroupFunctionRegionSelection(source.RegionMappingSelections[i]);
            }
        }
        if (source.WeightedSelections != null) {
            this.WeightedSelections = new ConfigGroupFunctionWeightedSelection[source.WeightedSelections.length];
            for (int i = 0; i < source.WeightedSelections.length; i++) {
                this.WeightedSelections[i] = new ConfigGroupFunctionWeightedSelection(source.WeightedSelections[i]);
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
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamArrayObj(map, prefix + "RegionMappingSelections.", this.RegionMappingSelections);
        this.setParamArrayObj(map, prefix + "WeightedSelections.", this.WeightedSelections);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

