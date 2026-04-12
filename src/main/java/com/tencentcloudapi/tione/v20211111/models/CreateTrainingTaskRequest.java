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

public class CreateTrainingTaskRequest extends AbstractModel {

    /**
    * <p>训练任务名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>计费模式，eg：PREPAID 包年包月（资源组）;<br>POSTPAID_BY_HOUR 按量计费</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{&quot;Role&quot;:&quot;WORKER&quot;, &quot;InstanceType&quot;: &quot;TI.S.MEDIUM.POST&quot;, &quot;InstanceNum&quot;: 1}]</p>
    */
    @SerializedName("ResourceConfigInfos")
    @Expose
    private ResourceConfigInfo [] ResourceConfigInfos;

    /**
    * <p>训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH</p>
    */
    @SerializedName("FrameworkName")
    @Expose
    private String FrameworkName;

    /**
    * <p>训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9</p>
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
    * <p>训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu</p>
    */
    @SerializedName("FrameworkEnvironment")
    @Expose
    private String FrameworkEnvironment;

    /**
    * <p>预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>标签配置</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>自定义镜像信息</p>
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * <p>COS代码包路径</p>
    */
    @SerializedName("CodePackagePath")
    @Expose
    private CosPathInfo CodePackagePath;

    /**
    * <p>任务的启动命令，按任务训练模式输入，如遇特殊字符导致配置失败，可使用EncodedStartCmdInfo参数</p>
    */
    @SerializedName("StartCmdInfo")
    @Expose
    private StartCmdInfo StartCmdInfo;

    /**
    * <p>训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD</p>
    */
    @SerializedName("TrainingMode")
    @Expose
    private String TrainingMode;

    /**
    * <p>数据配置，依赖DataSource字段，数量不超过10个</p>
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * <p>VPC Id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网Id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>COS训练输出路径</p>
    */
    @SerializedName("Output")
    @Expose
    private CosPathInfo Output;

    /**
    * <p>CLS日志配置</p>
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * <p>调优参数，不超过2048个字符</p>
    */
    @SerializedName("TuningParameters")
    @Expose
    private String TuningParameters;

    /**
    * <p>是否上报日志</p>
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * <p>备注，不超过1024个字符</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>数据来源，eg：DATASET、COS、CFS、CFSTurbo、HDFS、GooseFSx</p>
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * <p>回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&amp;内容详见：<a href="https://cloud.tencent.com/document/product/851/84292">[TI-ONE接口回调说明]</a></p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>编码后的任务启动命令，与StartCmdInfo同时配置时，仅当前参数生效</p>
    */
    @SerializedName("EncodedStartCmdInfo")
    @Expose
    private EncodedStartCmdInfo EncodedStartCmdInfo;

    /**
    * <p>代码仓库配置</p>
    */
    @SerializedName("CodeRepos")
    @Expose
    private CodeRepoConfig [] CodeRepos;

    /**
    * <p>网络暴露配置</p>
    */
    @SerializedName("ExposeNetworkConfig")
    @Expose
    private ExposeNetworkConfig ExposeNetworkConfig;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("Envs")
    @Expose
    private EnvVar [] Envs;

    /**
     * Get <p>训练任务名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p> 
     * @return Name <p>训练任务名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>训练任务名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
     * @param Name <p>训练任务名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>计费模式，eg：PREPAID 包年包月（资源组）;<br>POSTPAID_BY_HOUR 按量计费</p> 
     * @return ChargeType <p>计费模式，eg：PREPAID 包年包月（资源组）;<br>POSTPAID_BY_HOUR 按量计费</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>计费模式，eg：PREPAID 包年包月（资源组）;<br>POSTPAID_BY_HOUR 按量计费</p>
     * @param ChargeType <p>计费模式，eg：PREPAID 包年包月（资源组）;<br>POSTPAID_BY_HOUR 按量计费</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{&quot;Role&quot;:&quot;WORKER&quot;, &quot;InstanceType&quot;: &quot;TI.S.MEDIUM.POST&quot;, &quot;InstanceNum&quot;: 1}]</p> 
     * @return ResourceConfigInfos <p>资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{&quot;Role&quot;:&quot;WORKER&quot;, &quot;InstanceType&quot;: &quot;TI.S.MEDIUM.POST&quot;, &quot;InstanceNum&quot;: 1}]</p>
     */
    public ResourceConfigInfo [] getResourceConfigInfos() {
        return this.ResourceConfigInfos;
    }

