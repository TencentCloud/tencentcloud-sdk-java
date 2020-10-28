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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeCountSummary extends AbstractModel{

    /**
    * 手动管理的节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManuallyAdded")
    @Expose
    private ManuallyAdded ManuallyAdded;

    /**
    * 自动管理的节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoscalingAdded")
    @Expose
    private AutoscalingAdded AutoscalingAdded;

    /**
     * Get 手动管理的节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManuallyAdded 手动管理的节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ManuallyAdded getManuallyAdded() {
        return this.ManuallyAdded;
    }

    /**
     * Set 手动管理的节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManuallyAdded 手动管理的节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManuallyAdded(ManuallyAdded ManuallyAdded) {
        this.ManuallyAdded = ManuallyAdded;
    }

    /**
     * Get 自动管理的节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoscalingAdded 自动管理的节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AutoscalingAdded getAutoscalingAdded() {
        return this.AutoscalingAdded;
    }

    /**
     * Set 自动管理的节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoscalingAdded 自动管理的节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoscalingAdded(AutoscalingAdded AutoscalingAdded) {
        this.AutoscalingAdded = AutoscalingAdded;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ManuallyAdded.", this.ManuallyAdded);
        this.setParamObj(map, prefix + "AutoscalingAdded.", this.AutoscalingAdded);

    }
}

