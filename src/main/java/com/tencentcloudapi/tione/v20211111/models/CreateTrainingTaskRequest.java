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

public class CreateTrainingTaskRequest extends AbstractModel{

    /**
    * 训练任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 计费模式，eg：PREPAID 包年包月（资源组）;
POSTPAID_BY_HOUR 按量计费
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}]
    */
    @SerializedName("ResourceConfigInfos")
    @Expose
    private ResourceConfigInfo [] ResourceConfigInfos;

    /**
    * COS代码包路径
    */
    @SerializedName("CodePackagePath")
    @Expose
    private CosPathInfo CodePackagePath;

    /**
    * 训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD
    */
    @SerializedName("TrainingMode")
    @Expose
    private String TrainingMode;

    /**
    * COS训练输出路径
    */
    @SerializedName("Output")
    @Expose
    private CosPathInfo Output;

    /**
    * 是否上报日志
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * 训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH
    */
    @SerializedName("FrameworkName")
    @Expose
    private String FrameworkName;

    /**
    * 训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
    * 训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu
    */
    @SerializedName("FrameworkEnvironment")
    @Expose
    private String FrameworkEnvironment;

    /**
    * 预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 标签配置
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 自定义镜像信息
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 启动命令信息，默认为sh start.sh
    */
    @SerializedName("StartCmdInfo")
    @Expose
    private StartCmdInfo StartCmdInfo;

    /**
    * 数据配置，依赖DataSource字段
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * VPC Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * CLS日志配置
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * 调优参数
    */
    @SerializedName("TuningParameters")
    @Expose
    private String TuningParameters;

    /**
    * 备注，最多500个字
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 数据来源，eg：DATASET、COS、CFS、HDFS
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * 回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&内容详见：[[TI-ONE接口回调说明]](https://cloud.tencent.com/document/product/851/84292)
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get 训练任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头 
     * @return Name 训练任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 训练任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     * @param Name 训练任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 计费模式，eg：PREPAID 包年包月（资源组）;
POSTPAID_BY_HOUR 按量计费 
     * @return ChargeType 计费模式，eg：PREPAID 包年包月（资源组）;
POSTPAID_BY_HOUR 按量计费
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费模式，eg：PREPAID 包年包月（资源组）;
POSTPAID_BY_HOUR 按量计费
     * @param ChargeType 计费模式，eg：PREPAID 包年包月（资源组）;
POSTPAID_BY_HOUR 按量计费
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}] 
     * @return ResourceConfigInfos 资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}]
     */
    public ResourceConfigInfo [] getResourceConfigInfos() {
        return this.ResourceConfigInfos;
    }

    /**
     * Set 资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}]
     * @param ResourceConfigInfos 资源配置，需填写对应算力规格ID和节点数量，算力规格ID查询接口为DescribeBillingSpecsPrice，eg：[{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}]
     */
    public void setResourceConfigInfos(ResourceConfigInfo [] ResourceConfigInfos) {
        this.ResourceConfigInfos = ResourceConfigInfos;
    }

    /**
     * Get COS代码包路径 
     * @return CodePackagePath COS代码包路径
     */
    public CosPathInfo getCodePackagePath() {
        return this.CodePackagePath;
    }

    /**
     * Set COS代码包路径
     * @param CodePackagePath COS代码包路径
     */
    public void setCodePackagePath(CosPathInfo CodePackagePath) {
        this.CodePackagePath = CodePackagePath;
    }

    /**
     * Get 训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD 
     * @return TrainingMode 训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD
     */
    public String getTrainingMode() {
        return this.TrainingMode;
    }

    /**
     * Set 训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD
     * @param TrainingMode 训练模式，通过DescribeTrainingFrameworks接口查询，eg：PS_WORKER、DDP、MPI、HOROVOD
     */
    public void setTrainingMode(String TrainingMode) {
        this.TrainingMode = TrainingMode;
    }

    /**
     * Get COS训练输出路径 
     * @return Output COS训练输出路径
     */
    public CosPathInfo getOutput() {
        return this.Output;
    }

    /**
     * Set COS训练输出路径
     * @param Output COS训练输出路径
     */
    public void setOutput(CosPathInfo Output) {
        this.Output = Output;
    }

    /**
     * Get 是否上报日志 
     * @return LogEnable 是否上报日志
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set 是否上报日志
     * @param LogEnable 是否上报日志
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get 训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH 
     * @return FrameworkName 训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH
     */
    public String getFrameworkName() {
        return this.FrameworkName;
    }

    /**
     * Set 训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH
     * @param FrameworkName 训练框架名称，通过DescribeTrainingFrameworks接口查询，eg：SPARK、PYSPARK、TENSORFLOW、PYTORCH
     */
    public void setFrameworkName(String FrameworkName) {
        this.FrameworkName = FrameworkName;
    }

    /**
     * Get 训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9 
     * @return FrameworkVersion 训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set 训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9
     * @param FrameworkVersion 训练框架版本，通过DescribeTrainingFrameworks接口查询，eg：1.15、1.9
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    /**
     * Get 训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu 
     * @return FrameworkEnvironment 训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu
     */
    public String getFrameworkEnvironment() {
        return this.FrameworkEnvironment;
    }

