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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatDetail extends AbstractModel {

    /**
    * 角色
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 用户消息
    */
    @SerializedName("UserMessage")
    @Expose
    private String UserMessage;

    /**
    * 助手消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssistantMessage")
    @Expose
    private CreateChatCompletionRes [] AssistantMessage;

    /**
     * Get 角色 
     * @return Role 角色
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色
     * @param Role 角色
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 用户消息 
     * @return UserMessage 用户消息
     */
    public String getUserMessage() {
        return this.UserMessage;
    }

    /**
     * Set 用户消息
     * @param UserMessage 用户消息
     */
    public void setUserMessage(String UserMessage) {
        this.UserMessage = UserMessage;
    }

    /**
     * Get 助手消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssistantMessage 助手消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateChatCompletionRes [] getAssistantMessage() {
        return this.AssistantMessage;
    }

    /**
     * Set 助手消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssistantMessage 助手消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssistantMessage(CreateChatCompletionRes [] AssistantMessage) {
        this.AssistantMessage = AssistantMessage;
    }

    public ChatDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatDetail(ChatDetail source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.UserMessage != null) {
            this.UserMessage = new String(source.UserMessage);
        }
        if (source.AssistantMessage != null) {
            this.AssistantMessage = new CreateChatCompletionRes[source.AssistantMessage.length];
            for (int i = 0; i < source.AssistantMessage.length; i++) {
                this.AssistantMessage[i] = new CreateChatCompletionRes(source.AssistantMessage[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "UserMessage", this.UserMessage);
        this.setParamArrayObj(map, prefix + "AssistantMessage.", this.AssistantMessage);

    }
}

