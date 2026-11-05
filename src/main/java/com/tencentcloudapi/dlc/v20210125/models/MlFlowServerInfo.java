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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MlFlowServerInfo extends AbstractModel {

    /**
    * <p>MLflow 实例的 ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * <p>资源分区 ID</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>资源包名</p>
    */
    @SerializedName("ResourcePartitionName")
    @Expose
    private String ResourcePartitionName;

    /**
    * <p>资源组（逻辑队列名，可选）</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>集群内MLflow访问地址。用于训练作业上报 metrics</p>
    */
    @SerializedName("TrackingUri")
    @Expose
    private String TrackingUri;

    /**
    * <p>集群外访问地址（Ingress URL）</p>
    */
    @SerializedName("UiUrl")
    @Expose
    private String UiUrl;

    /**
    * <p>状态：CREATED / CREATING / RUNNING / FAILED / STOPPED</p><p>枚举值：</p><ul><li>CREATED： 已创建</li><li>CREATING： 创建中</li><li>RUNNING： 运行中</li><li>FAILED： 失败</li><li>STOPPED： 已停止</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>仅失败时展示错误信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>MLflow 镜像地址</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>存储配置 JSON，具体结构按 storageMode 解释（cos / cfs / local）</p>
    */
    @SerializedName("StorageConfig")
    @Expose
    private String StorageConfig;

    /**
    * <p>存储模式</p><p>枚举值：</p><ul><li>cos： cos 对象存储</li><li>cfs： cfs 文件系统存储</li></ul>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>启动参数（用户自定义；null = 默认命令，编辑弹窗预填用）</p>
    */
    @SerializedName("ServerArgs")
    @Expose
    private String ServerArgs;

    /**
    * <p>描述信息（纯文本；null = 未填写）</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建者 UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>创建人子账号 UIN（实际提交者，存量数据可能为空）</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>创建人子账号名称（CAM 动态回填，非持久化；查询失败时为空）</p>
    */
    @SerializedName("SubAccountName")
    @Expose
    private String SubAccountName;

    /**
    * <p>创建时间（epoch 毫秒）</p><p>单位：毫秒</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间（epoch 毫秒）</p><p>单位：毫秒</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>资源配置 JSON</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>标签列表（TagKey-TagValue）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>最近一次成功探测 Deployment 的时间（epoch millis，Neutrino 透传）；NULL=尚未成功探测过。</p>
    */
    @SerializedName("LastProbeSuccessTime")
    @Expose
    private Long LastProbeSuccessTime;

    /**
    * <p>最近一次成功探测后的连续失败次数（&gt;0 表示当前 Status 可能过期）</p>
    */
    @SerializedName("ConsecutiveProbeFailures")
    @Expose
    private Long ConsecutiveProbeFailures;

    /**
    * <p>最近一次探测失败原因（Neutrino 透传，仅诊断展示）</p>
    */
    @SerializedName("LastProbeError")
    @Expose
    private String LastProbeError;

    /**
    * <p>关联训练实例总数（ray-nexus 侧统计，仅 ListMlflowServers 返回；详情/监控请用 QueryMlFlowServerInstanceStats）</p>
    */
    @SerializedName("TotalInstanceCount")
    @Expose
    private Long TotalInstanceCount;

    /**
    * <p>关联的运行中（RUNNING）训练实例数（仅 ListMlflowServers 返回；详情/监控请用 QueryMlflowServerInstanceStats）</p>
    */
    @SerializedName("RunningInstanceCount")
    @Expose
    private Long RunningInstanceCount;

    /**
     * Get <p>MLflow 实例的 ID</p> 
     * @return ServerId <p>MLflow 实例的 ID</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MLflow 实例的 ID</p>
     * @param ServerId <p>MLflow 实例的 ID</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return ServerName <p>实例名称</p>
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set <p>实例名称</p>
     * @param ServerName <p>实例名称</p>
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get <p>资源分区 ID</p> 
     * @return ResourcePartitionId <p>资源分区 ID</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>资源分区 ID</p>
     * @param ResourcePartitionId <p>资源分区 ID</p>
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>资源包名</p> 
     * @return ResourcePartitionName <p>资源包名</p>
     */
    public String getResourcePartitionName() {
        return this.ResourcePartitionName;
    }

    /**
     * Set <p>资源包名</p>
     * @param ResourcePartitionName <p>资源包名</p>
     */
    public void setResourcePartitionName(String ResourcePartitionName) {
        this.ResourcePartitionName = ResourcePartitionName;
    }

    /**
     * Get <p>资源组（逻辑队列名，可选）</p> 
     * @return Queue <p>资源组（逻辑队列名，可选）</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>资源组（逻辑队列名，可选）</p>
     * @param Queue <p>资源组（逻辑队列名，可选）</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>集群内MLflow访问地址。用于训练作业上报 metrics</p> 
     * @return TrackingUri <p>集群内MLflow访问地址。用于训练作业上报 metrics</p>
     */
    public String getTrackingUri() {
        return this.TrackingUri;
    }

    /**
     * Set <p>集群内MLflow访问地址。用于训练作业上报 metrics</p>
     * @param TrackingUri <p>集群内MLflow访问地址。用于训练作业上报 metrics</p>
     */
    public void setTrackingUri(String TrackingUri) {
        this.TrackingUri = TrackingUri;
    }

    /**
     * Get <p>集群外访问地址（Ingress URL）</p> 
     * @return UiUrl <p>集群外访问地址（Ingress URL）</p>
     */
    public String getUiUrl() {
        return this.UiUrl;
    }

    /**
     * Set <p>集群外访问地址（Ingress URL）</p>
     * @param UiUrl <p>集群外访问地址（Ingress URL）</p>
     */
    public void setUiUrl(String UiUrl) {
        this.UiUrl = UiUrl;
    }

    /**
     * Get <p>状态：CREATED / CREATING / RUNNING / FAILED / STOPPED</p><p>枚举值：</p><ul><li>CREATED： 已创建</li><li>CREATING： 创建中</li><li>RUNNING： 运行中</li><li>FAILED： 失败</li><li>STOPPED： 已停止</li></ul> 
     * @return Status <p>状态：CREATED / CREATING / RUNNING / FAILED / STOPPED</p><p>枚举值：</p><ul><li>CREATED： 已创建</li><li>CREATING： 创建中</li><li>RUNNING： 运行中</li><li>FAILED： 失败</li><li>STOPPED： 已停止</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：CREATED / CREATING / RUNNING / FAILED / STOPPED</p><p>枚举值：</p><ul><li>CREATED： 已创建</li><li>CREATING： 创建中</li><li>RUNNING： 运行中</li><li>FAILED： 失败</li><li>STOPPED： 已停止</li></ul>
     * @param Status <p>状态：CREATED / CREATING / RUNNING / FAILED / STOPPED</p><p>枚举值：</p><ul><li>CREATED： 已创建</li><li>CREATING： 创建中</li><li>RUNNING： 运行中</li><li>FAILED： 失败</li><li>STOPPED： 已停止</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>仅失败时展示错误信息</p> 
     * @return ErrorMessage <p>仅失败时展示错误信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>仅失败时展示错误信息</p>
     * @param ErrorMessage <p>仅失败时展示错误信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>MLflow 镜像地址</p> 
     * @return Image <p>MLflow 镜像地址</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>MLflow 镜像地址</p>
     * @param Image <p>MLflow 镜像地址</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>存储配置 JSON，具体结构按 storageMode 解释（cos / cfs / local）</p> 
     * @return StorageConfig <p>存储配置 JSON，具体结构按 storageMode 解释（cos / cfs / local）</p>
     */
    public String getStorageConfig() {
        return this.StorageConfig;
    }

    /**
     * Set <p>存储配置 JSON，具体结构按 storageMode 解释（cos / cfs / local）</p>
     * @param StorageConfig <p>存储配置 JSON，具体结构按 storageMode 解释（cos / cfs / local）</p>
     */
    public void setStorageConfig(String StorageConfig) {
        this.StorageConfig = StorageConfig;
    }

    /**
     * Get <p>存储模式</p><p>枚举值：</p><ul><li>cos： cos 对象存储</li><li>cfs： cfs 文件系统存储</li></ul> 
     * @return StorageMode <p>存储模式</p><p>枚举值：</p><ul><li>cos： cos 对象存储</li><li>cfs： cfs 文件系统存储</li></ul>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>存储模式</p><p>枚举值：</p><ul><li>cos： cos 对象存储</li><li>cfs： cfs 文件系统存储</li></ul>
     * @param StorageMode <p>存储模式</p><p>枚举值：</p><ul><li>cos： cos 对象存储</li><li>cfs： cfs 文件系统存储</li></ul>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>启动参数（用户自定义；null = 默认命令，编辑弹窗预填用）</p> 
     * @return ServerArgs <p>启动参数（用户自定义；null = 默认命令，编辑弹窗预填用）</p>
     */
    public String getServerArgs() {
        return this.ServerArgs;
    }

    /**
     * Set <p>启动参数（用户自定义；null = 默认命令，编辑弹窗预填用）</p>
     * @param ServerArgs <p>启动参数（用户自定义；null = 默认命令，编辑弹窗预填用）</p>
     */
    public void setServerArgs(String ServerArgs) {
        this.ServerArgs = ServerArgs;
    }

    /**
     * Get <p>描述信息（纯文本；null = 未填写）</p> 
     * @return Description <p>描述信息（纯文本；null = 未填写）</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息（纯文本；null = 未填写）</p>
     * @param Description <p>描述信息（纯文本；null = 未填写）</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建者 UIN</p> 
     * @return Uin <p>创建者 UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>创建者 UIN</p>
     * @param Uin <p>创建者 UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>创建人子账号 UIN（实际提交者，存量数据可能为空）</p> 
     * @return SubAccountUin <p>创建人子账号 UIN（实际提交者，存量数据可能为空）</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>创建人子账号 UIN（实际提交者，存量数据可能为空）</p>
     * @param SubAccountUin <p>创建人子账号 UIN（实际提交者，存量数据可能为空）</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>创建人子账号名称（CAM 动态回填，非持久化；查询失败时为空）</p> 
     * @return SubAccountName <p>创建人子账号名称（CAM 动态回填，非持久化；查询失败时为空）</p>
     */
    public String getSubAccountName() {
        return this.SubAccountName;
    }

    /**
     * Set <p>创建人子账号名称（CAM 动态回填，非持久化；查询失败时为空）</p>
     * @param SubAccountName <p>创建人子账号名称（CAM 动态回填，非持久化；查询失败时为空）</p>
     */
    public void setSubAccountName(String SubAccountName) {
        this.SubAccountName = SubAccountName;
    }

    /**
     * Get <p>创建时间（epoch 毫秒）</p><p>单位：毫秒</p> 
     * @return CreateTime <p>创建时间（epoch 毫秒）</p><p>单位：毫秒</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（epoch 毫秒）</p><p>单位：毫秒</p>
     * @param CreateTime <p>创建时间（epoch 毫秒）</p><p>单位：毫秒</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（epoch 毫秒）</p><p>单位：毫秒</p> 
     * @return UpdateTime <p>更新时间（epoch 毫秒）</p><p>单位：毫秒</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（epoch 毫秒）</p><p>单位：毫秒</p>
     * @param UpdateTime <p>更新时间（epoch 毫秒）</p><p>单位：毫秒</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>资源配置 JSON</p> 
     * @return ResourceConfig <p>资源配置 JSON</p>
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>资源配置 JSON</p>
     * @param ResourceConfig <p>资源配置 JSON</p>
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>标签列表（TagKey-TagValue）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签列表（TagKey-TagValue）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表（TagKey-TagValue）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签列表（TagKey-TagValue）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>最近一次成功探测 Deployment 的时间（epoch millis，Neutrino 透传）；NULL=尚未成功探测过。</p> 
     * @return LastProbeSuccessTime <p>最近一次成功探测 Deployment 的时间（epoch millis，Neutrino 透传）；NULL=尚未成功探测过。</p>
     */
    public Long getLastProbeSuccessTime() {
        return this.LastProbeSuccessTime;
    }

    /**
     * Set <p>最近一次成功探测 Deployment 的时间（epoch millis，Neutrino 透传）；NULL=尚未成功探测过。</p>
     * @param LastProbeSuccessTime <p>最近一次成功探测 Deployment 的时间（epoch millis，Neutrino 透传）；NULL=尚未成功探测过。</p>
     */
    public void setLastProbeSuccessTime(Long LastProbeSuccessTime) {
        this.LastProbeSuccessTime = LastProbeSuccessTime;
    }

    /**
     * Get <p>最近一次成功探测后的连续失败次数（&gt;0 表示当前 Status 可能过期）</p> 
     * @return ConsecutiveProbeFailures <p>最近一次成功探测后的连续失败次数（&gt;0 表示当前 Status 可能过期）</p>
     */
    public Long getConsecutiveProbeFailures() {
        return this.ConsecutiveProbeFailures;
    }

    /**
     * Set <p>最近一次成功探测后的连续失败次数（&gt;0 表示当前 Status 可能过期）</p>
     * @param ConsecutiveProbeFailures <p>最近一次成功探测后的连续失败次数（&gt;0 表示当前 Status 可能过期）</p>
     */
    public void setConsecutiveProbeFailures(Long ConsecutiveProbeFailures) {
        this.ConsecutiveProbeFailures = ConsecutiveProbeFailures;
    }

    /**
     * Get <p>最近一次探测失败原因（Neutrino 透传，仅诊断展示）</p> 
     * @return LastProbeError <p>最近一次探测失败原因（Neutrino 透传，仅诊断展示）</p>
     */
    public String getLastProbeError() {
        return this.LastProbeError;
    }

    /**
     * Set <p>最近一次探测失败原因（Neutrino 透传，仅诊断展示）</p>
     * @param LastProbeError <p>最近一次探测失败原因（Neutrino 透传，仅诊断展示）</p>
     */
    public void setLastProbeError(String LastProbeError) {
        this.LastProbeError = LastProbeError;
    }

    /**
     * Get <p>关联训练实例总数（ray-nexus 侧统计，仅 ListMlflowServers 返回；详情/监控请用 QueryMlFlowServerInstanceStats）</p> 
     * @return TotalInstanceCount <p>关联训练实例总数（ray-nexus 侧统计，仅 ListMlflowServers 返回；详情/监控请用 QueryMlFlowServerInstanceStats）</p>
     */
    public Long getTotalInstanceCount() {
        return this.TotalInstanceCount;
    }

    /**
     * Set <p>关联训练实例总数（ray-nexus 侧统计，仅 ListMlflowServers 返回；详情/监控请用 QueryMlFlowServerInstanceStats）</p>
     * @param TotalInstanceCount <p>关联训练实例总数（ray-nexus 侧统计，仅 ListMlflowServers 返回；详情/监控请用 QueryMlFlowServerInstanceStats）</p>
     */
    public void setTotalInstanceCount(Long TotalInstanceCount) {
        this.TotalInstanceCount = TotalInstanceCount;
    }

    /**
     * Get <p>关联的运行中（RUNNING）训练实例数（仅 ListMlflowServers 返回；详情/监控请用 QueryMlflowServerInstanceStats）</p> 
     * @return RunningInstanceCount <p>关联的运行中（RUNNING）训练实例数（仅 ListMlflowServers 返回；详情/监控请用 QueryMlflowServerInstanceStats）</p>
     */
    public Long getRunningInstanceCount() {
        return this.RunningInstanceCount;
    }

    /**
     * Set <p>关联的运行中（RUNNING）训练实例数（仅 ListMlflowServers 返回；详情/监控请用 QueryMlflowServerInstanceStats）</p>
     * @param RunningInstanceCount <p>关联的运行中（RUNNING）训练实例数（仅 ListMlflowServers 返回；详情/监控请用 QueryMlflowServerInstanceStats）</p>
     */
    public void setRunningInstanceCount(Long RunningInstanceCount) {
        this.RunningInstanceCount = RunningInstanceCount;
    }

    public MlFlowServerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MlFlowServerInfo(MlFlowServerInfo source) {
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.ResourcePartitionName != null) {
            this.ResourcePartitionName = new String(source.ResourcePartitionName);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.TrackingUri != null) {
            this.TrackingUri = new String(source.TrackingUri);
        }
        if (source.UiUrl != null) {
            this.UiUrl = new String(source.UiUrl);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.StorageConfig != null) {
            this.StorageConfig = new String(source.StorageConfig);
        }
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.ServerArgs != null) {
            this.ServerArgs = new String(source.ServerArgs);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.SubAccountName != null) {
            this.SubAccountName = new String(source.SubAccountName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LastProbeSuccessTime != null) {
            this.LastProbeSuccessTime = new Long(source.LastProbeSuccessTime);
        }
        if (source.ConsecutiveProbeFailures != null) {
            this.ConsecutiveProbeFailures = new Long(source.ConsecutiveProbeFailures);
        }
        if (source.LastProbeError != null) {
            this.LastProbeError = new String(source.LastProbeError);
        }
        if (source.TotalInstanceCount != null) {
            this.TotalInstanceCount = new Long(source.TotalInstanceCount);
        }
        if (source.RunningInstanceCount != null) {
            this.RunningInstanceCount = new Long(source.RunningInstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "ResourcePartitionName", this.ResourcePartitionName);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "TrackingUri", this.TrackingUri);
        this.setParamSimple(map, prefix + "UiUrl", this.UiUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "StorageConfig", this.StorageConfig);
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "ServerArgs", this.ServerArgs);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "SubAccountName", this.SubAccountName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LastProbeSuccessTime", this.LastProbeSuccessTime);
        this.setParamSimple(map, prefix + "ConsecutiveProbeFailures", this.ConsecutiveProbeFailures);
        this.setParamSimple(map, prefix + "LastProbeError", this.LastProbeError);
        this.setParamSimple(map, prefix + "TotalInstanceCount", this.TotalInstanceCount);
        this.setParamSimple(map, prefix + "RunningInstanceCount", this.RunningInstanceCount);

    }
}