    /**
     * Set <p>资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{&quot;Role&quot;:&quot;WORKER&quot;, &quot;InstanceType&quot;: &quot;TI.S.MEDIUM.POST&quot;, &quot;InstanceNum&quot;: 1}]</p>
     * @param ResourceConfigInfos <p>资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{&quot;Role&quot;:&quot;WORKER&quot;, &quot;InstanceType&quot;: &quot;TI.S.MEDIUM.POST&quot;, &quot;InstanceNum&quot;: 1}]</p>
     */
    public void setResourceConfigInfos(ResourceConfigInfo [] ResourceConfigInfos) {
        this.ResourceConfigInfos = ResourceConfigInfos;
    }

    /**
     * Get <p>训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH</p> 
     * @return FrameworkName <p>训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH</p>
     */
    public String getFrameworkName() {
        return this.FrameworkName;
    }

    /**
     * Set <p>训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH</p>
     * @param FrameworkName <p>训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH</p>
     */
    public void setFrameworkName(String FrameworkName) {
        this.FrameworkName = FrameworkName;
    }

    /**
     * Get <p>训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9</p> 
     * @return FrameworkVersion <p>训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9</p>
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set <p>训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9</p>
     * @param FrameworkVersion <p>训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9</p>
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    /**
     * Get <p>训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu</p> 
     * @return FrameworkEnvironment <p>训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu</p>
     */
    public String getFrameworkEnvironment() {
        return this.FrameworkEnvironment;
    }

    /**
     * Set <p>训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu</p>
     * @param FrameworkEnvironment <p>训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu</p>
     */
    public void setFrameworkEnvironment(String FrameworkEnvironment) {
        this.FrameworkEnvironment = FrameworkEnvironment;
    }

    /**
     * Get <p>预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询</p> 
     * @return ResourceGroupId <p>预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询</p>
     * @param ResourceGroupId <p>预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>标签配置</p> 
     * @return Tags <p>标签配置</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签配置</p>
     * @param Tags <p>标签配置</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>自定义镜像信息</p> 
     * @return ImageInfo <p>自定义镜像信息</p>
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set <p>自定义镜像信息</p>
     * @param ImageInfo <p>自定义镜像信息</p>
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get <p>COS代码包路径</p> 
     * @return CodePackagePath <p>COS代码包路径</p>
     */
    public CosPathInfo getCodePackagePath() {
        return this.CodePackagePath;
    }

    /**
     * Set <p>COS代码包路径</p>
     * @param CodePackagePath <p>COS代码包路径</p>
     */
    public void setCodePackagePath(CosPathInfo CodePackagePath) {
        this.CodePackagePath = CodePackagePath;
    }

    /**
     * Get <p>任务的启动命令，按任务训练模式输入，如遇特殊字符导致配置失败，可使用EncodedStartCmdInfo参数</p> 
     * @return StartCmdInfo <p>任务的启动命令，按任务训练模式输入，如遇特殊字符导致配置失败，可使用EncodedStartCmdInfo参数</p>
     */
    public StartCmdInfo getStartCmdInfo() {
        return this.StartCmdInfo;
    }

    /**
     * Set <p>任务的启动命令，按任务训练模式输入，如遇特殊字符导致配置失败，可使用EncodedStartCmdInfo参数</p>
     * @param StartCmdInfo <p>任务的启动命令，按任务训练模式输入，如遇特殊字符导致配置失败，可使用EncodedStartCmdInfo参数</p>
     */
    public void setStartCmdInfo(StartCmdInfo StartCmdInfo) {
        this.StartCmdInfo = StartCmdInfo;
    }

    /**
     * Get <p>训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD</p> 
     * @return TrainingMode <p>训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD</p>
     */
    public String getTrainingMode() {
        return this.TrainingMode;
    }

    /**
     * Set <p>训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD</p>
     * @param TrainingMode <p>训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD</p>
     */
    public void setTrainingMode(String TrainingMode) {
        this.TrainingMode = TrainingMode;
    }

    /**
     * Get <p>数据配置，依赖DataSource字段，数量不超过10个</p> 
     * @return DataConfigs <p>数据配置，依赖DataSource字段，数量不超过10个</p>
     */
    public DataConfig [] getDataConfigs() {
        return this.DataConfigs;
    }

