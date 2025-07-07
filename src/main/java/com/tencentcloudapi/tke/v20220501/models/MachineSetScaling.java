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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineSetScaling extends AbstractModel {

    /**
    * 节点池最小副本数
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 节点池最大副本数
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatePolicy")
    @Expose
    private String CreatePolicy;

    /**
     * Get 节点池最小副本数 
     * @return MinReplicas 节点池最小副本数
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 节点池最小副本数
     * @param MinReplicas 节点池最小副本数
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 节点池最大副本数 
     * @return MaxReplicas 节点池最大副本数
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 节点池最大副本数
     * @param MaxReplicas 节点池最大副本数
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatePolicy 节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatePolicy() {
        return this.CreatePolicy;
    }

    /**
     * Set 节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatePolicy 节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatePolicy(String CreatePolicy) {
        this.CreatePolicy = CreatePolicy;
    }

    public MachineSetScaling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineSetScaling(MachineSetScaling source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.CreatePolicy != null) {
            this.CreatePolicy = new String(source.CreatePolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamSimple(map, prefix + "CreatePolicy", this.CreatePolicy);

    }
}

