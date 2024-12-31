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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreferredSchedulingTerm extends AbstractModel {

    /**
    * 权重，范围1-100
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 节点选择表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Preference")
    @Expose
    private NodeSelectorTerm Preference;

    /**
     * Get 权重，范围1-100 
     * @return Weight 权重，范围1-100
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重，范围1-100
     * @param Weight 权重，范围1-100
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 节点选择表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Preference 节点选择表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSelectorTerm getPreference() {
        return this.Preference;
    }

    /**
     * Set 节点选择表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Preference 节点选择表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreference(NodeSelectorTerm Preference) {
        this.Preference = Preference;
    }

    public PreferredSchedulingTerm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreferredSchedulingTerm(PreferredSchedulingTerm source) {
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Preference != null) {
            this.Preference = new NodeSelectorTerm(source.Preference);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamObj(map, prefix + "Preference.", this.Preference);

    }
}

