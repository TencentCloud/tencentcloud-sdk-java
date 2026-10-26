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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWConsumerGroupBrief extends AbstractModel {

    /**
    * <p>消费者组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>消费者组Id</p>
    */
    @SerializedName("ConsumerGroupId")
    @Expose
    private String ConsumerGroupId;

    /**
    * <p>消费者组（组织节点）的当前展示路径，可选。TokenUsageList 在网关版本不低于 3.9.8 时，从 Kong CP 当前目录补齐，用于展示当前直接所属组的位置；多父节点使用确定性路径。更早版本、无可用路径或未补齐此元数据的接口可省略；前端缺省时回退 Name。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerGroupPath")
    @Expose
    private String ConsumerGroupPath;

    /**
     * Get <p>消费者组名称</p> 
     * @return Name <p>消费者组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>消费者组名称</p>
     * @param Name <p>消费者组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>消费者组Id</p> 
     * @return ConsumerGroupId <p>消费者组Id</p>
     */
    public String getConsumerGroupId() {
        return this.ConsumerGroupId;
    }

    /**
     * Set <p>消费者组Id</p>
     * @param ConsumerGroupId <p>消费者组Id</p>
     */
    public void setConsumerGroupId(String ConsumerGroupId) {
        this.ConsumerGroupId = ConsumerGroupId;
    }

    /**
     * Get <p>消费者组（组织节点）的当前展示路径，可选。TokenUsageList 在网关版本不低于 3.9.8 时，从 Kong CP 当前目录补齐，用于展示当前直接所属组的位置；多父节点使用确定性路径。更早版本、无可用路径或未补齐此元数据的接口可省略；前端缺省时回退 Name。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerGroupPath <p>消费者组（组织节点）的当前展示路径，可选。TokenUsageList 在网关版本不低于 3.9.8 时，从 Kong CP 当前目录补齐，用于展示当前直接所属组的位置；多父节点使用确定性路径。更早版本、无可用路径或未补齐此元数据的接口可省略；前端缺省时回退 Name。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerGroupPath() {
        return this.ConsumerGroupPath;
    }

    /**
     * Set <p>消费者组（组织节点）的当前展示路径，可选。TokenUsageList 在网关版本不低于 3.9.8 时，从 Kong CP 当前目录补齐，用于展示当前直接所属组的位置；多父节点使用确定性路径。更早版本、无可用路径或未补齐此元数据的接口可省略；前端缺省时回退 Name。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerGroupPath <p>消费者组（组织节点）的当前展示路径，可选。TokenUsageList 在网关版本不低于 3.9.8 时，从 Kong CP 当前目录补齐，用于展示当前直接所属组的位置；多父节点使用确定性路径。更早版本、无可用路径或未补齐此元数据的接口可省略；前端缺省时回退 Name。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerGroupPath(String ConsumerGroupPath) {
        this.ConsumerGroupPath = ConsumerGroupPath;
    }

    public AIGWConsumerGroupBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWConsumerGroupBrief(AIGWConsumerGroupBrief source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ConsumerGroupId != null) {
            this.ConsumerGroupId = new String(source.ConsumerGroupId);
        }
        if (source.ConsumerGroupPath != null) {
            this.ConsumerGroupPath = new String(source.ConsumerGroupPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ConsumerGroupId", this.ConsumerGroupId);
        this.setParamSimple(map, prefix + "ConsumerGroupPath", this.ConsumerGroupPath);

    }
}

