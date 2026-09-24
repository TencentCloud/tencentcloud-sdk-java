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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRegistryRecordRequest extends AbstractModel {

    /**
    * <p>所属 Registry ID。</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Record 名称，长度 1..255，同一租户、Registry 内按规范化 Name 唯一（大小写不敏感）；软删除后允许复用。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>协议描述符类型。MCP / A2A / AGUI / CUSTOM / AGENT_SKILLS。Record 创建后不可修改。</p>
    */
    @SerializedName("DescriptorType")
    @Expose
    private String DescriptorType;

    /**
    * <p>Record 描述，最大 4096 字符，可选，默认空。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Revision 1 的展示名称，可选。</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>DescriptorType=MCP 时必填，其他类型禁止。</p>
    */
    @SerializedName("MCPSource")
    @Expose
    private CloudMCPSourceInput MCPSource;

    /**
    * <p>DescriptorType=A2A 或 AGUI 时必填，其他类型禁止。</p>
    */
    @SerializedName("AgentSource")
    @Expose
    private CloudAgentSourceInput AgentSource;

    /**
    * <p>DescriptorType=AGENT_SKILLS 时必填，其他类型禁止。</p>
    */
    @SerializedName("SkillSource")
    @Expose
    private CloudSkillSourceInput SkillSource;

    /**
    * <p>DescriptorType=CUSTOM 时必填，其他类型禁止。内容必须是 JSON object 字符串；服务端解析后写入 CloudRecordVersion.Descriptors，Version 的 SourceType 固定为 MANUAL、SourceConfig 固定为空对象。</p>
    */
    @SerializedName("CustomDescriptors")
    @Expose
    private String CustomDescriptors;

    /**
     * Get <p>所属 Registry ID。</p> 
     * @return RegistryId <p>所属 Registry ID。</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>所属 Registry ID。</p>
     * @param RegistryId <p>所属 Registry ID。</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Record 名称，长度 1..255，同一租户、Registry 内按规范化 Name 唯一（大小写不敏感）；软删除后允许复用。</p> 
     * @return Name <p>Record 名称，长度 1..255，同一租户、Registry 内按规范化 Name 唯一（大小写不敏感）；软删除后允许复用。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Record 名称，长度 1..255，同一租户、Registry 内按规范化 Name 唯一（大小写不敏感）；软删除后允许复用。</p>
     * @param Name <p>Record 名称，长度 1..255，同一租户、Registry 内按规范化 Name 唯一（大小写不敏感）；软删除后允许复用。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>协议描述符类型。MCP / A2A / AGUI / CUSTOM / AGENT_SKILLS。Record 创建后不可修改。</p> 
     * @return DescriptorType <p>协议描述符类型。MCP / A2A / AGUI / CUSTOM / AGENT_SKILLS。Record 创建后不可修改。</p>
     */
    public String getDescriptorType() {
        return this.DescriptorType;
    }

    /**
     * Set <p>协议描述符类型。MCP / A2A / AGUI / CUSTOM / AGENT_SKILLS。Record 创建后不可修改。</p>
     * @param DescriptorType <p>协议描述符类型。MCP / A2A / AGUI / CUSTOM / AGENT_SKILLS。Record 创建后不可修改。</p>
     */
    public void setDescriptorType(String DescriptorType) {
        this.DescriptorType = DescriptorType;
    }

    /**
     * Get <p>Record 描述，最大 4096 字符，可选，默认空。</p> 
     * @return Description <p>Record 描述，最大 4096 字符，可选，默认空。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Record 描述，最大 4096 字符，可选，默认空。</p>
     * @param Description <p>Record 描述，最大 4096 字符，可选，默认空。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Revision 1 的展示名称，可选。</p> 
     * @return VersionName <p>Revision 1 的展示名称，可选。</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>Revision 1 的展示名称，可选。</p>
     * @param VersionName <p>Revision 1 的展示名称，可选。</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>DescriptorType=MCP 时必填，其他类型禁止。</p> 
     * @return MCPSource <p>DescriptorType=MCP 时必填，其他类型禁止。</p>
     */
    public CloudMCPSourceInput getMCPSource() {
        return this.MCPSource;
    }

    /**
     * Set <p>DescriptorType=MCP 时必填，其他类型禁止。</p>
     * @param MCPSource <p>DescriptorType=MCP 时必填，其他类型禁止。</p>
     */
    public void setMCPSource(CloudMCPSourceInput MCPSource) {
        this.MCPSource = MCPSource;
    }

    /**
     * Get <p>DescriptorType=A2A 或 AGUI 时必填，其他类型禁止。</p> 
     * @return AgentSource <p>DescriptorType=A2A 或 AGUI 时必填，其他类型禁止。</p>
     */
    public CloudAgentSourceInput getAgentSource() {
        return this.AgentSource;
    }

    /**
     * Set <p>DescriptorType=A2A 或 AGUI 时必填，其他类型禁止。</p>
     * @param AgentSource <p>DescriptorType=A2A 或 AGUI 时必填，其他类型禁止。</p>
     */
    public void setAgentSource(CloudAgentSourceInput AgentSource) {
        this.AgentSource = AgentSource;
    }

    /**
     * Get <p>DescriptorType=AGENT_SKILLS 时必填，其他类型禁止。</p> 
     * @return SkillSource <p>DescriptorType=AGENT_SKILLS 时必填，其他类型禁止。</p>
     */
    public CloudSkillSourceInput getSkillSource() {
        return this.SkillSource;
    }

    /**
     * Set <p>DescriptorType=AGENT_SKILLS 时必填，其他类型禁止。</p>
     * @param SkillSource <p>DescriptorType=AGENT_SKILLS 时必填，其他类型禁止。</p>
     */
    public void setSkillSource(CloudSkillSourceInput SkillSource) {
        this.SkillSource = SkillSource;
    }

    /**
     * Get <p>DescriptorType=CUSTOM 时必填，其他类型禁止。内容必须是 JSON object 字符串；服务端解析后写入 CloudRecordVersion.Descriptors，Version 的 SourceType 固定为 MANUAL、SourceConfig 固定为空对象。</p> 
     * @return CustomDescriptors <p>DescriptorType=CUSTOM 时必填，其他类型禁止。内容必须是 JSON object 字符串；服务端解析后写入 CloudRecordVersion.Descriptors，Version 的 SourceType 固定为 MANUAL、SourceConfig 固定为空对象。</p>
     */
    public String getCustomDescriptors() {
        return this.CustomDescriptors;
    }

    /**
     * Set <p>DescriptorType=CUSTOM 时必填，其他类型禁止。内容必须是 JSON object 字符串；服务端解析后写入 CloudRecordVersion.Descriptors，Version 的 SourceType 固定为 MANUAL、SourceConfig 固定为空对象。</p>
     * @param CustomDescriptors <p>DescriptorType=CUSTOM 时必填，其他类型禁止。内容必须是 JSON object 字符串；服务端解析后写入 CloudRecordVersion.Descriptors，Version 的 SourceType 固定为 MANUAL、SourceConfig 固定为空对象。</p>
     */
    public void setCustomDescriptors(String CustomDescriptors) {
        this.CustomDescriptors = CustomDescriptors;
    }

    public CreateRegistryRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRegistryRecordRequest(CreateRegistryRecordRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DescriptorType != null) {
            this.DescriptorType = new String(source.DescriptorType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.MCPSource != null) {
            this.MCPSource = new CloudMCPSourceInput(source.MCPSource);
        }
        if (source.AgentSource != null) {
            this.AgentSource = new CloudAgentSourceInput(source.AgentSource);
        }
        if (source.SkillSource != null) {
            this.SkillSource = new CloudSkillSourceInput(source.SkillSource);
        }
        if (source.CustomDescriptors != null) {
            this.CustomDescriptors = new String(source.CustomDescriptors);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DescriptorType", this.DescriptorType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamObj(map, prefix + "MCPSource.", this.MCPSource);
        this.setParamObj(map, prefix + "AgentSource.", this.AgentSource);
        this.setParamObj(map, prefix + "SkillSource.", this.SkillSource);
        this.setParamSimple(map, prefix + "CustomDescriptors", this.CustomDescriptors);

    }
}

