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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McpServer extends AbstractModel {

    /**
    * MCP Server ID
    */
    @SerializedName("McpServerId")
    @Expose
    private String McpServerId;

    /**
    * MCP Server名称。最大长度：64
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * MCP Server类型。枚举值如下：

<li>PUBLIC_PACKAGE：公共包安装</li>
<li>AGENT_GENERATED：AI生成</li>
    */
    @SerializedName("McpServerType")
    @Expose
    private String McpServerType;

    /**
    * MCP Server图标地址
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * Base64编码后的MCP Server启动命令。最大长度：2048
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * MCP Server状态。枚举值如下：

<li>PENDING：表示创建中</li>
<li>LAUNCH_FAILED：表示创建失败</li>
<li>RUNNING：表示运行中</li>
<li>STOPPED：表示关闭</li>
<li>STARTING：表示开启中</li>
<li>STOPPING：表示关闭中</li>
<li>RESTARTING：表示重启中</li>
<li>REMOVING：表示删除中</li>
<li>UNKNOWN：表示未知</li>
<li>ENV_ERROR：表示环境错误</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * MCP Server访问地址。传输类型 TransportType 为 STREAMABLE_HTTP 时以 /mcp结尾，为 SSE 时以 /sse结尾。
    */
    @SerializedName("ServerUrl")
    @Expose
    private String ServerUrl;

    /**
    * MCP Server配置
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * MCP Server备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * MCP Server创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * MCP Server修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * MCP Server环境变量
    */
    @SerializedName("EnvSet")
    @Expose
    private McpServerEnv [] EnvSet;

    /**
    * 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式</li>
<li>SSE：Server-Sent Events，服务器发送事件</li>
    */
    @SerializedName("TransportType")
    @Expose
    private String TransportType;

    /**
     * Get MCP Server ID 
     * @return McpServerId MCP Server ID
     */
    public String getMcpServerId() {
        return this.McpServerId;
    }

    /**
     * Set MCP Server ID
     * @param McpServerId MCP Server ID
     */
    public void setMcpServerId(String McpServerId) {
        this.McpServerId = McpServerId;
    }

    /**
     * Get MCP Server名称。最大长度：64 
     * @return Name MCP Server名称。最大长度：64
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set MCP Server名称。最大长度：64
     * @param Name MCP Server名称。最大长度：64
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get MCP Server类型。枚举值如下：

<li>PUBLIC_PACKAGE：公共包安装</li>
<li>AGENT_GENERATED：AI生成</li> 
     * @return McpServerType MCP Server类型。枚举值如下：

<li>PUBLIC_PACKAGE：公共包安装</li>
<li>AGENT_GENERATED：AI生成</li>
     */
    public String getMcpServerType() {
        return this.McpServerType;
    }

    /**
     * Set MCP Server类型。枚举值如下：

<li>PUBLIC_PACKAGE：公共包安装</li>
<li>AGENT_GENERATED：AI生成</li>
     * @param McpServerType MCP Server类型。枚举值如下：

<li>PUBLIC_PACKAGE：公共包安装</li>
<li>AGENT_GENERATED：AI生成</li>
     */
    public void setMcpServerType(String McpServerType) {
        this.McpServerType = McpServerType;
    }

    /**
     * Get MCP Server图标地址 
     * @return IconUrl MCP Server图标地址
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set MCP Server图标地址
     * @param IconUrl MCP Server图标地址
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get Base64编码后的MCP Server启动命令。最大长度：2048 
     * @return Command Base64编码后的MCP Server启动命令。最大长度：2048
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Base64编码后的MCP Server启动命令。最大长度：2048
     * @param Command Base64编码后的MCP Server启动命令。最大长度：2048
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get MCP Server状态。枚举值如下：

<li>PENDING：表示创建中</li>
<li>LAUNCH_FAILED：表示创建失败</li>
<li>RUNNING：表示运行中</li>
<li>STOPPED：表示关闭</li>
<li>STARTING：表示开启中</li>
<li>STOPPING：表示关闭中</li>
<li>RESTARTING：表示重启中</li>
<li>REMOVING：表示删除中</li>
<li>UNKNOWN：表示未知</li>
<li>ENV_ERROR：表示环境错误</li> 
     * @return State MCP Server状态。枚举值如下：

<li>PENDING：表示创建中</li>
<li>LAUNCH_FAILED：表示创建失败</li>
<li>RUNNING：表示运行中</li>
<li>STOPPED：表示关闭</li>
<li>STARTING：表示开启中</li>
<li>STOPPING：表示关闭中</li>
<li>RESTARTING：表示重启中</li>
<li>REMOVING：表示删除中</li>
<li>UNKNOWN：表示未知</li>
<li>ENV_ERROR：表示环境错误</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set MCP Server状态。枚举值如下：

<li>PENDING：表示创建中</li>
<li>LAUNCH_FAILED：表示创建失败</li>
<li>RUNNING：表示运行中</li>
<li>STOPPED：表示关闭</li>
<li>STARTING：表示开启中</li>
<li>STOPPING：表示关闭中</li>
<li>RESTARTING：表示重启中</li>
<li>REMOVING：表示删除中</li>
<li>UNKNOWN：表示未知</li>
<li>ENV_ERROR：表示环境错误</li>
     * @param State MCP Server状态。枚举值如下：

<li>PENDING：表示创建中</li>
<li>LAUNCH_FAILED：表示创建失败</li>
<li>RUNNING：表示运行中</li>
<li>STOPPED：表示关闭</li>
<li>STARTING：表示开启中</li>
<li>STOPPING：表示关闭中</li>
<li>RESTARTING：表示重启中</li>
<li>REMOVING：表示删除中</li>
<li>UNKNOWN：表示未知</li>
<li>ENV_ERROR：表示环境错误</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get MCP Server访问地址。传输类型 TransportType 为 STREAMABLE_HTTP 时以 /mcp结尾，为 SSE 时以 /sse结尾。 
     * @return ServerUrl MCP Server访问地址。传输类型 TransportType 为 STREAMABLE_HTTP 时以 /mcp结尾，为 SSE 时以 /sse结尾。
     */
    public String getServerUrl() {
        return this.ServerUrl;
    }

    /**
     * Set MCP Server访问地址。传输类型 TransportType 为 STREAMABLE_HTTP 时以 /mcp结尾，为 SSE 时以 /sse结尾。
     * @param ServerUrl MCP Server访问地址。传输类型 TransportType 为 STREAMABLE_HTTP 时以 /mcp结尾，为 SSE 时以 /sse结尾。
     */
    public void setServerUrl(String ServerUrl) {
        this.ServerUrl = ServerUrl;
    }

    /**
     * Get MCP Server配置 
     * @return Config MCP Server配置
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set MCP Server配置
     * @param Config MCP Server配置
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get MCP Server备注 
     * @return Description MCP Server备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set MCP Server备注
     * @param Description MCP Server备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get MCP Server创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。 
     * @return CreatedTime MCP Server创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set MCP Server创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     * @param CreatedTime MCP Server创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get MCP Server修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。 
     * @return UpdatedTime MCP Server修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set MCP Server修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     * @param UpdatedTime MCP Server修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get MCP Server环境变量 
     * @return EnvSet MCP Server环境变量
     */
    public McpServerEnv [] getEnvSet() {
        return this.EnvSet;
    }

    /**
     * Set MCP Server环境变量
     * @param EnvSet MCP Server环境变量
     */
    public void setEnvSet(McpServerEnv [] EnvSet) {
        this.EnvSet = EnvSet;
    }

    /**
     * Get 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式</li>
<li>SSE：Server-Sent Events，服务器发送事件</li> 
     * @return TransportType 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式</li>
<li>SSE：Server-Sent Events，服务器发送事件</li>
     */
    public String getTransportType() {
        return this.TransportType;
    }

    /**
     * Set 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式</li>
<li>SSE：Server-Sent Events，服务器发送事件</li>
     * @param TransportType 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式</li>
<li>SSE：Server-Sent Events，服务器发送事件</li>
     */
    public void setTransportType(String TransportType) {
        this.TransportType = TransportType;
    }

    public McpServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpServer(McpServer source) {
        if (source.McpServerId != null) {
            this.McpServerId = new String(source.McpServerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.McpServerType != null) {
            this.McpServerType = new String(source.McpServerType);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.ServerUrl != null) {
            this.ServerUrl = new String(source.ServerUrl);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.EnvSet != null) {
            this.EnvSet = new McpServerEnv[source.EnvSet.length];
            for (int i = 0; i < source.EnvSet.length; i++) {
                this.EnvSet[i] = new McpServerEnv(source.EnvSet[i]);
            }
        }
        if (source.TransportType != null) {
            this.TransportType = new String(source.TransportType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "McpServerId", this.McpServerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "McpServerType", this.McpServerType);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ServerUrl", this.ServerUrl);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "EnvSet.", this.EnvSet);
        this.setParamSimple(map, prefix + "TransportType", this.TransportType);

    }
}

