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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeSelectorRequirement extends AbstractModel {

    /**
    * 节点选择项Key值
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 节点选择项Operator值，支持In, NotIn, Exists, DoesNotExist. Gt, and Lt.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 节点选择项Values值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 节点选择项Key值 
     * @return Key 节点选择项Key值
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 节点选择项Key值
     * @param Key 节点选择项Key值
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 节点选择项Operator值，支持In, NotIn, Exists, DoesNotExist. Gt, and Lt. 
     * @return Operator 节点选择项Operator值，支持In, NotIn, Exists, DoesNotExist. Gt, and Lt.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 节点选择项Operator值，支持In, NotIn, Exists, DoesNotExist. Gt, and Lt.
     * @param Operator 节点选择项Operator值，支持In, NotIn, Exists, DoesNotExist. Gt, and Lt.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 节点选择项Values值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values 节点选择项Values值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 节点选择项Values值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values 节点选择项Values值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public NodeSelectorRequirement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSelectorRequirement(NodeSelectorRequirement source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

