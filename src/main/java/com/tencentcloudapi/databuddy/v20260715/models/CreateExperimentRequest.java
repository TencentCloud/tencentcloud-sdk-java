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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExperimentRequest extends AbstractModel {

    /**
    * <p>工作空间ID（必填），可通过 ListWorkspaces 接口获取</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>实验名称（必填），同一工作空间内唯一</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实验类型（必填），取值：MACHINE_LEARNING（机器学习）/ CLASSIFICATION（分类）/ REGRESSION（回归）/ FORECASTING（时间序列预测）/ AGENT（智能体）。传入其他值将返回 InvalidParameter.ExperimentTypeInvalid</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>实验描述（可选），建议长度不超过 1024 字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Studio目录树文件夹节点ID，即实验所在的目录节点，可通过 ListFiles 接口获取</p>
    */
    @SerializedName("StudioId")
    @Expose
    private String StudioId;

    /**
    * <p>实验标签列表（可选），key/value 均为字符串</p>
    */
    @SerializedName("Tags")
    @Expose
    private ExperimentTag [] Tags;

    /**
    * <p>AutoML配置（可选，仅 Type 为 CLASSIFICATION/REGRESSION/FORECASTING 时需要），包含评估指标、搜索空间、最大运行时间/次数/并发等</p>
    */
    @SerializedName("AutoMlConf")
    @Expose
    private AutoMlConf AutoMlConf;

    /**
    * <p>训练数据配置（可选，仅 AutoML 类型实验需要），指定训练数据表（Catalog.Schema.Table 三段式）与目标标签列</p>
    */
    @SerializedName("TrainingData")
    @Expose
    private TrainingData TrainingData;

    /**
    * <p>计算资源组ID（可选），指定实验运行所使用的计算资源，可通过 ListComputeResourceOptions 接口获取</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
     * Get <p>工作空间ID（必填），可通过 ListWorkspaces 接口获取</p> 
     * @return WorkspaceId <p>工作空间ID（必填），可通过 ListWorkspaces 接口获取</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID（必填），可通过 ListWorkspaces 接口获取</p>
     * @param WorkspaceId <p>工作空间ID（必填），可通过 ListWorkspaces 接口获取</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>实验名称（必填），同一工作空间内唯一</p> 
     * @return Name <p>实验名称（必填），同一工作空间内唯一</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实验名称（必填），同一工作空间内唯一</p>
     * @param Name <p>实验名称（必填），同一工作空间内唯一</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实验类型（必填），取值：MACHINE_LEARNING（机器学习）/ CLASSIFICATION（分类）/ REGRESSION（回归）/ FORECASTING（时间序列预测）/ AGENT（智能体）。传入其他值将返回 InvalidParameter.ExperimentTypeInvalid</p> 
     * @return Type <p>实验类型（必填），取值：MACHINE_LEARNING（机器学习）/ CLASSIFICATION（分类）/ REGRESSION（回归）/ FORECASTING（时间序列预测）/ AGENT（智能体）。传入其他值将返回 InvalidParameter.ExperimentTypeInvalid</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>实验类型（必填），取值：MACHINE_LEARNING（机器学习）/ CLASSIFICATION（分类）/ REGRESSION（回归）/ FORECASTING（时间序列预测）/ AGENT（智能体）。传入其他值将返回 InvalidParameter.ExperimentTypeInvalid</p>
     * @param Type <p>实验类型（必填），取值：MACHINE_LEARNING（机器学习）/ CLASSIFICATION（分类）/ REGRESSION（回归）/ FORECASTING（时间序列预测）/ AGENT（智能体）。传入其他值将返回 InvalidParameter.ExperimentTypeInvalid</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>实验描述（可选），建议长度不超过 1024 字符</p> 
     * @return Description <p>实验描述（可选），建议长度不超过 1024 字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>实验描述（可选），建议长度不超过 1024 字符</p>
     * @param Description <p>实验描述（可选），建议长度不超过 1024 字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Studio目录树文件夹节点ID，即实验所在的目录节点，可通过 ListFiles 接口获取</p> 
     * @return StudioId <p>Studio目录树文件夹节点ID，即实验所在的目录节点，可通过 ListFiles 接口获取</p>
     */
    public String getStudioId() {
        return this.StudioId;
    }

    /**
     * Set <p>Studio目录树文件夹节点ID，即实验所在的目录节点，可通过 ListFiles 接口获取</p>
     * @param StudioId <p>Studio目录树文件夹节点ID，即实验所在的目录节点，可通过 ListFiles 接口获取</p>
     */
    public void setStudioId(String StudioId) {
        this.StudioId = StudioId;
    }

    /**
     * Get <p>实验标签列表（可选），key/value 均为字符串</p> 
     * @return Tags <p>实验标签列表（可选），key/value 均为字符串</p>
     */
    public ExperimentTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实验标签列表（可选），key/value 均为字符串</p>
     * @param Tags <p>实验标签列表（可选），key/value 均为字符串</p>
     */
    public void setTags(ExperimentTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>AutoML配置（可选，仅 Type 为 CLASSIFICATION/REGRESSION/FORECASTING 时需要），包含评估指标、搜索空间、最大运行时间/次数/并发等</p> 
     * @return AutoMlConf <p>AutoML配置（可选，仅 Type 为 CLASSIFICATION/REGRESSION/FORECASTING 时需要），包含评估指标、搜索空间、最大运行时间/次数/并发等</p>
     */
    public AutoMlConf getAutoMlConf() {
        return this.AutoMlConf;
    }

    /**
     * Set <p>AutoML配置（可选，仅 Type 为 CLASSIFICATION/REGRESSION/FORECASTING 时需要），包含评估指标、搜索空间、最大运行时间/次数/并发等</p>
     * @param AutoMlConf <p>AutoML配置（可选，仅 Type 为 CLASSIFICATION/REGRESSION/FORECASTING 时需要），包含评估指标、搜索空间、最大运行时间/次数/并发等</p>
     */
    public void setAutoMlConf(AutoMlConf AutoMlConf) {
        this.AutoMlConf = AutoMlConf;
    }

    /**
     * Get <p>训练数据配置（可选，仅 AutoML 类型实验需要），指定训练数据表（Catalog.Schema.Table 三段式）与目标标签列</p> 
     * @return TrainingData <p>训练数据配置（可选，仅 AutoML 类型实验需要），指定训练数据表（Catalog.Schema.Table 三段式）与目标标签列</p>
     */
    public TrainingData getTrainingData() {
        return this.TrainingData;
    }

    /**
     * Set <p>训练数据配置（可选，仅 AutoML 类型实验需要），指定训练数据表（Catalog.Schema.Table 三段式）与目标标签列</p>
     * @param TrainingData <p>训练数据配置（可选，仅 AutoML 类型实验需要），指定训练数据表（Catalog.Schema.Table 三段式）与目标标签列</p>
     */
    public void setTrainingData(TrainingData TrainingData) {
        this.TrainingData = TrainingData;
    }

    /**
     * Get <p>计算资源组ID（可选），指定实验运行所使用的计算资源，可通过 ListComputeResourceOptions 接口获取</p> 
     * @return ResourceGroupId <p>计算资源组ID（可选），指定实验运行所使用的计算资源，可通过 ListComputeResourceOptions 接口获取</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>计算资源组ID（可选），指定实验运行所使用的计算资源，可通过 ListComputeResourceOptions 接口获取</p>
     * @param ResourceGroupId <p>计算资源组ID（可选），指定实验运行所使用的计算资源，可通过 ListComputeResourceOptions 接口获取</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    public CreateExperimentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExperimentRequest(CreateExperimentRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StudioId != null) {
            this.StudioId = new String(source.StudioId);
        }
        if (source.Tags != null) {
            this.Tags = new ExperimentTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ExperimentTag(source.Tags[i]);
            }
        }
        if (source.AutoMlConf != null) {
            this.AutoMlConf = new AutoMlConf(source.AutoMlConf);
        }
        if (source.TrainingData != null) {
            this.TrainingData = new TrainingData(source.TrainingData);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StudioId", this.StudioId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "AutoMlConf.", this.AutoMlConf);
        this.setParamObj(map, prefix + "TrainingData.", this.TrainingData);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);

    }
}

