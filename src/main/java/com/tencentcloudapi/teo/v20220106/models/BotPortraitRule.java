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

public class BotPortraitRule extends AbstractModel{

    /**
    * 本规则的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * JS挑战的规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlgManagedIds")
    @Expose
    private Long [] AlgManagedIds;

    /**
    * 数字验证码的规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CapManagedIds")
    @Expose
    private Long [] CapManagedIds;

    /**
    * 观察的规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonManagedIds")
    @Expose
    private Long [] MonManagedIds;

    /**
    * 拦截的规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropManagedIds")
    @Expose
    private Long [] DropManagedIds;

    /**
     * Get 本规则的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleID 本规则的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 本规则的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleID 本规则的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get JS挑战的规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlgManagedIds JS挑战的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAlgManagedIds() {
        return this.AlgManagedIds;
    }

    /**
     * Set JS挑战的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlgManagedIds JS挑战的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgManagedIds(Long [] AlgManagedIds) {
        this.AlgManagedIds = AlgManagedIds;
    }

    /**
     * Get 数字验证码的规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CapManagedIds 数字验证码的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getCapManagedIds() {
        return this.CapManagedIds;
    }

    /**
     * Set 数字验证码的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CapManagedIds 数字验证码的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapManagedIds(Long [] CapManagedIds) {
        this.CapManagedIds = CapManagedIds;
    }

    /**
     * Get 观察的规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonManagedIds 观察的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getMonManagedIds() {
        return this.MonManagedIds;
    }

    /**
     * Set 观察的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonManagedIds 观察的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonManagedIds(Long [] MonManagedIds) {
        this.MonManagedIds = MonManagedIds;
    }

    /**
     * Get 拦截的规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropManagedIds 拦截的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDropManagedIds() {
        return this.DropManagedIds;
    }

    /**
     * Set 拦截的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropManagedIds 拦截的规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropManagedIds(Long [] DropManagedIds) {
        this.DropManagedIds = DropManagedIds;
    }

    public BotPortraitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotPortraitRule(BotPortraitRule source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.AlgManagedIds != null) {
            this.AlgManagedIds = new Long[source.AlgManagedIds.length];
            for (int i = 0; i < source.AlgManagedIds.length; i++) {
                this.AlgManagedIds[i] = new Long(source.AlgManagedIds[i]);
            }
        }
        if (source.CapManagedIds != null) {
            this.CapManagedIds = new Long[source.CapManagedIds.length];
            for (int i = 0; i < source.CapManagedIds.length; i++) {
                this.CapManagedIds[i] = new Long(source.CapManagedIds[i]);
            }
        }
        if (source.MonManagedIds != null) {
            this.MonManagedIds = new Long[source.MonManagedIds.length];
            for (int i = 0; i < source.MonManagedIds.length; i++) {
                this.MonManagedIds[i] = new Long(source.MonManagedIds[i]);
            }
        }
        if (source.DropManagedIds != null) {
            this.DropManagedIds = new Long[source.DropManagedIds.length];
            for (int i = 0; i < source.DropManagedIds.length; i++) {
                this.DropManagedIds[i] = new Long(source.DropManagedIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "AlgManagedIds.", this.AlgManagedIds);
        this.setParamArraySimple(map, prefix + "CapManagedIds.", this.CapManagedIds);
        this.setParamArraySimple(map, prefix + "MonManagedIds.", this.MonManagedIds);
        this.setParamArraySimple(map, prefix + "DropManagedIds.", this.DropManagedIds);

    }
}

