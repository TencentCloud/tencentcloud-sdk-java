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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModelChatTaskRequest extends AbstractModel {

    /**
    * <p>模型标识</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>对话消息数组</p>
    */
    @SerializedName("Messages")
    @Expose
    private ModelChatMessageItem [] Messages;

    /**
    * <p>回调通知配置</p>
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private ModelChatTaskNotifyConfig TaskNotifyConfig;

    /**
     * Get <p>模型标识</p> 
     * @return Model <p>模型标识</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型标识</p>
     * @param Model <p>模型标识</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>对话消息数组</p> 
     * @return Messages <p>对话消息数组</p>
     */
    public ModelChatMessageItem [] getMessages() {
        return this.Messages;
    }

    /**
     * Set <p>对话消息数组</p>
     * @param Messages <p>对话消息数组</p>
     */
    public void setMessages(ModelChatMessageItem [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get <p>回调通知配置</p> 
     * @return TaskNotifyConfig <p>回调通知配置</p>
     */
    public ModelChatTaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set <p>回调通知配置</p>
     * @param TaskNotifyConfig <p>回调通知配置</p>
     */
    public void setTaskNotifyConfig(ModelChatTaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    public CreateModelChatTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelChatTaskRequest(CreateModelChatTaskRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Messages != null) {
            this.Messages = new ModelChatMessageItem[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new ModelChatMessageItem(source.Messages[i]);
            }
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new ModelChatTaskNotifyConfig(source.TaskNotifyConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);

    }
}

