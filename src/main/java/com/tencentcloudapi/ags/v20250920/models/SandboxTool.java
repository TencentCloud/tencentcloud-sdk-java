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
    * <p>沙箱工具唯一标识符</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具）</p>
    */
    @SerializedName("ToolType")
    @Expose
    private String ToolType;

    /**
    * <p>沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败）</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>沙箱工具描述信息，最大长度 200 字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p>
    */
    @SerializedName("DefaultTimeoutSeconds")
    @Expose
    private Long DefaultTimeoutSeconds;

    /**
    * <p>网络配置</p>
    */
    @SerializedName("NetworkConfiguration")
    @Expose
    private NetworkConfiguration NetworkConfiguration;

    /**
    * <p>标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>沙箱工具创建时间，格式：ISO8601</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>沙箱工具更新时间，格式：ISO8601</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>沙箱工具绑定角色ARN</p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>沙箱工具中实例存储挂载配置</p>
    */
    @SerializedName("StorageMounts")
    @Expose
    private StorageMount [] StorageMounts;

    /**
    * <p>沙箱工具自定义配置</p>
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private CustomConfigurationDetail CustomConfiguration;

    /**
    * <p>沙箱工具日志推送相关配置</p>
    */
    @SerializedName("LogConfiguration")
    @Expose
    private LogConfiguration LogConfiguration;

    /**
    * <p>用于说明沙箱工具处于该状态的原因</p>
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
     * Get <p>沙箱工具唯一标识符</p> 
     * @return ToolId <p>沙箱工具唯一标识符</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>沙箱工具唯一标识符</p>
     * @param ToolId <p>沙箱工具唯一标识符</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一</p> 
     * @return ToolName <p>沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一</p>
     * @param ToolName <p>沙箱工具名称，长度 1-50 字符，支持中英文、数字、下划线。同一 AppId 下沙箱工具名称必须唯一</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具）</p> 
     * @return ToolType <p>沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具）</p>
     */
    public String getToolType() {
        return this.ToolType;
    }

    /**
     * Set <p>沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具）</p>
     * @param ToolType <p>沙箱工具类型，取值：browser（浏览器工具）、code-interpreter（代码解释器工具）、computer（计算机控制工具）、mobile（移动设备工具）</p>
     */
    public void setToolType(String ToolType) {
        this.ToolType = ToolType;
    }

    /**
     * Get <p>沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败）</p> 
     * @return Status <p>沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败）</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败）</p>
     * @param Status <p>沙箱工具状态，取值：CREATING（创建中）、ACTIVE（可用）、DELETING（删除中）、FAILED（失败）</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>沙箱工具描述信息，最大长度 200 字符</p> 
     * @return Description <p>沙箱工具描述信息，最大长度 200 字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>沙箱工具描述信息，最大长度 200 字符</p>
     * @param Description <p>沙箱工具描述信息，最大长度 200 字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p> 
     * @return DefaultTimeoutSeconds <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p>
     */
    public Long getDefaultTimeoutSeconds() {
        return this.DefaultTimeoutSeconds;
    }

    /**
     * Set <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p>
     * @param DefaultTimeoutSeconds <p>默认超时时间，支持格式：5m、300s、1h 等，不指定则使用系统默认值（5 分钟）。最大 24 小时</p>
     */
    public void setDefaultTimeoutSeconds(Long DefaultTimeoutSeconds) {
        this.DefaultTimeoutSeconds = DefaultTimeoutSeconds;
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
     * Get <p>标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定</p> 
     * @return Tags <p>标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定</p>
     * @param Tags <p>标签规格，包含资源标签绑定关系。用于为沙箱工具绑定标签，支持多种资源类型的标签绑定</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>沙箱工具创建时间，格式：ISO8601</p> 
     * @return CreateTime <p>沙箱工具创建时间，格式：ISO8601</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>沙箱工具创建时间，格式：ISO8601</p>
     * @param CreateTime <p>沙箱工具创建时间，格式：ISO8601</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>沙箱工具更新时间，格式：ISO8601</p> 
     * @return UpdateTime <p>沙箱工具更新时间，格式：ISO8601</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>沙箱工具更新时间，格式：ISO8601</p>
     * @param UpdateTime <p>沙箱工具更新时间，格式：ISO8601</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>沙箱工具绑定角色ARN</p> 
     * @return RoleArn <p>沙箱工具绑定角色ARN</p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>沙箱工具绑定角色ARN</p>
     * @param RoleArn <p>沙箱工具绑定角色ARN</p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>沙箱工具中实例存储挂载配置</p> 
     * @return StorageMounts <p>沙箱工具中实例存储挂载配置</p>
     */
    public StorageMount [] getStorageMounts() {
        return this.StorageMounts;
    }

    /**
     * Set <p>沙箱工具中实例存储挂载配置</p>
     * @param StorageMounts <p>沙箱工具中实例存储挂载配置</p>
     */
    public void setStorageMounts(StorageMount [] StorageMounts) {
        this.StorageMounts = StorageMounts;
    }

    /**
     * Get <p>沙箱工具自定义配置</p> 
     * @return CustomConfiguration <p>沙箱工具自定义配置</p>
     */
    public CustomConfigurationDetail getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set <p>沙箱工具自定义配置</p>
     * @param CustomConfiguration <p>沙箱工具自定义配置</p>
     */
    public void setCustomConfiguration(CustomConfigurationDetail CustomConfiguration) {
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
     * Get <p>用于说明沙箱工具处于该状态的原因</p> 
     * @return StatusReason <p>用于说明沙箱工具处于该状态的原因</p>
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set <p>用于说明沙箱工具处于该状态的原因</p>
     * @param StatusReason <p>用于说明沙箱工具处于该状态的原因</p>
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
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
        if (source.StatusReason != null) {
            this.StatusReason = new String(source.StatusReason);
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
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);

    }
}

