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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Message extends AbstractModel {

    /**
    * 角色，可选值包括 system、user、assistant、 tool。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 具体文本内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 当role为tool时传入，标识具体的函数调用
    */
    @SerializedName("ToolCallId")
    @Expose
    private String ToolCallId;

    /**
    * 模型生成的工具调用
    */
    @SerializedName("ToolCalls")
    @Expose
    private ToolCall [] ToolCalls;

    /**
     * Get 角色，可选值包括 system、user、assistant、 tool。 
     * @return Role 角色，可选值包括 system、user、assistant、 tool。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色，可选值包括 system、user、assistant、 tool。
     * @param Role 角色，可选值包括 system、user、assistant、 tool。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 具体文本内容 
     * @return Content 具体文本内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 具体文本内容
     * @param Content 具体文本内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 当role为tool时传入，标识具体的函数调用 
     * @return ToolCallId 当role为tool时传入，标识具体的函数调用
     */
    public String getToolCallId() {
        return this.ToolCallId;
    }

    /**
     * Set 当role为tool时传入，标识具体的函数调用
     * @param ToolCallId 当role为tool时传入，标识具体的函数调用
     */
    public void setToolCallId(String ToolCallId) {
        this.ToolCallId = ToolCallId;
    }

    /**
     * Get 模型生成的工具调用 
     * @return ToolCalls 模型生成的工具调用
     */
    public ToolCall [] getToolCalls() {
        return this.ToolCalls;
    }

    /**
     * Set 模型生成的工具调用
     * @param ToolCalls 模型生成的工具调用
     */
    public void setToolCalls(ToolCall [] ToolCalls) {
        this.ToolCalls = ToolCalls;
    }

    public Message() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Message(Message source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ToolCallId != null) {
            this.ToolCallId = new String(source.ToolCallId);
        }
        if (source.ToolCalls != null) {
            this.ToolCalls = new ToolCall[source.ToolCalls.length];
            for (int i = 0; i < source.ToolCalls.length; i++) {
                this.ToolCalls[i] = new ToolCall(source.ToolCalls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ToolCallId", this.ToolCallId);
        this.setParamArrayObj(map, prefix + "ToolCalls.", this.ToolCalls);

    }
}

