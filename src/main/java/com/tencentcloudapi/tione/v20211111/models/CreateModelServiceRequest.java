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

public class CreateModelServiceRequest extends AbstractModel{

    /**
    * 新增版本时需要填写
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * 不超过60个字，仅支持英文、数字、下划线"_"、短横"-"，只能以英文、数字开头
    */
    @SerializedName("ServiceGroupName")
    @Expose
    private String ServiceGroupName;

    /**
    * 模型服务的描述
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * 付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费）
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 预付费模式下所属的资源组id，同服务组下唯一
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 模型信息，需要挂载模型时填写
    */
    @SerializedName("ModelInfo")
    @Expose
    private ModelInfo ModelInfo;

    /**
    * 镜像信息，配置服务运行所需的镜像地址等信息
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 环境变量，可选参数，用于配置容器中的环境变量
    */
    @SerializedName("Env")
    @Expose
    private EnvVar [] Env;

    /**
    * 资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo Resources;

    /**
    * 使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:
TI.S.MEDIUM.POST	2C4G
TI.S.LARGE.POST	4C8G
TI.S.2XLARGE16.POST	8C16G
TI.S.2XLARGE32.POST	8C32G
TI.S.4XLARGE32.POST	16C32G
TI.S.4XLARGE64.POST	16C64G
TI.S.6XLARGE48.POST	24C48G
TI.S.6XLARGE96.POST	24C96G
TI.S.8XLARGE64.POST	32C64G
TI.S.8XLARGE128.POST 32C128G
TI.GN7.LARGE20.POST	4C20G T4*1/4
TI.GN7.2XLARGE40.POST	10C40G T4*1/2
TI.GN7.2XLARGE32.POST	8C32G T4*1
TI.GN7.5XLARGE80.POST	20C80G T4*1
TI.GN7.8XLARGE128.POST	32C128G T4*1
TI.GN7.10XLARGE160.POST	40C160G T4*2
TI.GN7.20XLARGE320.POST	80C320G T4*4
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 扩缩容类型 支持：自动 - "AUTO", 手动 - "MANUAL",默认为MANUAL
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

    /**
    * 实例数量, 不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 自动伸缩信息
    */
    @SerializedName("HorizontalPodAutoscaler")
    @Expose
    private HorizontalPodAutoscaler HorizontalPodAutoscaler;

    /**
    * 是否开启日志投递，开启后需填写配置投递到指定cls
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * 日志配置，需要投递服务日志到指定cls时填写
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * 是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权
    */
    @SerializedName("AuthorizationEnable")
    @Expose
    private Boolean AuthorizationEnable;

    /**
    * 腾讯云标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否新增版本
    */
    @SerializedName("NewVersion")
    @Expose
    private Boolean NewVersion;

    /**
    * 定时任务配置，使用定时策略时填写
    */
    @SerializedName("CronScaleJobs")
    @Expose
    private CronScaleJob [] CronScaleJobs;

    /**
    * 自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩
    */
    @SerializedName("ScaleStrategy")
    @Expose
    private String ScaleStrategy;

    /**
    * 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数
    */
    @SerializedName("HybridBillingPrepaidReplicas")
    @Expose
    private Long HybridBillingPrepaidReplicas;

    /**
    * [AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认]
    */
    @SerializedName("CreateSource")
    @Expose
    private String CreateSource;

    /**
    * 是否开启模型的热更新。默认不开启
    */
    @SerializedName("ModelHotUpdateEnable")
    @Expose
    private Boolean ModelHotUpdateEnable;

    /**
    * 定时停止配置
    */
    @SerializedName("ScheduledAction")
    @Expose
    private ScheduledAction ScheduledAction;

    /**
    * 挂载配置，目前只支持CFS
    */
    @SerializedName("VolumeMount")
    @Expose
    private VolumeMount VolumeMount;

    /**
    * 服务限速限流相关配置
    */
    @SerializedName("ServiceLimit")
    @Expose
    private ServiceLimit ServiceLimit;

    /**
    * 回调地址，用于回调创建服务状态信息，回调格式&内容详情见：[TI-ONE 接口回调说明](https://cloud.tencent.com/document/product/851/84292)
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。
    */
    @SerializedName("ModelTurboEnable")
    @Expose
    private Boolean ModelTurboEnable;

