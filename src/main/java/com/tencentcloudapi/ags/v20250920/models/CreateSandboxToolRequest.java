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
    * <p>沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>沙箱工具类型，目前支持：browser、code-interpreter、custom</p>
    */
    @SerializedName("ToolType")
    @Expose
    private String ToolType;

    /**
    * <p>网络配置</p>
    */
    @SerializedName("NetworkConfiguration")
    @Expose
    private NetworkConfiguration NetworkConfiguration;

    /**
    * <p>沙箱工具描述，最大长度 200 字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p>
    */
    @SerializedName("DefaultTimeout")
    @Expose
    private String DefaultTimeout;

    /**
    * <p>标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>幂等性 Token，长度不超过 64 字符</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>角色ARN</p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>沙箱工具存储配置</p>
    */
    @SerializedName("StorageMounts")
    @Expose
    private StorageMount [] StorageMounts;

    /**
    * <p>沙箱工具自定义配置</p>
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private CustomConfiguration CustomConfiguration;

    /**
    * <p>沙箱工具日志推送相关配置</p>
    */
    @SerializedName("LogConfiguration")
    @Expose
    private LogConfiguration LogConfiguration;

    /**
    * <p>常驻沙箱标识</p>
    */
    @SerializedName("Persistent")
    @Expose
    private Boolean Persistent;

    /**
     * Get <p>沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一</p> 
     * @return ToolName <p>沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一</p>
     * @param ToolName <p>沙箱工具名称，长度 1-50 字符，支持英文、数字、下划线和连接线。同一 AppId 下沙箱工具名称必须唯一</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>沙箱工具类型，目前支持：browser、code-interpreter、custom</p> 
     * @return ToolType <p>沙箱工具类型，目前支持：browser、code-interpreter、custom</p>
     */
    public String getToolType() {
        return this.ToolType;
    }

    /**
     * Set <p>沙箱工具类型，目前支持：browser、code-interpreter、custom</p>
     * @param ToolType <p>沙箱工具类型，目前支持：browser、code-interpreter、custom</p>
     */
    public void setToolType(String ToolType) {
        this.ToolType = ToolType;
    }

    /**
     * Get <p>网络配置</p> 
     * @return NetworkConfiguration <p>网络配置</p>
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.NetworkConfiguration;
    }

    /**
     * Set <p>网络配置</p>
     * @param NetworkConfiguration <p>网络配置</p>
     */
    public void setNetworkConfiguration(NetworkConfiguration NetworkConfiguration) {
        this.NetworkConfiguration = NetworkConfiguration;
    }

    /**
     * Get <p>沙箱工具描述，最大长度 200 字符</p> 
     * @return Description <p>沙箱工具描述，最大长度 200 字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>沙箱工具描述，最大长度 200 字符</p>
     * @param Description <p>沙箱工具描述，最大长度 200 字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p> 
     * @return DefaultTimeout <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p>
     */
    public String getDefaultTimeout() {
        return this.DefaultTimeout;
    }

    /**
     * Set <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p>
     * @param DefaultTimeout <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p>
     */
    public void setDefaultTimeout(String DefaultTimeout) {
        this.DefaultTimeout = DefaultTimeout;
    }

    /**
     * Get <p>标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定</p> 
     * @return Tags <p>标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定</p>
     * @param Tags <p>标签规格，为沙箱工具绑定标签，支持多种资源类型的标签绑定</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
     * Get <p>角色ARN</p> 
     * @return RoleArn <p>角色ARN</p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>角色ARN</p>
     * @param RoleArn <p>角色ARN</p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>沙箱工具存储配置</p> 
     * @return StorageMounts <p>沙箱工具存储配置</p>
     */
    public StorageMount [] getStorageMounts() {
        return this.StorageMounts;
    }

    /**
     * Set <p>沙箱工具存储配置</p>
     * @param StorageMounts <p>沙箱工具存储配置</p>
     */
    public void setStorageMounts(StorageMount [] StorageMounts) {
        this.StorageMounts = StorageMounts;
    }

    /**
     * Get <p>沙箱工具自定义配置</p> 
     * @return CustomConfiguration <p>沙箱工具自定义配置</p>
     */
    public CustomConfiguration getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set <p>沙箱工具自定义配置</p>
     * @param CustomConfiguration <p>沙箱工具自定义配置</p>
     */
    public void setCustomConfiguration(CustomConfiguration CustomConfiguration) {
        this.CustomConfiguration = CustomConfiguration;
    }

    /**
     * Get <p>沙箱工具日志推送相关配置</p> 
     * @return LogConfiguration <p>沙箱工具日志推送相关配置</p>
     */
    public LogConfiguration getLogConfiguration() {
        return this.LogConfiguration;
    }

    /**
     * Set <p>沙箱工具日志推送相关配置</p>
     * @param LogConfiguration <p>沙箱工具日志推送相关配置</p>
     */
    public void setLogConfiguration(LogConfiguration LogConfiguration) {
        this.LogConfiguration = LogConfiguration;
    }

    /**
     * Get <p>常驻沙箱标识</p> 
     * @return Persistent <p>常驻沙箱标识</p>
     */
    public Boolean getPersistent() {
        return this.Persistent;
    }

    /**
     * Set <p>常驻沙箱标识</p>
     * @param Persistent <p>常驻沙箱标识</p>
     */
    public void setPersistent(Boolean Persistent) {
        this.Persistent = Persistent;
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
        if (source.Persistent != null) {
            this.Persistent = new Boolean(source.Persistent);
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
        this.setParamSimple(map, prefix + "Persistent", this.Persistent);

    }
}

