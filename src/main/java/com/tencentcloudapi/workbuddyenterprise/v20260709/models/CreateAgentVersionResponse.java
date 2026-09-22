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

public class CreateAgentVersionResponse extends AbstractModel {

    /**
    * <p>版本 ID</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>Agent 业务 ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>版本名称</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>版本类型：DEFAULT / TEST / PROD</p>
    */
    @SerializedName("VersionType")
    @Expose
    private String VersionType;

    /**
    * <p>版本变更说明</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模型标识</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>Manifest v2.0 精简 manifest 原文（JSON 字符串）</p>
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * <p>版本状态：DRAFT / ENABLED / DISABLED</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。</p>
    */
    @SerializedName("SandboxTemplateId")
    @Expose
    private String SandboxTemplateId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>版本 ID</p> 
     * @return VersionId <p>版本 ID</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>版本 ID</p>
     * @param VersionId <p>版本 ID</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

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
     * Get <p>版本名称</p> 
     * @return VersionName <p>版本名称</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>版本名称</p>
     * @param VersionName <p>版本名称</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>版本类型：DEFAULT / TEST / PROD</p> 
     * @return VersionType <p>版本类型：DEFAULT / TEST / PROD</p>
     */
    public String getVersionType() {
        return this.VersionType;
    }

    /**
     * Set <p>版本类型：DEFAULT / TEST / PROD</p>
     * @param VersionType <p>版本类型：DEFAULT / TEST / PROD</p>
     */
    public void setVersionType(String VersionType) {
        this.VersionType = VersionType;
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
     * Get <p>Manifest v2.0 精简 manifest 原文（JSON 字符串）</p> 
     * @return Manifest <p>Manifest v2.0 精简 manifest 原文（JSON 字符串）</p>
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set <p>Manifest v2.0 精简 manifest 原文（JSON 字符串）</p>
     * @param Manifest <p>Manifest v2.0 精简 manifest 原文（JSON 字符串）</p>
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get <p>版本状态：DRAFT / ENABLED / DISABLED</p> 
     * @return Status <p>版本状态：DRAFT / ENABLED / DISABLED</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>版本状态：DRAFT / ENABLED / DISABLED</p>
     * @param Status <p>版本状态：DRAFT / ENABLED / DISABLED</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return ModifiedTime <p>更新时间</p>
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param ModifiedTime <p>更新时间</p>
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。</p> 
     * @return SandboxTemplateId <p>绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。</p>
     */
    public String getSandboxTemplateId() {
        return this.SandboxTemplateId;
    }

    /**
     * Set <p>绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。</p>
     * @param SandboxTemplateId <p>绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。</p>
     */
    public void setSandboxTemplateId(String SandboxTemplateId) {
        this.SandboxTemplateId = SandboxTemplateId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateAgentVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentVersionResponse(CreateAgentVersionResponse source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.VersionType != null) {
            this.VersionType = new String(source.VersionType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.SandboxTemplateId != null) {
            this.SandboxTemplateId = new String(source.SandboxTemplateId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "VersionType", this.VersionType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "SandboxTemplateId", this.SandboxTemplateId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

