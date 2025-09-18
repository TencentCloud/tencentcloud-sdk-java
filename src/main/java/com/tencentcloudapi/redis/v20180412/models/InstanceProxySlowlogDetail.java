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
    * 慢查询耗时时长。单位：毫秒。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 客户端地址。
    */
    @SerializedName("Client")
    @Expose
    private String Client;

    /**
    * 慢查询的命令。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 慢查询详细命令行信息。
    */
    @SerializedName("CommandLine")
    @Expose
    private String CommandLine;

    /**
    * 执行时间。
    */
    @SerializedName("ExecuteTime")
    @Expose
    private String ExecuteTime;

    /**
    * 收客户端请求时长(ms)
    */
    @SerializedName("RecvClientEnd")
    @Expose
    private Long RecvClientEnd;

    /**
    * 发送客户端请求时长(ms)
    */
    @SerializedName("SendClientEnd")
    @Expose
    private Long SendClientEnd;

    /**
     * Get 慢查询耗时时长。单位：毫秒。 
     * @return Duration 慢查询耗时时长。单位：毫秒。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 慢查询耗时时长。单位：毫秒。
     * @param Duration 慢查询耗时时长。单位：毫秒。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 客户端地址。 
     * @return Client 客户端地址。
     */
    public String getClient() {
        return this.Client;
    }

    /**
     * Set 客户端地址。
     * @param Client 客户端地址。
     */
    public void setClient(String Client) {
        this.Client = Client;
    }

    /**
     * Get 慢查询的命令。 
     * @return Command 慢查询的命令。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 慢查询的命令。
     * @param Command 慢查询的命令。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 慢查询详细命令行信息。 
     * @return CommandLine 慢查询详细命令行信息。
     */
    public String getCommandLine() {
        return this.CommandLine;
    }

    /**
     * Set 慢查询详细命令行信息。
     * @param CommandLine 慢查询详细命令行信息。
     */
    public void setCommandLine(String CommandLine) {
        this.CommandLine = CommandLine;
    }

    /**
     * Get 执行时间。 
     * @return ExecuteTime 执行时间。
     */
    public String getExecuteTime() {
        return this.ExecuteTime;
    }

    /**
     * Set 执行时间。
     * @param ExecuteTime 执行时间。
     */
    public void setExecuteTime(String ExecuteTime) {
        this.ExecuteTime = ExecuteTime;
    }

    /**
     * Get 收客户端请求时长(ms) 
     * @return RecvClientEnd 收客户端请求时长(ms)
     */
    public Long getRecvClientEnd() {
        return this.RecvClientEnd;
    }

    /**
     * Set 收客户端请求时长(ms)
     * @param RecvClientEnd 收客户端请求时长(ms)
     */
    public void setRecvClientEnd(Long RecvClientEnd) {
        this.RecvClientEnd = RecvClientEnd;
    }

    /**
     * Get 发送客户端请求时长(ms) 
     * @return SendClientEnd 发送客户端请求时长(ms)
     */
    public Long getSendClientEnd() {
        return this.SendClientEnd;
    }

    /**
     * Set 发送客户端请求时长(ms)
     * @param SendClientEnd 发送客户端请求时长(ms)
     */
    public void setSendClientEnd(Long SendClientEnd) {
        this.SendClientEnd = SendClientEnd;
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

    }
}

