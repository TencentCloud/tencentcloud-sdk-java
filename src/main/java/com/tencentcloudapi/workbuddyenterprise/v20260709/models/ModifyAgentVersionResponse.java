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

public class ModifyAgentVersionResponse extends AbstractModel {

    /**
    * 版本 ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Agent 业务 ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 版本类型：DEFAULT / TEST / PROD
    */
    @SerializedName("VersionType")
    @Expose
    private String VersionType;

    /**
    * 版本变更说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模型标识
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Manifest v2.0 精简 manifest 原文（JSON 字符串）
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * 版本状态：DRAFT / ENABLED / DISABLED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。
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
     * Get 版本 ID 
     * @return VersionId 版本 ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本 ID
     * @param VersionId 版本 ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Agent 业务 ID 
     * @return AgentId Agent 业务 ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent 业务 ID
     * @param AgentId Agent 业务 ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 版本类型：DEFAULT / TEST / PROD 
     * @return VersionType 版本类型：DEFAULT / TEST / PROD
     */
    public String getVersionType() {
        return this.VersionType;
    }

    /**
     * Set 版本类型：DEFAULT / TEST / PROD
     * @param VersionType 版本类型：DEFAULT / TEST / PROD
     */
    public void setVersionType(String VersionType) {
        this.VersionType = VersionType;
    }

    /**
     * Get 版本变更说明 
     * @return Description 版本变更说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本变更说明
     * @param Description 版本变更说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模型标识 
     * @return Model 模型标识
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型标识
     * @param Model 模型标识
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Manifest v2.0 精简 manifest 原文（JSON 字符串） 
     * @return Manifest Manifest v2.0 精简 manifest 原文（JSON 字符串）
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set Manifest v2.0 精简 manifest 原文（JSON 字符串）
     * @param Manifest Manifest v2.0 精简 manifest 原文（JSON 字符串）
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get 版本状态：DRAFT / ENABLED / DISABLED 
     * @return Status 版本状态：DRAFT / ENABLED / DISABLED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 版本状态：DRAFT / ENABLED / DISABLED
     * @param Status 版本状态：DRAFT / ENABLED / DISABLED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间 
     * @return ModifiedTime 更新时间
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 更新时间
     * @param ModifiedTime 更新时间
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。 
     * @return SandboxTemplateId 绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。
     */
    public String getSandboxTemplateId() {
        return this.SandboxTemplateId;
    }

    /**
     * Set 绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。
     * @param SandboxTemplateId 绑定的沙箱模板 ID；未绑定时为空，创建会话沙箱使用系统默认模板。
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

    public ModifyAgentVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentVersionResponse(ModifyAgentVersionResponse source) {
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

