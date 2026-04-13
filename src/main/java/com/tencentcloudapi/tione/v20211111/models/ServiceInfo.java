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
    * <p>期望运行的Pod数量，停止状态是0<br>不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * <p>镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Env")
    @Expose
    private EnvVar [] Env;

    /**
    * <p>资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo Resources;

    /**
    * <p>后付费实例对应的机型规格</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>模型信息</p>
    */
    @SerializedName("ModelInfo")
    @Expose
    private ModelInfo ModelInfo;

    /**
    * <p>是否启用日志</p>
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * <p>日志配置</p>
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * <p>是否开启鉴权</p>
    */
    @SerializedName("AuthorizationEnable")
    @Expose
    private Boolean AuthorizationEnable;

    /**
    * <p>hpa配置</p>
    */
    @SerializedName("HorizontalPodAutoscaler")
    @Expose
    private HorizontalPodAutoscaler HorizontalPodAutoscaler;

    /**
    * <p>服务的状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private WorkloadStatus Status;

    /**
    * <p>权重</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>资源总量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTotal")
    @Expose
    private ResourceInfo ResourceTotal;

    /**
    * <p>历史实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldReplicas")
    @Expose
    private Long OldReplicas;

    /**
    * <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HybridBillingPrepaidReplicas")
    @Expose
    private Long HybridBillingPrepaidReplicas;

    /**
    * <p>历史 HYBRID_PAID 时的实例数，用户恢复服务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldHybridBillingPrepaidReplicas")
    @Expose
    private Long OldHybridBillingPrepaidReplicas;

    /**
    * <p>是否开启模型的热更新。默认不开启</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelHotUpdateEnable")
    @Expose
    private Boolean ModelHotUpdateEnable;

    /**
    * <p>服务的规格别名</p>
    */
    @SerializedName("InstanceAlias")
    @Expose
    private String InstanceAlias;

    /**
    * <p>实例数量调节方式,默认为手动<br>支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

    /**
    * <p>定时伸缩任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronScaleJobs")
    @Expose
    private CronScaleJob [] CronScaleJobs;

    /**
    * <p>定时伸缩策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleStrategy")
    @Expose
    private String ScaleStrategy;

    /**
    * <p>定时停止的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduledAction")
    @Expose
    private ScheduledAction ScheduledAction;

    /**
    * <p>实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodList")
    @Expose
    private String [] PodList;

    /**
    * <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pods")
    @Expose
    private Pod Pods;

    /**
    * <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodInfos")
    @Expose
    private Pod [] PodInfos;

    /**
    * <p>服务限速限流相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceLimit")
    @Expose
    private ServiceLimit ServiceLimit;

    /**
    * <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelTurboEnable")
    @Expose
    private Boolean ModelTurboEnable;

    /**
    * <p>挂载</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeMount")
    @Expose
    private VolumeMount VolumeMount;

    /**
    * <p>推理代码信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InferCodeInfo")
    @Expose
    private InferCodeInfo InferCodeInfo;

    /**
    * <p>服务的启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * <p>开启TIONE内网访问外部设置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceEIP")
    @Expose
    private ServiceEIP ServiceEIP;

    /**
    * <p>服务端口，默认为8501</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServicePort")
    @Expose
    private Long ServicePort;

    /**
    * <p>服务的优雅退出时限。单位为秒，默认值为30，最小为1</p>
    */
    @SerializedName("TerminationGracePeriodSeconds")
    @Expose
    private Long TerminationGracePeriodSeconds;

    /**
    * <p>服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束</p>
    */
    @SerializedName("PreStopCommand")
    @Expose
    private String [] PreStopCommand;

    /**
    * <p>是否启用grpc端口</p>
    */
    @SerializedName("GrpcEnable")
    @Expose
    private Boolean GrpcEnable;

    /**
    * <p>健康探针</p>
    */
    @SerializedName("HealthProbe")
    @Expose
    private HealthProbe HealthProbe;

    /**
    * <p>滚动更新配置</p>
    */
    @SerializedName("RollingUpdate")
    @Expose
    private RollingUpdate RollingUpdate;

    /**
    * <p>单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1</p>
    */
    @SerializedName("InstancePerReplicas")
    @Expose
    private Long InstancePerReplicas;

    /**
    * <p>批量数据盘挂载配置</p>
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
    * <p>调度策略 [binpack] 优先占满整机，尽量避免碎卡（默认值）[spread] 优先分散在各个节点，确保服务高可用</p>
    */
    @SerializedName("SchedulingStrategy")
    @Expose
    private String SchedulingStrategy;

    /**
    * <p>服务实际运行的节点数</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
     * Get <p>期望运行的Pod数量，停止状态是0<br>不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas <p>期望运行的Pod数量，停止状态是0<br>不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>期望运行的Pod数量，停止状态是0<br>不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas <p>期望运行的Pod数量，停止状态是0<br>不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageInfo <p>镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set <p>镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageInfo <p>镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Env <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnvVar [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Env <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnv(EnvVar [] Env) {
        this.Env = Env;
    }

    /**
     * Get <p>资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resources <p>资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo getResources() {
        return this.Resources;
    }

    /**
     * Set <p>资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resources <p>资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResources(ResourceInfo Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>后付费实例对应的机型规格</p> 
     * @return InstanceType <p>后付费实例对应的机型规格</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>后付费实例对应的机型规格</p>
     * @param InstanceType <p>后付费实例对应的机型规格</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>模型信息</p> 
     * @return ModelInfo <p>模型信息</p>
     */
    public ModelInfo getModelInfo() {
        return this.ModelInfo;
    }

    /**
     * Set <p>模型信息</p>
     * @param ModelInfo <p>模型信息</p>
     */
    public void setModelInfo(ModelInfo ModelInfo) {
        this.ModelInfo = ModelInfo;
    }

    /**
     * Get <p>是否启用日志</p> 
     * @return LogEnable <p>是否启用日志</p>
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set <p>是否启用日志</p>
     * @param LogEnable <p>是否启用日志</p>
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get <p>日志配置</p> 
     * @return LogConfig <p>日志配置</p>
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set <p>日志配置</p>
     * @param LogConfig <p>日志配置</p>
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get <p>是否开启鉴权</p> 
     * @return AuthorizationEnable <p>是否开启鉴权</p>
     */
    public Boolean getAuthorizationEnable() {
        return this.AuthorizationEnable;
    }

    /**
     * Set <p>是否开启鉴权</p>
     * @param AuthorizationEnable <p>是否开启鉴权</p>
     */
    public void setAuthorizationEnable(Boolean AuthorizationEnable) {
        this.AuthorizationEnable = AuthorizationEnable;
    }

    /**
     * Get <p>hpa配置</p> 
     * @return HorizontalPodAutoscaler <p>hpa配置</p>
     */
    public HorizontalPodAutoscaler getHorizontalPodAutoscaler() {
        return this.HorizontalPodAutoscaler;
    }

    /**
     * Set <p>hpa配置</p>
     * @param HorizontalPodAutoscaler <p>hpa配置</p>
     */
    public void setHorizontalPodAutoscaler(HorizontalPodAutoscaler HorizontalPodAutoscaler) {
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
    }

    /**
     * Get <p>服务的状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>服务的状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkloadStatus getStatus() {
        return this.Status;
    }

    /**
     * Set <p>服务的状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>服务的状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(WorkloadStatus Status) {
        this.Status = Status;
    }

    /**
     * Get <p>权重</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight <p>权重</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>权重</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight <p>权重</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>资源总量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTotal <p>资源总量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo getResourceTotal() {
        return this.ResourceTotal;
    }

    /**
     * Set <p>资源总量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTotal <p>资源总量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTotal(ResourceInfo ResourceTotal) {
        this.ResourceTotal = ResourceTotal;
    }

    /**
     * Get <p>历史实例数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldReplicas <p>历史实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOldReplicas() {
        return this.OldReplicas;
    }

    /**
     * Set <p>历史实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldReplicas <p>历史实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldReplicas(Long OldReplicas) {
        this.OldReplicas = OldReplicas;
    }

    /**
     * Get <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HybridBillingPrepaidReplicas <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHybridBillingPrepaidReplicas() {
        return this.HybridBillingPrepaidReplicas;
    }

    /**
     * Set <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HybridBillingPrepaidReplicas <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数, 若不填则默认为1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHybridBillingPrepaidReplicas(Long HybridBillingPrepaidReplicas) {
        this.HybridBillingPrepaidReplicas = HybridBillingPrepaidReplicas;
    }

    /**
     * Get <p>历史 HYBRID_PAID 时的实例数，用户恢复服务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldHybridBillingPrepaidReplicas <p>历史 HYBRID_PAID 时的实例数，用户恢复服务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOldHybridBillingPrepaidReplicas() {
        return this.OldHybridBillingPrepaidReplicas;
    }

    /**
     * Set <p>历史 HYBRID_PAID 时的实例数，用户恢复服务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldHybridBillingPrepaidReplicas <p>历史 HYBRID_PAID 时的实例数，用户恢复服务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldHybridBillingPrepaidReplicas(Long OldHybridBillingPrepaidReplicas) {
        this.OldHybridBillingPrepaidReplicas = OldHybridBillingPrepaidReplicas;
    }

    /**
     * Get <p>是否开启模型的热更新。默认不开启</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelHotUpdateEnable <p>是否开启模型的热更新。默认不开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getModelHotUpdateEnable() {
        return this.ModelHotUpdateEnable;
    }

    /**
     * Set <p>是否开启模型的热更新。默认不开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelHotUpdateEnable <p>是否开启模型的热更新。默认不开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelHotUpdateEnable(Boolean ModelHotUpdateEnable) {
        this.ModelHotUpdateEnable = ModelHotUpdateEnable;
    }

    /**
     * Get <p>服务的规格别名</p> 
     * @return InstanceAlias <p>服务的规格别名</p>
     */
    public String getInstanceAlias() {
        return this.InstanceAlias;
    }

    /**
     * Set <p>服务的规格别名</p>
     * @param InstanceAlias <p>服务的规格别名</p>
     */
    public void setInstanceAlias(String InstanceAlias) {
        this.InstanceAlias = InstanceAlias;
    }

    /**
     * Get <p>实例数量调节方式,默认为手动<br>支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleMode <p>实例数量调节方式,默认为手动<br>支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * Set <p>实例数量调节方式,默认为手动<br>支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleMode <p>实例数量调节方式,默认为手动<br>支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * Get <p>定时伸缩任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronScaleJobs <p>定时伸缩任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CronScaleJob [] getCronScaleJobs() {
        return this.CronScaleJobs;
    }

    /**
     * Set <p>定时伸缩任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronScaleJobs <p>定时伸缩任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronScaleJobs(CronScaleJob [] CronScaleJobs) {
        this.CronScaleJobs = CronScaleJobs;
    }

    /**
     * Get <p>定时伸缩策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleStrategy <p>定时伸缩策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScaleStrategy() {
        return this.ScaleStrategy;
    }

    /**
     * Set <p>定时伸缩策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleStrategy <p>定时伸缩策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleStrategy(String ScaleStrategy) {
        this.ScaleStrategy = ScaleStrategy;
    }

    /**
     * Get <p>定时停止的配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduledAction <p>定时停止的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduledAction getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set <p>定时停止的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduledAction <p>定时停止的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduledAction(ScheduledAction ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get <p>实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodList <p>实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String [] getPodList() {
        return this.PodList;
    }

    /**
     * Set <p>实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodList <p>实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setPodList(String [] PodList) {
        this.PodList = PodList;
    }

    /**
     * Get <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pods <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Pod getPods() {
        return this.Pods;
    }

    /**
     * Set <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pods <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setPods(Pod Pods) {
        this.Pods = Pods;
    }

    /**
     * Get <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodInfos <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Pod [] getPodInfos() {
        return this.PodInfos;
    }

    /**
     * Set <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodInfos <p>Pod列表信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodInfos(Pod [] PodInfos) {
        this.PodInfos = PodInfos;
    }

    /**
     * Get <p>服务限速限流相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceLimit <p>服务限速限流相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceLimit getServiceLimit() {
        return this.ServiceLimit;
    }

    /**
     * Set <p>服务限速限流相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceLimit <p>服务限速限流相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceLimit(ServiceLimit ServiceLimit) {
        this.ServiceLimit = ServiceLimit;
    }

    /**
     * Get <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelTurboEnable <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getModelTurboEnable() {
        return this.ModelTurboEnable;
    }

    /**
     * Set <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelTurboEnable <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelTurboEnable(Boolean ModelTurboEnable) {
        this.ModelTurboEnable = ModelTurboEnable;
    }

    /**
     * Get <p>挂载</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeMount <p>挂载</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeMount getVolumeMount() {
        return this.VolumeMount;
    }

    /**
     * Set <p>挂载</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeMount <p>挂载</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeMount(VolumeMount VolumeMount) {
        this.VolumeMount = VolumeMount;
    }

    /**
     * Get <p>推理代码信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InferCodeInfo <p>推理代码信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InferCodeInfo getInferCodeInfo() {
        return this.InferCodeInfo;
    }

    /**
     * Set <p>推理代码信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InferCodeInfo <p>推理代码信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInferCodeInfo(InferCodeInfo InferCodeInfo) {
        this.InferCodeInfo = InferCodeInfo;
    }

    /**
     * Get <p>服务的启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Command <p>服务的启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>服务的启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Command <p>服务的启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get <p>开启TIONE内网访问外部设置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceEIP <p>开启TIONE内网访问外部设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceEIP getServiceEIP() {
        return this.ServiceEIP;
    }

    /**
     * Set <p>开启TIONE内网访问外部设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceEIP <p>开启TIONE内网访问外部设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceEIP(ServiceEIP ServiceEIP) {
        this.ServiceEIP = ServiceEIP;
    }

    /**
     * Get <p>服务端口，默认为8501</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServicePort <p>服务端口，默认为8501</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServicePort() {
        return this.ServicePort;
    }

    /**
     * Set <p>服务端口，默认为8501</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServicePort <p>服务端口，默认为8501</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServicePort(Long ServicePort) {
        this.ServicePort = ServicePort;
    }

    /**
     * Get <p>服务的优雅退出时限。单位为秒，默认值为30，最小为1</p> 
     * @return TerminationGracePeriodSeconds <p>服务的优雅退出时限。单位为秒，默认值为30，最小为1</p>
     */
    public Long getTerminationGracePeriodSeconds() {
        return this.TerminationGracePeriodSeconds;
    }

    /**
     * Set <p>服务的优雅退出时限。单位为秒，默认值为30，最小为1</p>
     * @param TerminationGracePeriodSeconds <p>服务的优雅退出时限。单位为秒，默认值为30，最小为1</p>
     */
    public void setTerminationGracePeriodSeconds(Long TerminationGracePeriodSeconds) {
        this.TerminationGracePeriodSeconds = TerminationGracePeriodSeconds;
    }

    /**
     * Get <p>服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束</p> 
     * @return PreStopCommand <p>服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束</p>
     */
    public String [] getPreStopCommand() {
        return this.PreStopCommand;
    }

    /**
     * Set <p>服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束</p>
     * @param PreStopCommand <p>服务实例停止前执行的命令，执行完毕或执行时间超过优雅退出时限后实例结束</p>
     */
    public void setPreStopCommand(String [] PreStopCommand) {
        this.PreStopCommand = PreStopCommand;
    }

    /**
     * Get <p>是否启用grpc端口</p> 
     * @return GrpcEnable <p>是否启用grpc端口</p>
     */
    public Boolean getGrpcEnable() {
        return this.GrpcEnable;
    }

    /**
     * Set <p>是否启用grpc端口</p>
     * @param GrpcEnable <p>是否启用grpc端口</p>
     */
    public void setGrpcEnable(Boolean GrpcEnable) {
        this.GrpcEnable = GrpcEnable;
    }

    /**
     * Get <p>健康探针</p> 
     * @return HealthProbe <p>健康探针</p>
     */
    public HealthProbe getHealthProbe() {
        return this.HealthProbe;
    }

    /**
     * Set <p>健康探针</p>
     * @param HealthProbe <p>健康探针</p>
     */
    public void setHealthProbe(HealthProbe HealthProbe) {
        this.HealthProbe = HealthProbe;
    }

    /**
     * Get <p>滚动更新配置</p> 
     * @return RollingUpdate <p>滚动更新配置</p>
     */
    public RollingUpdate getRollingUpdate() {
        return this.RollingUpdate;
    }

    /**
     * Set <p>滚动更新配置</p>
     * @param RollingUpdate <p>滚动更新配置</p>
     */
    public void setRollingUpdate(RollingUpdate RollingUpdate) {
        this.RollingUpdate = RollingUpdate;
    }

    /**
     * Get <p>单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1</p> 
     * @return InstancePerReplicas <p>单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1</p>
     */
    public Long getInstancePerReplicas() {
        return this.InstancePerReplicas;
    }

    /**
     * Set <p>单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1</p>
     * @param InstancePerReplicas <p>单副本下的实例数，仅在部署类型为DIST、ROLE时生效，默认1</p>
     */
    public void setInstancePerReplicas(Long InstancePerReplicas) {
        this.InstancePerReplicas = InstancePerReplicas;
    }

    /**
     * Get <p>批量数据盘挂载配置</p> 
     * @return VolumeMounts <p>批量数据盘挂载配置</p>
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set <p>批量数据盘挂载配置</p>
     * @param VolumeMounts <p>批量数据盘挂载配置</p>
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    /**
     * Get <p>调度策略 [binpack] 优先占满整机，尽量避免碎卡（默认值）[spread] 优先分散在各个节点，确保服务高可用</p> 
     * @return SchedulingStrategy <p>调度策略 [binpack] 优先占满整机，尽量避免碎卡（默认值）[spread] 优先分散在各个节点，确保服务高可用</p>
     */
    public String getSchedulingStrategy() {
        return this.SchedulingStrategy;
    }

    /**
     * Set <p>调度策略 [binpack] 优先占满整机，尽量避免碎卡（默认值）[spread] 优先分散在各个节点，确保服务高可用</p>
     * @param SchedulingStrategy <p>调度策略 [binpack] 优先占满整机，尽量避免碎卡（默认值）[spread] 优先分散在各个节点，确保服务高可用</p>
     */
    public void setSchedulingStrategy(String SchedulingStrategy) {
        this.SchedulingStrategy = SchedulingStrategy;
    }

    /**
     * Get <p>服务实际运行的节点数</p> 
     * @return NodeCount <p>服务实际运行的节点数</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>服务实际运行的节点数</p>
     * @param NodeCount <p>服务实际运行的节点数</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
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
        if (source.SchedulingStrategy != null) {
            this.SchedulingStrategy = new String(source.SchedulingStrategy);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
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
        this.setParamSimple(map, prefix + "SchedulingStrategy", this.SchedulingStrategy);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);

    }
}

