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

public class UpdateRegistryRecordRequest extends AbstractModel {

    /**
    * <p>Registry ID。</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Record ID。</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>Record 描述，可选。Record 更新模式下允许，允许空字符串清空；Version 创建模式禁止。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>新 Version 的展示名，可选。仅 Version 创建模式允许。</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>新 Version 的变更原因，最大 4096 字符，可选。仅 Version 创建模式允许。</p>
    */
    @SerializedName("ChangeLog")
    @Expose
    private String ChangeLog;

    /**
    * <p>Version 创建模式：现有 Record 的 DescriptorType=MCP 时可提交。</p>
    */
    @SerializedName("MCPSource")
    @Expose
    private CloudMCPSourceInput MCPSource;

    /**
    * <p>Version 创建模式：现有 Record 的 DescriptorType=A2A 或 AGUI 时可提交。</p>
    */
    @SerializedName("AgentSource")
    @Expose
    private CloudAgentSourceInput AgentSource;

    /**
    * <p>Version 创建模式：现有 Record 的 DescriptorType=AGENT_SKILLS 时可提交。</p>
    */
    @SerializedName("SkillSource")
    @Expose
    private CloudSkillSourceInput SkillSource;

    /**
    * <p>Version 创建模式：现有 Record 的 DescriptorType=CUSTOM 时可提交，必须是 JSON object 字符串。</p>
    */
    @SerializedName("CustomDescriptors")
    @Expose
    private String CustomDescriptors;

    /**
    * <p>Record 更新模式：Label 变更列表，最多 32 条，同一次请求中 Label Name 不可重复。</p>
    */
    @SerializedName("LabelMutations")
    @Expose
    private CloudRecordLabelMutation [] LabelMutations;

    /**
    * <p>Skill 或 Plugin 后续版本的文件来源。PLUGIN 可使用 FILE 上传新文件，或使用 VERSION 复用同一 Record 的 READY 制品；Skill 仅通过 VERSION 复用现有文件。与其他内容来源互斥。</p><p>VERSION 只提交 Type、SourceVersionId；Metadata 和 SupportedHarnessVersions 由本次请求单独声明，不继承来源版本。</p>
    */
    @SerializedName("FileSource")
    @Expose
    private CloudFileSourceInput FileSource;

    /**
    * <p>资产版本支持的 Harness 引擎与具体版本列表。每个元素同时包含 HarnessEngine 和 HarnessEngineVersion，取值原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：最多 128 个元素；两个字段均必填，长度 1～128，区分大小写，不允许空白、通配符或版本范围。按完整配对去重；不接受字符串数组或 null。</p><p>省略或空数组表示未声明兼容性，不表示兼容全部。仅随新 Version 写入，后续修改需创建新 Version。筛选时 supported_harness_engine 与 supported_harness_version 必须同时传入，并在同一元素中精确匹配。</p>
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
     * Get <p>Registry ID。</p> 
     * @return RegistryId <p>Registry ID。</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>Registry ID。</p>
     * @param RegistryId <p>Registry ID。</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Record ID。</p> 
     * @return RecordId <p>Record ID。</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>Record ID。</p>
     * @param RecordId <p>Record ID。</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>Record 描述，可选。Record 更新模式下允许，允许空字符串清空；Version 创建模式禁止。</p> 
     * @return Description <p>Record 描述，可选。Record 更新模式下允许，允许空字符串清空；Version 创建模式禁止。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Record 描述，可选。Record 更新模式下允许，允许空字符串清空；Version 创建模式禁止。</p>
     * @param Description <p>Record 描述，可选。Record 更新模式下允许，允许空字符串清空；Version 创建模式禁止。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>新 Version 的展示名，可选。仅 Version 创建模式允许。</p> 
     * @return VersionName <p>新 Version 的展示名，可选。仅 Version 创建模式允许。</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>新 Version 的展示名，可选。仅 Version 创建模式允许。</p>
     * @param VersionName <p>新 Version 的展示名，可选。仅 Version 创建模式允许。</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>新 Version 的变更原因，最大 4096 字符，可选。仅 Version 创建模式允许。</p> 
     * @return ChangeLog <p>新 Version 的变更原因，最大 4096 字符，可选。仅 Version 创建模式允许。</p>
     */
    public String getChangeLog() {
        return this.ChangeLog;
    }

    /**
     * Set <p>新 Version 的变更原因，最大 4096 字符，可选。仅 Version 创建模式允许。</p>
     * @param ChangeLog <p>新 Version 的变更原因，最大 4096 字符，可选。仅 Version 创建模式允许。</p>
     */
    public void setChangeLog(String ChangeLog) {
        this.ChangeLog = ChangeLog;
    }

