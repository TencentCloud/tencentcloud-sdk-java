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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetsWeightRule extends AbstractModel{

    /**
    * 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 要修改权重的后端机器列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * 后端服务新的转发权重，取值范围：0~100。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerId 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerId 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 要修改权重的后端机器列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Targets 要修改权重的后端机器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 要修改权重的后端机器列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Targets 要修改权重的后端机器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 后端服务新的转发权重，取值范围：0~100。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 后端服务新的转发权重，取值范围：0~100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 后端服务新的转发权重，取值范围：0~100。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 后端服务新的转发权重，取值范围：0~100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetsWeightRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetsWeightRule(TargetsWeightRule source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Targets != null) {
            this.Targets = new Target[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new Target(source.Targets[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

