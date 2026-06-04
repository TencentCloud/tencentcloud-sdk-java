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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiAgentConfig extends AbstractModel {

    /**
    * Agent协同配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentCollaboration")
    @Expose
    private AgentCollaborationConfig AgentCollaboration;

    /**
     * Get Agent协同配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentCollaboration Agent协同配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentCollaborationConfig getAgentCollaboration() {
        return this.AgentCollaboration;
    }

    /**
     * Set Agent协同配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentCollaboration Agent协同配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentCollaboration(AgentCollaborationConfig AgentCollaboration) {
        this.AgentCollaboration = AgentCollaboration;
    }

    public MultiAgentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiAgentConfig(MultiAgentConfig source) {
        if (source.AgentCollaboration != null) {
            this.AgentCollaboration = new AgentCollaborationConfig(source.AgentCollaboration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AgentCollaboration.", this.AgentCollaboration);

    }
}

