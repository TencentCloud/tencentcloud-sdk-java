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

public class CreateModelServiceRequest extends AbstractModel {

    /**
    * <p>新增版本时需要填写</p>
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * <p>不超过60个字，仅支持英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以英文、数字开头</p>
    */
    @SerializedName("ServiceGroupName")
    @Expose
    private String ServiceGroupName;

    /**
    * <p>模型服务的描述</p>
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * <p>付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费）</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>预付费模式下所属的资源组id，同服务组下唯一</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>模型信息，需要挂载模型时填写</p>
    */
    @SerializedName("ModelInfo")
    @Expose
    private ModelInfo ModelInfo;

    /**
    * <p>镜像信息，配置服务运行所需的镜像地址等信息</p>
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * <p>环境变量，可选参数，用于配置容器中的环境变量</p>
    */
    @SerializedName("Env")
    @Expose
    private EnvVar [] Env;

    /**
    * <p>资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写</p>
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo Resources;

    /**
    * <p>使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:<br>TI.S.MEDIUM.POST    2C4G<br>TI.S.LARGE.POST    4C8G<br>TI.S.2XLARGE16.POST    8C16G<br>TI.S.2XLARGE32.POST    8C32G<br>TI.S.4XLARGE32.POST    16C32G<br>TI.S.4XLARGE64.POST    16C64G<br>TI.S.6XLARGE48.POST    24C48G<br>TI.S.6XLARGE96.POST    24C96G<br>TI.S.8XLARGE64.POST    32C64G<br>TI.S.8XLARGE128.POST 32C128G<br>TI.GN7.LARGE20.POST    4C20G T4<em>1/4<br>TI.GN7.2XLARGE40.POST    10C40G T4</em>1/2<br>TI.GN7.2XLARGE32.POST    8C32G T4<em>1<br>TI.GN7.5XLARGE80.POST    20C80G T4</em>1<br>TI.GN7.8XLARGE128.POST    32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST    40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST    80C320G T4*4</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>扩缩容类型 支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;,默认为MANUAL</p>
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

    /**
    * <p>实例数量, 不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p>
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * <p>自动伸缩信息</p>
    */
    @SerializedName("HorizontalPodAutoscaler")
    @Expose
    private HorizontalPodAutoscaler HorizontalPodAutoscaler;

    /**
    * <p>是否开启日志投递，开启后需填写配置投递到指定cls</p>
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * <p>日志配置，需要投递服务日志到指定cls时填写</p>
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * <p>是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权</p>
    */
    @SerializedName("AuthorizationEnable")
    @Expose
    private Boolean AuthorizationEnable;

    /**
    * <p>腾讯云标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否新增版本</p>
    */
    @SerializedName("NewVersion")
    @Expose
    private Boolean NewVersion;

    /**
    * <p>定时任务配置，使用定时策略时填写</p>
    */
    @SerializedName("CronScaleJobs")
    @Expose
    private CronScaleJob [] CronScaleJobs;

    /**
    * <p>自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩</p>
    */
    @SerializedName("ScaleStrategy")
    @Expose
    private String ScaleStrategy;

    /**
    * <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数</p>
    */
    @SerializedName("HybridBillingPrepaidReplicas")
    @Expose
    private Long HybridBillingPrepaidReplicas;

    /**
    * <p>[AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认]</p>
    */
    @SerializedName("CreateSource")
    @Expose
    private String CreateSource;

    /**
    * <p>是否开启模型的热更新。默认不开启</p>
    */
    @SerializedName("ModelHotUpdateEnable")
    @Expose
    private Boolean ModelHotUpdateEnable;

    /**
    * <p>定时停止配置</p>
    */
    @SerializedName("ScheduledAction")
    @Expose
    private ScheduledAction ScheduledAction;

    /**
    * <p>挂载配置，目前只支持CFS</p>
    */
    @SerializedName("VolumeMount")
    @Expose
    private VolumeMount VolumeMount;

    /**
    * <p>服务限速限流相关配置</p>
    */
    @SerializedName("ServiceLimit")
    @Expose
    private ServiceLimit ServiceLimit;

