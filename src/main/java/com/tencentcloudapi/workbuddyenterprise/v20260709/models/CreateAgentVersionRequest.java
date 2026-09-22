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

public class CreateAgentVersionRequest extends AbstractModel {

    /**
    * <p>Agent 业务 ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Manifest v2.0 精简 manifest 原文（JSON 对象序列化后的字符串）</p>
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * <p>模型标识</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>版本变更说明</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>沙箱模板 ID。可选；传入时模板须属于当前企业且可用（未删除、状态正常），绑定到新建的 test/prod 版本。</p>
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
     * Get <p>Manifest v2.0 精简 manifest 原文（JSON 对象序列化后的字符串）</p> 
     * @return Manifest <p>Manifest v2.0 精简 manifest 原文（JSON 对象序列化后的字符串）</p>
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set <p>Manifest v2.0 精简 manifest 原文（JSON 对象序列化后的字符串）</p>
     * @param Manifest <p>Manifest v2.0 精简 manifest 原文（JSON 对象序列化后的字符串）</p>
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get <p>模型标识</p> 
     * @return Model <p>模型标识</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型标识</p>
     * @param Model <p>模型标识</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>版本变更说明</p> 
     * @return Description <p>版本变更说明</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>版本变更说明</p>
     * @param Description <p>版本变更说明</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>沙箱模板 ID。可选；传入时模板须属于当前企业且可用（未删除、状态正常），绑定到新建的 test/prod 版本。</p> 
     * @return SandboxTemplateId <p>沙箱模板 ID。可选；传入时模板须属于当前企业且可用（未删除、状态正常），绑定到新建的 test/prod 版本。</p>
     */
    public String getSandboxTemplateId() {
        return this.SandboxTemplateId;
    }

    /**
     * Set <p>沙箱模板 ID。可选；传入时模板须属于当前企业且可用（未删除、状态正常），绑定到新建的 test/prod 版本。</p>
     * @param SandboxTemplateId <p>沙箱模板 ID。可选；传入时模板须属于当前企业且可用（未删除、状态正常），绑定到新建的 test/prod 版本。</p>
     */
    public void setSandboxTemplateId(String SandboxTemplateId) {
        this.SandboxTemplateId = SandboxTemplateId;
    }

    public CreateAgentVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentVersionRequest(CreateAgentVersionRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SandboxTemplateId", this.SandboxTemplateId);

    }
}

