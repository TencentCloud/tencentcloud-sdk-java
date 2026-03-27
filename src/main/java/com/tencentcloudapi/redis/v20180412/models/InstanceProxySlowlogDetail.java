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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceProxySlowlogDetail extends AbstractModel {

    /**
    * <p>慢查询耗时时长。单位：毫秒。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>客户端地址。</p>
    */
    @SerializedName("Client")
    @Expose
    private String Client;

    /**
    * <p>慢查询的命令。</p>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * <p>慢查询详细命令行信息。</p>
    */
    @SerializedName("CommandLine")
    @Expose
    private String CommandLine;

    /**
    * <p>执行时间。</p>
    */
    @SerializedName("ExecuteTime")
    @Expose
    private String ExecuteTime;

    /**
    * <p>收客户端请求时长(ms)</p>
    */
    @SerializedName("RecvClientEnd")
    @Expose
    private Long RecvClientEnd;

    /**
    * <p>发送客户端请求时长(ms)</p>
    */
    @SerializedName("SendClientEnd")
    @Expose
    private Long SendClientEnd;

    /**
    * <p>Proxy节点ID。</p>
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
     * Get <p>慢查询耗时时长。单位：毫秒。</p> 
     * @return Duration <p>慢查询耗时时长。单位：毫秒。</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>慢查询耗时时长。单位：毫秒。</p>
     * @param Duration <p>慢查询耗时时长。单位：毫秒。</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>客户端地址。</p> 
     * @return Client <p>客户端地址。</p>
     */
    public String getClient() {
        return this.Client;
    }

    /**
     * Set <p>客户端地址。</p>
     * @param Client <p>客户端地址。</p>
     */
    public void setClient(String Client) {
        this.Client = Client;
    }

    /**
     * Get <p>慢查询的命令。</p> 
     * @return Command <p>慢查询的命令。</p>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>慢查询的命令。</p>
     * @param Command <p>慢查询的命令。</p>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get <p>慢查询详细命令行信息。</p> 
     * @return CommandLine <p>慢查询详细命令行信息。</p>
     */
    public String getCommandLine() {
        return this.CommandLine;
    }

    /**
     * Set <p>慢查询详细命令行信息。</p>
     * @param CommandLine <p>慢查询详细命令行信息。</p>
     */
    public void setCommandLine(String CommandLine) {
        this.CommandLine = CommandLine;
    }

    /**
     * Get <p>执行时间。</p> 
     * @return ExecuteTime <p>执行时间。</p>
     */
    public String getExecuteTime() {
        return this.ExecuteTime;
    }

    /**
     * Set <p>执行时间。</p>
     * @param ExecuteTime <p>执行时间。</p>
     */
    public void setExecuteTime(String ExecuteTime) {
        this.ExecuteTime = ExecuteTime;
    }

    /**
     * Get <p>收客户端请求时长(ms)</p> 
     * @return RecvClientEnd <p>收客户端请求时长(ms)</p>
     */
    public Long getRecvClientEnd() {
        return this.RecvClientEnd;
    }

    /**
     * Set <p>收客户端请求时长(ms)</p>
     * @param RecvClientEnd <p>收客户端请求时长(ms)</p>
     */
    public void setRecvClientEnd(Long RecvClientEnd) {
        this.RecvClientEnd = RecvClientEnd;
    }

    /**
     * Get <p>发送客户端请求时长(ms)</p> 
     * @return SendClientEnd <p>发送客户端请求时长(ms)</p>
     */
    public Long getSendClientEnd() {
        return this.SendClientEnd;
    }

    /**
     * Set <p>发送客户端请求时长(ms)</p>
     * @param SendClientEnd <p>发送客户端请求时长(ms)</p>
     */
    public void setSendClientEnd(Long SendClientEnd) {
        this.SendClientEnd = SendClientEnd;
    }

    /**
     * Get <p>Proxy节点ID。</p> 
     * @return Node <p>Proxy节点ID。</p>
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set <p>Proxy节点ID。</p>
     * @param Node <p>Proxy节点ID。</p>
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    public InstanceProxySlowlogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceProxySlowlogDetail(InstanceProxySlowlogDetail source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Client != null) {
            this.Client = new String(source.Client);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.CommandLine != null) {
            this.CommandLine = new String(source.CommandLine);
        }
        if (source.ExecuteTime != null) {
            this.ExecuteTime = new String(source.ExecuteTime);
        }
        if (source.RecvClientEnd != null) {
            this.RecvClientEnd = new Long(source.RecvClientEnd);
        }
        if (source.SendClientEnd != null) {
            this.SendClientEnd = new Long(source.SendClientEnd);
        }
        if (source.Node != null) {
            this.Node = new String(source.Node);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Client", this.Client);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "CommandLine", this.CommandLine);
        this.setParamSimple(map, prefix + "ExecuteTime", this.ExecuteTime);
        this.setParamSimple(map, prefix + "RecvClientEnd", this.RecvClientEnd);
        this.setParamSimple(map, prefix + "SendClientEnd", this.SendClientEnd);
        this.setParamSimple(map, prefix + "Node", this.Node);

    }
}

