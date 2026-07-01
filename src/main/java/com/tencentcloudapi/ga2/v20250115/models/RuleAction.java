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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleAction extends AbstractModel {

    /**
    * <p>七层转发规则行为类型</p><p>枚举值：</p><ul><li>ForwardGroup： 转发策略为转发至终端节点组。</li><li>Drop： 转发策略为丢弃。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleActionType")
    @Expose
    private String RuleActionType;

    /**
    * <p>七层转发规则行为值</p><p>当RuleActionType是Drop时，此字段不用传；当RuleActionType是ForwardGroup时，此字段必传，需要填写的是自定义终端节点组ID， 不支持配置默认终端节点组。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleActionValue")
    @Expose
    private String RuleActionValue;

    /**
     * Get <p>七层转发规则行为类型</p><p>枚举值：</p><ul><li>ForwardGroup： 转发策略为转发至终端节点组。</li><li>Drop： 转发策略为丢弃。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleActionType <p>七层转发规则行为类型</p><p>枚举值：</p><ul><li>ForwardGroup： 转发策略为转发至终端节点组。</li><li>Drop： 转发策略为丢弃。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleActionType() {
        return this.RuleActionType;
    }

    /**
     * Set <p>七层转发规则行为类型</p><p>枚举值：</p><ul><li>ForwardGroup： 转发策略为转发至终端节点组。</li><li>Drop： 转发策略为丢弃。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleActionType <p>七层转发规则行为类型</p><p>枚举值：</p><ul><li>ForwardGroup： 转发策略为转发至终端节点组。</li><li>Drop： 转发策略为丢弃。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleActionType(String RuleActionType) {
        this.RuleActionType = RuleActionType;
    }

    /**
     * Get <p>七层转发规则行为值</p><p>当RuleActionType是Drop时，此字段不用传；当RuleActionType是ForwardGroup时，此字段必传，需要填写的是自定义终端节点组ID， 不支持配置默认终端节点组。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleActionValue <p>七层转发规则行为值</p><p>当RuleActionType是Drop时，此字段不用传；当RuleActionType是ForwardGroup时，此字段必传，需要填写的是自定义终端节点组ID， 不支持配置默认终端节点组。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleActionValue() {
        return this.RuleActionValue;
    }

    /**
     * Set <p>七层转发规则行为值</p><p>当RuleActionType是Drop时，此字段不用传；当RuleActionType是ForwardGroup时，此字段必传，需要填写的是自定义终端节点组ID， 不支持配置默认终端节点组。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleActionValue <p>七层转发规则行为值</p><p>当RuleActionType是Drop时，此字段不用传；当RuleActionType是ForwardGroup时，此字段必传，需要填写的是自定义终端节点组ID， 不支持配置默认终端节点组。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleActionValue(String RuleActionValue) {
        this.RuleActionValue = RuleActionValue;
    }

    public RuleAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleAction(RuleAction source) {
        if (source.RuleActionType != null) {
            this.RuleActionType = new String(source.RuleActionType);
        }
        if (source.RuleActionValue != null) {
            this.RuleActionValue = new String(source.RuleActionValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleActionType", this.RuleActionType);
        this.setParamSimple(map, prefix + "RuleActionValue", this.RuleActionValue);

    }
}

