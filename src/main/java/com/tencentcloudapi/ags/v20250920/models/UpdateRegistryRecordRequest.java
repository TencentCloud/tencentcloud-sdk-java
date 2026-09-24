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

    }
}

