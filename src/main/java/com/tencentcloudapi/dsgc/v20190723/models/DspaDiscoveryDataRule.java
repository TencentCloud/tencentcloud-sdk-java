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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryDataRule extends AbstractModel{

    /**
    * 规则类型；取值：
keyword 关键字, 
regex 正则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * 该字段是针对规则类型RuleType为keyword类型时的一个扩展属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtendParameters")
    @Expose
    private DatagovRuleExtendParameter [] ExtendParameters;

    /**
     * Get 规则类型；取值：
keyword 关键字, 
regex 正则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 规则类型；取值：
keyword 关键字, 
regex 正则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型；取值：
keyword 关键字, 
regex 正则
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 规则类型；取值：
keyword 关键字, 
regex 正则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleContent 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set 内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleContent 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get 该字段是针对规则类型RuleType为keyword类型时的一个扩展属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtendParameters 该字段是针对规则类型RuleType为keyword类型时的一个扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatagovRuleExtendParameter [] getExtendParameters() {
        return this.ExtendParameters;
    }

    /**
     * Set 该字段是针对规则类型RuleType为keyword类型时的一个扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtendParameters 该字段是针对规则类型RuleType为keyword类型时的一个扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtendParameters(DatagovRuleExtendParameter [] ExtendParameters) {
        this.ExtendParameters = ExtendParameters;
    }

    public DspaDiscoveryDataRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryDataRule(DspaDiscoveryDataRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
        if (source.ExtendParameters != null) {
            this.ExtendParameters = new DatagovRuleExtendParameter[source.ExtendParameters.length];
            for (int i = 0; i < source.ExtendParameters.length; i++) {
                this.ExtendParameters[i] = new DatagovRuleExtendParameter(source.ExtendParameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);
        this.setParamArrayObj(map, prefix + "ExtendParameters.", this.ExtendParameters);

    }
}

