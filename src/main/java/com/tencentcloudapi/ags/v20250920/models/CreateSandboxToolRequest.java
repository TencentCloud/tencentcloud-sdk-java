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

public class CreateSandboxToolRequest extends AbstractModel {

    /**
    * 沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * 沙箱工具类型，目前支持：browser、code-interpreter、custom
    */
    @SerializedName("ToolType")
    @Expose
    private String ToolType;

    /**
    * 网络配置
    */
    @SerializedName("NetworkConfiguration")
    @Expose
    private NetworkConfiguration NetworkConfiguration;

    /**
    * 沙箱工具描述，最大长度 200 字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时
    */
    @SerializedName("DefaultTimeout")
    @Expose
    private String DefaultTimeout;

    /**
    * 标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 幂等性 Token，长度不超过 64 字符
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 角色ARN
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * 沙箱工具存储配置
    */
    @SerializedName("StorageMounts")
    @Expose
    private StorageMount [] StorageMounts;

    /**
    * 沙箱工具自定义配置
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private CustomConfiguration CustomConfiguration;

    /**
    * 沙箱工具日志推送相关配置
    */
    @SerializedName("LogConfiguration")
    @Expose
    private LogConfiguration LogConfiguration;

    /**
     * Get 沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一 
     * @return ToolName 沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set 沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一
     * @param ToolName 沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get 沙箱工具类型，目前支持：browser、code-interpreter、custom 
     * @return ToolType 沙箱工具类型，目前支持：browser、code-interpreter、custom
     */
    public String getToolType() {
        return this.ToolType;
    }

    /**
     * Set 沙箱工具类型，目前支持：browser、code-interpreter、custom
     * @param ToolType 沙箱工具类型，目前支持：browser、code-interpreter、custom
     */
    public void setToolType(String ToolType) {
        this.ToolType = ToolType;
    }

    /**
     * Get 网络配置 
     * @return NetworkConfiguration 网络配置
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.NetworkConfiguration;
    }

    /**
     * Set 网络配置
     * @param NetworkConfiguration 网络配置
     */
    public void setNetworkConfiguration(NetworkConfiguration NetworkConfiguration) {
        this.NetworkConfiguration = NetworkConfiguration;
    }

    /**
     * Get 沙箱工具描述，最大长度 200 字符 
     * @return Description 沙箱工具描述，最大长度 200 字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 沙箱工具描述，最大长度 200 字符
     * @param Description 沙箱工具描述，最大长度 200 字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时 
     * @return DefaultTimeout 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时
     */
    public String getDefaultTimeout() {
        return this.DefaultTimeout;
    }

    /**
     * Set 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时
     * @param DefaultTimeout 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时
     */
    public void setDefaultTimeout(String DefaultTimeout) {
        this.DefaultTimeout = DefaultTimeout;
    }

    /**
     * Get 标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定 
     * @return Tags 标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定
     * @param Tags 标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
     * Get 角色ARN 
     * @return RoleArn 角色ARN
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色ARN
     * @param RoleArn 角色ARN
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 沙箱工具存储配置 
     * @return StorageMounts 沙箱工具存储配置
     */
    public StorageMount [] getStorageMounts() {
        return this.StorageMounts;
    }

    /**
     * Set 沙箱工具存储配置
     * @param StorageMounts 沙箱工具存储配置
     */
    public void setStorageMounts(StorageMount [] StorageMounts) {
        this.StorageMounts = StorageMounts;
    }

    /**
     * Get 沙箱工具自定义配置 
     * @return CustomConfiguration 沙箱工具自定义配置
     */
    public CustomConfiguration getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set 沙箱工具自定义配置
     * @param CustomConfiguration 沙箱工具自定义配置
     */
    public void setCustomConfiguration(CustomConfiguration CustomConfiguration) {
        this.CustomConfiguration = CustomConfiguration;
    }

    /**
     * Get 沙箱工具日志推送相关配置 
     * @return LogConfiguration 沙箱工具日志推送相关配置
     */
    public LogConfiguration getLogConfiguration() {
        return this.LogConfiguration;
    }

    /**
     * Set 沙箱工具日志推送相关配置
     * @param LogConfiguration 沙箱工具日志推送相关配置
     */
    public void setLogConfiguration(LogConfiguration LogConfiguration) {
        this.LogConfiguration = LogConfiguration;
    }

    public CreateSandboxToolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSandboxToolRequest(CreateSandboxToolRequest source) {
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.ToolType != null) {
            this.ToolType = new String(source.ToolType);
        }
        if (source.NetworkConfiguration != null) {
            this.NetworkConfiguration = new NetworkConfiguration(source.NetworkConfiguration);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DefaultTimeout != null) {
            this.DefaultTimeout = new String(source.DefaultTimeout);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.StorageMounts != null) {
            this.StorageMounts = new StorageMount[source.StorageMounts.length];
            for (int i = 0; i < source.StorageMounts.length; i++) {
                this.StorageMounts[i] = new StorageMount(source.StorageMounts[i]);
            }
        }
        if (source.CustomConfiguration != null) {
            this.CustomConfiguration = new CustomConfiguration(source.CustomConfiguration);
        }
        if (source.LogConfiguration != null) {
            this.LogConfiguration = new LogConfiguration(source.LogConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "ToolType", this.ToolType);
        this.setParamObj(map, prefix + "NetworkConfiguration.", this.NetworkConfiguration);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DefaultTimeout", this.DefaultTimeout);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamArrayObj(map, prefix + "StorageMounts.", this.StorageMounts);
        this.setParamObj(map, prefix + "CustomConfiguration.", this.CustomConfiguration);
        this.setParamObj(map, prefix + "LogConfiguration.", this.LogConfiguration);

    }
}