    /**
     * Set <p>数据配置，依赖DataSource字段，数量不超过10个</p>
     * @param DataConfigs <p>数据配置，依赖DataSource字段，数量不超过10个</p>
     */
    public void setDataConfigs(DataConfig [] DataConfigs) {
        this.DataConfigs = DataConfigs;
    }

    /**
     * Get <p>VPC Id</p> 
     * @return VpcId <p>VPC Id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC Id</p>
     * @param VpcId <p>VPC Id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网Id</p> 
     * @return SubnetId <p>子网Id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网Id</p>
     * @param SubnetId <p>子网Id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>COS训练输出路径</p> 
     * @return Output <p>COS训练输出路径</p>
     */
    public CosPathInfo getOutput() {
        return this.Output;
    }

    /**
     * Set <p>COS训练输出路径</p>
     * @param Output <p>COS训练输出路径</p>
     */
    public void setOutput(CosPathInfo Output) {
        this.Output = Output;
    }

    /**
     * Get <p>CLS日志配置</p> 
     * @return LogConfig <p>CLS日志配置</p>
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set <p>CLS日志配置</p>
     * @param LogConfig <p>CLS日志配置</p>
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get <p>调优参数，不超过2048个字符</p> 
     * @return TuningParameters <p>调优参数，不超过2048个字符</p>
     */
    public String getTuningParameters() {
        return this.TuningParameters;
    }

    /**
     * Set <p>调优参数，不超过2048个字符</p>
     * @param TuningParameters <p>调优参数，不超过2048个字符</p>
     */
    public void setTuningParameters(String TuningParameters) {
        this.TuningParameters = TuningParameters;
    }

    /**
     * Get <p>是否上报日志</p> 
     * @return LogEnable <p>是否上报日志</p>
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set <p>是否上报日志</p>
     * @param LogEnable <p>是否上报日志</p>
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get <p>备注，不超过1024个字符</p> 
     * @return Remark <p>备注，不超过1024个字符</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注，不超过1024个字符</p>
     * @param Remark <p>备注，不超过1024个字符</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>数据来源，eg：DATASET、COS、CFS、CFSTurbo、HDFS、GooseFSx</p> 
     * @return DataSource <p>数据来源，eg：DATASET、COS、CFS、CFSTurbo、HDFS、GooseFSx</p>
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set <p>数据来源，eg：DATASET、COS、CFS、CFSTurbo、HDFS、GooseFSx</p>
     * @param DataSource <p>数据来源，eg：DATASET、COS、CFS、CFSTurbo、HDFS、GooseFSx</p>
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get <p>回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&amp;内容详见：<a href="https://cloud.tencent.com/document/product/851/84292">[TI-ONE接口回调说明]</a></p> 
     * @return CallbackUrl <p>回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&amp;内容详见：<a href="https://cloud.tencent.com/document/product/851/84292">[TI-ONE接口回调说明]</a></p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&amp;内容详见：<a href="https://cloud.tencent.com/document/product/851/84292">[TI-ONE接口回调说明]</a></p>
     * @param CallbackUrl <p>回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&amp;内容详见：<a href="https://cloud.tencent.com/document/product/851/84292">[TI-ONE接口回调说明]</a></p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>编码后的任务启动命令，与StartCmdInfo同时配置时，仅当前参数生效</p> 
     * @return EncodedStartCmdInfo <p>编码后的任务启动命令，与StartCmdInfo同时配置时，仅当前参数生效</p>
     */
    public EncodedStartCmdInfo getEncodedStartCmdInfo() {
        return this.EncodedStartCmdInfo;
    }

    /**
     * Set <p>编码后的任务启动命令，与StartCmdInfo同时配置时，仅当前参数生效</p>
     * @param EncodedStartCmdInfo <p>编码后的任务启动命令，与StartCmdInfo同时配置时，仅当前参数生效</p>
     */
    public void setEncodedStartCmdInfo(EncodedStartCmdInfo EncodedStartCmdInfo) {
        this.EncodedStartCmdInfo = EncodedStartCmdInfo;
    }

    /**
     * Get <p>代码仓库配置</p> 
     * @return CodeRepos <p>代码仓库配置</p>
     */
    public CodeRepoConfig [] getCodeRepos() {
        return this.CodeRepos;
    }

