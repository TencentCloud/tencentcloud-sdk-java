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

public class CreateBatchTaskRequest extends AbstractModel{

    /**
    * 跑批任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
    */
    @SerializedName("BatchTaskName")
    @Expose
    private String BatchTaskName;

    /**
    * 计费模式，eg：PREPAID预付费，即包年包月；POSTPAID_BY_HOUR按小时后付费
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 资源配置
    */
    @SerializedName("ResourceConfigInfo")
    @Expose
    private ResourceConfigInfo ResourceConfigInfo;

    /**
    * 结果输出
    */
    @SerializedName("Outputs")
    @Expose
    private DataConfig [] Outputs;

    /**
    * 是否上报日志
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * 工作类型 1:单次 2:周期
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * 任务周期描述
    */
    @SerializedName("CronInfo")
    @Expose
    private CronInfo CronInfo;

    /**
    * 预付费专用资源组
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
    * 服务对应的模型信息，有模型文件时需要填写
    */
    @SerializedName("ModelInfo")
    @Expose
    private ModelInfo ModelInfo;

    /**
    * 自定义镜像信息
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 代码包
    */
    @SerializedName("CodePackage")
    @Expose
    private CosPathInfo CodePackage;

    /**
    * 启动命令
    */
    @SerializedName("StartCmd")
    @Expose
    private String StartCmd;

    /**
    * 数据配置
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * 日志配置
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

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
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 跑批任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头 
     * @return BatchTaskName 跑批任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public String getBatchTaskName() {
        return this.BatchTaskName;
    }

    /**
     * Set 跑批任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     * @param BatchTaskName 跑批任务名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public void setBatchTaskName(String BatchTaskName) {
        this.BatchTaskName = BatchTaskName;
    }

    /**
     * Get 计费模式，eg：PREPAID预付费，即包年包月；POSTPAID_BY_HOUR按小时后付费 
     * @return ChargeType 计费模式，eg：PREPAID预付费，即包年包月；POSTPAID_BY_HOUR按小时后付费
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费模式，eg：PREPAID预付费，即包年包月；POSTPAID_BY_HOUR按小时后付费
     * @param ChargeType 计费模式，eg：PREPAID预付费，即包年包月；POSTPAID_BY_HOUR按小时后付费
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 资源配置 
     * @return ResourceConfigInfo 资源配置
     */
    public ResourceConfigInfo getResourceConfigInfo() {
        return this.ResourceConfigInfo;
    }

    /**
     * Set 资源配置
     * @param ResourceConfigInfo 资源配置
     */
    public void setResourceConfigInfo(ResourceConfigInfo ResourceConfigInfo) {
        this.ResourceConfigInfo = ResourceConfigInfo;
    }

    /**
     * Get 结果输出 
     * @return Outputs 结果输出
     */
    public DataConfig [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set 结果输出
     * @param Outputs 结果输出
     */
    public void setOutputs(DataConfig [] Outputs) {
        this.Outputs = Outputs;
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
     * Get 工作类型 1:单次 2:周期 
     * @return JobType 工作类型 1:单次 2:周期
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set 工作类型 1:单次 2:周期
     * @param JobType 工作类型 1:单次 2:周期
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 任务周期描述 
     * @return CronInfo 任务周期描述
     */
    public CronInfo getCronInfo() {
        return this.CronInfo;
    }

    /**
     * Set 任务周期描述
     * @param CronInfo 任务周期描述
     */
    public void setCronInfo(CronInfo CronInfo) {
        this.CronInfo = CronInfo;
    }

    /**
     * Get 预付费专用资源组 
     * @return ResourceGroupId 预付费专用资源组
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 预付费专用资源组
     * @param ResourceGroupId 预付费专用资源组
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
     * Get 服务对应的模型信息，有模型文件时需要填写 
     * @return ModelInfo 服务对应的模型信息，有模型文件时需要填写
     */
    public ModelInfo getModelInfo() {
        return this.ModelInfo;
    }

    /**
     * Set 服务对应的模型信息，有模型文件时需要填写
     * @param ModelInfo 服务对应的模型信息，有模型文件时需要填写
     */
    public void setModelInfo(ModelInfo ModelInfo) {
        this.ModelInfo = ModelInfo;
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
     * Get 代码包 
     * @return CodePackage 代码包
     */
    public CosPathInfo getCodePackage() {
        return this.CodePackage;
    }

    /**
     * Set 代码包
     * @param CodePackage 代码包
     */
    public void setCodePackage(CosPathInfo CodePackage) {
        this.CodePackage = CodePackage;
    }

    /**
     * Get 启动命令 
     * @return StartCmd 启动命令
     */
    public String getStartCmd() {
        return this.StartCmd;
    }

    /**
     * Set 启动命令
     * @param StartCmd 启动命令
     */
    public void setStartCmd(String StartCmd) {
        this.StartCmd = StartCmd;
    }

    /**
     * Get 数据配置 
     * @return DataConfigs 数据配置
     */
    public DataConfig [] getDataConfigs() {
        return this.DataConfigs;
    }

    /**
     * Set 数据配置
     * @param DataConfigs 数据配置
     */
    public void setDataConfigs(DataConfig [] DataConfigs) {
        this.DataConfigs = DataConfigs;
    }

    /**
     * Get 日志配置 
     * @return LogConfig 日志配置
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set 日志配置
     * @param LogConfig 日志配置
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
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
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateBatchTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchTaskRequest(CreateBatchTaskRequest source) {
        if (source.BatchTaskName != null) {
            this.BatchTaskName = new String(source.BatchTaskName);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceConfigInfo != null) {
            this.ResourceConfigInfo = new ResourceConfigInfo(source.ResourceConfigInfo);
        }
        if (source.Outputs != null) {
            this.Outputs = new DataConfig[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new DataConfig(source.Outputs[i]);
            }
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
        if (source.CronInfo != null) {
            this.CronInfo = new CronInfo(source.CronInfo);
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
        if (source.ModelInfo != null) {
            this.ModelInfo = new ModelInfo(source.ModelInfo);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.CodePackage != null) {
            this.CodePackage = new CosPathInfo(source.CodePackage);
        }
        if (source.StartCmd != null) {
            this.StartCmd = new String(source.StartCmd);
        }
        if (source.DataConfigs != null) {
            this.DataConfigs = new DataConfig[source.DataConfigs.length];
            for (int i = 0; i < source.DataConfigs.length; i++) {
                this.DataConfigs[i] = new DataConfig(source.DataConfigs[i]);
            }
        }
        if (source.LogConfig != null) {
            this.LogConfig = new LogConfig(source.LogConfig);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchTaskName", this.BatchTaskName);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "ResourceConfigInfo.", this.ResourceConfigInfo);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "CronInfo.", this.CronInfo);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ModelInfo.", this.ModelInfo);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "CodePackage.", this.CodePackage);
        this.setParamSimple(map, prefix + "StartCmd", this.StartCmd);
        this.setParamArrayObj(map, prefix + "DataConfigs.", this.DataConfigs);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

