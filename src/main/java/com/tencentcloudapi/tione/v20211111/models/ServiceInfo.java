/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceInfo extends AbstractModel{

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
    * 实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodList")
    @Expose
    private String [] PodList;

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
    private String ScheduledAction;

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
     * Get 实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodList 实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPodList() {
        return this.PodList;
    }

    /**
     * Set 实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodList 实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodList(String [] PodList) {
        this.PodList = PodList;
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
    public String getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set 定时停止的配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduledAction 定时停止的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduledAction(String ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pods Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Pod getPods() {
        return this.Pods;
    }

    /**
     * Set Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pods Pod列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
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
        if (source.PodList != null) {
            this.PodList = new String[source.PodList.length];
            for (int i = 0; i < source.PodList.length; i++) {
                this.PodList[i] = new String(source.PodList[i]);
            }
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
            this.ScheduledAction = new String(source.ScheduledAction);
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
        this.setParamArraySimple(map, prefix + "PodList.", this.PodList);
        this.setParamObj(map, prefix + "ResourceTotal.", this.ResourceTotal);
        this.setParamSimple(map, prefix + "OldReplicas", this.OldReplicas);
        this.setParamSimple(map, prefix + "HybridBillingPrepaidReplicas", this.HybridBillingPrepaidReplicas);
        this.setParamSimple(map, prefix + "OldHybridBillingPrepaidReplicas", this.OldHybridBillingPrepaidReplicas);
        this.setParamSimple(map, prefix + "ModelHotUpdateEnable", this.ModelHotUpdateEnable);
        this.setParamSimple(map, prefix + "ScaleMode", this.ScaleMode);
        this.setParamArrayObj(map, prefix + "CronScaleJobs.", this.CronScaleJobs);
        this.setParamSimple(map, prefix + "ScaleStrategy", this.ScaleStrategy);
        this.setParamSimple(map, prefix + "ScheduledAction", this.ScheduledAction);
        this.setParamObj(map, prefix + "Pods.", this.Pods);
        this.setParamArrayObj(map, prefix + "PodInfos.", this.PodInfos);
        this.setParamObj(map, prefix + "ServiceLimit.", this.ServiceLimit);
        this.setParamSimple(map, prefix + "ModelTurboEnable", this.ModelTurboEnable);

    }
}