    /**
     * Set <p>代码仓库配置</p>
     * @param CodeRepos <p>代码仓库配置</p>
     */
    public void setCodeRepos(CodeRepoConfig [] CodeRepos) {
        this.CodeRepos = CodeRepos;
    }

    /**
     * Get <p>网络暴露配置</p> 
     * @return ExposeNetworkConfig <p>网络暴露配置</p>
     */
    public ExposeNetworkConfig getExposeNetworkConfig() {
        return this.ExposeNetworkConfig;
    }

    /**
     * Set <p>网络暴露配置</p>
     * @param ExposeNetworkConfig <p>网络暴露配置</p>
     */
    public void setExposeNetworkConfig(ExposeNetworkConfig ExposeNetworkConfig) {
        this.ExposeNetworkConfig = ExposeNetworkConfig;
    }

    /**
     * Get <p>环境变量</p> 
     * @return Envs <p>环境变量</p>
     */
    public EnvVar [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>环境变量</p>
     * @param Envs <p>环境变量</p>
     */
    public void setEnvs(EnvVar [] Envs) {
        this.Envs = Envs;
    }

    public CreateTrainingTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTrainingTaskRequest(CreateTrainingTaskRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceConfigInfos != null) {
            this.ResourceConfigInfos = new ResourceConfigInfo[source.ResourceConfigInfos.length];
            for (int i = 0; i < source.ResourceConfigInfos.length; i++) {
                this.ResourceConfigInfos[i] = new ResourceConfigInfo(source.ResourceConfigInfos[i]);
            }
        }
        if (source.FrameworkName != null) {
            this.FrameworkName = new String(source.FrameworkName);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
        if (source.FrameworkEnvironment != null) {
            this.FrameworkEnvironment = new String(source.FrameworkEnvironment);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.CodePackagePath != null) {
            this.CodePackagePath = new CosPathInfo(source.CodePackagePath);
        }
        if (source.StartCmdInfo != null) {
            this.StartCmdInfo = new StartCmdInfo(source.StartCmdInfo);
        }
        if (source.TrainingMode != null) {
            this.TrainingMode = new String(source.TrainingMode);
        }
        if (source.DataConfigs != null) {
            this.DataConfigs = new DataConfig[source.DataConfigs.length];
            for (int i = 0; i < source.DataConfigs.length; i++) {
                this.DataConfigs[i] = new DataConfig(source.DataConfigs[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Output != null) {
            this.Output = new CosPathInfo(source.Output);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new LogConfig(source.LogConfig);
        }
        if (source.TuningParameters != null) {
            this.TuningParameters = new String(source.TuningParameters);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.EncodedStartCmdInfo != null) {
            this.EncodedStartCmdInfo = new EncodedStartCmdInfo(source.EncodedStartCmdInfo);
        }
        if (source.CodeRepos != null) {
            this.CodeRepos = new CodeRepoConfig[source.CodeRepos.length];
            for (int i = 0; i < source.CodeRepos.length; i++) {
                this.CodeRepos[i] = new CodeRepoConfig(source.CodeRepos[i]);
            }
        }
        if (source.ExposeNetworkConfig != null) {
            this.ExposeNetworkConfig = new ExposeNetworkConfig(source.ExposeNetworkConfig);
        }
        if (source.Envs != null) {
            this.Envs = new EnvVar[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new EnvVar(source.Envs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamArrayObj(map, prefix + "ResourceConfigInfos.", this.ResourceConfigInfos);
        this.setParamSimple(map, prefix + "FrameworkName", this.FrameworkName);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamSimple(map, prefix + "FrameworkEnvironment", this.FrameworkEnvironment);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "CodePackagePath.", this.CodePackagePath);
        this.setParamObj(map, prefix + "StartCmdInfo.", this.StartCmdInfo);
        this.setParamSimple(map, prefix + "TrainingMode", this.TrainingMode);
        this.setParamArrayObj(map, prefix + "DataConfigs.", this.DataConfigs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "TuningParameters", this.TuningParameters);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamObj(map, prefix + "EncodedStartCmdInfo.", this.EncodedStartCmdInfo);
        this.setParamArrayObj(map, prefix + "CodeRepos.", this.CodeRepos);
        this.setParamObj(map, prefix + "ExposeNetworkConfig.", this.ExposeNetworkConfig);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);

    }
}

