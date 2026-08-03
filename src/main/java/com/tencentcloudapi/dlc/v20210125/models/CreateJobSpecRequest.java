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

public class CreateJobSpecRequest extends AbstractModel {

    /**
    * <p>入口命令不能为空</p>
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * <p>配置名称（可选，不填则自动生成）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>配置描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>镜像拉取类型（Builtin: 内置, Custom: 自定义）</p>
    */
    @SerializedName("ImagePullType")
    @Expose
    private String ImagePullType;

    /**
    * <p>镜像拉取策略（Always, IfNotPresent, Never）</p>
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * <p>资源配置(JSON)</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>运行时环境配置(JSON)</p>
    */
    @SerializedName("RuntimeEnv")
    @Expose
    private String RuntimeEnv;

    /**
    * <p>存储卷和挂载卷配置(JSON)</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>弹性伸缩配置(JSON)</p>
    */
    @SerializedName("AutoscalerOptions")
    @Expose
    private String AutoscalerOptions;

    /**
    * <p>默认资源分区ID</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>资源配置模板ID</p>
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private String ResourceConfigId;

    /**
    * <p>默认队列名称</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>作业包URL</p>
    */
    @SerializedName("JobPackage")
    @Expose
    private String JobPackage;

    /**
    * <p>作业包名称</p>
    */
    @SerializedName("JobPackageName")
    @Expose
    private String JobPackageName;

    /**
    * <p>作业包来源类型（Local: 本地上传, Cos: 用户自有 COS 桶地址）；缺省时按 Local 处理</p>
    */
    @SerializedName("JobPackageSource")
    @Expose
    private String JobPackageSource;

    /**
    * <p>高级参数json</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
    * <p>默认计算组名称（与 ClusterId 互斥；与老字段 ClusterGroup 等价，新调用方优先使用 GroupId）</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>默认集群 ID（与 GroupId 互斥，同时非空将返回 InvalidParameter.ClusterAndGroupConflict）</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>作业优先级（1-9，数字越大优先级越高）</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>标签列表（TagKey-TagValue），用于将资源与腾讯云标签系统中的标签绑定</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>集群分派策略</p><p>枚举值：</p><ul><li>RANDOM： 随机分配</li></ul>
    */
    @SerializedName("DispatchStrategy")
    @Expose
    private String DispatchStrategy;

    /**
     * Get <p>入口命令不能为空</p> 
     * @return Entrypoint <p>入口命令不能为空</p>
     */
    public String getEntrypoint() {
        return this.Entrypoint;
    }

    /**
     * Set <p>入口命令不能为空</p>
     * @param Entrypoint <p>入口命令不能为空</p>
     */
    public void setEntrypoint(String Entrypoint) {
        this.Entrypoint = Entrypoint;
    }

    /**
     * Get <p>配置名称（可选，不填则自动生成）</p> 
     * @return Name <p>配置名称（可选，不填则自动生成）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>配置名称（可选，不填则自动生成）</p>
     * @param Name <p>配置名称（可选，不填则自动生成）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>配置描述</p> 
     * @return Description <p>配置描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>配置描述</p>
     * @param Description <p>配置描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>镜像地址</p> 
     * @return Image <p>镜像地址</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像地址</p>
     * @param Image <p>镜像地址</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>镜像拉取类型（Builtin: 内置, Custom: 自定义）</p> 
     * @return ImagePullType <p>镜像拉取类型（Builtin: 内置, Custom: 自定义）</p>
     */
    public String getImagePullType() {
        return this.ImagePullType;
    }

    /**
     * Set <p>镜像拉取类型（Builtin: 内置, Custom: 自定义）</p>
     * @param ImagePullType <p>镜像拉取类型（Builtin: 内置, Custom: 自定义）</p>
     */
    public void setImagePullType(String ImagePullType) {
        this.ImagePullType = ImagePullType;
    }

    /**
     * Get <p>镜像拉取策略（Always, IfNotPresent, Never）</p> 
     * @return ImagePullPolicy <p>镜像拉取策略（Always, IfNotPresent, Never）</p>
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set <p>镜像拉取策略（Always, IfNotPresent, Never）</p>
     * @param ImagePullPolicy <p>镜像拉取策略（Always, IfNotPresent, Never）</p>
     */
    public void setImagePullPolicy(String ImagePullPolicy) {
        this.ImagePullPolicy = ImagePullPolicy;
    }

