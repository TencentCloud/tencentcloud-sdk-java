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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Message extends AbstractModel {

    /**
    * <p>角色</p><p>枚举值：</p><ul><li>user： 用户</li><li>assistant： AI助手</li></ul>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>文本内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>思维链内容。<br>用于展示模型思考过程，仅深度思考模式可用。仅作为输出参数返回，在进行多轮对话时，无需传入输入参数中。</p>
    */
    @SerializedName("ReasoningContent")
    @Expose
    private String ReasoningContent;

    /**
    * <p>模型生成的工具调用。仅支持输出参数返回。</p>
    */
    @SerializedName("ToolCalls")
    @Expose
    private ToolCall [] ToolCalls;

    /**
     * Get <p>角色</p><p>枚举值：</p><ul><li>user： 用户</li><li>assistant： AI助手</li></ul> 
     * @return Role <p>角色</p><p>枚举值：</p><ul><li>user： 用户</li><li>assistant： AI助手</li></ul>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>角色</p><p>枚举值：</p><ul><li>user： 用户</li><li>assistant： AI助手</li></ul>
     * @param Role <p>角色</p><p>枚举值：</p><ul><li>user： 用户</li><li>assistant： AI助手</li></ul>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>文本内容</p> 
     * @return Content <p>文本内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>文本内容</p>
     * @param Content <p>文本内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>思维链内容。<br>用于展示模型思考过程，仅深度思考模式可用。仅作为输出参数返回，在进行多轮对话时，无需传入输入参数中。</p> 
     * @return ReasoningContent <p>思维链内容。<br>用于展示模型思考过程，仅深度思考模式可用。仅作为输出参数返回，在进行多轮对话时，无需传入输入参数中。</p>
     */
    public String getReasoningContent() {
        return this.ReasoningContent;
    }

    /**
     * Set <p>思维链内容。<br>用于展示模型思考过程，仅深度思考模式可用。仅作为输出参数返回，在进行多轮对话时，无需传入输入参数中。</p>
     * @param ReasoningContent <p>思维链内容。<br>用于展示模型思考过程，仅深度思考模式可用。仅作为输出参数返回，在进行多轮对话时，无需传入输入参数中。</p>
     */
    public void setReasoningContent(String ReasoningContent) {
        this.ReasoningContent = ReasoningContent;
    }

    /**
     * Get <p>模型生成的工具调用。仅支持输出参数返回。</p> 
     * @return ToolCalls <p>模型生成的工具调用。仅支持输出参数返回。</p>
     */
    public ToolCall [] getToolCalls() {
        return this.ToolCalls;
    }

    /**
     * Set <p>模型生成的工具调用。仅支持输出参数返回。</p>
     * @param ToolCalls <p>模型生成的工具调用。仅支持输出参数返回。</p>
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
        if (source.ReasoningContent != null) {
            this.ReasoningContent = new String(source.ReasoningContent);
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
        this.setParamSimple(map, prefix + "ReasoningContent", this.ReasoningContent);
        this.setParamArrayObj(map, prefix + "ToolCalls.", this.ToolCalls);

    }
}