    /**
    * <p>回调地址，用于回调创建服务状态信息，回调格式&amp;内容详情见：<a href="https://cloud.tencent.com/document/product/851/84292">TI-ONE 接口回调说明</a></p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p>
    */
    @SerializedName("ModelTurboEnable")
    @Expose
    private Boolean ModelTurboEnable;

    /**
    * <p>服务分类</p>
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

    /**
    * <p>服务的启动命令，如遇特殊字符导致配置失败，可使用CommandBase64参数</p>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * <p>是否开启TIONE内网访问外部，此功能仅支持后付费机型与从TIONE平台购买的预付费机型；使用从CVM选择资源组时此配置不生效。</p>
    */
    @SerializedName("ServiceEIP")
    @Expose
    private ServiceEIP ServiceEIP;

    /**
    * <p>服务的启动命令，以base64格式进行输入，与Command同时配置时，仅当前参数生效</p>
    */
    @SerializedName("CommandBase64")
    @Expose
    private String CommandBase64;

    /**
    * <p>服务端口，仅在非内置镜像时生效，默认8501。不支持输入8501-8510,6006,9092</p>
    */
    @SerializedName("ServicePort")
    @Expose
    private Long ServicePort;

    /**
    * <p>服务的部署类型 [标准部署，分布式多机部署，] 默认STANDARD</p><p>枚举值：</p><ul><li>STANDARD： 标准部署</li><li>DIST： 多机分布式部署</li><li>ROLE_SET： 多角色部署</li></ul>
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p>
    */
    @SerializedName("InstancePerReplicas")
    @Expose
    private Long InstancePerReplicas;

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
    * <p>是否启用 grpc 端口</p>
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
    * <p>滚动更新策略</p>
    */
    @SerializedName("RollingUpdate")
    @Expose
    private RollingUpdate RollingUpdate;

    /**
    * <p>sidecar配置</p>
    */
    @SerializedName("Sidecar")
    @Expose
    private SidecarSpec Sidecar;

    /**
    * <p>数据盘批量挂载配置，当前仅支持CFS，仅针对“模型来源-腾讯云存储、模型来源-腾讯云容器镜像、模型来源-资源组、模型来源-数据源”。</p>
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
    * <p>网关日志投递相关配置</p>
    */
    @SerializedName("GatewayLogConfig")
    @Expose
    private LogConfig GatewayLogConfig;

    /**
    * <p>网关相关配置</p>
    */
    @SerializedName("GatewayConfig")
    @Expose
    private GatewayConfig GatewayConfig;

    /**
     * Get <p>新增版本时需要填写</p> 
     * @return ServiceGroupId <p>新增版本时需要填写</p>
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set <p>新增版本时需要填写</p>
     * @param ServiceGroupId <p>新增版本时需要填写</p>
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get <p>不超过60个字，仅支持英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以英文、数字开头</p> 
     * @return ServiceGroupName <p>不超过60个字，仅支持英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以英文、数字开头</p>
     */
    public String getServiceGroupName() {
        return this.ServiceGroupName;
    }

    /**
     * Set <p>不超过60个字，仅支持英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以英文、数字开头</p>
     * @param ServiceGroupName <p>不超过60个字，仅支持英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以英文、数字开头</p>
     */
    public void setServiceGroupName(String ServiceGroupName) {
        this.ServiceGroupName = ServiceGroupName;
    }

    /**
     * Get <p>模型服务的描述</p> 
     * @return ServiceDescription <p>模型服务的描述</p>
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set <p>模型服务的描述</p>
     * @param ServiceDescription <p>模型服务的描述</p>
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get <p>付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费）</p> 
     * @return ChargeType <p>付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费）</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费）</p>
     * @param ChargeType <p>付费模式,有 PREPAID （包年包月）和 POSTPAID_BY_HOUR（按量付费）</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>预付费模式下所属的资源组id，同服务组下唯一</p> 
     * @return ResourceGroupId <p>预付费模式下所属的资源组id，同服务组下唯一</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>预付费模式下所属的资源组id，同服务组下唯一</p>
     * @param ResourceGroupId <p>预付费模式下所属的资源组id，同服务组下唯一</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>模型信息，需要挂载模型时填写</p> 
     * @return ModelInfo <p>模型信息，需要挂载模型时填写</p>
     */
    public ModelInfo getModelInfo() {
        return this.ModelInfo;
    }

