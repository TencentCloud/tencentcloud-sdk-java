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

public class CreateMcpServerRequest extends AbstractModel {

    /**
    * 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * MCP Server名称。最大长度：64
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Base64编码后的MCP Server启动命令。最大长度：2048
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * MCP Server备注。最大长度：2048
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * MCP Server环境变量。最大长度：10
    */
    @SerializedName("Envs")
    @Expose
    private McpServerEnv [] Envs;

    /**
    * 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式。未传传输类型字段时，默认创建此类型的MCP Server</li>
<li>SSE：Server-Sent Events，服务器发送事件</li>
    */
    @SerializedName("TransportType")
    @Expose
    private String TransportType;

    /**
     * Get 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。 
     * @return InstanceId 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     * @param InstanceId 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get MCP Server备注。最大长度：2048 
     * @return Description MCP Server备注。最大长度：2048
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set MCP Server备注。最大长度：2048
     * @param Description MCP Server备注。最大长度：2048
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get MCP Server环境变量。最大长度：10 
     * @return Envs MCP Server环境变量。最大长度：10
     */
    public McpServerEnv [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set MCP Server环境变量。最大长度：10
     * @param Envs MCP Server环境变量。最大长度：10
     */
    public void setEnvs(McpServerEnv [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式。未传传输类型字段时，默认创建此类型的MCP Server</li>
<li>SSE：Server-Sent Events，服务器发送事件</li> 
     * @return TransportType 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式。未传传输类型字段时，默认创建此类型的MCP Server</li>
<li>SSE：Server-Sent Events，服务器发送事件</li>
     */
    public String getTransportType() {
        return this.TransportType;
    }

    /**
     * Set 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式。未传传输类型字段时，默认创建此类型的MCP Server</li>
<li>SSE：Server-Sent Events，服务器发送事件</li>
     * @param TransportType 传输类型。枚举值如下：

<li>STREAMABLE_HTTP：HTTP协议的流式传输方式。未传传输类型字段时，默认创建此类型的MCP Server</li>
<li>SSE：Server-Sent Events，服务器发送事件</li>
     */
    public void setTransportType(String TransportType) {
        this.TransportType = TransportType;
    }

    public CreateMcpServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMcpServerRequest(CreateMcpServerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Envs != null) {
            this.Envs = new McpServerEnv[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new McpServerEnv(source.Envs[i]);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamSimple(map, prefix + "TransportType", this.TransportType);

    }
}

