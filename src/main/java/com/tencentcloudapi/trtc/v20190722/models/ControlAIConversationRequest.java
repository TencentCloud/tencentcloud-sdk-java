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
    * <p>任务唯一标识</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话。- TransparentData，透传信息给客户端。</p>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * <p>服务端发送播报文本命令，当Command为ServerPushText时必填</p>
    */
    @SerializedName("ServerPushText")
    @Expose
    private ServerPushText ServerPushText;

    /**
    * <p>服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM=&quot;1&quot;</p>
    */
    @SerializedName("InvokeLLM")
    @Expose
    private InvokeLLM InvokeLLM;

    /**
    * <p>ai对话需要透传给客户端的信息</p>
    */
    @SerializedName("TransparentData")
    @Expose
    private TransparentData TransparentData;

    /**
     * Get <p>任务唯一标识</p> 
     * @return TaskId <p>任务唯一标识</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务唯一标识</p>
     * @param TaskId <p>任务唯一标识</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话。- TransparentData，透传信息给客户端。</p> 
     * @return Command <p>控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话。- TransparentData，透传信息给客户端。</p>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话。- TransparentData，透传信息给客户端。</p>
     * @param Command <p>控制命令，目前支持命令如下：- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本. - InvokeLLM，服务端发送文本给大模型，触发对话。- TransparentData，透传信息给客户端。</p>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get <p>服务端发送播报文本命令，当Command为ServerPushText时必填</p> 
     * @return ServerPushText <p>服务端发送播报文本命令，当Command为ServerPushText时必填</p>
     */
    public ServerPushText getServerPushText() {
        return this.ServerPushText;
    }

    /**
     * Set <p>服务端发送播报文本命令，当Command为ServerPushText时必填</p>
     * @param ServerPushText <p>服务端发送播报文本命令，当Command为ServerPushText时必填</p>
     */
    public void setServerPushText(ServerPushText ServerPushText) {
        this.ServerPushText = ServerPushText;
    }

    /**
     * Get <p>服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM=&quot;1&quot;</p> 
     * @return InvokeLLM <p>服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM=&quot;1&quot;</p>
     */
    public InvokeLLM getInvokeLLM() {
        return this.InvokeLLM;
    }

    /**
     * Set <p>服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM=&quot;1&quot;</p>
     * @param InvokeLLM <p>服务端发送命令主动请求大模型,当Command为InvokeLLM时会把content请求到大模型,头部增加X-Invoke-LLM=&quot;1&quot;</p>
     */
    public void setInvokeLLM(InvokeLLM InvokeLLM) {
        this.InvokeLLM = InvokeLLM;
    }

    /**
     * Get <p>ai对话需要透传给客户端的信息</p> 
     * @return TransparentData <p>ai对话需要透传给客户端的信息</p>
     */
    public TransparentData getTransparentData() {
        return this.TransparentData;
    }

    /**
     * Set <p>ai对话需要透传给客户端的信息</p>
     * @param TransparentData <p>ai对话需要透传给客户端的信息</p>
     */
    public void setTransparentData(TransparentData TransparentData) {
        this.TransparentData = TransparentData;
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
        if (source.TransparentData != null) {
            this.TransparentData = new TransparentData(source.TransparentData);
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
        this.setParamObj(map, prefix + "TransparentData.", this.TransparentData);

    }
}

