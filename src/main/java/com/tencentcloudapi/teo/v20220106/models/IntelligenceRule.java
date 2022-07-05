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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntelligenceRule extends AbstractModel{

    /**
    * 开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 规则详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private IntelligenceRuleItem [] Items;

    /**
     * Get 开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 规则详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 规则详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntelligenceRuleItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 规则详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 规则详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(IntelligenceRuleItem [] Items) {
        this.Items = Items;
    }

    public IntelligenceRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntelligenceRule(IntelligenceRule source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Items != null) {
            this.Items = new IntelligenceRuleItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new IntelligenceRuleItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

