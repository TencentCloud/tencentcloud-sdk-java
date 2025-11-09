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
    * 沙箱实例唯一标识符
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 所属沙箱工具 ID
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * 所属沙箱工具名称
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * 实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 超时时间（秒），null 表示无超时设置
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * 过期时间（ISO 8601 格式），null 表示无过期时间
    */
    @SerializedName("ExpiresAt")
    @Expose
    private String ExpiresAt;

    /**
    * 停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * 创建时间（ISO 8601 格式）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间（ISO 8601 格式）
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 沙箱实例唯一标识符 
     * @return InstanceId 沙箱实例唯一标识符
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 沙箱实例唯一标识符
     * @param InstanceId 沙箱实例唯一标识符
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 所属沙箱工具 ID 
     * @return ToolId 所属沙箱工具 ID
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set 所属沙箱工具 ID
     * @param ToolId 所属沙箱工具 ID
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get 所属沙箱工具名称 
     * @return ToolName 所属沙箱工具名称
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set 所属沙箱工具名称
     * @param ToolName 所属沙箱工具名称
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get 实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态） 
     * @return Status 实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态）
     * @param Status 实例状态：STARTING（启动中）、RUNNING（运行中）、STOPPING（停止中）、STOPPED（已停止）、STOP_FAILED（停止失败）、FAILED（失败状态）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 超时时间（秒），null 表示无超时设置 
     * @return TimeoutSeconds 超时时间（秒），null 表示无超时设置
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set 超时时间（秒），null 表示无超时设置
     * @param TimeoutSeconds 超时时间（秒），null 表示无超时设置
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get 过期时间（ISO 8601 格式），null 表示无过期时间 
     * @return ExpiresAt 过期时间（ISO 8601 格式），null 表示无过期时间
     */
    public String getExpiresAt() {
        return this.ExpiresAt;
    }

    /**
     * Set 过期时间（ISO 8601 格式），null 表示无过期时间
     * @param ExpiresAt 过期时间（ISO 8601 格式），null 表示无过期时间
     */
    public void setExpiresAt(String ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }

    /**
     * Get 停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error 
     * @return StopReason 停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set 停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error
     * @param StopReason 停止原因：manual（手动）、timeout（超时）、error（错误）、system（系统），仅在状态为 STOPPED、STOP_FAILED 或 FAILED 时有值。当 provider 停止失败时，状态为 STOP_FAILED，原因为 error
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get 创建时间（ISO 8601 格式） 
     * @return CreateTime 创建时间（ISO 8601 格式）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间（ISO 8601 格式）
     * @param CreateTime 创建时间（ISO 8601 格式）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间（ISO 8601 格式） 
     * @return UpdateTime 更新时间（ISO 8601 格式）
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间（ISO 8601 格式）
     * @param UpdateTime 更新时间（ISO 8601 格式）
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    }
}

