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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExceptUserRuleScope extends AbstractModel{

    /**
    * 例外规则类型。其中complete模式代表全量数据进行例外，partial模式代表可选择指定模块指定字段进行例外，该字段取值有：
<li>complete：完全跳过模式；</li>
<li>partial：部分跳过模式。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 生效的模块，该字段取值有：
<li>waf：托管规则；</li>
<li>rate：速率限制；</li>
<li>acl：自定义规则；</li>
<li>cc：cc攻击防护；</li>
<li>bot：Bot防护。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Modules")
    @Expose
    private String [] Modules;

    /**
    * 跳过部分规则ID的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartialModules")
    @Expose
    private PartialModule [] PartialModules;

    /**
    * 跳过具体字段不去扫描的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkipConditions")
    @Expose
    private SkipCondition [] SkipConditions;

    /**
     * Get 例外规则类型。其中complete模式代表全量数据进行例外，partial模式代表可选择指定模块指定字段进行例外，该字段取值有：
<li>complete：完全跳过模式；</li>
<li>partial：部分跳过模式。</li> 
     * @return Type 例外规则类型。其中complete模式代表全量数据进行例外，partial模式代表可选择指定模块指定字段进行例外，该字段取值有：
<li>complete：完全跳过模式；</li>
<li>partial：部分跳过模式。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 例外规则类型。其中complete模式代表全量数据进行例外，partial模式代表可选择指定模块指定字段进行例外，该字段取值有：
<li>complete：完全跳过模式；</li>
<li>partial：部分跳过模式。</li>
     * @param Type 例外规则类型。其中complete模式代表全量数据进行例外，partial模式代表可选择指定模块指定字段进行例外，该字段取值有：
<li>complete：完全跳过模式；</li>
<li>partial：部分跳过模式。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 生效的模块，该字段取值有：
<li>waf：托管规则；</li>
<li>rate：速率限制；</li>
<li>acl：自定义规则；</li>
<li>cc：cc攻击防护；</li>
<li>bot：Bot防护。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Modules 生效的模块，该字段取值有：
<li>waf：托管规则；</li>
<li>rate：速率限制；</li>
<li>acl：自定义规则；</li>
<li>cc：cc攻击防护；</li>
<li>bot：Bot防护。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getModules() {
        return this.Modules;
    }

    /**
     * Set 生效的模块，该字段取值有：
<li>waf：托管规则；</li>
<li>rate：速率限制；</li>
<li>acl：自定义规则；</li>
<li>cc：cc攻击防护；</li>
<li>bot：Bot防护。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Modules 生效的模块，该字段取值有：
<li>waf：托管规则；</li>
<li>rate：速率限制；</li>
<li>acl：自定义规则；</li>
<li>cc：cc攻击防护；</li>
<li>bot：Bot防护。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModules(String [] Modules) {
        this.Modules = Modules;
    }

    /**
     * Get 跳过部分规则ID的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartialModules 跳过部分规则ID的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PartialModule [] getPartialModules() {
        return this.PartialModules;
    }

    /**
     * Set 跳过部分规则ID的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartialModules 跳过部分规则ID的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartialModules(PartialModule [] PartialModules) {
        this.PartialModules = PartialModules;
    }

    /**
     * Get 跳过具体字段不去扫描的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkipConditions 跳过具体字段不去扫描的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SkipCondition [] getSkipConditions() {
        return this.SkipConditions;
    }

    /**
     * Set 跳过具体字段不去扫描的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkipConditions 跳过具体字段不去扫描的例外规则详情。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkipConditions(SkipCondition [] SkipConditions) {
        this.SkipConditions = SkipConditions;
    }

    public ExceptUserRuleScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptUserRuleScope(ExceptUserRuleScope source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Modules != null) {
            this.Modules = new String[source.Modules.length];
            for (int i = 0; i < source.Modules.length; i++) {
                this.Modules[i] = new String(source.Modules[i]);
            }
        }
        if (source.PartialModules != null) {
            this.PartialModules = new PartialModule[source.PartialModules.length];
            for (int i = 0; i < source.PartialModules.length; i++) {
                this.PartialModules[i] = new PartialModule(source.PartialModules[i]);
            }
        }
        if (source.SkipConditions != null) {
            this.SkipConditions = new SkipCondition[source.SkipConditions.length];
            for (int i = 0; i < source.SkipConditions.length; i++) {
                this.SkipConditions[i] = new SkipCondition(source.SkipConditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Modules.", this.Modules);
        this.setParamArrayObj(map, prefix + "PartialModules.", this.PartialModules);
        this.setParamArrayObj(map, prefix + "SkipConditions.", this.SkipConditions);

    }
}

