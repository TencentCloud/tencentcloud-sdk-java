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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8SToleration extends AbstractModel{

    /**
    * 匹配的污点名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 匹配方式，默认值为: Equal
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 执行策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * 匹配的污点值，当Operator为Equal时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 当污点不被容忍时，Pod还能在节点上运行多久
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TolerationSeconds")
    @Expose
    private Long TolerationSeconds;

    /**
     * Get 匹配的污点名 
     * @return Key 匹配的污点名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 匹配的污点名
     * @param Key 匹配的污点名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 匹配方式，默认值为: Equal
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 匹配方式，默认值为: Equal
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 匹配方式，默认值为: Equal
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 匹配方式，默认值为: Equal
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 执行策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Effect 执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set 执行策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param Effect 执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get 匹配的污点值，当Operator为Equal时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 匹配的污点值，当Operator为Equal时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 匹配的污点值，当Operator为Equal时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 匹配的污点值，当Operator为Equal时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 当污点不被容忍时，Pod还能在节点上运行多久
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TolerationSeconds 当污点不被容忍时，Pod还能在节点上运行多久
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTolerationSeconds() {
        return this.TolerationSeconds;
    }

    /**
     * Set 当污点不被容忍时，Pod还能在节点上运行多久
注意：此字段可能返回 null，表示取不到有效值。
     * @param TolerationSeconds 当污点不被容忍时，Pod还能在节点上运行多久
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTolerationSeconds(Long TolerationSeconds) {
        this.TolerationSeconds = TolerationSeconds;
    }

    public K8SToleration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8SToleration(K8SToleration source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.TolerationSeconds != null) {
            this.TolerationSeconds = new Long(source.TolerationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "TolerationSeconds", this.TolerationSeconds);

    }
}