    /**
     * Set <p>模型信息，需要挂载模型时填写</p>
     * @param ModelInfo <p>模型信息，需要挂载模型时填写</p>
     */
    public void setModelInfo(ModelInfo ModelInfo) {
        this.ModelInfo = ModelInfo;
    }

    /**
     * Get <p>镜像信息，配置服务运行所需的镜像地址等信息</p> 
     * @return ImageInfo <p>镜像信息，配置服务运行所需的镜像地址等信息</p>
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set <p>镜像信息，配置服务运行所需的镜像地址等信息</p>
     * @param ImageInfo <p>镜像信息，配置服务运行所需的镜像地址等信息</p>
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get <p>环境变量，可选参数，用于配置容器中的环境变量</p> 
     * @return Env <p>环境变量，可选参数，用于配置容器中的环境变量</p>
     */
    public EnvVar [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境变量，可选参数，用于配置容器中的环境变量</p>
     * @param Env <p>环境变量，可选参数，用于配置容器中的环境变量</p>
     */
    public void setEnv(EnvVar [] Env) {
        this.Env = Env;
    }

    /**
     * Get <p>资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写</p> 
     * @return Resources <p>资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写</p>
     */
    public ResourceInfo getResources() {
        return this.Resources;
    }

    /**
     * Set <p>资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写</p>
     * @param Resources <p>资源描述，指定包年包月模式下的cpu,mem,gpu等信息，后付费无需填写</p>
     */
    public void setResources(ResourceInfo Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:<br>TI.S.MEDIUM.POST    2C4G<br>TI.S.LARGE.POST    4C8G<br>TI.S.2XLARGE16.POST    8C16G<br>TI.S.2XLARGE32.POST    8C32G<br>TI.S.4XLARGE32.POST    16C32G<br>TI.S.4XLARGE64.POST    16C64G<br>TI.S.6XLARGE48.POST    24C48G<br>TI.S.6XLARGE96.POST    24C96G<br>TI.S.8XLARGE64.POST    32C64G<br>TI.S.8XLARGE128.POST 32C128G<br>TI.GN7.LARGE20.POST    4C20G T4<em>1/4<br>TI.GN7.2XLARGE40.POST    10C40G T4</em>1/2<br>TI.GN7.2XLARGE32.POST    8C32G T4<em>1<br>TI.GN7.5XLARGE80.POST    20C80G T4</em>1<br>TI.GN7.8XLARGE128.POST    32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST    40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST    80C320G T4*4</p> 
     * @return InstanceType <p>使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:<br>TI.S.MEDIUM.POST    2C4G<br>TI.S.LARGE.POST    4C8G<br>TI.S.2XLARGE16.POST    8C16G<br>TI.S.2XLARGE32.POST    8C32G<br>TI.S.4XLARGE32.POST    16C32G<br>TI.S.4XLARGE64.POST    16C64G<br>TI.S.6XLARGE48.POST    24C48G<br>TI.S.6XLARGE96.POST    24C96G<br>TI.S.8XLARGE64.POST    32C64G<br>TI.S.8XLARGE128.POST 32C128G<br>TI.GN7.LARGE20.POST    4C20G T4<em>1/4<br>TI.GN7.2XLARGE40.POST    10C40G T4</em>1/2<br>TI.GN7.2XLARGE32.POST    8C32G T4<em>1<br>TI.GN7.5XLARGE80.POST    20C80G T4</em>1<br>TI.GN7.8XLARGE128.POST    32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST    40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST    80C320G T4*4</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:<br>TI.S.MEDIUM.POST    2C4G<br>TI.S.LARGE.POST    4C8G<br>TI.S.2XLARGE16.POST    8C16G<br>TI.S.2XLARGE32.POST    8C32G<br>TI.S.4XLARGE32.POST    16C32G<br>TI.S.4XLARGE64.POST    16C64G<br>TI.S.6XLARGE48.POST    24C48G<br>TI.S.6XLARGE96.POST    24C96G<br>TI.S.8XLARGE64.POST    32C64G<br>TI.S.8XLARGE128.POST 32C128G<br>TI.GN7.LARGE20.POST    4C20G T4<em>1/4<br>TI.GN7.2XLARGE40.POST    10C40G T4</em>1/2<br>TI.GN7.2XLARGE32.POST    8C32G T4<em>1<br>TI.GN7.5XLARGE80.POST    20C80G T4</em>1<br>TI.GN7.8XLARGE128.POST    32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST    40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST    80C320G T4*4</p>
     * @param InstanceType <p>使用DescribeBillingSpecs接口返回的规格列表中的值，或者参考实例列表:<br>TI.S.MEDIUM.POST    2C4G<br>TI.S.LARGE.POST    4C8G<br>TI.S.2XLARGE16.POST    8C16G<br>TI.S.2XLARGE32.POST    8C32G<br>TI.S.4XLARGE32.POST    16C32G<br>TI.S.4XLARGE64.POST    16C64G<br>TI.S.6XLARGE48.POST    24C48G<br>TI.S.6XLARGE96.POST    24C96G<br>TI.S.8XLARGE64.POST    32C64G<br>TI.S.8XLARGE128.POST 32C128G<br>TI.GN7.LARGE20.POST    4C20G T4<em>1/4<br>TI.GN7.2XLARGE40.POST    10C40G T4</em>1/2<br>TI.GN7.2XLARGE32.POST    8C32G T4<em>1<br>TI.GN7.5XLARGE80.POST    20C80G T4</em>1<br>TI.GN7.8XLARGE128.POST    32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST    40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST    80C320G T4*4</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>扩缩容类型 支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;,默认为MANUAL</p> 
     * @return ScaleMode <p>扩缩容类型 支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;,默认为MANUAL</p>
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * Set <p>扩缩容类型 支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;,默认为MANUAL</p>
     * @param ScaleMode <p>扩缩容类型 支持：自动 - &quot;AUTO&quot;, 手动 - &quot;MANUAL&quot;,默认为MANUAL</p>
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * Get <p>实例数量, 不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p> 
     * @return Replicas <p>实例数量, 不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p>
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>实例数量, 不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p>
     * @param Replicas <p>实例数量, 不同计费模式和调节模式下对应关系如下<br>PREPAID 和 POSTPAID_BY_HOUR:<br>手动调节模式下对应 实例数量<br>自动调节模式下对应 基于时间的默认策略的实例数量<br>HYBRID_PAID:<br>后付费实例手动调节模式下对应 实例数量<br>后付费实例自动调节模式下对应 时间策略的默认策略的实例数量</p>
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>自动伸缩信息</p> 
     * @return HorizontalPodAutoscaler <p>自动伸缩信息</p>
     */
    public HorizontalPodAutoscaler getHorizontalPodAutoscaler() {
        return this.HorizontalPodAutoscaler;
    }

    /**
     * Set <p>自动伸缩信息</p>
     * @param HorizontalPodAutoscaler <p>自动伸缩信息</p>
     */
    public void setHorizontalPodAutoscaler(HorizontalPodAutoscaler HorizontalPodAutoscaler) {
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
    }

    /**
     * Get <p>是否开启日志投递，开启后需填写配置投递到指定cls</p> 
     * @return LogEnable <p>是否开启日志投递，开启后需填写配置投递到指定cls</p>
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set <p>是否开启日志投递，开启后需填写配置投递到指定cls</p>
     * @param LogEnable <p>是否开启日志投递，开启后需填写配置投递到指定cls</p>
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get <p>日志配置，需要投递服务日志到指定cls时填写</p> 
     * @return LogConfig <p>日志配置，需要投递服务日志到指定cls时填写</p>
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set <p>日志配置，需要投递服务日志到指定cls时填写</p>
     * @param LogConfig <p>日志配置，需要投递服务日志到指定cls时填写</p>
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get <p>是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权</p> 
     * @return AuthorizationEnable <p>是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权</p>
     */
    public Boolean getAuthorizationEnable() {
        return this.AuthorizationEnable;
    }

    /**
     * Set <p>是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权</p>
     * @param AuthorizationEnable <p>是否开启接口鉴权，开启后自动生成token信息，访问需要token鉴权</p>
     */
    public void setAuthorizationEnable(Boolean AuthorizationEnable) {
        this.AuthorizationEnable = AuthorizationEnable;
    }

    /**
     * Get <p>腾讯云标签</p> 
     * @return Tags <p>腾讯云标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>腾讯云标签</p>
     * @param Tags <p>腾讯云标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否新增版本</p> 
     * @return NewVersion <p>是否新增版本</p>
     */
    public Boolean getNewVersion() {
        return this.NewVersion;
    }

    /**
     * Set <p>是否新增版本</p>
     * @param NewVersion <p>是否新增版本</p>
     */
    public void setNewVersion(Boolean NewVersion) {
        this.NewVersion = NewVersion;
    }

    /**
     * Get <p>定时任务配置，使用定时策略时填写</p> 
     * @return CronScaleJobs <p>定时任务配置，使用定时策略时填写</p>
     */
    public CronScaleJob [] getCronScaleJobs() {
        return this.CronScaleJobs;
    }

    /**
     * Set <p>定时任务配置，使用定时策略时填写</p>
     * @param CronScaleJobs <p>定时任务配置，使用定时策略时填写</p>
     */
    public void setCronScaleJobs(CronScaleJob [] CronScaleJobs) {
        this.CronScaleJobs = CronScaleJobs;
    }

    /**
     * Get <p>自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩</p> 
     * @return ScaleStrategy <p>自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩</p>
     */
    public String getScaleStrategy() {
        return this.ScaleStrategy;
    }

    /**
     * Set <p>自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩</p>
     * @param ScaleStrategy <p>自动伸缩策略配置 HPA : 通过HPA进行弹性伸缩 CRON 通过定时任务进行伸缩</p>
     */
    public void setScaleStrategy(String ScaleStrategy) {
        this.ScaleStrategy = ScaleStrategy;
    }

    /**
     * Get <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数</p> 
     * @return HybridBillingPrepaidReplicas <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数</p>
     */
    public Long getHybridBillingPrepaidReplicas() {
        return this.HybridBillingPrepaidReplicas;
    }

    /**
     * Set <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数</p>
     * @param HybridBillingPrepaidReplicas <p>计费模式[HYBRID_PAID]时生效, 用于标识混合计费模式下的预付费实例数</p>
     */
    public void setHybridBillingPrepaidReplicas(Long HybridBillingPrepaidReplicas) {
        this.HybridBillingPrepaidReplicas = HybridBillingPrepaidReplicas;
    }

    /**
     * Get <p>[AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认]</p> 
     * @return CreateSource <p>[AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认]</p>
     */
    public String getCreateSource() {
        return this.CreateSource;
    }

    /**
     * Set <p>[AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认]</p>
     * @param CreateSource <p>[AUTO_ML 自动学习，自动学习正式发布 AUTO_ML_FORMAL, DEFAULT 默认]</p>
     */
    public void setCreateSource(String CreateSource) {
        this.CreateSource = CreateSource;
    }

    /**
     * Get <p>是否开启模型的热更新。默认不开启</p> 
     * @return ModelHotUpdateEnable <p>是否开启模型的热更新。默认不开启</p>
     */
    public Boolean getModelHotUpdateEnable() {
        return this.ModelHotUpdateEnable;
    }

    /**
     * Set <p>是否开启模型的热更新。默认不开启</p>
     * @param ModelHotUpdateEnable <p>是否开启模型的热更新。默认不开启</p>
     */
    public void setModelHotUpdateEnable(Boolean ModelHotUpdateEnable) {
        this.ModelHotUpdateEnable = ModelHotUpdateEnable;
    }

    /**
     * Get <p>定时停止配置</p> 
     * @return ScheduledAction <p>定时停止配置</p>
     */
    public ScheduledAction getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set <p>定时停止配置</p>
     * @param ScheduledAction <p>定时停止配置</p>
     */
    public void setScheduledAction(ScheduledAction ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get <p>挂载配置，目前只支持CFS</p> 
     * @return VolumeMount <p>挂载配置，目前只支持CFS</p>
     */
    public VolumeMount getVolumeMount() {
        return this.VolumeMount;
    }

    /**
     * Set <p>挂载配置，目前只支持CFS</p>
     * @param VolumeMount <p>挂载配置，目前只支持CFS</p>
     */
    public void setVolumeMount(VolumeMount VolumeMount) {
        this.VolumeMount = VolumeMount;
    }

    /**
     * Get <p>服务限速限流相关配置</p> 
     * @return ServiceLimit <p>服务限速限流相关配置</p>
     */
    public ServiceLimit getServiceLimit() {
        return this.ServiceLimit;
    }

    /**
     * Set <p>服务限速限流相关配置</p>
     * @param ServiceLimit <p>服务限速限流相关配置</p>
     */
    public void setServiceLimit(ServiceLimit ServiceLimit) {
        this.ServiceLimit = ServiceLimit;
    }

    /**
     * Get <p>回调地址，用于回调创建服务状态信息，回调格式&amp;内容详情见：<a href="https://cloud.tencent.com/document/product/851/84292">TI-ONE 接口回调说明</a></p> 
     * @return CallbackUrl <p>回调地址，用于回调创建服务状态信息，回调格式&amp;内容详情见：<a href="https://cloud.tencent.com/document/product/851/84292">TI-ONE 接口回调说明</a></p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调地址，用于回调创建服务状态信息，回调格式&amp;内容详情见：<a href="https://cloud.tencent.com/document/product/851/84292">TI-ONE 接口回调说明</a></p>
     * @param CallbackUrl <p>回调地址，用于回调创建服务状态信息，回调格式&amp;内容详情见：<a href="https://cloud.tencent.com/document/product/851/84292">TI-ONE 接口回调说明</a></p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p> 
     * @return ModelTurboEnable <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p>
     */
    public Boolean getModelTurboEnable() {
        return this.ModelTurboEnable;
    }

    /**
     * Set <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p>
     * @param ModelTurboEnable <p>是否开启模型的加速, 仅对StableDiffusion(动态加速)格式的模型有效。</p>
     */
    public void setModelTurboEnable(Boolean ModelTurboEnable) {
        this.ModelTurboEnable = ModelTurboEnable;
    }

    /**
     * Get <p>服务分类</p> 
     * @return ServiceCategory <p>服务分类</p>
     */
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set <p>服务分类</p>
     * @param ServiceCategory <p>服务分类</p>
     */
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }

    /**
     * Get <p>服务的启动命令，如遇特殊字符导致配置失败，可使用CommandBase64参数</p> 
     * @return Command <p>服务的启动命令，如遇特殊字符导致配置失败，可使用CommandBase64参数</p>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>服务的启动命令，如遇特殊字符导致配置失败，可使用CommandBase64参数</p>
     * @param Command <p>服务的启动命令，如遇特殊字符导致配置失败，可使用CommandBase64参数</p>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get <p>是否开启TIONE内网访问外部，此功能仅支持后付费机型与从TIONE平台购买的预付费机型；使用从CVM选择资源组时此配置不生效。</p> 
     * @return ServiceEIP <p>是否开启TIONE内网访问外部，此功能仅支持后付费机型与从TIONE平台购买的预付费机型；使用从CVM选择资源组时此配置不生效。</p>
     */
    public ServiceEIP getServiceEIP() {
        return this.ServiceEIP;
    }

    /**
     * Set <p>是否开启TIONE内网访问外部，此功能仅支持后付费机型与从TIONE平台购买的预付费机型；使用从CVM选择资源组时此配置不生效。</p>
     * @param ServiceEIP <p>是否开启TIONE内网访问外部，此功能仅支持后付费机型与从TIONE平台购买的预付费机型；使用从CVM选择资源组时此配置不生效。</p>
     */
    public void setServiceEIP(ServiceEIP ServiceEIP) {
        this.ServiceEIP = ServiceEIP;
    }

    /**
     * Get <p>服务的启动命令，以base64格式进行输入，与Command同时配置时，仅当前参数生效</p> 
     * @return CommandBase64 <p>服务的启动命令，以base64格式进行输入，与Command同时配置时，仅当前参数生效</p>
     */
    public String getCommandBase64() {
        return this.CommandBase64;
    }

    /**
     * Set <p>服务的启动命令，以base64格式进行输入，与Command同时配置时，仅当前参数生效</p>
     * @param CommandBase64 <p>服务的启动命令，以base64格式进行输入，与Command同时配置时，仅当前参数生效</p>
     */
    public void setCommandBase64(String CommandBase64) {
        this.CommandBase64 = CommandBase64;
    }

    /**
     * Get <p>服务端口，仅在非内置镜像时生效，默认8501。不支持输入8501-8510,6006,9092</p> 
     * @return ServicePort <p>服务端口，仅在非内置镜像时生效，默认8501。不支持输入8501-8510,6006,9092</p>
     */
    public Long getServicePort() {
        return this.ServicePort;
    }

    /**
     * Set <p>服务端口，仅在非内置镜像时生效，默认8501。不支持输入8501-8510,6006,9092</p>
     * @param ServicePort <p>服务端口，仅在非内置镜像时生效，默认8501。不支持输入8501-8510,6006,9092</p>
     */
    public void setServicePort(Long ServicePort) {
        this.ServicePort = ServicePort;
    }

    /**
     * Get <p>服务的部署类型 [标准部署，分布式多机部署，] 默认STANDARD</p><p>枚举值：</p><ul><li>STANDARD： 标准部署</li><li>DIST： 多机分布式部署</li><li>ROLE_SET： 多角色部署</li></ul> 
     * @return DeployType <p>服务的部署类型 [标准部署，分布式多机部署，] 默认STANDARD</p><p>枚举值：</p><ul><li>STANDARD： 标准部署</li><li>DIST： 多机分布式部署</li><li>ROLE_SET： 多角色部署</li></ul>
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set <p>服务的部署类型 [标准部署，分布式多机部署，] 默认STANDARD</p><p>枚举值：</p><ul><li>STANDARD： 标准部署</li><li>DIST： 多机分布式部署</li><li>ROLE_SET： 多角色部署</li></ul>
     * @param DeployType <p>服务的部署类型 [标准部署，分布式多机部署，] 默认STANDARD</p><p>枚举值：</p><ul><li>STANDARD： 标准部署</li><li>DIST： 多机分布式部署</li><li>ROLE_SET： 多角色部署</li></ul>
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    /**
     * Get <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p> 
     * @return InstancePerReplicas <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p>
     */
    public Long getInstancePerReplicas() {
        return this.InstancePerReplicas;
    }

    /**
     * Set <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p>
     * @param InstancePerReplicas <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p>
     */
    public void setInstancePerReplicas(Long InstancePerReplicas) {
        this.InstancePerReplicas = InstancePerReplicas;
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
     * Get <p>是否启用 grpc 端口</p> 
     * @return GrpcEnable <p>是否启用 grpc 端口</p>
     */
    public Boolean getGrpcEnable() {
        return this.GrpcEnable;
    }

    /**
     * Set <p>是否启用 grpc 端口</p>
     * @param GrpcEnable <p>是否启用 grpc 端口</p>
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
     * Get <p>滚动更新策略</p> 
     * @return RollingUpdate <p>滚动更新策略</p>
     */
    public RollingUpdate getRollingUpdate() {
        return this.RollingUpdate;
    }

    /**
     * Set <p>滚动更新策略</p>
     * @param RollingUpdate <p>滚动更新策略</p>
     */
    public void setRollingUpdate(RollingUpdate RollingUpdate) {
        this.RollingUpdate = RollingUpdate;
    }

    /**
     * Get <p>sidecar配置</p> 
     * @return Sidecar <p>sidecar配置</p>
     */
    public SidecarSpec getSidecar() {
        return this.Sidecar;
    }

    /**
     * Set <p>sidecar配置</p>
     * @param Sidecar <p>sidecar配置</p>
     */
    public void setSidecar(SidecarSpec Sidecar) {
        this.Sidecar = Sidecar;
    }

    /**
     * Get <p>数据盘批量挂载配置，当前仅支持CFS，仅针对“模型来源-腾讯云存储、模型来源-腾讯云容器镜像、模型来源-资源组、模型来源-数据源”。</p> 
     * @return VolumeMounts <p>数据盘批量挂载配置，当前仅支持CFS，仅针对“模型来源-腾讯云存储、模型来源-腾讯云容器镜像、模型来源-资源组、模型来源-数据源”。</p>
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set <p>数据盘批量挂载配置，当前仅支持CFS，仅针对“模型来源-腾讯云存储、模型来源-腾讯云容器镜像、模型来源-资源组、模型来源-数据源”。</p>
     * @param VolumeMounts <p>数据盘批量挂载配置，当前仅支持CFS，仅针对“模型来源-腾讯云存储、模型来源-腾讯云容器镜像、模型来源-资源组、模型来源-数据源”。</p>
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
     * Get <p>网关日志投递相关配置</p> 
     * @return GatewayLogConfig <p>网关日志投递相关配置</p>
     */
    public LogConfig getGatewayLogConfig() {
        return this.GatewayLogConfig;
    }

    /**
     * Set <p>网关日志投递相关配置</p>
     * @param GatewayLogConfig <p>网关日志投递相关配置</p>
     */
    public void setGatewayLogConfig(LogConfig GatewayLogConfig) {
        this.GatewayLogConfig = GatewayLogConfig;
    }

    /**
     * Get <p>网关相关配置</p> 
     * @return GatewayConfig <p>网关相关配置</p>
     */
    public GatewayConfig getGatewayConfig() {
        return this.GatewayConfig;
    }

    /**
     * Set <p>网关相关配置</p>
     * @param GatewayConfig <p>网关相关配置</p>
     */
    public void setGatewayConfig(GatewayConfig GatewayConfig) {
        this.GatewayConfig = GatewayConfig;
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
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.ServiceEIP != null) {
            this.ServiceEIP = new ServiceEIP(source.ServiceEIP);
        }
        if (source.CommandBase64 != null) {
            this.CommandBase64 = new String(source.CommandBase64);
        }
        if (source.ServicePort != null) {
            this.ServicePort = new Long(source.ServicePort);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.InstancePerReplicas != null) {
            this.InstancePerReplicas = new Long(source.InstancePerReplicas);
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
        if (source.Sidecar != null) {
            this.Sidecar = new SidecarSpec(source.Sidecar);
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
        if (source.GatewayLogConfig != null) {
            this.GatewayLogConfig = new LogConfig(source.GatewayLogConfig);
        }
        if (source.GatewayConfig != null) {
            this.GatewayConfig = new GatewayConfig(source.GatewayConfig);
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
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "ServiceEIP.", this.ServiceEIP);
        this.setParamSimple(map, prefix + "CommandBase64", this.CommandBase64);
        this.setParamSimple(map, prefix + "ServicePort", this.ServicePort);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "InstancePerReplicas", this.InstancePerReplicas);
        this.setParamSimple(map, prefix + "TerminationGracePeriodSeconds", this.TerminationGracePeriodSeconds);
        this.setParamArraySimple(map, prefix + "PreStopCommand.", this.PreStopCommand);
        this.setParamSimple(map, prefix + "GrpcEnable", this.GrpcEnable);
        this.setParamObj(map, prefix + "HealthProbe.", this.HealthProbe);
        this.setParamObj(map, prefix + "RollingUpdate.", this.RollingUpdate);
        this.setParamObj(map, prefix + "Sidecar.", this.Sidecar);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);
        this.setParamSimple(map, prefix + "SchedulingStrategy", this.SchedulingStrategy);
        this.setParamObj(map, prefix + "GatewayLogConfig.", this.GatewayLogConfig);
        this.setParamObj(map, prefix + "GatewayConfig.", this.GatewayConfig);

    }
}

