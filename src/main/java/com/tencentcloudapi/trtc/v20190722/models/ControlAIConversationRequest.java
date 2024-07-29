/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * 控制命令，目前支持命令如下：

- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本
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
     * Get 控制命令，目前支持命令如下：

- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本 
     * @return Command 控制命令，目前支持命令如下：

- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 控制命令，目前支持命令如下：

- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本
     * @param Command 控制命令，目前支持命令如下：

- ServerPushText，服务端发送文本给AI机器人，AI机器人会播报该文本
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "ServerPushText.", this.ServerPushText);

    }
}

