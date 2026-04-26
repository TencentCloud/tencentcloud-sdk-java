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

public class StartSandboxInstanceRequest extends AbstractModel {

    /**
    * <p>沙箱工具 ID，与 ToolName 至少有一个要填</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>沙箱工具名称，与 ToolId 至少有一个要填</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h</p>
    */
    @SerializedName("Timeout")
    @Expose
    private String Timeout;

    /**
    * <p>幂等性 Token，长度不超过 64 字符</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>沙箱实例存储挂载配置</p>
    */
    @SerializedName("MountOptions")
    @Expose
    private MountOption [] MountOptions;

    /**
    * <p>沙箱实例自定义配置</p>
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private CustomConfiguration CustomConfiguration;

    /**
    * <p>沙箱访问认证模式</p><p>枚举值：</p><ul><li>DEFAULT： 默认，即 TOKEN 认证</li><li>TOKEN： Token认证，即所有端口访问都需携带TOKEN</li><li>NONE： 免认证，即所有端口访问无需携带TOKEN</li><li>PUBLIC： 公开模式，即ENVD管理端口（49983）访问需携带TOKEN，其他端口无需携带TOKEN</li></ul><p>默认值：DEFAULT</p>
    */
    @SerializedName("AuthMode")
    @Expose
    private String AuthMode;

    /**
    * <p>沙箱元数据</p>
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataVar [] Metadata;

    /**
     * Get <p>沙箱工具 ID，与 ToolName 至少有一个要填</p> 
     * @return ToolId <p>沙箱工具 ID，与 ToolName 至少有一个要填</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>沙箱工具 ID，与 ToolName 至少有一个要填</p>
     * @param ToolId <p>沙箱工具 ID，与 ToolName 至少有一个要填</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>沙箱工具名称，与 ToolId 至少有一个要填</p> 
     * @return ToolName <p>沙箱工具名称，与 ToolId 至少有一个要填</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>沙箱工具名称，与 ToolId 至少有一个要填</p>
     * @param ToolName <p>沙箱工具名称，与 ToolId 至少有一个要填</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h</p> 
     * @return Timeout <p>超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h</p>
     */
    public String getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h</p>
     * @param Timeout <p>超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h</p>
     */
    public void setTimeout(String Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>幂等性 Token，长度不超过 64 字符</p> 
     * @return ClientToken <p>幂等性 Token，长度不超过 64 字符</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>幂等性 Token，长度不超过 64 字符</p>
     * @param ClientToken <p>幂等性 Token，长度不超过 64 字符</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>沙箱实例存储挂载配置</p> 
     * @return MountOptions <p>沙箱实例存储挂载配置</p>
     */
    public MountOption [] getMountOptions() {
        return this.MountOptions;
    }

    /**
     * Set <p>沙箱实例存储挂载配置</p>
     * @param MountOptions <p>沙箱实例存储挂载配置</p>
     */
    public void setMountOptions(MountOption [] MountOptions) {
        this.MountOptions = MountOptions;
    }

    /**
     * Get <p>沙箱实例自定义配置</p> 
     * @return CustomConfiguration <p>沙箱实例自定义配置</p>
     */
    public CustomConfiguration getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set <p>沙箱实例自定义配置</p>
     * @param CustomConfiguration <p>沙箱实例自定义配置</p>
     */
    public void setCustomConfiguration(CustomConfiguration CustomConfiguration) {
        this.CustomConfiguration = CustomConfiguration;
    }

    /**
     * Get <p>沙箱访问认证模式</p><p>枚举值：</p><ul><li>DEFAULT： 默认，即 TOKEN 认证</li><li>TOKEN： Token认证，即所有端口访问都需携带TOKEN</li><li>NONE： 免认证，即所有端口访问无需携带TOKEN</li><li>PUBLIC： 公开模式，即ENVD管理端口（49983）访问需携带TOKEN，其他端口无需携带TOKEN</li></ul><p>默认值：DEFAULT</p> 
     * @return AuthMode <p>沙箱访问认证模式</p><p>枚举值：</p><ul><li>DEFAULT： 默认，即 TOKEN 认证</li><li>TOKEN： Token认证，即所有端口访问都需携带TOKEN</li><li>NONE： 免认证，即所有端口访问无需携带TOKEN</li><li>PUBLIC： 公开模式，即ENVD管理端口（49983）访问需携带TOKEN，其他端口无需携带TOKEN</li></ul><p>默认值：DEFAULT</p>
     */
    public String getAuthMode() {
        return this.AuthMode;
    }

    /**
     * Set <p>沙箱访问认证模式</p><p>枚举值：</p><ul><li>DEFAULT： 默认，即 TOKEN 认证</li><li>TOKEN： Token认证，即所有端口访问都需携带TOKEN</li><li>NONE： 免认证，即所有端口访问无需携带TOKEN</li><li>PUBLIC： 公开模式，即ENVD管理端口（49983）访问需携带TOKEN，其他端口无需携带TOKEN</li></ul><p>默认值：DEFAULT</p>
     * @param AuthMode <p>沙箱访问认证模式</p><p>枚举值：</p><ul><li>DEFAULT： 默认，即 TOKEN 认证</li><li>TOKEN： Token认证，即所有端口访问都需携带TOKEN</li><li>NONE： 免认证，即所有端口访问无需携带TOKEN</li><li>PUBLIC： 公开模式，即ENVD管理端口（49983）访问需携带TOKEN，其他端口无需携带TOKEN</li></ul><p>默认值：DEFAULT</p>
     */
    public void setAuthMode(String AuthMode) {
        this.AuthMode = AuthMode;
    }

    /**
     * Get <p>沙箱元数据</p> 
     * @return Metadata <p>沙箱元数据</p>
     */
    public MetadataVar [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>沙箱元数据</p>
     * @param Metadata <p>沙箱元数据</p>
     */
    public void setMetadata(MetadataVar [] Metadata) {
        this.Metadata = Metadata;
    }

    public StartSandboxInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartSandboxInstanceRequest(StartSandboxInstanceRequest source) {
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.Timeout != null) {
            this.Timeout = new String(source.Timeout);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.MountOptions != null) {
            this.MountOptions = new MountOption[source.MountOptions.length];
            for (int i = 0; i < source.MountOptions.length; i++) {
                this.MountOptions[i] = new MountOption(source.MountOptions[i]);
            }
        }
        if (source.CustomConfiguration != null) {
            this.CustomConfiguration = new CustomConfiguration(source.CustomConfiguration);
        }
        if (source.AuthMode != null) {
            this.AuthMode = new String(source.AuthMode);
        }
        if (source.Metadata != null) {
            this.Metadata = new MetadataVar[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new MetadataVar(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArrayObj(map, prefix + "MountOptions.", this.MountOptions);
        this.setParamObj(map, prefix + "CustomConfiguration.", this.CustomConfiguration);
        this.setParamSimple(map, prefix + "AuthMode", this.AuthMode);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

