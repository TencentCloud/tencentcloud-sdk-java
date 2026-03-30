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

public class SandboxInstance extends AbstractModel {

    /**
    * <p>沙箱实例唯一标识符</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>所属沙箱工具 ID</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>所属沙箱工具名称</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态）</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>超时时间（秒），null 表示无超时设置</p>
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * <p>过期时间（ISO 8601 格式），null 表示无过期时间</p>
    */
    @SerializedName("ExpiresAt")
    @Expose
    private String ExpiresAt;

    /**
    * <p>停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error</p>
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * <p>创建时间（ISO 8601 格式）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间（ISO 8601 格式）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>存储挂载选项</p>
    */
    @SerializedName("MountOptions")
    @Expose
    private MountOption [] MountOptions;

    /**
    * <p>沙箱实例自定义配置</p>
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private CustomConfigurationDetail CustomConfiguration;

    /**
    * <p>网络模式</p><p>枚举值：</p><ul><li>PUBLIC： 公网访问</li><li>SANDBOX： 无网络</li><li>INTERNAL_SERVICE： 腾讯云内部公共服务</li></ul><p>可以覆盖工具级别的网络配置。但如果一个工具本身就不支持 VPC 网络，那么即便在实例设置里选了 VPC 模式，也是无效的</p>
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
    * <p>沙箱实例元数据</p>
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataVar [] Metadata;

    /**
     * Get <p>沙箱实例唯一标识符</p> 
     * @return InstanceId <p>沙箱实例唯一标识符</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>沙箱实例唯一标识符</p>
     * @param InstanceId <p>沙箱实例唯一标识符</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>所属沙箱工具 ID</p> 
     * @return ToolId <p>所属沙箱工具 ID</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>所属沙箱工具 ID</p>
     * @param ToolId <p>所属沙箱工具 ID</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>所属沙箱工具名称</p> 
     * @return ToolName <p>所属沙箱工具名称</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>所属沙箱工具名称</p>
     * @param ToolName <p>所属沙箱工具名称</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态）</p> 
     * @return Status <p>实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态）</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态）</p>
     * @param Status <p>实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态）</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>超时时间（秒），null 表示无超时设置</p> 
     * @return TimeoutSeconds <p>超时时间（秒），null 表示无超时设置</p>
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set <p>超时时间（秒），null 表示无超时设置</p>
     * @param TimeoutSeconds <p>超时时间（秒），null 表示无超时设置</p>
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get <p>过期时间（ISO 8601 格式），null 表示无过期时间</p> 
     * @return ExpiresAt <p>过期时间（ISO 8601 格式），null 表示无过期时间</p>
     */
    public String getExpiresAt() {
        return this.ExpiresAt;
    }

    /**
     * Set <p>过期时间（ISO 8601 格式），null 表示无过期时间</p>
     * @param ExpiresAt <p>过期时间（ISO 8601 格式），null 表示无过期时间</p>
     */
    public void setExpiresAt(String ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }

    /**
     * Get <p>停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error</p> 
     * @return StopReason <p>停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error</p>
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set <p>停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error</p>
     * @param StopReason <p>停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error</p>
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get <p>创建时间（ISO 8601 格式）</p> 
     * @return CreateTime <p>创建时间（ISO 8601 格式）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（ISO 8601 格式）</p>
     * @param CreateTime <p>创建时间（ISO 8601 格式）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（ISO 8601 格式）</p> 
     * @return UpdateTime <p>更新时间（ISO 8601 格式）</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（ISO 8601 格式）</p>
     * @param UpdateTime <p>更新时间（ISO 8601 格式）</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>存储挂载选项</p> 
     * @return MountOptions <p>存储挂载选项</p>
     */
    public MountOption [] getMountOptions() {
        return this.MountOptions;
    }

    /**
     * Set <p>存储挂载选项</p>
     * @param MountOptions <p>存储挂载选项</p>
     */
    public void setMountOptions(MountOption [] MountOptions) {
        this.MountOptions = MountOptions;
    }

    /**
     * Get <p>沙箱实例自定义配置</p> 
     * @return CustomConfiguration <p>沙箱实例自定义配置</p>
     */
    public CustomConfigurationDetail getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set <p>沙箱实例自定义配置</p>
     * @param CustomConfiguration <p>沙箱实例自定义配置</p>
     */
    public void setCustomConfiguration(CustomConfigurationDetail CustomConfiguration) {
        this.CustomConfiguration = CustomConfiguration;
    }

    /**
     * Get <p>网络模式</p><p>枚举值：</p><ul><li>PUBLIC： 公网访问</li><li>SANDBOX： 无网络</li><li>INTERNAL_SERVICE： 腾讯云内部公共服务</li></ul><p>可以覆盖工具级别的网络配置。但如果一个工具本身就不支持 VPC 网络，那么即便在实例设置里选了 VPC 模式，也是无效的</p> 
     * @return NetworkMode <p>网络模式</p><p>枚举值：</p><ul><li>PUBLIC： 公网访问</li><li>SANDBOX： 无网络</li><li>INTERNAL_SERVICE： 腾讯云内部公共服务</li></ul><p>可以覆盖工具级别的网络配置。但如果一个工具本身就不支持 VPC 网络，那么即便在实例设置里选了 VPC 模式，也是无效的</p>
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set <p>网络模式</p><p>枚举值：</p><ul><li>PUBLIC： 公网访问</li><li>SANDBOX： 无网络</li><li>INTERNAL_SERVICE： 腾讯云内部公共服务</li></ul><p>可以覆盖工具级别的网络配置。但如果一个工具本身就不支持 VPC 网络，那么即便在实例设置里选了 VPC 模式，也是无效的</p>
     * @param NetworkMode <p>网络模式</p><p>枚举值：</p><ul><li>PUBLIC： 公网访问</li><li>SANDBOX： 无网络</li><li>INTERNAL_SERVICE： 腾讯云内部公共服务</li></ul><p>可以覆盖工具级别的网络配置。但如果一个工具本身就不支持 VPC 网络，那么即便在实例设置里选了 VPC 模式，也是无效的</p>
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    /**
     * Get <p>沙箱实例元数据</p> 
     * @return Metadata <p>沙箱实例元数据</p>
     */
    public MetadataVar [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>沙箱实例元数据</p>
     * @param Metadata <p>沙箱实例元数据</p>
     */
    public void setMetadata(MetadataVar [] Metadata) {
        this.Metadata = Metadata;
    }

    public SandboxInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SandboxInstance(SandboxInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TimeoutSeconds != null) {
            this.TimeoutSeconds = new Long(source.TimeoutSeconds);
        }
        if (source.ExpiresAt != null) {
            this.ExpiresAt = new String(source.ExpiresAt);
        }
        if (source.StopReason != null) {
            this.StopReason = new String(source.StopReason);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MountOptions != null) {
            this.MountOptions = new MountOption[source.MountOptions.length];
            for (int i = 0; i < source.MountOptions.length; i++) {
                this.MountOptions[i] = new MountOption(source.MountOptions[i]);
            }
        }
        if (source.CustomConfiguration != null) {
            this.CustomConfiguration = new CustomConfigurationDetail(source.CustomConfiguration);
        }
        if (source.NetworkMode != null) {
            this.NetworkMode = new String(source.NetworkMode);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "ExpiresAt", this.ExpiresAt);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "MountOptions.", this.MountOptions);
        this.setParamObj(map, prefix + "CustomConfiguration.", this.CustomConfiguration);
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

