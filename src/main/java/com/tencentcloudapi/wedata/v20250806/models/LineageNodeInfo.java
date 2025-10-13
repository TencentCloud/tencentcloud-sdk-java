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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageNodeInfo extends AbstractModel {

    /**
    * 当前资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private LineageResource Resource;

    /**
    * 关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Relation")
    @Expose
    private LineageRelation Relation;

    /**
     * Get 当前资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 当前资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageResource getResource() {
        return this.Resource;
    }

    /**
     * Set 当前资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 当前资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(LineageResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Relation 关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageRelation getRelation() {
        return this.Relation;
    }

    /**
     * Set 关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param Relation 关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelation(LineageRelation Relation) {
        this.Relation = Relation;
    }

    public LineageNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageNodeInfo(LineageNodeInfo source) {
        if (source.Resource != null) {
            this.Resource = new LineageResource(source.Resource);
        }
        if (source.Relation != null) {
            this.Relation = new LineageRelation(source.Relation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamObj(map, prefix + "Relation.", this.Relation);

    }
}