    /**
     * Get <p>Version 创建模式：现有 Record 的 DescriptorType=MCP 时可提交。</p> 
     * @return MCPSource <p>Version 创建模式：现有 Record 的 DescriptorType=MCP 时可提交。</p>
     */
    public CloudMCPSourceInput getMCPSource() {
        return this.MCPSource;
    }

    /**
     * Set <p>Version 创建模式：现有 Record 的 DescriptorType=MCP 时可提交。</p>
     * @param MCPSource <p>Version 创建模式：现有 Record 的 DescriptorType=MCP 时可提交。</p>
     */
    public void setMCPSource(CloudMCPSourceInput MCPSource) {
        this.MCPSource = MCPSource;
    }

    /**
     * Get <p>Version 创建模式：现有 Record 的 DescriptorType=A2A 或 AGUI 时可提交。</p> 
     * @return AgentSource <p>Version 创建模式：现有 Record 的 DescriptorType=A2A 或 AGUI 时可提交。</p>
     */
    public CloudAgentSourceInput getAgentSource() {
        return this.AgentSource;
    }

    /**
     * Set <p>Version 创建模式：现有 Record 的 DescriptorType=A2A 或 AGUI 时可提交。</p>
     * @param AgentSource <p>Version 创建模式：现有 Record 的 DescriptorType=A2A 或 AGUI 时可提交。</p>
     */
    public void setAgentSource(CloudAgentSourceInput AgentSource) {
        this.AgentSource = AgentSource;
    }

    /**
     * Get <p>Version 创建模式：现有 Record 的 DescriptorType=AGENT_SKILLS 时可提交。</p> 
     * @return SkillSource <p>Version 创建模式：现有 Record 的 DescriptorType=AGENT_SKILLS 时可提交。</p>
     */
    public CloudSkillSourceInput getSkillSource() {
        return this.SkillSource;
    }

    /**
     * Set <p>Version 创建模式：现有 Record 的 DescriptorType=AGENT_SKILLS 时可提交。</p>
     * @param SkillSource <p>Version 创建模式：现有 Record 的 DescriptorType=AGENT_SKILLS 时可提交。</p>
     */
    public void setSkillSource(CloudSkillSourceInput SkillSource) {
        this.SkillSource = SkillSource;
    }

    /**
     * Get <p>Version 创建模式：现有 Record 的 DescriptorType=CUSTOM 时可提交，必须是 JSON object 字符串。</p> 
     * @return CustomDescriptors <p>Version 创建模式：现有 Record 的 DescriptorType=CUSTOM 时可提交，必须是 JSON object 字符串。</p>
     */
    public String getCustomDescriptors() {
        return this.CustomDescriptors;
    }

    /**
     * Set <p>Version 创建模式：现有 Record 的 DescriptorType=CUSTOM 时可提交，必须是 JSON object 字符串。</p>
     * @param CustomDescriptors <p>Version 创建模式：现有 Record 的 DescriptorType=CUSTOM 时可提交，必须是 JSON object 字符串。</p>
     */
    public void setCustomDescriptors(String CustomDescriptors) {
        this.CustomDescriptors = CustomDescriptors;
    }

    /**
     * Get <p>Record 更新模式：Label 变更列表，最多 32 条，同一次请求中 Label Name 不可重复。</p> 
     * @return LabelMutations <p>Record 更新模式：Label 变更列表，最多 32 条，同一次请求中 Label Name 不可重复。</p>
     */
    public CloudRecordLabelMutation [] getLabelMutations() {
        return this.LabelMutations;
    }

    /**
     * Set <p>Record 更新模式：Label 变更列表，最多 32 条，同一次请求中 Label Name 不可重复。</p>
     * @param LabelMutations <p>Record 更新模式：Label 变更列表，最多 32 条，同一次请求中 Label Name 不可重复。</p>
     */
    public void setLabelMutations(CloudRecordLabelMutation [] LabelMutations) {
        this.LabelMutations = LabelMutations;
    }

    /**
     * Get <p>Skill 或 Plugin 后续版本的文件来源。PLUGIN 可使用 FILE 上传新文件，或使用 VERSION 复用同一 Record 的 READY 制品；Skill 仅通过 VERSION 复用现有文件。与其他内容来源互斥。</p><p>VERSION 只提交 Type、SourceVersionId；Metadata 和 SupportedHarnessVersions 由本次请求单独声明，不继承来源版本。</p> 
     * @return FileSource <p>Skill 或 Plugin 后续版本的文件来源。PLUGIN 可使用 FILE 上传新文件，或使用 VERSION 复用同一 Record 的 READY 制品；Skill 仅通过 VERSION 复用现有文件。与其他内容来源互斥。</p><p>VERSION 只提交 Type、SourceVersionId；Metadata 和 SupportedHarnessVersions 由本次请求单独声明，不继承来源版本。</p>
     */
    public CloudFileSourceInput getFileSource() {
        return this.FileSource;
    }

