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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentConfig extends AbstractModel {

    /**
    * <p>执行 Prompt（必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Agent 唯一标识（引用 CreateAgent 创建的 Managed Agent，必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
     * Get <p>执行 Prompt（必填）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Prompt <p>执行 Prompt（必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>执行 Prompt（必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Prompt <p>执行 Prompt（必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Agent 唯一标识（引用 CreateAgent 创建的 Managed Agent，必填）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId <p>Agent 唯一标识（引用 CreateAgent 创建的 Managed Agent，必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent 唯一标识（引用 CreateAgent 创建的 Managed Agent，必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId <p>Agent 唯一标识（引用 CreateAgent 创建的 Managed Agent，必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    public AgentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentConfig(AgentConfig source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);

    }
}

