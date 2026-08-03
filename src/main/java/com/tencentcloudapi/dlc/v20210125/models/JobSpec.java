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

public class JobSpec extends AbstractModel {

    /**
    * <p>配置ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>配置名称</p>
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
    * <p>入口命令</p>
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

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
    * <p>镜像拉取策略</p>
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
    * <p>ResourceConfigId</p>
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private String ResourceConfigId;

    /**
    * <p>资源配置模板是否变更</p>
    */
    @SerializedName("ResourceConfigChanged")
    @Expose
    private Boolean ResourceConfigChanged;

    /**
    * <p>默认资源分区ID</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>默认资源分区名称</p>
    */
    @SerializedName("ResourcePartitionName")
    @Expose
    private String ResourcePartitionName;

    /**
    * <p>默认队列名称</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>集群组Id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>默认计算组名称</p>
    */
    @SerializedName("ClusterGroup")
    @Expose
    private String ClusterGroup;

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
    * <p>优先级</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建者UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>子用户UIN</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>该配置产生的作业实例数量</p>
    */
    @SerializedName("JobInstanceCount")
    @Expose
    private Long JobInstanceCount;

    /**
    * <p>是否有运行中的作业实例</p>
    */
    @SerializedName("HasRunningJobs")
    @Expose
    private Boolean HasRunningJobs;

    /**
    * <p>高级参数，JSON 字符串</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
    * <p>标签列表（TagKey-TagValue），用于将资源与腾讯云标签系统中的标签绑定</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>集群分派策略</p>
    */
    @SerializedName("DispatchStrategy")
    @Expose
    private String DispatchStrategy;

    /**
    * <p>作业提交目标：GROUP（按计算组分派）/ CLUSTER（指定集群）/ SERVERLESS（按 Serverless 拉起）</p>
    */
    @SerializedName("SubmissionTarget")
    @Expose
    private String SubmissionTarget;

    /**
    * <p>集群组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>配置ID</p> 
     * @return Id <p>配置ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>配置ID</p>
     * @param Id <p>配置ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>配置名称</p> 
     * @return Name <p>配置名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>配置名称</p>
     * @param Name <p>配置名称</p>
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
     * Get <p>入口命令</p> 
     * @return Entrypoint <p>入口命令</p>
     */
    public String getEntrypoint() {
        return this.Entrypoint;
    }

