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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobGraphEdge extends AbstractModel{

    /**
    * 边的起始节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 边的目标节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Target")
    @Expose
    private Long Target;

    /**
     * Get 边的起始节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 边的起始节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 边的起始节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 边的起始节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 边的目标节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Target 边的目标节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTarget() {
        return this.Target;
    }

    /**
     * Set 边的目标节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Target 边的目标节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTarget(Long Target) {
        this.Target = Target;
    }

    public JobGraphEdge() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobGraphEdge(JobGraphEdge source) {
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.Target != null) {
            this.Target = new Long(source.Target);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);

    }
}