    /**
    * 服务分类
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

    /**
     * Get 新增版本时需要填写 
     * @return ServiceGroupId 新增版本时需要填写
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set 新增版本时需要填写
     * @param ServiceGroupId 新增版本时需要填写
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get 不超过60个字，仅支持英文、数字、下划线"_"、短横"-"，只能以英文、数字开头 
     * @return ServiceGroupName 不超过60个字，仅支持英文、数字、下划线"_"、短横"-"，只能以英文、数字开头
     */
    public String getServiceGroupName() {
        return this.ServiceGroupName;
    }

    /**
     * Set 不超过60个字，仅支持英文、数字、下划线"_"、短横"-"，只能以英文、数字开头
     * @param ServiceGroupName 不超过60个字，仅支持英文、数字、下划线"_"、短横"-"，只能以英文、数字开头
     */
    public void setServiceGroupName(String ServiceGroupName) {
        this.ServiceGroupName = ServiceGroupName;
    }

    /**
     * Get 模型服务的描述 
     * @return ServiceDescription 模型服务的描述
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set 模型服务的描述
     * @param ServiceDescription 模型服务的描述
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get 付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费） 
     * @return ChargeType 付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费）
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费）
     * @param ChargeType 付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费）
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 预付费模式下所属的资源组id，同服务组下唯一 
     * @return ResourceGroupId 预付费模式下所属的资源组id，同服务组下唯一
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 预付费模式下所属的资源组id，同服务组下唯一
     * @param ResourceGroupId 预付费模式下所属的资源组id，同服务组下唯一
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 模型信息，需要挂载模型时填写 
     * @return ModelInfo 模型信息，需要挂载模型时填写
     */
    public ModelInfo getModelInfo() {
        return this.ModelInfo;
    }

    /**
     * Set 模型信息，需要挂载模型时填写
     * @param ModelInfo 模型信息，需要挂载模型时填写
     */
    public void setModelInfo(ModelInfo ModelInfo) {
        this.ModelInfo = ModelInfo;
    }

    /**
     * Get 镜像信息，配置服务运行所需的镜像地址等信息 
     * @return ImageInfo 镜像信息，配置服务运行所需的镜像地址等信息
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 镜像信息，配置服务运行所需的镜像地址等信息
     * @param ImageInfo 镜像信息，配置服务运行所需的镜像地址等信息
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get 环境变量，可选参数，用于配置容器中的环境变量 
     * @return Env 环境变量，可选参数，用于配置容器中的环境变量
     */
    public EnvVar [] getEnv() {
        return this.Env;
    }

    /**
     * Set 环境变量，可选参数，用于配置容器中的环境变量
     * @param Env 环境变量，可选参数，用于配置容器中的环境变量
     */
    public void setEnv(EnvVar [] Env) {
        this.Env = Env;
    }

    /**
     * Get 资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写 
     * @return Resources 资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写
     */
    public ResourceInfo getResources() {
        return this.Resources;
    }

