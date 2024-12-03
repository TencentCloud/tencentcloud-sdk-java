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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomTolerateSchedule extends AbstractModel {

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TolerationSeconds")
    @Expose
    private Long TolerationSeconds;

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Effect -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Effect -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TolerationSeconds -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTolerationSeconds() {
        return this.TolerationSeconds;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param TolerationSeconds -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTolerationSeconds(Long TolerationSeconds) {
        this.TolerationSeconds = TolerationSeconds;
    }

    public CustomTolerateSchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomTolerateSchedule(CustomTolerateSchedule source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
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
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "TolerationSeconds", this.TolerationSeconds);

    }
}