    /**
     * Set <p>入口命令</p>
     * @param Entrypoint <p>入口命令</p>
     */
    public void setEntrypoint(String Entrypoint) {
        this.Entrypoint = Entrypoint;
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
     * Get <p>镜像拉取策略</p> 
     * @return ImagePullPolicy <p>镜像拉取策略</p>
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set <p>镜像拉取策略</p>
     * @param ImagePullPolicy <p>镜像拉取策略</p>
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
     * Get <p>ResourceConfigId</p> 
     * @return ResourceConfigId <p>ResourceConfigId</p>
     */
    public String getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set <p>ResourceConfigId</p>
     * @param ResourceConfigId <p>ResourceConfigId</p>
     */
    public void setResourceConfigId(String ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get <p>资源配置模板是否变更</p> 
     * @return ResourceConfigChanged <p>资源配置模板是否变更</p>
     */
    public Boolean getResourceConfigChanged() {
        return this.ResourceConfigChanged;
    }

    /**
     * Set <p>资源配置模板是否变更</p>
     * @param ResourceConfigChanged <p>资源配置模板是否变更</p>
     */
    public void setResourceConfigChanged(Boolean ResourceConfigChanged) {
        this.ResourceConfigChanged = ResourceConfigChanged;
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
     * Get <p>默认资源分区名称</p> 
     * @return ResourcePartitionName <p>默认资源分区名称</p>
     */
    public String getResourcePartitionName() {
        return this.ResourcePartitionName;
    }

    /**
     * Set <p>默认资源分区名称</p>
     * @param ResourcePartitionName <p>默认资源分区名称</p>
     */
    public void setResourcePartitionName(String ResourcePartitionName) {
        this.ResourcePartitionName = ResourcePartitionName;
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
     * Get <p>集群组Id</p> 
     * @return GroupId <p>集群组Id</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>集群组Id</p>
     * @param GroupId <p>集群组Id</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>默认计算组名称</p> 
     * @return ClusterGroup <p>默认计算组名称</p>
     */
    public String getClusterGroup() {
        return this.ClusterGroup;
    }

    /**
     * Set <p>默认计算组名称</p>
     * @param ClusterGroup <p>默认计算组名称</p>
     */
    public void setClusterGroup(String ClusterGroup) {
        this.ClusterGroup = ClusterGroup;
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
     * Get <p>优先级</p> 
     * @return Priority <p>优先级</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级</p>
     * @param Priority <p>优先级</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建者UIN</p> 
     * @return Uin <p>创建者UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>创建者UIN</p>
     * @param Uin <p>创建者UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>子用户UIN</p> 
     * @return SubAccountUin <p>子用户UIN</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>子用户UIN</p>
     * @param SubAccountUin <p>子用户UIN</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>该配置产生的作业实例数量</p> 
     * @return JobInstanceCount <p>该配置产生的作业实例数量</p>
     */
    public Long getJobInstanceCount() {
        return this.JobInstanceCount;
    }

    /**
     * Set <p>该配置产生的作业实例数量</p>
     * @param JobInstanceCount <p>该配置产生的作业实例数量</p>
     */
    public void setJobInstanceCount(Long JobInstanceCount) {
        this.JobInstanceCount = JobInstanceCount;
    }

    /**
     * Get <p>是否有运行中的作业实例</p> 
     * @return HasRunningJobs <p>是否有运行中的作业实例</p>
     */
    public Boolean getHasRunningJobs() {
        return this.HasRunningJobs;
    }

    /**
     * Set <p>是否有运行中的作业实例</p>
     * @param HasRunningJobs <p>是否有运行中的作业实例</p>
     */
    public void setHasRunningJobs(Boolean HasRunningJobs) {
        this.HasRunningJobs = HasRunningJobs;
    }

    /**
     * Get <p>高级参数，JSON 字符串</p> 
     * @return AdvancedOptions <p>高级参数，JSON 字符串</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>高级参数，JSON 字符串</p>
     * @param AdvancedOptions <p>高级参数，JSON 字符串</p>
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
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
     * Get <p>集群分派策略</p> 
     * @return DispatchStrategy <p>集群分派策略</p>
     */
    public String getDispatchStrategy() {
        return this.DispatchStrategy;
    }

    /**
     * Set <p>集群分派策略</p>
     * @param DispatchStrategy <p>集群分派策略</p>
     */
    public void setDispatchStrategy(String DispatchStrategy) {
        this.DispatchStrategy = DispatchStrategy;
    }

    /**
     * Get <p>作业提交目标：GROUP（按计算组分派）/ CLUSTER（指定集群）/ SERVERLESS（按 Serverless 拉起）</p> 
     * @return SubmissionTarget <p>作业提交目标：GROUP（按计算组分派）/ CLUSTER（指定集群）/ SERVERLESS（按 Serverless 拉起）</p>
     */
    public String getSubmissionTarget() {
        return this.SubmissionTarget;
    }

    /**
     * Set <p>作业提交目标：GROUP（按计算组分派）/ CLUSTER（指定集群）/ SERVERLESS（按 Serverless 拉起）</p>
     * @param SubmissionTarget <p>作业提交目标：GROUP（按计算组分派）/ CLUSTER（指定集群）/ SERVERLESS（按 Serverless 拉起）</p>
     */
    public void setSubmissionTarget(String SubmissionTarget) {
        this.SubmissionTarget = SubmissionTarget;
    }

    /**
     * Get <p>集群组名称</p> 
     * @return GroupName <p>集群组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>集群组名称</p>
     * @param GroupName <p>集群组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public JobSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobSpec(JobSpec source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Entrypoint != null) {
            this.Entrypoint = new String(source.Entrypoint);
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
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new String(source.ResourceConfigId);
        }
        if (source.ResourceConfigChanged != null) {
            this.ResourceConfigChanged = new Boolean(source.ResourceConfigChanged);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.ResourcePartitionName != null) {
            this.ResourcePartitionName = new String(source.ResourcePartitionName);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterGroup != null) {
            this.ClusterGroup = new String(source.ClusterGroup);
        }
        if (source.JobPackage != null) {
            this.JobPackage = new String(source.JobPackage);
        }
        if (source.JobPackageName != null) {
            this.JobPackageName = new String(source.JobPackageName);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.JobInstanceCount != null) {
            this.JobInstanceCount = new Long(source.JobInstanceCount);
        }
        if (source.HasRunningJobs != null) {
            this.HasRunningJobs = new Boolean(source.HasRunningJobs);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
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
        if (source.SubmissionTarget != null) {
            this.SubmissionTarget = new String(source.SubmissionTarget);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImagePullType", this.ImagePullType);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "RuntimeEnv", this.RuntimeEnv);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "AutoscalerOptions", this.AutoscalerOptions);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "ResourceConfigChanged", this.ResourceConfigChanged);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "ResourcePartitionName", this.ResourcePartitionName);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterGroup", this.ClusterGroup);
        this.setParamSimple(map, prefix + "JobPackage", this.JobPackage);
        this.setParamSimple(map, prefix + "JobPackageName", this.JobPackageName);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "JobInstanceCount", this.JobInstanceCount);
        this.setParamSimple(map, prefix + "HasRunningJobs", this.HasRunningJobs);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DispatchStrategy", this.DispatchStrategy);
        this.setParamSimple(map, prefix + "SubmissionTarget", this.SubmissionTarget);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