    /**
     * Set 资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写
     * @param Resources 资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写
     */
    public void setResources(ResourceInfo Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:
TI.S.MEDIUM.POST	2C4G
TI.S.LARGE.POST	4C8G
TI.S.2XLARGE16.POST	8C16G
TI.S.2XLARGE32.POST	8C32G
TI.S.4XLARGE32.POST	16C32G
TI.S.4XLARGE64.POST	16C64G
TI.S.6XLARGE48.POST	24C48G
TI.S.6XLARGE96.POST	24C96G
TI.S.8XLARGE64.POST	32C64G
TI.S.8XLARGE128.POST 32C128G
TI.GN7.LARGE20.POST	4C20G T4*1/4
TI.GN7.2XLARGE40.POST	10C40G T4*1/2
TI.GN7.2XLARGE32.POST	8C32G T4*1
TI.GN7.5XLARGE80.POST	20C80G T4*1
TI.GN7.8XLARGE128.POST	32C128G T4*1
TI.GN7.10XLARGE160.POST	40C160G T4*2
TI.GN7.20XLARGE320.POST	80C320G T4*4 
     * @return InstanceType 使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:
TI.S.MEDIUM.POST	2C4G
TI.S.LARGE.POST	4C8G
TI.S.2XLARGE16.POST	8C16G
TI.S.2XLARGE32.POST	8C32G
TI.S.4XLARGE32.POST	16C32G
TI.S.4XLARGE64.POST	16C64G
TI.S.6XLARGE48.POST	24C48G
TI.S.6XLARGE96.POST	24C96G
TI.S.8XLARGE64.POST	32C64G
TI.S.8XLARGE128.POST 32C128G
TI.GN7.LARGE20.POST	4C20G T4*1/4
TI.GN7.2XLARGE40.POST	10C40G T4*1/2
TI.GN7.2XLARGE32.POST	8C32G T4*1
TI.GN7.5XLARGE80.POST	20C80G T4*1
TI.GN7.8XLARGE128.POST	32C128G T4*1
TI.GN7.10XLARGE160.POST	40C160G T4*2
TI.GN7.20XLARGE320.POST	80C320G T4*4
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:
TI.S.MEDIUM.POST	2C4G
TI.S.LARGE.POST	4C8G
TI.S.2XLARGE16.POST	8C16G
TI.S.2XLARGE32.POST	8C32G
TI.S.4XLARGE32.POST	16C32G
TI.S.4XLARGE64.POST	16C64G
TI.S.6XLARGE48.POST	24C48G
TI.S.6XLARGE96.POST	24C96G
TI.S.8XLARGE64.POST	32C64G
TI.S.8XLARGE128.POST 32C128G
TI.GN7.LARGE20.POST	4C20G T4*1/4
TI.GN7.2XLARGE40.POST	10C40G T4*1/2
TI.GN7.2XLARGE32.POST	8C32G T4*1
TI.GN7.5XLARGE80.POST	20C80G T4*1
TI.GN7.8XLARGE128.POST	32C128G T4*1
TI.GN7.10XLARGE160.POST	40C160G T4*2
TI.GN7.20XLARGE320.POST	80C320G T4*4
     * @param InstanceType 使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:
TI.S.MEDIUM.POST	2C4G
TI.S.LARGE.POST	4C8G
TI.S.2XLARGE16.POST	8C16G
TI.S.2XLARGE32.POST	8C32G
TI.S.4XLARGE32.POST	16C32G
TI.S.4XLARGE64.POST	16C64G
TI.S.6XLARGE48.POST	24C48G
TI.S.6XLARGE96.POST	24C96G
TI.S.8XLARGE64.POST	32C64G
TI.S.8XLARGE128.POST 32C128G
TI.GN7.LARGE20.POST	4C20G T4*1/4
TI.GN7.2XLARGE40.POST	10C40G T4*1/2
TI.GN7.2XLARGE32.POST	8C32G T4*1
TI.GN7.5XLARGE80.POST	20C80G T4*1
TI.GN7.8XLARGE128.POST	32C128G T4*1
TI.GN7.10XLARGE160.POST	40C160G T4*2
TI.GN7.20XLARGE320.POST	80C320G T4*4
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 扩缩容类型 支持：自动 - "AUTO", 手动 - "MANUAL",默认为MANUAL 
     * @return ScaleMode 扩缩容类型 支持：自动 - "AUTO", 手动 - "MANUAL",默认为MANUAL
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * Set 扩缩容类型 支持：自动 - "AUTO", 手动 - "MANUAL",默认为MANUAL
     * @param ScaleMode 扩缩容类型 支持：自动 - "AUTO", 手动 - "MANUAL",默认为MANUAL
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * Get 实例数量, 不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量 
     * @return Replicas 实例数量, 不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 实例数量, 不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量
     * @param Replicas 实例数量, 不同计费模式和调节模式下对应关系如下
PREPAID 和 POSTPAID_BY_HOUR:
手动调节模式下对应 实例数量
自动调节模式下对应 基于时间的默认策略的实例数量
HYBRID_PAID:
后付费实例手动调节模式下对应 实例数量
后付费实例自动调节模式下对应 时间策略的默认策略的实例数量
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 自动伸缩信息 
     * @return HorizontalPodAutoscaler 自动伸缩信息
     */
    public HorizontalPodAutoscaler getHorizontalPodAutoscaler() {
        return this.HorizontalPodAutoscaler;
    }

    /**
     * Set 自动伸缩信息
     * @param HorizontalPodAutoscaler 自动伸缩信息
     */
    public void setHorizontalPodAutoscaler(HorizontalPodAutoscaler HorizontalPodAutoscaler) {
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
    }

    /**
     * Get 是否开启日志投递，开启后需填写配置投递到指定cls 
     * @return LogEnable 是否开启日志投递，开启后需填写配置投递到指定cls
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set 是否开启日志投递，开启后需填写配置投递到指定cls
     * @param LogEnable 是否开启日志投递，开启后需填写配置投递到指定cls
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get 日志配置，需要投递服务日志到指定cls时填写 
     * @return LogConfig 日志配置，需要投递服务日志到指定cls时填写
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set 日志配置，需要投递服务日志到指定cls时填写
     * @param LogConfig 日志配置，需要投递服务日志到指定cls时填写
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get 是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权 
     * @return AuthorizationEnable 是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权
     */
    public Boolean getAuthorizationEnable() {
        return this.AuthorizationEnable;
    }

    /**
     * Set 是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权
     * @param AuthorizationEnable 是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权
     */
    public void setAuthorizationEnable(Boolean AuthorizationEnable) {
        this.AuthorizationEnable = AuthorizationEnable;
    }

    /**
     * Get 腾讯云标签 
     * @return Tags 腾讯云标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 腾讯云标签
     * @param Tags 腾讯云标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否新增版本 
     * @return NewVersion 是否新增版本
     */
    public Boolean getNewVersion() {
        return this.NewVersion;
    }

    /**
     * Set 是否新增版本
     * @param NewVersion 是否新增版本
     */
    public void setNewVersion(Boolean NewVersion) {
        this.NewVersion = NewVersion;
    }

    /**
     * Get 定时任务配置，使用定时策略时填写 
     * @return CronScaleJobs 定时任务配置，使用定时策略时填写
     */
    public CronScaleJob [] getCronScaleJobs() {
        return this.CronScaleJobs;
    }

    /**
     * Set 定时任务配置，使用定时策略时填写
     * @param CronScaleJobs 定时任务配置，使用定时策略时填写
     */
    public void setCronScaleJobs(CronScaleJob [] CronScaleJobs) {
        this.CronScaleJobs = CronScaleJobs;
    }

    /**
     * Get 自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩 
     * @return ScaleStrategy 自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩
     */
    public String getScaleStrategy() {
        return this.ScaleStrategy;
    }

    /**
     * Set 自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩
     * @param ScaleStrategy 自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩
     */
    public void setScaleStrategy(String ScaleStrategy) {
        this.ScaleStrategy = ScaleStrategy;
    }

    /**
     * Get 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数 
     * @return HybridBillingPrepaidReplicas 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数
     */
    public Long getHybridBillingPrepaidReplicas() {
        return this.HybridBillingPrepaidReplicas;
    }

    /**
     * Set 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数
     * @param HybridBillingPrepaidReplicas 计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数
     */
    public void setHybridBillingPrepaidReplicas(Long HybridBillingPrepaidReplicas) {
        this.HybridBillingPrepaidReplicas = HybridBillingPrepaidReplicas;
    }

    /**
     * Get [AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认] 
     * @return CreateSource [AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认]
     */
    public String getCreateSource() {
        return this.CreateSource;
    }

    /**
     * Set [AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认]
     * @param CreateSource [AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认]
     */
    public void setCreateSource(String CreateSource) {
        this.CreateSource = CreateSource;
    }

    /**
     * Get 是否开启模型的热更新。默认不开启 
     * @return ModelHotUpdateEnable 是否开启模型的热更新。默认不开启
     */
    public Boolean getModelHotUpdateEnable() {
        return this.ModelHotUpdateEnable;
    }

    /**
     * Set 是否开启模型的热更新。默认不开启
     * @param ModelHotUpdateEnable 是否开启模型的热更新。默认不开启
     */
    public void setModelHotUpdateEnable(Boolean ModelHotUpdateEnable) {
        this.ModelHotUpdateEnable = ModelHotUpdateEnable;
    }

    /**
     * Get 定时停止配置 
     * @return ScheduledAction 定时停止配置
     */
    public ScheduledAction getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set 定时停止配置
     * @param ScheduledAction 定时停止配置
     */
    public void setScheduledAction(ScheduledAction ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get 挂载配置，目前只支持CFS 
     * @return VolumeMount 挂载配置，目前只支持CFS
     */
    public VolumeMount getVolumeMount() {
        return this.VolumeMount;
    }

    /**
     * Set 挂载配置，目前只支持CFS
     * @param VolumeMount 挂载配置，目前只支持CFS
     */
    public void setVolumeMount(VolumeMount VolumeMount) {
        this.VolumeMount = VolumeMount;
    }

    /**
     * Get 服务限速限流相关配置 
     * @return ServiceLimit 服务限速限流相关配置
     */
    public ServiceLimit getServiceLimit() {
        return this.ServiceLimit;
    }

    /**
     * Set 服务限速限流相关配置
     * @param ServiceLimit 服务限速限流相关配置
     */
    public void setServiceLimit(ServiceLimit ServiceLimit) {
        this.ServiceLimit = ServiceLimit;
    }

    /**
     * Get 回调地址，用于回调创建服务状态信息，回调格式&内容详情见：[TI-ONE 接口回调说明](https://cloud.tencent.com/document/product/851/84292) 
     * @return CallbackUrl 回调地址，用于回调创建服务状态信息，回调格式&内容详情见：[TI-ONE 接口回调说明](https://cloud.tencent.com/document/product/851/84292)
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调地址，用于回调创建服务状态信息，回调格式&内容详情见：[TI-ONE 接口回调说明](https://cloud.tencent.com/document/product/851/84292)
     * @param CallbackUrl 回调地址，用于回调创建服务状态信息，回调格式&内容详情见：[TI-ONE 接口回调说明](https://cloud.tencent.com/document/product/851/84292)
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。 
     * @return ModelTurboEnable 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。
     */
    public Boolean getModelTurboEnable() {
        return this.ModelTurboEnable;
    }

    /**
     * Set 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。
     * @param ModelTurboEnable 是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。
     */
    public void setModelTurboEnable(Boolean ModelTurboEnable) {
        this.ModelTurboEnable = ModelTurboEnable;
    }

    /**
     * Get 服务分类 
     * @return ServiceCategory 服务分类
     */
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set 服务分类
     * @param ServiceCategory 服务分类
     */
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }

    public CreateModelServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelServiceRequest(CreateModelServiceRequest source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.ServiceGroupName != null) {
            this.ServiceGroupName = new String(source.ServiceGroupName);
        }
        if (source.ServiceDescription != null) {
            this.ServiceDescription = new String(source.ServiceDescription);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ModelInfo != null) {
            this.ModelInfo = new ModelInfo(source.ModelInfo);
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
        if (source.ScaleMode != null) {
            this.ScaleMode = new String(source.ScaleMode);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.HorizontalPodAutoscaler != null) {
            this.HorizontalPodAutoscaler = new HorizontalPodAutoscaler(source.HorizontalPodAutoscaler);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.NewVersion != null) {
            this.NewVersion = new Boolean(source.NewVersion);
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
        if (source.HybridBillingPrepaidReplicas != null) {
            this.HybridBillingPrepaidReplicas = new Long(source.HybridBillingPrepaidReplicas);
        }
        if (source.CreateSource != null) {
            this.CreateSource = new String(source.CreateSource);
        }
        if (source.ModelHotUpdateEnable != null) {
            this.ModelHotUpdateEnable = new Boolean(source.ModelHotUpdateEnable);
        }
        if (source.ScheduledAction != null) {
            this.ScheduledAction = new ScheduledAction(source.ScheduledAction);
        }
        if (source.VolumeMount != null) {
            this.VolumeMount = new VolumeMount(source.VolumeMount);
        }
        if (source.ServiceLimit != null) {
            this.ServiceLimit = new ServiceLimit(source.ServiceLimit);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ModelTurboEnable != null) {
            this.ModelTurboEnable = new Boolean(source.ModelTurboEnable);
        }
        if (source.ServiceCategory != null) {
            this.ServiceCategory = new String(source.ServiceCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "ServiceGroupName", this.ServiceGroupName);
        this.setParamSimple(map, prefix + "ServiceDescription", this.ServiceDescription);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamObj(map, prefix + "ModelInfo.", this.ModelInfo);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamArrayObj(map, prefix + "Env.", this.Env);
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ScaleMode", this.ScaleMode);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamObj(map, prefix + "HorizontalPodAutoscaler.", this.HorizontalPodAutoscaler);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "AuthorizationEnable", this.AuthorizationEnable);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NewVersion", this.NewVersion);
        this.setParamArrayObj(map, prefix + "CronScaleJobs.", this.CronScaleJobs);
        this.setParamSimple(map, prefix + "ScaleStrategy", this.ScaleStrategy);
        this.setParamSimple(map, prefix + "HybridBillingPrepaidReplicas", this.HybridBillingPrepaidReplicas);
        this.setParamSimple(map, prefix + "CreateSource", this.CreateSource);
        this.setParamSimple(map, prefix + "ModelHotUpdateEnable", this.ModelHotUpdateEnable);
        this.setParamObj(map, prefix + "ScheduledAction.", this.ScheduledAction);
        this.setParamObj(map, prefix + "VolumeMount.", this.VolumeMount);
        this.setParamObj(map, prefix + "ServiceLimit.", this.ServiceLimit);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ModelTurboEnable", this.ModelTurboEnable);
        this.setParamSimple(map, prefix + "ServiceCategory", this.ServiceCategory);

    }
}

