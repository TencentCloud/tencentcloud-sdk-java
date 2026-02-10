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

public class SandboxTool extends AbstractModel {

    /**
    * 沙箱工具唯一标识符
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * 沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * 沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具）
    */
    @SerializedName("ToolType")
    @Expose
    private String ToolType;

    /**
    * 沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 沙箱工具描述信息，最大长度 200 字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时
    */
    @SerializedName("DefaultTimeoutSeconds")
    @Expose
    private Long DefaultTimeoutSeconds;

    /**
    * 网络配置
    */
    @SerializedName("NetworkConfiguration")
    @Expose
    private NetworkConfiguration NetworkConfiguration;

    /**
    * 标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 沙箱工具创建时间，格式：ISO8601
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 沙箱工具更新时间，格式：ISO8601
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 沙箱工具绑定角色ARN
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * 沙箱工具中实例存储挂载配置
    */
    @SerializedName("StorageMounts")
    @Expose
    private StorageMount [] StorageMounts;

    /**
    * 沙箱工具自定义配置
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private CustomConfigurationDetail CustomConfiguration;

    /**
    * 沙箱工具日志推送相关配置
    */
    @SerializedName("LogConfiguration")
    @Expose
    private LogConfiguration LogConfiguration;

    /**
     * Get 沙箱工具唯一标识符 
     * @return ToolId 沙箱工具唯一标识符
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set 沙箱工具唯一标识符
     * @param ToolId 沙箱工具唯一标识符
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get 沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一 
     * @return ToolName 沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set 沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一
     * @param ToolName 沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get 沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具） 
     * @return ToolType 沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具）
     */
    public String getToolType() {
        return this.ToolType;
    }

    /**
     * Set 沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具）
     * @param ToolType 沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具）
     */
    public void setToolType(String ToolType) {
        this.ToolType = ToolType;
    }

    /**
     * Get 沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败） 
     * @return Status 沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败）
     * @param Status 沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 沙箱工具描述信息，最大长度 200 字符 
     * @return Description 沙箱工具描述信息，最大长度 200 字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 沙箱工具描述信息，最大长度 200 字符
     * @param Description 沙箱工具描述信息，最大长度 200 字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时 
     * @return DefaultTimeoutSeconds 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时
     */
    public Long getDefaultTimeoutSeconds() {
        return this.DefaultTimeoutSeconds;
    }

    /**
     * Set 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时
     * @param DefaultTimeoutSeconds 默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时
     */
    public void setDefaultTimeoutSeconds(Long DefaultTimeoutSeconds) {
        this.DefaultTimeoutSeconds = DefaultTimeoutSeconds;
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
     * Get 标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定 
     * @return Tags 标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定
     * @param Tags 标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 沙箱工具创建时间，格式：ISO8601 
     * @return CreateTime 沙箱工具创建时间，格式：ISO8601
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 沙箱工具创建时间，格式：ISO8601
     * @param CreateTime 沙箱工具创建时间，格式：ISO8601
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 沙箱工具更新时间，格式：ISO8601 
     * @return UpdateTime 沙箱工具更新时间，格式：ISO8601
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 沙箱工具更新时间，格式：ISO8601
     * @param UpdateTime 沙箱工具更新时间，格式：ISO8601
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 沙箱工具绑定角色ARN 
     * @return RoleArn 沙箱工具绑定角色ARN
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 沙箱工具绑定角色ARN
     * @param RoleArn 沙箱工具绑定角色ARN
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 沙箱工具中实例存储挂载配置 
     * @return StorageMounts 沙箱工具中实例存储挂载配置
     */
    public StorageMount [] getStorageMounts() {
        return this.StorageMounts;
    }

    /**
     * Set 沙箱工具中实例存储挂载配置
     * @param StorageMounts 沙箱工具中实例存储挂载配置
     */
    public void setStorageMounts(StorageMount [] StorageMounts) {
        this.StorageMounts = StorageMounts;
    }

    /**
     * Get 沙箱工具自定义配置 
     * @return CustomConfiguration 沙箱工具自定义配置
     */
    public CustomConfigurationDetail getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set 沙箱工具自定义配置
     * @param CustomConfiguration 沙箱工具自定义配置
     */
    public void setCustomConfiguration(CustomConfigurationDetail CustomConfiguration) {
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

    public SandboxTool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SandboxTool(SandboxTool source) {
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.ToolType != null) {
            this.ToolType = new String(source.ToolType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DefaultTimeoutSeconds != null) {
            this.DefaultTimeoutSeconds = new Long(source.DefaultTimeoutSeconds);
        }
        if (source.NetworkConfiguration != null) {
            this.NetworkConfiguration = new NetworkConfiguration(source.NetworkConfiguration);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
            this.CustomConfiguration = new CustomConfigurationDetail(source.CustomConfiguration);
        }
        if (source.LogConfiguration != null) {
            this.LogConfiguration = new LogConfiguration(source.LogConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "ToolType", this.ToolType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DefaultTimeoutSeconds", this.DefaultTimeoutSeconds);
        this.setParamObj(map, prefix + "NetworkConfiguration.", this.NetworkConfiguration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamArrayObj(map, prefix + "StorageMounts.", this.StorageMounts);
        this.setParamObj(map, prefix + "CustomConfiguration.", this.CustomConfiguration);
        this.setParamObj(map, prefix + "LogConfiguration.", this.LogConfiguration);

    }
}

