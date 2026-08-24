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

public class Deployment extends AbstractModel {

    /**
    * <p>Deployment 稳定 ID，格式为 dpl- 加 8 位小写 base36 字符。</p>
    */
    @SerializedName("DeploymentId")
    @Expose
    private String DeploymentId;

    /**
    * <p>唯一且创建后不可修改的名称，必须符合 DNS-1123 命名规范。</p>
    */
    @SerializedName("DeploymentName")
    @Expose
    private String DeploymentName;

    /**
    * <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>完整的活跃容量配置。</p>
    */
    @SerializedName("ScalingConfiguration")
    @Expose
    private ScalingConfiguration ScalingConfiguration;

    /**
    * <p>完整的空闲生命周期配置。</p>
    */
    @SerializedName("LifecycleConfiguration")
    @Expose
    private LifecycleConfiguration LifecycleConfiguration;

    /**
    * <p>可选 Affinity 配置；未启用时省略。</p>
    */
    @SerializedName("AffinityConfiguration")
    @Expose
    private AffinityConfiguration AffinityConfiguration;

    /**
    * <p>Deployment 控制面状态。</p><p>枚举值：</p><ul><li>ACTIVE：入口可用。</li><li>DELETING：入口已关闭并正在异步删除。</li><li>DELETE_FAILED：最近一次异步删除失败，可再次调用 DeleteDeployment。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>DELETE_FAILED 状态下 1..1024 个 UTF-8 字节的安全失败摘要，格式为 {Code}[.{SubCode}]: {Message}；其他状态省略。</p>
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * <p>创建时间，UTC、秒精度 RFC3339 格式。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>最近一次成功公共配置写入或 Deployment 状态迁移时间，UTC、秒精度 RFC3339 格式。</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>Deployment 稳定 ID，格式为 dpl- 加 8 位小写 base36 字符。</p> 
     * @return DeploymentId <p>Deployment 稳定 ID，格式为 dpl- 加 8 位小写 base36 字符。</p>
     */
    public String getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>Deployment 稳定 ID，格式为 dpl- 加 8 位小写 base36 字符。</p>
     * @param DeploymentId <p>Deployment 稳定 ID，格式为 dpl- 加 8 位小写 base36 字符。</p>
     */
    public void setDeploymentId(String DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    /**
     * Get <p>唯一且创建后不可修改的名称，必须符合 DNS-1123 命名规范。</p> 
     * @return DeploymentName <p>唯一且创建后不可修改的名称，必须符合 DNS-1123 命名规范。</p>
     */
    public String getDeploymentName() {
        return this.DeploymentName;
    }

    /**
     * Set <p>唯一且创建后不可修改的名称，必须符合 DNS-1123 命名规范。</p>
     * @param DeploymentName <p>唯一且创建后不可修改的名称，必须符合 DNS-1123 命名规范。</p>
     */
    public void setDeploymentName(String DeploymentName) {
        this.DeploymentName = DeploymentName;
    }

    /**
     * Get <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p> 
     * @return ToolId <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p>
     * @param ToolId <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>完整的活跃容量配置。</p> 
     * @return ScalingConfiguration <p>完整的活跃容量配置。</p>
     */
    public ScalingConfiguration getScalingConfiguration() {
        return this.ScalingConfiguration;
    }

    /**
     * Set <p>完整的活跃容量配置。</p>
     * @param ScalingConfiguration <p>完整的活跃容量配置。</p>
     */
    public void setScalingConfiguration(ScalingConfiguration ScalingConfiguration) {
        this.ScalingConfiguration = ScalingConfiguration;
    }

    /**
     * Get <p>完整的空闲生命周期配置。</p> 
     * @return LifecycleConfiguration <p>完整的空闲生命周期配置。</p>
     */
    public LifecycleConfiguration getLifecycleConfiguration() {
        return this.LifecycleConfiguration;
    }

    /**
     * Set <p>完整的空闲生命周期配置。</p>
     * @param LifecycleConfiguration <p>完整的空闲生命周期配置。</p>
     */
    public void setLifecycleConfiguration(LifecycleConfiguration LifecycleConfiguration) {
        this.LifecycleConfiguration = LifecycleConfiguration;
    }

    /**
     * Get <p>可选 Affinity 配置；未启用时省略。</p> 
     * @return AffinityConfiguration <p>可选 Affinity 配置；未启用时省略。</p>
     */
    public AffinityConfiguration getAffinityConfiguration() {
        return this.AffinityConfiguration;
    }

    /**
     * Set <p>可选 Affinity 配置；未启用时省略。</p>
     * @param AffinityConfiguration <p>可选 Affinity 配置；未启用时省略。</p>
     */
    public void setAffinityConfiguration(AffinityConfiguration AffinityConfiguration) {
        this.AffinityConfiguration = AffinityConfiguration;
    }

    /**
     * Get <p>Deployment 控制面状态。</p><p>枚举值：</p><ul><li>ACTIVE：入口可用。</li><li>DELETING：入口已关闭并正在异步删除。</li><li>DELETE_FAILED：最近一次异步删除失败，可再次调用 DeleteDeployment。</li></ul> 
     * @return Status <p>Deployment 控制面状态。</p><p>枚举值：</p><ul><li>ACTIVE：入口可用。</li><li>DELETING：入口已关闭并正在异步删除。</li><li>DELETE_FAILED：最近一次异步删除失败，可再次调用 DeleteDeployment。</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Deployment 控制面状态。</p><p>枚举值：</p><ul><li>ACTIVE：入口可用。</li><li>DELETING：入口已关闭并正在异步删除。</li><li>DELETE_FAILED：最近一次异步删除失败，可再次调用 DeleteDeployment。</li></ul>
     * @param Status <p>Deployment 控制面状态。</p><p>枚举值：</p><ul><li>ACTIVE：入口可用。</li><li>DELETING：入口已关闭并正在异步删除。</li><li>DELETE_FAILED：最近一次异步删除失败，可再次调用 DeleteDeployment。</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>DELETE_FAILED 状态下 1..1024 个 UTF-8 字节的安全失败摘要，格式为 {Code}[.{SubCode}]: {Message}；其他状态省略。</p> 
     * @return StatusReason <p>DELETE_FAILED 状态下 1..1024 个 UTF-8 字节的安全失败摘要，格式为 {Code}[.{SubCode}]: {Message}；其他状态省略。</p>
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set <p>DELETE_FAILED 状态下 1..1024 个 UTF-8 字节的安全失败摘要，格式为 {Code}[.{SubCode}]: {Message}；其他状态省略。</p>
     * @param StatusReason <p>DELETE_FAILED 状态下 1..1024 个 UTF-8 字节的安全失败摘要，格式为 {Code}[.{SubCode}]: {Message}；其他状态省略。</p>
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get <p>创建时间，UTC、秒精度 RFC3339 格式。</p> 
     * @return CreatedTime <p>创建时间，UTC、秒精度 RFC3339 格式。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间，UTC、秒精度 RFC3339 格式。</p>
     * @param CreatedTime <p>创建时间，UTC、秒精度 RFC3339 格式。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>最近一次成功公共配置写入或 Deployment 状态迁移时间，UTC、秒精度 RFC3339 格式。</p> 
     * @return UpdatedTime <p>最近一次成功公共配置写入或 Deployment 状态迁移时间，UTC、秒精度 RFC3339 格式。</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>最近一次成功公共配置写入或 Deployment 状态迁移时间，UTC、秒精度 RFC3339 格式。</p>
     * @param UpdatedTime <p>最近一次成功公共配置写入或 Deployment 状态迁移时间，UTC、秒精度 RFC3339 格式。</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public Deployment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Deployment(Deployment source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
        if (source.DeploymentName != null) {
            this.DeploymentName = new String(source.DeploymentName);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.ScalingConfiguration != null) {
            this.ScalingConfiguration = new ScalingConfiguration(source.ScalingConfiguration);
        }
        if (source.LifecycleConfiguration != null) {
            this.LifecycleConfiguration = new LifecycleConfiguration(source.LifecycleConfiguration);
        }
        if (source.AffinityConfiguration != null) {
            this.AffinityConfiguration = new AffinityConfiguration(source.AffinityConfiguration);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusReason != null) {
            this.StatusReason = new String(source.StatusReason);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamSimple(map, prefix + "DeploymentName", this.DeploymentName);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamObj(map, prefix + "ScalingConfiguration.", this.ScalingConfiguration);
        this.setParamObj(map, prefix + "LifecycleConfiguration.", this.LifecycleConfiguration);
        this.setParamObj(map, prefix + "AffinityConfiguration.", this.AffinityConfiguration);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