    /**
     * Set <p>Skill 或 Plugin 后续版本的文件来源。PLUGIN 可使用 FILE 上传新文件，或使用 VERSION 复用同一 Record 的 READY 制品；Skill 仅通过 VERSION 复用现有文件。与其他内容来源互斥。</p><p>VERSION 只提交 Type、SourceVersionId；Metadata 和 SupportedHarnessVersions 由本次请求单独声明，不继承来源版本。</p>
     * @param FileSource <p>Skill 或 Plugin 后续版本的文件来源。PLUGIN 可使用 FILE 上传新文件，或使用 VERSION 复用同一 Record 的 READY 制品；Skill 仅通过 VERSION 复用现有文件。与其他内容来源互斥。</p><p>VERSION 只提交 Type、SourceVersionId；Metadata 和 SupportedHarnessVersions 由本次请求单独声明，不继承来源版本。</p>
     */
    public void setFileSource(CloudFileSourceInput FileSource) {
        this.FileSource = FileSource;
    }

    /**
     * Get <p>资产版本支持的 Harness 引擎与具体版本列表。每个元素同时包含 HarnessEngine 和 HarnessEngineVersion，取值原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：最多 128 个元素；两个字段均必填，长度 1～128，区分大小写，不允许空白、通配符或版本范围。按完整配对去重；不接受字符串数组或 null。</p><p>省略或空数组表示未声明兼容性，不表示兼容全部。仅随新 Version 写入，后续修改需创建新 Version。筛选时 supported_harness_engine 与 supported_harness_version 必须同时传入，并在同一元素中精确匹配。</p> 
     * @return SupportedHarnessVersions <p>资产版本支持的 Harness 引擎与具体版本列表。每个元素同时包含 HarnessEngine 和 HarnessEngineVersion，取值原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：最多 128 个元素；两个字段均必填，长度 1～128，区分大小写，不允许空白、通配符或版本范围。按完整配对去重；不接受字符串数组或 null。</p><p>省略或空数组表示未声明兼容性，不表示兼容全部。仅随新 Version 写入，后续修改需创建新 Version。筛选时 supported_harness_engine 与 supported_harness_version 必须同时传入，并在同一元素中精确匹配。</p>
     */
    public HarnessVersionReference [] getSupportedHarnessVersions() {
        return this.SupportedHarnessVersions;
    }

    /**
     * Set <p>资产版本支持的 Harness 引擎与具体版本列表。每个元素同时包含 HarnessEngine 和 HarnessEngineVersion，取值原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：最多 128 个元素；两个字段均必填，长度 1～128，区分大小写，不允许空白、通配符或版本范围。按完整配对去重；不接受字符串数组或 null。</p><p>省略或空数组表示未声明兼容性，不表示兼容全部。仅随新 Version 写入，后续修改需创建新 Version。筛选时 supported_harness_engine 与 supported_harness_version 必须同时传入，并在同一元素中精确匹配。</p>
     * @param SupportedHarnessVersions <p>资产版本支持的 Harness 引擎与具体版本列表。每个元素同时包含 HarnessEngine 和 HarnessEngineVersion，取值原样使用 DescribeHarnessEngineList 返回的选项。</p><p>入参限制：最多 128 个元素；两个字段均必填，长度 1～128，区分大小写，不允许空白、通配符或版本范围。按完整配对去重；不接受字符串数组或 null。</p><p>省略或空数组表示未声明兼容性，不表示兼容全部。仅随新 Version 写入，后续修改需创建新 Version。筛选时 supported_harness_engine 与 supported_harness_version 必须同时传入，并在同一元素中精确匹配。</p>
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

    public UpdateRegistryRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRegistryRecordRequest(UpdateRegistryRecordRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.ChangeLog != null) {
            this.ChangeLog = new String(source.ChangeLog);
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
        if (source.LabelMutations != null) {
            this.LabelMutations = new CloudRecordLabelMutation[source.LabelMutations.length];
            for (int i = 0; i < source.LabelMutations.length; i++) {
                this.LabelMutations[i] = new CloudRecordLabelMutation(source.LabelMutations[i]);
            }
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
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "ChangeLog", this.ChangeLog);
        this.setParamObj(map, prefix + "MCPSource.", this.MCPSource);
        this.setParamObj(map, prefix + "AgentSource.", this.AgentSource);
        this.setParamObj(map, prefix + "SkillSource.", this.SkillSource);
        this.setParamSimple(map, prefix + "CustomDescriptors", this.CustomDescriptors);
        this.setParamArrayObj(map, prefix + "LabelMutations.", this.LabelMutations);
        this.setParamObj(map, prefix + "FileSource.", this.FileSource);
        this.setParamArrayObj(map, prefix + "SupportedHarnessVersions.", this.SupportedHarnessVersions);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