    /**
     * Get <p>资源配置(JSON)</p> 
     * @return ResourceConfig <p>资源配置(JSON)</p>
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>资源配置(JSON)</p>
     * @param ResourceConfig <p>资源配置(JSON)</p>
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>运行时环境配置(JSON)</p> 
     * @return RuntimeEnv <p>运行时环境配置(JSON)</p>
     */
    public String getRuntimeEnv() {
        return this.RuntimeEnv;
    }

    /**
     * Set <p>运行时环境配置(JSON)</p>
     * @param RuntimeEnv <p>运行时环境配置(JSON)</p>
     */
    public void setRuntimeEnv(String RuntimeEnv) {
        this.RuntimeEnv = RuntimeEnv;
    }

    /**
     * Get <p>存储卷和挂载卷配置(JSON)</p> 
     * @return Catalog <p>存储卷和挂载卷配置(JSON)</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>存储卷和挂载卷配置(JSON)</p>
     * @param Catalog <p>存储卷和挂载卷配置(JSON)</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>弹性伸缩配置(JSON)</p> 
     * @return AutoscalerOptions <p>弹性伸缩配置(JSON)</p>
     */
    public String getAutoscalerOptions() {
        return this.AutoscalerOptions;
    }

    /**
     * Set <p>弹性伸缩配置(JSON)</p>
     * @param AutoscalerOptions <p>弹性伸缩配置(JSON)</p>
     */
    public void setAutoscalerOptions(String AutoscalerOptions) {
        this.AutoscalerOptions = AutoscalerOptions;
    }

