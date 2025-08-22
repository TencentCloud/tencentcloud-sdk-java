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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceInfo extends AbstractModel {

    /**
    * 期望运行的Pod数量，停止状态是0
不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 环境变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Env")
    @Expose
    private EnvVar [] Env;

    /**
    * 资源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo Resources;

    /**
    * 后付费实例对应的机型规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 模型信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelInfo")
    @Expose
    private ModelInfo ModelInfo;

    /**
    * 是否启用日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * 日志配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * 是否开启鉴权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizationEnable")
    @Expose
    private Boolean AuthorizationEnable;

    /**
    * hpa配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HorizontalPodAutoscaler")
    @Expose
    private HorizontalPodAutoscaler HorizontalPodAutoscaler;

    /**
    * 服务的状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private WorkloadStatus Status;

    /**
    * 权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 资源总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTotal")
    @Expose
    private ResourceInfo ResourceTotal;

    /**
    * 历史实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldReplicas")
    @Expose
    private Long OldReplicas;

    /**
    * 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HybridBillingPrepaidReplicas")
    @Expose
    private Long HybridBillingPrepaidReplicas;

    /**
    * 历史 HYBRID_PAID 时的实例数，用户恢复服务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldHybridBillingPrepaidReplicas")
    @Expose
    private Long OldHybridBillingPrepaidReplicas;

    /**
    * 是否开启模型的热更新。默认不开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelHotUpdateEnable")
    @Expose
    private Boolean ModelHotUpdateEnable;

    /**
    * 服务的规格别名
    */
    @SerializedName("InstanceAlias")
    @Expose
    private String InstanceAlias;

    /**
    * 实例数量调节方式,默认为手动
支持：自动 - "AUTO", 手动 - "MANUAL"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

    /**
    * 定时伸缩任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronScaleJobs")
    @Expose
    private CronScaleJob [] CronScaleJobs;

    /**
    * 定时伸缩策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleStrategy")
    @Expose
    private String ScaleStrategy;

    /**
    * 定时停止的配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduledAction")
    @Expose
    private ScheduledAction ScheduledAction;

    /**
    * 实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodList")
    @Expose
    private String [] PodList;

    /**
    * Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pods")
    @Expose
    private Pod Pods;

    /**
    * Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodInfos")
    @Expose
    private Pod [] PodInfos;

    /**
    * 服务限速限流相关配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceLimit")
    @Expose
    private ServiceLimit ServiceLimit;

    /**
    * 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelTurboEnable")
    @Expose
    private Boolean ModelTurboEnable;

    /**
    * 挂载
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeMount")
    @Expose
    private VolumeMount VolumeMount;

    /**
    * 推理代码信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InferCodeInfo")
    @Expose
    private InferCodeInfo InferCodeInfo;

    /**
    * 服务的启动命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 开启TIONE内网访问外部设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceEIP")
    @Expose
    private ServiceEIP ServiceEIP;

    /**
    * 服务端口，默认为8501
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServicePort")
    @Expose
    private Long ServicePort;

    /**
    * 服务的优雅退出时限。单位为秒，默认值为30，最小为1
    */
    @SerializedName("TerminationGracePeriodSeconds")
    @Expose
    private Long TerminationGracePeriodSeconds;

    /**
    * 服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束
    */
    @SerializedName("PreStopCommand")
    @Expose
    private String [] PreStopCommand;

    /**
    * 是否启用grpc端口
    */
    @SerializedName("GrpcEnable")
    @Expose
    private Boolean GrpcEnable;

    /**
    * 健康探针
    */
    @SerializedName("HealthProbe")
    @Expose
    private HealthProbe HealthProbe;

    /**
    * 滚动更新配置
    */
    @SerializedName("RollingUpdate")
    @Expose
    private RollingUpdate RollingUpdate;

    /**
    * 单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1
    */
    @SerializedName("InstancePerReplicas")
    @Expose
    private Long InstancePerReplicas;

    /**
    * 批量数据盘挂载配置
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
     * Get 期望运行的Pod数量，停止状态是0
不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas 期望运行的Pod数量，停止状态是0
不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 期望运行的Pod数量，停止状态是0
不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas 期望运行的Pod数量，停止状态是0
不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 镜像信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageInfo 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageInfo 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get 环境变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Env 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnvVar [] getEnv() {
        return this.Env;
    }

    /**
     * Set 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Env 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnv(EnvVar [] Env) {
        this.Env = Env;
    }

    /**
     * Get 资源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resources 资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo getResources() {
        return this.Resources;
    }

    /**
     * Set 资源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resources 资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResources(ResourceInfo Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 后付费实例对应的机型规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 后付费实例对应的机型规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 后付费实例对应的机型规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 后付费实例对应的机型规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 模型信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelInfo 模型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelInfo getModelInfo() {
        return this.ModelInfo;
    }

    /**
     * Set 模型信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelInfo 模型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelInfo(ModelInfo ModelInfo) {
        this.ModelInfo = ModelInfo;
    }

    /**
     * Get 是否启用日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogEnable 是否启用日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set 是否启用日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogEnable 是否启用日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get 日志配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogConfig 日志配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set 日志配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogConfig 日志配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get 是否开启鉴权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizationEnable 是否开启鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAuthorizationEnable() {
        return this.AuthorizationEnable;
    }

    /**
     * Set 是否开启鉴权
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizationEnable 是否开启鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizationEnable(Boolean AuthorizationEnable) {
        this.AuthorizationEnable = AuthorizationEnable;
    }

    /**
     * Get hpa配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HorizontalPodAutoscaler hpa配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HorizontalPodAutoscaler getHorizontalPodAutoscaler() {
        return this.HorizontalPodAutoscaler;
    }

    /**
     * Set hpa配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HorizontalPodAutoscaler hpa配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHorizontalPodAutoscaler(HorizontalPodAutoscaler HorizontalPodAutoscaler) {
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
    }

    /**
     * Get 服务的状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 服务的状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkloadStatus getStatus() {
        return this.Status;
    }

    /**
     * Set 服务的状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 服务的状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(WorkloadStatus Status) {
        this.Status = Status;
    }

    /**
     * Get 权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 资源总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTotal 资源总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo getResourceTotal() {
        return this.ResourceTotal;
    }

    /**
     * Set 资源总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTotal 资源总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTotal(ResourceInfo ResourceTotal) {
        this.ResourceTotal = ResourceTotal;
    }

    /**
     * Get 历史实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldReplicas 历史实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOldReplicas() {
        return this.OldReplicas;
    }

    /**
     * Set 历史实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldReplicas 历史实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldReplicas(Long OldReplicas) {
        this.OldReplicas = OldReplicas;
    }

    /**
     * Get 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HybridBillingPrepaidReplicas 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHybridBillingPrepaidReplicas() {
        return this.HybridBillingPrepaidReplicas;
    }

    /**
     * Set 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param HybridBillingPrepaidReplicas 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHybridBillingPrepaidReplicas(Long HybridBillingPrepaidReplicas) {
        this.HybridBillingPrepaidReplicas = HybridBillingPrepaidReplicas;
    }

    /**
     * Get 历史 HYBRID_PAID 时的实例数，用户恢复服务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldHybridBillingPrepaidReplicas 历史 HYBRID_PAID 时的实例数，用户恢复服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOldHybridBillingPrepaidReplicas() {
        return this.OldHybridBillingPrepaidReplicas;
    }

    /**
     * Set 历史 HYBRID_PAID 时的实例数，用户恢复服务
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldHybridBillingPrepaidReplicas 历史 HYBRID_PAID 时的实例数，用户恢复服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldHybridBillingPrepaidReplicas(Long OldHybridBillingPrepaidReplicas) {
        this.OldHybridBillingPrepaidReplicas = OldHybridBillingPrepaidReplicas;
    }

    /**
     * Get 是否开启模型的热更新。默认不开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelHotUpdateEnable 是否开启模型的热更新。默认不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getModelHotUpdateEnable() {
        return this.ModelHotUpdateEnable;
    }

    /**
     * Set 是否开启模型的热更新。默认不开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelHotUpdateEnable 是否开启模型的热更新。默认不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelHotUpdateEnable(Boolean ModelHotUpdateEnable) {
        this.ModelHotUpdateEnable = ModelHotUpdateEnable;
    }

    /**
     * Get 服务的规格别名 
     * @return InstanceAlias 服务的规格别名
     */
    public String getInstanceAlias() {
        return this.InstanceAlias;
    }

    /**
     * Set 服务的规格别名
     * @param InstanceAlias 服务的规格别名
     */
    public void setInstanceAlias(String InstanceAlias) {
        this.InstanceAlias = InstanceAlias;
    }

    /**
     * Get 实例数量调节方式,默认为手动
支持：自动 - "AUTO", 手动 - "MANUAL"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleMode 实例数量调节方式,默认为手动
支持：自动 - "AUTO", 手动 - "MANUAL"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * Set 实例数量调节方式,默认为手动
支持：自动 - "AUTO", 手动 - "MANUAL"
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleMode 实例数量调节方式,默认为手动
支持：自动 - "AUTO", 手动 - "MANUAL"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * Get 定时伸缩任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronScaleJobs 定时伸缩任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CronScaleJob [] getCronScaleJobs() {
        return this.CronScaleJobs;
    }

    /**
     * Set 定时伸缩任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronScaleJobs 定时伸缩任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronScaleJobs(CronScaleJob [] CronScaleJobs) {
        this.CronScaleJobs = CronScaleJobs;
    }

    /**
     * Get 定时伸缩策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleStrategy 定时伸缩策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScaleStrategy() {
        return this.ScaleStrategy;
    }

    /**
     * Set 定时伸缩策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleStrategy 定时伸缩策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleStrategy(String ScaleStrategy) {
        this.ScaleStrategy = ScaleStrategy;
    }

    /**
     * Get 定时停止的配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduledAction 定时停止的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduledAction getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set 定时停止的配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduledAction 定时停止的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduledAction(ScheduledAction ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get 实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodList 实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String [] getPodList() {
        return this.PodList;
    }

    /**
     * Set 实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodList 实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setPodList(String [] PodList) {
        this.PodList = PodList;
    }

    /**
     * Get Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pods Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Pod getPods() {
        return this.Pods;
    }

    /**
     * Set Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pods Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setPods(Pod Pods) {
        this.Pods = Pods;
    }

    /**
     * Get Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodInfos Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Pod [] getPodInfos() {
        return this.PodInfos;
    }

    /**
     * Set Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodInfos Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodInfos(Pod [] PodInfos) {
        this.PodInfos = PodInfos;
    }

    /**
     * Get 服务限速限流相关配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceLimit 服务限速限流相关配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceLimit getServiceLimit() {
        return this.ServiceLimit;
    }

    /**
     * Set 服务限速限流相关配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceLimit 服务限速限流相关配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceLimit(ServiceLimit ServiceLimit) {
        this.ServiceLimit = ServiceLimit;
    }

    /**
     * Get 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelTurboEnable 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getModelTurboEnable() {
        return this.ModelTurboEnable;
    }

    /**
     * Set 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelTurboEnable 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelTurboEnable(Boolean ModelTurboEnable) {
        this.ModelTurboEnable = ModelTurboEnable;
    }

    /**
     * Get 挂载
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeMount 挂载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeMount getVolumeMount() {
        return this.VolumeMount;
    }

    /**
     * Set 挂载
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeMount 挂载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeMount(VolumeMount VolumeMount) {
        this.VolumeMount = VolumeMount;
    }

    /**
     * Get 推理代码信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InferCodeInfo 推理代码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InferCodeInfo getInferCodeInfo() {
        return this.InferCodeInfo;
    }

    /**
     * Set 推理代码信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InferCodeInfo 推理代码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInferCodeInfo(InferCodeInfo InferCodeInfo) {
        this.InferCodeInfo = InferCodeInfo;
    }

    /**
     * Get 服务的启动命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Command 服务的启动命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 服务的启动命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param Command 服务的启动命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 开启TIONE内网访问外部设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceEIP 开启TIONE内网访问外部设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceEIP getServiceEIP() {
        return this.ServiceEIP;
    }

    /**
     * Set 开启TIONE内网访问外部设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceEIP 开启TIONE内网访问外部设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceEIP(ServiceEIP ServiceEIP) {
        this.ServiceEIP = ServiceEIP;
    }

    /**
     * Get 服务端口，默认为8501
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServicePort 服务端口，默认为8501
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServicePort() {
        return this.ServicePort;
    }

    /**
     * Set 服务端口，默认为8501
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServicePort 服务端口，默认为8501
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServicePort(Long ServicePort) {
        this.ServicePort = ServicePort;
    }

    /**
     * Get 服务的优雅退出时限。单位为秒，默认值为30，最小为1 
     * @return TerminationGracePeriodSeconds 服务的优雅退出时限。单位为秒，默认值为30，最小为1
     */
    public Long getTerminationGracePeriodSeconds() {
        return this.TerminationGracePeriodSeconds;
    }

    /**
     * Set 服务的优雅退出时限。单位为秒，默认值为30，最小为1
     * @param TerminationGracePeriodSeconds 服务的优雅退出时限。单位为秒，默认值为30，最小为1
     */
    public void setTerminationGracePeriodSeconds(Long TerminationGracePeriodSeconds) {
        this.TerminationGracePeriodSeconds = TerminationGracePeriodSeconds;
    }

    /**
     * Get 服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束 
     * @return PreStopCommand 服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束
     */
    public String [] getPreStopCommand() {
        return this.PreStopCommand;
    }

    /**
     * Set 服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束
     * @param PreStopCommand 服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束
     */
    public void setPreStopCommand(String [] PreStopCommand) {
        this.PreStopCommand = PreStopCommand;
    }

    /**
     * Get 是否启用grpc端口 
     * @return GrpcEnable 是否启用grpc端口
     */
    public Boolean getGrpcEnable() {
        return this.GrpcEnable;
    }

    /**
     * Set 是否启用grpc端口
     * @param GrpcEnable 是否启用grpc端口
     */
    public void setGrpcEnable(Boolean GrpcEnable) {
        this.GrpcEnable = GrpcEnable;
    }

    /**
     * Get 健康探针 
     * @return HealthProbe 健康探针
     */
    public HealthProbe getHealthProbe() {
        return this.HealthProbe;
    }

    /**
     * Set 健康探针
     * @param HealthProbe 健康探针
     */
    public void setHealthProbe(HealthProbe HealthProbe) {
        this.HealthProbe = HealthProbe;
    }

    /**
     * Get 滚动更新配置 
     * @return RollingUpdate 滚动更新配置
     */
    public RollingUpdate getRollingUpdate() {
        return this.RollingUpdate;
    }

    /**
     * Set 滚动更新配置
     * @param RollingUpdate 滚动更新配置
     */
    public void setRollingUpdate(RollingUpdate RollingUpdate) {
        this.RollingUpdate = RollingUpdate;
    }

    /**
     * Get 单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1 
     * @return InstancePerReplicas 单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1
     */
    public Long getInstancePerReplicas() {
        return this.InstancePerReplicas;
    }

    /**
     * Set 单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1
     * @param InstancePerReplicas 单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1
     */
    public void setInstancePerReplicas(Long InstancePerReplicas) {
        this.InstancePerReplicas = InstancePerReplicas;
    }

    /**
     * Get 批量数据盘挂载配置 
     * @return VolumeMounts 批量数据盘挂载配置
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set 批量数据盘挂载配置
     * @param VolumeMounts 批量数据盘挂载配置
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    public ServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceInfo(ServiceInfo source) {
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.Env != null) {
            this.Env = new EnvVar[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new EnvVar(source.Env[i]);
            }
        }
        if (source.Resources != null) {
            this.Resources = new ResourceInfo(source.Resources);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ModelInfo != null) {
            this.ModelInfo = new ModelInfo(source.ModelInfo);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new LogConfig(source.LogConfig);
        }
        if (source.AuthorizationEnable != null) {
            this.AuthorizationEnable = new Boolean(source.AuthorizationEnable);
        }
        if (source.HorizontalPodAutoscaler != null) {
            this.HorizontalPodAutoscaler = new HorizontalPodAutoscaler(source.HorizontalPodAutoscaler);
        }
        if (source.Status != null) {
            this.Status = new WorkloadStatus(source.Status);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.ResourceTotal != null) {
            this.ResourceTotal = new ResourceInfo(source.ResourceTotal);
        }
        if (source.OldReplicas != null) {
            this.OldReplicas = new Long(source.OldReplicas);
        }
        if (source.HybridBillingPrepaidReplicas != null) {
            this.HybridBillingPrepaidReplicas = new Long(source.HybridBillingPrepaidReplicas);
        }
        if (source.OldHybridBillingPrepaidReplicas != null) {
            this.OldHybridBillingPrepaidReplicas = new Long(source.OldHybridBillingPrepaidReplicas);
        }
        if (source.ModelHotUpdateEnable != null) {
            this.ModelHotUpdateEnable = new Boolean(source.ModelHotUpdateEnable);
        }
        if (source.InstanceAlias != null) {
            this.InstanceAlias = new String(source.InstanceAlias);
        }
        if (source.ScaleMode != null) {
            this.ScaleMode = new String(source.ScaleMode);
        }
        if (source.CronScaleJobs != null) {
            this.CronScaleJobs = new CronScaleJob[source.CronScaleJobs.length];
            for (int i = 0; i < source.CronScaleJobs.length; i++) {
                this.CronScaleJobs[i] = new CronScaleJob(source.CronScaleJobs[i]);
            }
        }
        if (source.ScaleStrategy != null) {
            this.ScaleStrategy = new String(source.ScaleStrategy);
        }
        if (source.ScheduledAction != null) {
            this.ScheduledAction = new ScheduledAction(source.ScheduledAction);
        }
        if (source.PodList != null) {
            this.PodList = new String[source.PodList.length];
            for (int i = 0; i < source.PodList.length; i++) {
                this.PodList[i] = new String(source.PodList[i]);
            }
        }
        if (source.Pods != null) {
            this.Pods = new Pod(source.Pods);
        }
        if (source.PodInfos != null) {
            this.PodInfos = new Pod[source.PodInfos.length];
            for (int i = 0; i < source.PodInfos.length; i++) {
                this.PodInfos[i] = new Pod(source.PodInfos[i]);
            }
        }
        if (source.ServiceLimit != null) {
            this.ServiceLimit = new ServiceLimit(source.ServiceLimit);
        }
        if (source.ModelTurboEnable != null) {
            this.ModelTurboEnable = new Boolean(source.ModelTurboEnable);
        }
        if (source.VolumeMount != null) {
            this.VolumeMount = new VolumeMount(source.VolumeMount);
        }
        if (source.InferCodeInfo != null) {
            this.InferCodeInfo = new InferCodeInfo(source.InferCodeInfo);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.ServiceEIP != null) {
            this.ServiceEIP = new ServiceEIP(source.ServiceEIP);
        }
        if (source.ServicePort != null) {
            this.ServicePort = new Long(source.ServicePort);
        }
        if (source.TerminationGracePeriodSeconds != null) {
            this.TerminationGracePeriodSeconds = new Long(source.TerminationGracePeriodSeconds);
        }
        if (source.PreStopCommand != null) {
            this.PreStopCommand = new String[source.PreStopCommand.length];
            for (int i = 0; i < source.PreStopCommand.length; i++) {
                this.PreStopCommand[i] = new String(source.PreStopCommand[i]);
            }
        }
        if (source.GrpcEnable != null) {
            this.GrpcEnable = new Boolean(source.GrpcEnable);
        }
        if (source.HealthProbe != null) {
            this.HealthProbe = new HealthProbe(source.HealthProbe);
        }
        if (source.RollingUpdate != null) {
            this.RollingUpdate = new RollingUpdate(source.RollingUpdate);
        }
        if (source.InstancePerReplicas != null) {
            this.InstancePerReplicas = new Long(source.InstancePerReplicas);
        }
        if (source.VolumeMounts != null) {
            this.VolumeMounts = new VolumeMount[source.VolumeMounts.length];
            for (int i = 0; i < source.VolumeMounts.length; i++) {
                this.VolumeMounts[i] = new VolumeMount(source.VolumeMounts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamArrayObj(map, prefix + "Env.", this.Env);
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "ModelInfo.", this.ModelInfo);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "AuthorizationEnable", this.AuthorizationEnable);
        this.setParamObj(map, prefix + "HorizontalPodAutoscaler.", this.HorizontalPodAutoscaler);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamObj(map, prefix + "ResourceTotal.", this.ResourceTotal);
        this.setParamSimple(map, prefix + "OldReplicas", this.OldReplicas);
        this.setParamSimple(map, prefix + "HybridBillingPrepaidReplicas", this.HybridBillingPrepaidReplicas);
        this.setParamSimple(map, prefix + "OldHybridBillingPrepaidReplicas", this.OldHybridBillingPrepaidReplicas);
        this.setParamSimple(map, prefix + "ModelHotUpdateEnable", this.ModelHotUpdateEnable);
        this.setParamSimple(map, prefix + "InstanceAlias", this.InstanceAlias);
        this.setParamSimple(map, prefix + "ScaleMode", this.ScaleMode);
        this.setParamArrayObj(map, prefix + "CronScaleJobs.", this.CronScaleJobs);
        this.setParamSimple(map, prefix + "ScaleStrategy", this.ScaleStrategy);
        this.setParamObj(map, prefix + "ScheduledAction.", this.ScheduledAction);
        this.setParamArraySimple(map, prefix + "PodList.", this.PodList);
        this.setParamObj(map, prefix + "Pods.", this.Pods);
        this.setParamArrayObj(map, prefix + "PodInfos.", this.PodInfos);
        this.setParamObj(map, prefix + "ServiceLimit.", this.ServiceLimit);
        this.setParamSimple(map, prefix + "ModelTurboEnable", this.ModelTurboEnable);
        this.setParamObj(map, prefix + "VolumeMount.", this.VolumeMount);
        this.setParamObj(map, prefix + "InferCodeInfo.", this.InferCodeInfo);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "ServiceEIP.", this.ServiceEIP);
        this.setParamSimple(map, prefix + "ServicePort", this.ServicePort);
        this.setParamSimple(map, prefix + "TerminationGracePeriodSeconds", this.TerminationGracePeriodSeconds);
        this.setParamArraySimple(map, prefix + "PreStopCommand.", this.PreStopCommand);
        this.setParamSimple(map, prefix + "GrpcEnable", this.GrpcEnable);
        this.setParamObj(map, prefix + "HealthProbe.", this.HealthProbe);
        this.setParamObj(map, prefix + "RollingUpdate.", this.RollingUpdate);
        this.setParamSimple(map, prefix + "InstancePerReplicas", this.InstancePerReplicas);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);

    }
}

