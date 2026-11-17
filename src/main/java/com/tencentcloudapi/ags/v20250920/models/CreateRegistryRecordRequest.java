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
    * <p>资产类型。取值包括 MCP、A2A、AGUI、CUSTOM、AGENT_SKILLS 和 PLUGIN。Record 创建后不可修改。PLUGIN 按通用文件资产保存，由运行端解析和加载。</p>
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
    * <p>Plugin 通用文件来源。DescriptorType=PLUGIN 时必填，其他类型禁止。</p><p>入参限制：Create 仅支持 Type=FILE；声明 SizeBytes 为 1..54525952 字节，可选 SHA256 为 64 位小写十六进制摘要。</p><p>Registry 保存原始文件，不校验插件内容格式或语义；由运行端解析和加载。Skill 继续使用原 SkillSource。</p>
    */
    @SerializedName("FileSource")
    @Expose
    private CloudFileSourceInput FileSource;

    /**
    * <p>本版本支持的 HarnessVersionReference 对象列表；每项包含 HarnessEngine 和 HarnessEngineVersion，原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：两个字段均必填，各为 1 至 128 字符的精确值，区分大小写，不含空白、通配符或版本范围；最多 128 项，按引擎与版本二元组去重。不接受旧字符串数组、null、缺少字段或额外字段。</p><p>省略或空数组表示未声明，不继承前一版本，不代表支持所有 Harness。兼容性按同一对象的引擎与版本共同判断。修改兼容声明需创建新 Version，文件资产可通过 FileSource.Type=VERSION 复用制品。</p>
    */
    @SerializedName("SupportedHarnessVersions")
    @Expose
    private HarnessVersionReference [] SupportedHarnessVersions;

    /**
    * <p>版本元数据的 Name/Value 对象数组。</p><p>参数格式：每项仅包含必填的 Name、Value 两个字符串字段。Name 非空、小写且数组内唯一，不自动转换；重复 Name 即使 Value 相同也返回 InvalidParameter。Value 允许空字符串，保留大小写；不接受嵌套对象、数组或非字符串值。</p><p>默认值：空数组 []。创建新版本时省略或 [] 均为空，不继承；null、JSON 字符串和原生对象非法。响应按 Name 升序返回，旧 SQL NULL 归一为 []。服务内部使用 map[string]string，数据库 JSON 列保存对象。publisher 表示发布者展示名称；metadata.&lt;key&gt; 按完整小写名称精确筛选，规则不变。</p>
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataEntry [] Metadata;

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
     * Get <p>资产类型。取值包括 MCP、A2A、AGUI、CUSTOM、AGENT_SKILLS 和 PLUGIN。Record 创建后不可修改。PLUGIN 按通用文件资产保存，由运行端解析和加载。</p> 
     * @return DescriptorType <p>资产类型。取值包括 MCP、A2A、AGUI、CUSTOM、AGENT_SKILLS 和 PLUGIN。Record 创建后不可修改。PLUGIN 按通用文件资产保存，由运行端解析和加载。</p>
     */
    public String getDescriptorType() {
        return this.DescriptorType;
    }

    /**
     * Set <p>资产类型。取值包括 MCP、A2A、AGUI、CUSTOM、AGENT_SKILLS 和 PLUGIN。Record 创建后不可修改。PLUGIN 按通用文件资产保存，由运行端解析和加载。</p>
     * @param DescriptorType <p>资产类型。取值包括 MCP、A2A、AGUI、CUSTOM、AGENT_SKILLS 和 PLUGIN。Record 创建后不可修改。PLUGIN 按通用文件资产保存，由运行端解析和加载。</p>
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

    /**
     * Get <p>Plugin 通用文件来源。DescriptorType=PLUGIN 时必填，其他类型禁止。</p><p>入参限制：Create 仅支持 Type=FILE；声明 SizeBytes 为 1..54525952 字节，可选 SHA256 为 64 位小写十六进制摘要。</p><p>Registry 保存原始文件，不校验插件内容格式或语义；由运行端解析和加载。Skill 继续使用原 SkillSource。</p> 
     * @return FileSource <p>Plugin 通用文件来源。DescriptorType=PLUGIN 时必填，其他类型禁止。</p><p>入参限制：Create 仅支持 Type=FILE；声明 SizeBytes 为 1..54525952 字节，可选 SHA256 为 64 位小写十六进制摘要。</p><p>Registry 保存原始文件，不校验插件内容格式或语义；由运行端解析和加载。Skill 继续使用原 SkillSource。</p>
     */
    public CloudFileSourceInput getFileSource() {
        return this.FileSource;
    }

    /**
     * Set <p>Plugin 通用文件来源。DescriptorType=PLUGIN 时必填，其他类型禁止。</p><p>入参限制：Create 仅支持 Type=FILE；声明 SizeBytes 为 1..54525952 字节，可选 SHA256 为 64 位小写十六进制摘要。</p><p>Registry 保存原始文件，不校验插件内容格式或语义；由运行端解析和加载。Skill 继续使用原 SkillSource。</p>
     * @param FileSource <p>Plugin 通用文件来源。DescriptorType=PLUGIN 时必填，其他类型禁止。</p><p>入参限制：Create 仅支持 Type=FILE；声明 SizeBytes 为 1..54525952 字节，可选 SHA256 为 64 位小写十六进制摘要。</p><p>Registry 保存原始文件，不校验插件内容格式或语义；由运行端解析和加载。Skill 继续使用原 SkillSource。</p>
     */
    public void setFileSource(CloudFileSourceInput FileSource) {
        this.FileSource = FileSource;
    }

    /**
     * Get <p>本版本支持的 HarnessVersionReference 对象列表；每项包含 HarnessEngine 和 HarnessEngineVersion，原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：两个字段均必填，各为 1 至 128 字符的精确值，区分大小写，不含空白、通配符或版本范围；最多 128 项，按引擎与版本二元组去重。不接受旧字符串数组、null、缺少字段或额外字段。</p><p>省略或空数组表示未声明，不继承前一版本，不代表支持所有 Harness。兼容性按同一对象的引擎与版本共同判断。修改兼容声明需创建新 Version，文件资产可通过 FileSource.Type=VERSION 复用制品。</p> 
     * @return SupportedHarnessVersions <p>本版本支持的 HarnessVersionReference 对象列表；每项包含 HarnessEngine 和 HarnessEngineVersion，原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：两个字段均必填，各为 1 至 128 字符的精确值，区分大小写，不含空白、通配符或版本范围；最多 128 项，按引擎与版本二元组去重。不接受旧字符串数组、null、缺少字段或额外字段。</p><p>省略或空数组表示未声明，不继承前一版本，不代表支持所有 Harness。兼容性按同一对象的引擎与版本共同判断。修改兼容声明需创建新 Version，文件资产可通过 FileSource.Type=VERSION 复用制品。</p>
     */
    public HarnessVersionReference [] getSupportedHarnessVersions() {
        return this.SupportedHarnessVersions;
    }

    /**
     * Set <p>本版本支持的 HarnessVersionReference 对象列表；每项包含 HarnessEngine 和 HarnessEngineVersion，原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：两个字段均必填，各为 1 至 128 字符的精确值，区分大小写，不含空白、通配符或版本范围；最多 128 项，按引擎与版本二元组去重。不接受旧字符串数组、null、缺少字段或额外字段。</p><p>省略或空数组表示未声明，不继承前一版本，不代表支持所有 Harness。兼容性按同一对象的引擎与版本共同判断。修改兼容声明需创建新 Version，文件资产可通过 FileSource.Type=VERSION 复用制品。</p>
     * @param SupportedHarnessVersions <p>本版本支持的 HarnessVersionReference 对象列表；每项包含 HarnessEngine 和 HarnessEngineVersion，原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：两个字段均必填，各为 1 至 128 字符的精确值，区分大小写，不含空白、通配符或版本范围；最多 128 项，按引擎与版本二元组去重。不接受旧字符串数组、null、缺少字段或额外字段。</p><p>省略或空数组表示未声明，不继承前一版本，不代表支持所有 Harness。兼容性按同一对象的引擎与版本共同判断。修改兼容声明需创建新 Version，文件资产可通过 FileSource.Type=VERSION 复用制品。</p>
     */
    public void setSupportedHarnessVersions(HarnessVersionReference [] SupportedHarnessVersions) {
        this.SupportedHarnessVersions = SupportedHarnessVersions;
    }

    /**
     * Get <p>版本元数据的 Name/Value 对象数组。</p><p>参数格式：每项仅包含必填的 Name、Value 两个字符串字段。Name 非空、小写且数组内唯一，不自动转换；重复 Name 即使 Value 相同也返回 InvalidParameter。Value 允许空字符串，保留大小写；不接受嵌套对象、数组或非字符串值。</p><p>默认值：空数组 []。创建新版本时省略或 [] 均为空，不继承；null、JSON 字符串和原生对象非法。响应按 Name 升序返回，旧 SQL NULL 归一为 []。服务内部使用 map[string]string，数据库 JSON 列保存对象。publisher 表示发布者展示名称；metadata.&lt;key&gt; 按完整小写名称精确筛选，规则不变。</p> 
     * @return Metadata <p>版本元数据的 Name/Value 对象数组。</p><p>参数格式：每项仅包含必填的 Name、Value 两个字符串字段。Name 非空、小写且数组内唯一，不自动转换；重复 Name 即使 Value 相同也返回 InvalidParameter。Value 允许空字符串，保留大小写；不接受嵌套对象、数组或非字符串值。</p><p>默认值：空数组 []。创建新版本时省略或 [] 均为空，不继承；null、JSON 字符串和原生对象非法。响应按 Name 升序返回，旧 SQL NULL 归一为 []。服务内部使用 map[string]string，数据库 JSON 列保存对象。publisher 表示发布者展示名称；metadata.&lt;key&gt; 按完整小写名称精确筛选，规则不变。</p>
     */
    public MetadataEntry [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>版本元数据的 Name/Value 对象数组。</p><p>参数格式：每项仅包含必填的 Name、Value 两个字符串字段。Name 非空、小写且数组内唯一，不自动转换；重复 Name 即使 Value 相同也返回 InvalidParameter。Value 允许空字符串，保留大小写；不接受嵌套对象、数组或非字符串值。</p><p>默认值：空数组 []。创建新版本时省略或 [] 均为空，不继承；null、JSON 字符串和原生对象非法。响应按 Name 升序返回，旧 SQL NULL 归一为 []。服务内部使用 map[string]string，数据库 JSON 列保存对象。publisher 表示发布者展示名称；metadata.&lt;key&gt; 按完整小写名称精确筛选，规则不变。</p>
     * @param Metadata <p>版本元数据的 Name/Value 对象数组。</p><p>参数格式：每项仅包含必填的 Name、Value 两个字符串字段。Name 非空、小写且数组内唯一，不自动转换；重复 Name 即使 Value 相同也返回 InvalidParameter。Value 允许空字符串，保留大小写；不接受嵌套对象、数组或非字符串值。</p><p>默认值：空数组 []。创建新版本时省略或 [] 均为空，不继承；null、JSON 字符串和原生对象非法。响应按 Name 升序返回，旧 SQL NULL 归一为 []。服务内部使用 map[string]string，数据库 JSON 列保存对象。publisher 表示发布者展示名称；metadata.&lt;key&gt; 按完整小写名称精确筛选，规则不变。</p>
     */
    public void setMetadata(MetadataEntry [] Metadata) {
        this.Metadata = Metadata;
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
        if (source.FileSource != null) {
            this.FileSource = new CloudFileSourceInput(source.FileSource);
        }
        if (source.SupportedHarnessVersions != null) {
            this.SupportedHarnessVersions = new HarnessVersionReference[source.SupportedHarnessVersions.length];
            for (int i = 0; i < source.SupportedHarnessVersions.length; i++) {
                this.SupportedHarnessVersions[i] = new HarnessVersionReference(source.SupportedHarnessVersions[i]);
            }
        }
        if (source.Metadata != null) {
            this.Metadata = new MetadataEntry[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new MetadataEntry(source.Metadata[i]);
            }
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
        this.setParamObj(map, prefix + "FileSource.", this.FileSource);
        this.setParamArrayObj(map, prefix + "SupportedHarnessVersions.", this.SupportedHarnessVersions);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

