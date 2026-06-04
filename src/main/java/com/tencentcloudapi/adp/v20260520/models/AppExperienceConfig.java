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

public class AppExperienceConfig extends AbstractModel {

    /**
    * 高级配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Advanced")
    @Expose
    private AppAdvancedConf Advanced;

    /**
    * 对话体验配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conversation")
    @Expose
    private ConversationExperience Conversation;

    /**
    * 角色配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Role")
    @Expose
    private RoleConfig Role;

    /**
     * Get 高级配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Advanced 高级配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppAdvancedConf getAdvanced() {
        return this.Advanced;
    }

    /**
     * Set 高级配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Advanced 高级配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvanced(AppAdvancedConf Advanced) {
        this.Advanced = Advanced;
    }

    /**
     * Get 对话体验配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conversation 对话体验配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConversationExperience getConversation() {
        return this.Conversation;
    }

    /**
     * Set 对话体验配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conversation 对话体验配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConversation(ConversationExperience Conversation) {
        this.Conversation = Conversation;
    }

    /**
     * Get 角色配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Role 角色配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoleConfig getRole() {
        return this.Role;
    }

    /**
     * Set 角色配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Role 角色配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRole(RoleConfig Role) {
        this.Role = Role;
    }

    public AppExperienceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppExperienceConfig(AppExperienceConfig source) {
        if (source.Advanced != null) {
            this.Advanced = new AppAdvancedConf(source.Advanced);
        }
        if (source.Conversation != null) {
            this.Conversation = new ConversationExperience(source.Conversation);
        }
        if (source.Role != null) {
            this.Role = new RoleConfig(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Advanced.", this.Advanced);
        this.setParamObj(map, prefix + "Conversation.", this.Conversation);
        this.setParamObj(map, prefix + "Role.", this.Role);

    }
}

