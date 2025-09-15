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

public class McpServerTemplate extends AbstractModel {

    /**
    * MCP Server名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Base64编码之后的MCP Server启动命令。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * MCP Server图标地址
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * MCP Server社区地址
    */
    @SerializedName("CommunityUrl")
    @Expose
    private String CommunityUrl;

    /**
    * MCP Server关联的开发平台地址或开放平台地址
    */
    @SerializedName("PlatformUrl")
    @Expose
    private String PlatformUrl;

    /**
    * MCP Server环境变量
    */
    @SerializedName("EnvSet")
    @Expose
    private McpServerTemplateEnv [] EnvSet;

    /**
     * Get MCP Server名称 
     * @return Name MCP Server名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set MCP Server名称
     * @param Name MCP Server名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Base64编码之后的MCP Server启动命令。 
     * @return Command Base64编码之后的MCP Server启动命令。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Base64编码之后的MCP Server启动命令。
     * @param Command Base64编码之后的MCP Server启动命令。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get MCP Server社区地址 
     * @return CommunityUrl MCP Server社区地址
     */
    public String getCommunityUrl() {
        return this.CommunityUrl;
    }

    /**
     * Set MCP Server社区地址
     * @param CommunityUrl MCP Server社区地址
     */
    public void setCommunityUrl(String CommunityUrl) {
        this.CommunityUrl = CommunityUrl;
    }

    /**
     * Get MCP Server关联的开发平台地址或开放平台地址 
     * @return PlatformUrl MCP Server关联的开发平台地址或开放平台地址
     */
    public String getPlatformUrl() {
        return this.PlatformUrl;
    }

    /**
     * Set MCP Server关联的开发平台地址或开放平台地址
     * @param PlatformUrl MCP Server关联的开发平台地址或开放平台地址
     */
    public void setPlatformUrl(String PlatformUrl) {
        this.PlatformUrl = PlatformUrl;
    }

    /**
     * Get MCP Server环境变量 
     * @return EnvSet MCP Server环境变量
     */
    public McpServerTemplateEnv [] getEnvSet() {
        return this.EnvSet;
    }

    /**
     * Set MCP Server环境变量
     * @param EnvSet MCP Server环境变量
     */
    public void setEnvSet(McpServerTemplateEnv [] EnvSet) {
        this.EnvSet = EnvSet;
    }

    public McpServerTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpServerTemplate(McpServerTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.CommunityUrl != null) {
            this.CommunityUrl = new String(source.CommunityUrl);
        }
        if (source.PlatformUrl != null) {
            this.PlatformUrl = new String(source.PlatformUrl);
        }
        if (source.EnvSet != null) {
            this.EnvSet = new McpServerTemplateEnv[source.EnvSet.length];
            for (int i = 0; i < source.EnvSet.length; i++) {
                this.EnvSet[i] = new McpServerTemplateEnv(source.EnvSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "CommunityUrl", this.CommunityUrl);
        this.setParamSimple(map, prefix + "PlatformUrl", this.PlatformUrl);
        this.setParamArrayObj(map, prefix + "EnvSet.", this.EnvSet);

    }
}

