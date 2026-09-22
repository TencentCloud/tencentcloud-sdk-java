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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgentVersionFromSourceRequest extends AbstractModel {

    /**
    * <p>Agent 业务 ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>源版本 ID，同 Agent 下未 DISABLED 的任意版本</p>
    */
    @SerializedName("SourceVersionId")
    @Expose
    private String SourceVersionId;

    /**
    * <p>可选，覆盖源版本的 Model</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>可选，覆盖源版本的 Description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>可选，完整 v2.0 manifest JSON 字符串；传入则整体覆盖源版本 manifest</p>
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * <p>沙箱模板 ID。可选，patch 语义：null 沿用源版本绑定的模板；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。</p>
    */
    @SerializedName("SandboxTemplateId")
    @Expose
    private String SandboxTemplateId;

    /**
     * Get <p>Agent 业务 ID</p> 
     * @return AgentId <p>Agent 业务 ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent 业务 ID</p>
     * @param AgentId <p>Agent 业务 ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>源版本 ID，同 Agent 下未 DISABLED 的任意版本</p> 
     * @return SourceVersionId <p>源版本 ID，同 Agent 下未 DISABLED 的任意版本</p>
     */
    public String getSourceVersionId() {
        return this.SourceVersionId;
    }

    /**
     * Set <p>源版本 ID，同 Agent 下未 DISABLED 的任意版本</p>
     * @param SourceVersionId <p>源版本 ID，同 Agent 下未 DISABLED 的任意版本</p>
     */
    public void setSourceVersionId(String SourceVersionId) {
        this.SourceVersionId = SourceVersionId;
    }

    /**
     * Get <p>可选，覆盖源版本的 Model</p> 
     * @return Model <p>可选，覆盖源版本的 Model</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>可选，覆盖源版本的 Model</p>
     * @param Model <p>可选，覆盖源版本的 Model</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>可选，覆盖源版本的 Description</p> 
     * @return Description <p>可选，覆盖源版本的 Description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>可选，覆盖源版本的 Description</p>
     * @param Description <p>可选，覆盖源版本的 Description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>可选，完整 v2.0 manifest JSON 字符串；传入则整体覆盖源版本 manifest</p> 
     * @return Manifest <p>可选，完整 v2.0 manifest JSON 字符串；传入则整体覆盖源版本 manifest</p>
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set <p>可选，完整 v2.0 manifest JSON 字符串；传入则整体覆盖源版本 manifest</p>
     * @param Manifest <p>可选，完整 v2.0 manifest JSON 字符串；传入则整体覆盖源版本 manifest</p>
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get <p>沙箱模板 ID。可选，patch 语义：null 沿用源版本绑定的模板；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。</p> 
     * @return SandboxTemplateId <p>沙箱模板 ID。可选，patch 语义：null 沿用源版本绑定的模板；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。</p>
     */
    public String getSandboxTemplateId() {
        return this.SandboxTemplateId;
    }

    /**
     * Set <p>沙箱模板 ID。可选，patch 语义：null 沿用源版本绑定的模板；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。</p>
     * @param SandboxTemplateId <p>沙箱模板 ID。可选，patch 语义：null 沿用源版本绑定的模板；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。</p>
     */
    public void setSandboxTemplateId(String SandboxTemplateId) {
        this.SandboxTemplateId = SandboxTemplateId;
    }

    public CreateAgentVersionFromSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentVersionFromSourceRequest(CreateAgentVersionFromSourceRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.SourceVersionId != null) {
            this.SourceVersionId = new String(source.SourceVersionId);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.SandboxTemplateId != null) {
            this.SandboxTemplateId = new String(source.SandboxTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "SourceVersionId", this.SourceVersionId);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "SandboxTemplateId", this.SandboxTemplateId);

    }
}

