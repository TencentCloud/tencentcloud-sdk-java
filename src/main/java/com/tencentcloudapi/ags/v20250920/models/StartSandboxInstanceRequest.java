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
    * 沙箱工具 ID，与 ToolName 至少有一个要填
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * 沙箱工具名称，与 ToolId 至少有一个要填
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * 超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h
    */
    @SerializedName("Timeout")
    @Expose
    private String Timeout;

    /**
    * 幂等性 Token，长度不超过 64 字符
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 沙箱实例存储挂载配置
    */
    @SerializedName("MountOptions")
    @Expose
    private MountOption [] MountOptions;

    /**
    * 沙箱实例自定义配置
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private CustomConfiguration CustomConfiguration;

    /**
     * Get 沙箱工具 ID，与 ToolName 至少有一个要填 
     * @return ToolId 沙箱工具 ID，与 ToolName 至少有一个要填
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set 沙箱工具 ID，与 ToolName 至少有一个要填
     * @param ToolId 沙箱工具 ID，与 ToolName 至少有一个要填
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get 沙箱工具名称，与 ToolId 至少有一个要填 
     * @return ToolName 沙箱工具名称，与 ToolId 至少有一个要填
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set 沙箱工具名称，与 ToolId 至少有一个要填
     * @param ToolName 沙箱工具名称，与 ToolId 至少有一个要填
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get 超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h 
     * @return Timeout 超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h
     */
    public String getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h
     * @param Timeout 超时时间，超过这个时间就自动回收实例。支持格式：5m、300s、1h 等，默认 5m。最小 30s，最大 24h
     */
    public void setTimeout(String Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 幂等性 Token，长度不超过 64 字符 
     * @return ClientToken 幂等性 Token，长度不超过 64 字符
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 幂等性 Token，长度不超过 64 字符
     * @param ClientToken 幂等性 Token，长度不超过 64 字符
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 沙箱实例存储挂载配置 
     * @return MountOptions 沙箱实例存储挂载配置
     */
    public MountOption [] getMountOptions() {
        return this.MountOptions;
    }

    /**
     * Set 沙箱实例存储挂载配置
     * @param MountOptions 沙箱实例存储挂载配置
     */
    public void setMountOptions(MountOption [] MountOptions) {
        this.MountOptions = MountOptions;
    }

    /**
     * Get 沙箱实例自定义配置 
     * @return CustomConfiguration 沙箱实例自定义配置
     */
    public CustomConfiguration getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set 沙箱实例自定义配置
     * @param CustomConfiguration 沙箱实例自定义配置
     */
    public void setCustomConfiguration(CustomConfiguration CustomConfiguration) {
        this.CustomConfiguration = CustomConfiguration;
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

    }
}

