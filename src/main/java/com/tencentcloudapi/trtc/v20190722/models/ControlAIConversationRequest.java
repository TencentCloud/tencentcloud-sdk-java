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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlAIConversationRequest extends AbstractModel {

    /**
    * 任务唯一标识
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 服务端发送播报文本命令，当Command为ServerPushText时必填
    */
    @SerializedName("ServerPushText")
    @Expose
    private ServerPushText ServerPushText;

    /**
    * 服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM="1"
    */
    @SerializedName("InvokeLLM")
    @Expose
    private InvokeLLM InvokeLLM;

    /**
     * Get 任务唯一标识 
     * @return TaskId 任务唯一标识
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务唯一标识
     * @param TaskId 任务唯一标识
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话 
     * @return Command 控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话
     * @param Command 控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 服务端发送播报文本命令，当Command为ServerPushText时必填 
     * @return ServerPushText 服务端发送播报文本命令，当Command为ServerPushText时必填
     */
    public ServerPushText getServerPushText() {
        return this.ServerPushText;
    }

    /**
     * Set 服务端发送播报文本命令，当Command为ServerPushText时必填
     * @param ServerPushText 服务端发送播报文本命令，当Command为ServerPushText时必填
     */
    public void setServerPushText(ServerPushText ServerPushText) {
        this.ServerPushText = ServerPushText;
    }

    /**
     * Get 服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM="1" 
     * @return InvokeLLM 服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM="1"
     */
    public InvokeLLM getInvokeLLM() {
        return this.InvokeLLM;
    }

    /**
     * Set 服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM="1"
     * @param InvokeLLM 服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM="1"
     */
    public void setInvokeLLM(InvokeLLM InvokeLLM) {
        this.InvokeLLM = InvokeLLM;
    }

    public ControlAIConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlAIConversationRequest(ControlAIConversationRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.ServerPushText != null) {
            this.ServerPushText = new ServerPushText(source.ServerPushText);
        }
        if (source.InvokeLLM != null) {
            this.InvokeLLM = new InvokeLLM(source.InvokeLLM);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "ServerPushText.", this.ServerPushText);
        this.setParamObj(map, prefix + "InvokeLLM.", this.InvokeLLM);

    }
}

