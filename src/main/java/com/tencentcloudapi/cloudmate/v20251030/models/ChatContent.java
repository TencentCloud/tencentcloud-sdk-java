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
package com.tencentcloudapi.cloudmate.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatContent extends AbstractModel {

    /**
    * 角色，可选值：
 - user
 - model_thinking
 - model_output
 - knowledge
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 内容分片
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Parts")
    @Expose
    private ChatEventContentPart [] Parts;

    /**
     * Get 角色，可选值：
 - user
 - model_thinking
 - model_output
 - knowledge 
     * @return Role 角色，可选值：
 - user
 - model_thinking
 - model_output
 - knowledge
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色，可选值：
 - user
 - model_thinking
 - model_output
 - knowledge
     * @param Role 角色，可选值：
 - user
 - model_thinking
 - model_output
 - knowledge
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 内容分片
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Parts 内容分片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChatEventContentPart [] getParts() {
        return this.Parts;
    }

    /**
     * Set 内容分片
注意：此字段可能返回 null，表示取不到有效值。
     * @param Parts 内容分片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParts(ChatEventContentPart [] Parts) {
        this.Parts = Parts;
    }

    public ChatContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatContent(ChatContent source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Parts != null) {
            this.Parts = new ChatEventContentPart[source.Parts.length];
            for (int i = 0; i < source.Parts.length; i++) {
                this.Parts[i] = new ChatEventContentPart(source.Parts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamArrayObj(map, prefix + "Parts.", this.Parts);

    }
}