    /**
     * Set 训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu
     * @param FrameworkEnvironment 训练框架环境，通过DescribeTrainingFrameworks接口查询，eg：tf1.15-py3.7-cpu、torch1.9-py3.8-cuda11.1-gpu
     */
    public void setFrameworkEnvironment(String FrameworkEnvironment) {
        this.FrameworkEnvironment = FrameworkEnvironment;
    }

    /**
     * Get 预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询 
     * @return ResourceGroupId 预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询
     * @param ResourceGroupId 预付费专用资源组ID，通过DescribeBillingResourceGroups接口查询
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 标签配置 
     * @return Tags 标签配置
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签配置
     * @param Tags 标签配置
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 自定义镜像信息 
     * @return ImageInfo 自定义镜像信息
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 自定义镜像信息
     * @param ImageInfo 自定义镜像信息
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get 启动命令信息，默认为sh start.sh 
     * @return StartCmdInfo 启动命令信息，默认为sh start.sh
     */
    public StartCmdInfo getStartCmdInfo() {
        return this.StartCmdInfo;
    }

    /**
     * Set 启动命令信息，默认为sh start.sh
     * @param StartCmdInfo 启动命令信息，默认为sh start.sh
     */
    public void setStartCmdInfo(StartCmdInfo StartCmdInfo) {
        this.StartCmdInfo = StartCmdInfo;
    }

    /**
     * Get 数据配置，依赖DataSource字段 
     * @return DataConfigs 数据配置，依赖DataSource字段
     */
    public DataConfig [] getDataConfigs() {
        return this.DataConfigs;
    }

    /**
     * Set 数据配置，依赖DataSource字段
     * @param DataConfigs 数据配置，依赖DataSource字段
     */
    public void setDataConfigs(DataConfig [] DataConfigs) {
        this.DataConfigs = DataConfigs;
    }

    /**
     * Get VPC Id 
     * @return VpcId VPC Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC Id
     * @param VpcId VPC Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网Id 
     * @return SubnetId 子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id
     * @param SubnetId 子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get CLS日志配置 
     * @return LogConfig CLS日志配置
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set CLS日志配置
     * @param LogConfig CLS日志配置
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get 调优参数 
     * @return TuningParameters 调优参数
     */
    public String getTuningParameters() {
        return this.TuningParameters;
    }

    /**
     * Set 调优参数
     * @param TuningParameters 调优参数
     */
    public void setTuningParameters(String TuningParameters) {
        this.TuningParameters = TuningParameters;
    }

    /**
     * Get 备注，最多500个字 
     * @return Remark 备注，最多500个字
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，最多500个字
     * @param Remark 备注，最多500个字
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 数据来源，eg：DATASET、COS、CFS、HDFS 
     * @return DataSource 数据来源，eg：DATASET、COS、CFS、HDFS
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据来源，eg：DATASET、COS、CFS、HDFS
     * @param DataSource 数据来源，eg：DATASET、COS、CFS、HDFS
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&内容详见：[[TI-ONE接口回调说明]](https://cloud.tencent.com/document/product/851/84292) 
     * @return CallbackUrl 回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&内容详见：[[TI-ONE接口回调说明]](https://cloud.tencent.com/document/product/851/84292)
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&内容详见：[[TI-ONE接口回调说明]](https://cloud.tencent.com/document/product/851/84292)
     * @param CallbackUrl 回调地址，用于创建/启动/停止训练任务的异步回调。回调格式&内容详见：[[TI-ONE接口回调说明]](https://cloud.tencent.com/document/product/851/84292)
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
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
        if (source.CodePackagePath != null) {
            this.CodePackagePath = new CosPathInfo(source.CodePackagePath);
        }
        if (source.TrainingMode != null) {
            this.TrainingMode = new String(source.TrainingMode);
        }
        if (source.Output != null) {
            this.Output = new CosPathInfo(source.Output);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
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
        if (source.StartCmdInfo != null) {
            this.StartCmdInfo = new StartCmdInfo(source.StartCmdInfo);
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
        if (source.LogConfig != null) {
            this.LogConfig = new LogConfig(source.LogConfig);
        }
        if (source.TuningParameters != null) {
            this.TuningParameters = new String(source.TuningParameters);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamArrayObj(map, prefix + "ResourceConfigInfos.", this.ResourceConfigInfos);
        this.setParamObj(map, prefix + "CodePackagePath.", this.CodePackagePath);
        this.setParamSimple(map, prefix + "TrainingMode", this.TrainingMode);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamSimple(map, prefix + "FrameworkName", this.FrameworkName);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamSimple(map, prefix + "FrameworkEnvironment", this.FrameworkEnvironment);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "StartCmdInfo.", this.StartCmdInfo);
        this.setParamArrayObj(map, prefix + "DataConfigs.", this.DataConfigs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "TuningParameters", this.TuningParameters);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

