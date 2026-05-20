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

public class CreateChatCompletionRequest extends AbstractModel {

    /**
    * <p>输入内容</p>
    */
    @SerializedName("InputContent")
    @Expose
    private String InputContent;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>对话窗口ID，空值表示新的会话</p>
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * <p>是否隐藏</p>
    */
    @SerializedName("IsHidden")
    @Expose
    private Boolean IsHidden;

    /**
    * <p>是否隐藏会话</p>
    */
    @SerializedName("IsChatHidden")
    @Expose
    private Boolean IsChatHidden;

    /**
     * Get <p>输入内容</p> 
     * @return InputContent <p>输入内容</p>
     */
    public String getInputContent() {
        return this.InputContent;
    }

    /**
     * Set <p>输入内容</p>
     * @param InputContent <p>输入内容</p>
     */
    public void setInputContent(String InputContent) {
        this.InputContent = InputContent;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>对话窗口ID，空值表示新的会话</p> 
     * @return ChatId <p>对话窗口ID，空值表示新的会话</p>
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set <p>对话窗口ID，空值表示新的会话</p>
     * @param ChatId <p>对话窗口ID，空值表示新的会话</p>
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get <p>是否隐藏</p> 
     * @return IsHidden <p>是否隐藏</p>
     */
    public Boolean getIsHidden() {
        return this.IsHidden;
    }

    /**
     * Set <p>是否隐藏</p>
     * @param IsHidden <p>是否隐藏</p>
     */
    public void setIsHidden(Boolean IsHidden) {
        this.IsHidden = IsHidden;
    }

    /**
     * Get <p>是否隐藏会话</p> 
     * @return IsChatHidden <p>是否隐藏会话</p>
     */
    public Boolean getIsChatHidden() {
        return this.IsChatHidden;
    }

    /**
     * Set <p>是否隐藏会话</p>
     * @param IsChatHidden <p>是否隐藏会话</p>
     */
    public void setIsChatHidden(Boolean IsChatHidden) {
        this.IsChatHidden = IsChatHidden;
    }

    public CreateChatCompletionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateChatCompletionRequest(CreateChatCompletionRequest source) {
        if (source.InputContent != null) {
            this.InputContent = new String(source.InputContent);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.IsHidden != null) {
            this.IsHidden = new Boolean(source.IsHidden);
        }
        if (source.IsChatHidden != null) {
            this.IsChatHidden = new Boolean(source.IsChatHidden);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputContent", this.InputContent);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "IsHidden", this.IsHidden);
        this.setParamSimple(map, prefix + "IsChatHidden", this.IsChatHidden);

    }
}