    /**
     * Get <p>默认资源分区ID</p> 
     * @return ResourcePartitionId <p>默认资源分区ID</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>默认资源分区ID</p>
     * @param ResourcePartitionId <p>默认资源分区ID</p>
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>资源配置模板ID</p> 
     * @return ResourceConfigId <p>资源配置模板ID</p>
     */
    public String getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set <p>资源配置模板ID</p>
     * @param ResourceConfigId <p>资源配置模板ID</p>
     */
    public void setResourceConfigId(String ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get <p>默认队列名称</p> 
     * @return Queue <p>默认队列名称</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>默认队列名称</p>
     * @param Queue <p>默认队列名称</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>作业包URL</p> 
     * @return JobPackage <p>作业包URL</p>
     */
    public String getJobPackage() {
        return this.JobPackage;
    }

    /**
     * Set <p>作业包URL</p>
     * @param JobPackage <p>作业包URL</p>
     */
    public void setJobPackage(String JobPackage) {
        this.JobPackage = JobPackage;
    }

    /**
     * Get <p>作业包名称</p> 
     * @return JobPackageName <p>作业包名称</p>
     */
    public String getJobPackageName() {
        return this.JobPackageName;
    }

    /**
     * Set <p>作业包名称</p>
     * @param JobPackageName <p>作业包名称</p>
     */
    public void setJobPackageName(String JobPackageName) {
        this.JobPackageName = JobPackageName;
    }

    /**
     * Get <p>作业包来源类型（Local: 本地上传, Cos: 用户自有 COS 桶地址）；缺省时按 Local 处理</p> 
     * @return JobPackageSource <p>作业包来源类型（Local: 本地上传, Cos: 用户自有 COS 桶地址）；缺省时按 Local 处理</p>
     */
    public String getJobPackageSource() {
        return this.JobPackageSource;
    }

    /**
     * Set <p>作业包来源类型（Local: 本地上传, Cos: 用户自有 COS 桶地址）；缺省时按 Local 处理</p>
     * @param JobPackageSource <p>作业包来源类型（Local: 本地上传, Cos: 用户自有 COS 桶地址）；缺省时按 Local 处理</p>
     */
    public void setJobPackageSource(String JobPackageSource) {
        this.JobPackageSource = JobPackageSource;
    }

    /**
     * Get <p>高级参数json</p> 
     * @return AdvancedOptions <p>高级参数json</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>高级参数json</p>
     * @param AdvancedOptions <p>高级参数json</p>
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
    }

    /**
     * Get <p>默认计算组名称（与 ClusterId 互斥；与老字段 ClusterGroup 等价，新调用方优先使用 GroupId）</p> 
     * @return GroupId <p>默认计算组名称（与 ClusterId 互斥；与老字段 ClusterGroup 等价，新调用方优先使用 GroupId）</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>默认计算组名称（与 ClusterId 互斥；与老字段 ClusterGroup 等价，新调用方优先使用 GroupId）</p>
     * @param GroupId <p>默认计算组名称（与 ClusterId 互斥；与老字段 ClusterGroup 等价，新调用方优先使用 GroupId）</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>默认集群 ID（与 GroupId 互斥，同时非空将返回 InvalidParameter.ClusterAndGroupConflict）</p> 
     * @return ClusterId <p>默认集群 ID（与 GroupId 互斥，同时非空将返回 InvalidParameter.ClusterAndGroupConflict）</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>默认集群 ID（与 GroupId 互斥，同时非空将返回 InvalidParameter.ClusterAndGroupConflict）</p>
     * @param ClusterId <p>默认集群 ID（与 GroupId 互斥，同时非空将返回 InvalidParameter.ClusterAndGroupConflict）</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>作业优先级（1-9，数字越大优先级越高）</p> 
     * @return Priority <p>作业优先级（1-9，数字越大优先级越高）</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>作业优先级（1-9，数字越大优先级越高）</p>
     * @param Priority <p>作业优先级（1-9，数字越大优先级越高）</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>标签列表（TagKey-TagValue），用于将资源与腾讯云标签系统中的标签绑定</p> 
     * @return Tags <p>标签列表（TagKey-TagValue），用于将资源与腾讯云标签系统中的标签绑定</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表（TagKey-TagValue），用于将资源与腾讯云标签系统中的标签绑定</p>
     * @param Tags <p>标签列表（TagKey-TagValue），用于将资源与腾讯云标签系统中的标签绑定</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>集群分派策略</p><p>枚举值：</p><ul><li>RANDOM： 随机分配</li></ul> 
     * @return DispatchStrategy <p>集群分派策略</p><p>枚举值：</p><ul><li>RANDOM： 随机分配</li></ul>
     */
    public String getDispatchStrategy() {
        return this.DispatchStrategy;
    }

    /**
     * Set <p>集群分派策略</p><p>枚举值：</p><ul><li>RANDOM： 随机分配</li></ul>
     * @param DispatchStrategy <p>集群分派策略</p><p>枚举值：</p><ul><li>RANDOM： 随机分配</li></ul>
     */
    public void setDispatchStrategy(String DispatchStrategy) {
        this.DispatchStrategy = DispatchStrategy;
    }

    public CreateJobSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJobSpecRequest(CreateJobSpecRequest source) {
        if (source.Entrypoint != null) {
            this.Entrypoint = new String(source.Entrypoint);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ImagePullType != null) {
            this.ImagePullType = new String(source.ImagePullType);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.RuntimeEnv != null) {
            this.RuntimeEnv = new String(source.RuntimeEnv);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.AutoscalerOptions != null) {
            this.AutoscalerOptions = new String(source.AutoscalerOptions);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new String(source.ResourceConfigId);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.JobPackage != null) {
            this.JobPackage = new String(source.JobPackage);
        }
        if (source.JobPackageName != null) {
            this.JobPackageName = new String(source.JobPackageName);
        }
        if (source.JobPackageSource != null) {
            this.JobPackageSource = new String(source.JobPackageSource);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DispatchStrategy != null) {
            this.DispatchStrategy = new String(source.DispatchStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImagePullType", this.ImagePullType);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "RuntimeEnv", this.RuntimeEnv);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "AutoscalerOptions", this.AutoscalerOptions);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "JobPackage", this.JobPackage);
        this.setParamSimple(map, prefix + "JobPackageName", this.JobPackageName);
        this.setParamSimple(map, prefix + "JobPackageSource", this.JobPackageSource);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DispatchStrategy", this.DispatchStrategy);

    }
}

