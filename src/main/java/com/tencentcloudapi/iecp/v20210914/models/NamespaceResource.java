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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceResource extends AbstractModel{

    /**
    * 类型(workload|grid|configmap|secret)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 名称(最多返回5个）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
     * Get 类型(workload|grid|configmap|secret)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型(workload|grid|configmap|secret)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型(workload|grid|configmap|secret)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型(workload|grid|configmap|secret)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 名称(最多返回5个）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Names 名称(最多返回5个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 名称(最多返回5个）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Names 名称(最多返回5个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    public NamespaceResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceResource(NamespaceResource source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);

    }
}

