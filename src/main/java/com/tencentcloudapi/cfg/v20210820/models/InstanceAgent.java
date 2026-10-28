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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAgent extends AbstractModel {

    /**
    * 添加InstanceAgent的参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceAgentItem")
    @Expose
    private InstanceAgentItem [] InstanceAgentItem;

    /**
     * Get 添加InstanceAgent的参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceAgentItem 添加InstanceAgent的参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceAgentItem [] getInstanceAgentItem() {
        return this.InstanceAgentItem;
    }

    /**
     * Set 添加InstanceAgent的参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceAgentItem 添加InstanceAgent的参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceAgentItem(InstanceAgentItem [] InstanceAgentItem) {
        this.InstanceAgentItem = InstanceAgentItem;
    }

    public InstanceAgent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAgent(InstanceAgent source) {
        if (source.InstanceAgentItem != null) {
            this.InstanceAgentItem = new InstanceAgentItem[source.InstanceAgentItem.length];
            for (int i = 0; i < source.InstanceAgentItem.length; i++) {
                this.InstanceAgentItem[i] = new InstanceAgentItem(source.InstanceAgentItem[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceAgentItem.", this.InstanceAgentItem);

    }
}

