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

public class SubmitRayJobRequest extends AbstractModel {

    /**
    * <p>入口命令</p>
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>资源分区ID</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>队列名称</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>运行时环境</p>
    */
    @SerializedName("RuntimeEnv")
    @Expose
    private String RuntimeEnv;

    /**
    * <p>镜像名称</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>镜像拉取策略（Always, IfNotPresent, Never）</p>
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
    */
    @SerializedName("ImagePullType")
    @Expose
    private String ImagePullType;

    /**
    * <p>资源配置</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>目录</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>弹性伸缩配置</p>
    */
    @SerializedName("AutoscalerOptions")
    @Expose
    private String AutoscalerOptions;

    /**
    * <p>高级参数，JSON 字符串（透传到 Neutrino）</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
    * <p>计算组ID；与 ClusterId 互斥。组成员展开为候选集群后由 neutrino 侧路由</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>集群分派策略，本期仅支持 RANDOM；大小写不敏感</p>
    */
    @SerializedName("DispatchStrategy")
    @Expose
    private String DispatchStrategy;

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
    * <p>作业包 URL</p>
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
    * <p>业务来源标识，只为调用上下文，不落盘 JobSpec</p>
    */
    @SerializedName("JobSource")
    @Expose
    private String JobSource;

    /**
    * <p>外部工作流引擎业务键 flowId</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>外部工作流引擎业务键 executionId</p>
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * <p>用户网络配置 JSON 字符串</p>
    */
    @SerializedName("NetworkConfig")
    @Expose
    private String NetworkConfig;

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
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>资源分区ID</p> 
     * @return ResourcePartitionId <p>资源分区ID</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>资源分区ID</p>
     * @param ResourcePartitionId <p>资源分区ID</p>
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>队列名称</p> 
     * @return Queue <p>队列名称</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>队列名称</p>
     * @param Queue <p>队列名称</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>任务名称</p> 
     * @return JobName <p>任务名称</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>任务名称</p>
     * @param JobName <p>任务名称</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>运行时环境</p> 
     * @return RuntimeEnv <p>运行时环境</p>
     */
    public String getRuntimeEnv() {
        return this.RuntimeEnv;
    }

    /**
     * Set <p>运行时环境</p>
     * @param RuntimeEnv <p>运行时环境</p>
     */
    public void setRuntimeEnv(String RuntimeEnv) {
        this.RuntimeEnv = RuntimeEnv;
    }

    /**
     * Get <p>镜像名称</p> 
     * @return Image <p>镜像名称</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像名称</p>
     * @param Image <p>镜像名称</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
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
     * Get <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p> 
     * @return ImagePullType <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
     */
    public String getImagePullType() {
        return this.ImagePullType;
    }

    /**
     * Set <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
     * @param ImagePullType <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
     */
    public void setImagePullType(String ImagePullType) {
        this.ImagePullType = ImagePullType;
    }

    /**
     * Get <p>资源配置</p> 
     * @return ResourceConfig <p>资源配置</p>
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>资源配置</p>
     * @param ResourceConfig <p>资源配置</p>
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>目录</p> 
     * @return Catalog <p>目录</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>目录</p>
     * @param Catalog <p>目录</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>弹性伸缩配置</p> 
     * @return AutoscalerOptions <p>弹性伸缩配置</p>
     */
    public String getAutoscalerOptions() {
        return this.AutoscalerOptions;
    }

    /**
     * Set <p>弹性伸缩配置</p>
     * @param AutoscalerOptions <p>弹性伸缩配置</p>
     */
    public void setAutoscalerOptions(String AutoscalerOptions) {
        this.AutoscalerOptions = AutoscalerOptions;
    }

    /**
     * Get <p>高级参数，JSON 字符串（透传到 Neutrino）</p> 
     * @return AdvancedOptions <p>高级参数，JSON 字符串（透传到 Neutrino）</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>高级参数，JSON 字符串（透传到 Neutrino）</p>
     * @param AdvancedOptions <p>高级参数，JSON 字符串（透传到 Neutrino）</p>
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
    }

    /**
     * Get <p>计算组ID；与 ClusterId 互斥。组成员展开为候选集群后由 neutrino 侧路由</p> 
     * @return GroupId <p>计算组ID；与 ClusterId 互斥。组成员展开为候选集群后由 neutrino 侧路由</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>计算组ID；与 ClusterId 互斥。组成员展开为候选集群后由 neutrino 侧路由</p>
     * @param GroupId <p>计算组ID；与 ClusterId 互斥。组成员展开为候选集群后由 neutrino 侧路由</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>集群分派策略，本期仅支持 RANDOM；大小写不敏感</p> 
     * @return DispatchStrategy <p>集群分派策略，本期仅支持 RANDOM；大小写不敏感</p>
     */
    public String getDispatchStrategy() {
        return this.DispatchStrategy;
    }

    /**
     * Set <p>集群分派策略，本期仅支持 RANDOM；大小写不敏感</p>
     * @param DispatchStrategy <p>集群分派策略，本期仅支持 RANDOM；大小写不敏感</p>
     */
    public void setDispatchStrategy(String DispatchStrategy) {
        this.DispatchStrategy = DispatchStrategy;
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
     * Get <p>作业包 URL</p> 
     * @return JobPackage <p>作业包 URL</p>
     */
    public String getJobPackage() {
        return this.JobPackage;
    }

    /**
     * Set <p>作业包 URL</p>
     * @param JobPackage <p>作业包 URL</p>
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
     * Get <p>业务来源标识，只为调用上下文，不落盘 JobSpec</p> 
     * @return JobSource <p>业务来源标识，只为调用上下文，不落盘 JobSpec</p>
     */
    public String getJobSource() {
        return this.JobSource;
    }

    /**
     * Set <p>业务来源标识，只为调用上下文，不落盘 JobSpec</p>
     * @param JobSource <p>业务来源标识，只为调用上下文，不落盘 JobSpec</p>
     */
    public void setJobSource(String JobSource) {
        this.JobSource = JobSource;
    }

    /**
     * Get <p>外部工作流引擎业务键 flowId</p> 
     * @return FlowId <p>外部工作流引擎业务键 flowId</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>外部工作流引擎业务键 flowId</p>
     * @param FlowId <p>外部工作流引擎业务键 flowId</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>外部工作流引擎业务键 executionId</p> 
     * @return ExecutionId <p>外部工作流引擎业务键 executionId</p>
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set <p>外部工作流引擎业务键 executionId</p>
     * @param ExecutionId <p>外部工作流引擎业务键 executionId</p>
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get <p>用户网络配置 JSON 字符串</p> 
     * @return NetworkConfig <p>用户网络配置 JSON 字符串</p>
     */
    public String getNetworkConfig() {
        return this.NetworkConfig;
    }

    /**
     * Set <p>用户网络配置 JSON 字符串</p>
     * @param NetworkConfig <p>用户网络配置 JSON 字符串</p>
     */
    public void setNetworkConfig(String NetworkConfig) {
        this.NetworkConfig = NetworkConfig;
    }

    public SubmitRayJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitRayJobRequest(SubmitRayJobRequest source) {
        if (source.Entrypoint != null) {
            this.Entrypoint = new String(source.Entrypoint);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.RuntimeEnv != null) {
            this.RuntimeEnv = new String(source.RuntimeEnv);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.ImagePullType != null) {
            this.ImagePullType = new String(source.ImagePullType);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.AutoscalerOptions != null) {
            this.AutoscalerOptions = new String(source.AutoscalerOptions);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.DispatchStrategy != null) {
            this.DispatchStrategy = new String(source.DispatchStrategy);
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
        if (source.JobPackage != null) {
            this.JobPackage = new String(source.JobPackage);
        }
        if (source.JobPackageName != null) {
            this.JobPackageName = new String(source.JobPackageName);
        }
        if (source.JobPackageSource != null) {
            this.JobPackageSource = new String(source.JobPackageSource);
        }
        if (source.JobSource != null) {
            this.JobSource = new String(source.JobSource);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.NetworkConfig != null) {
            this.NetworkConfig = new String(source.NetworkConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "RuntimeEnv", this.RuntimeEnv);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "ImagePullType", this.ImagePullType);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "AutoscalerOptions", this.AutoscalerOptions);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DispatchStrategy", this.DispatchStrategy);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "JobPackage", this.JobPackage);
        this.setParamSimple(map, prefix + "JobPackageName", this.JobPackageName);
        this.setParamSimple(map, prefix + "JobPackageSource", this.JobPackageSource);
        this.setParamSimple(map, prefix + "JobSource", this.JobSource);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "NetworkConfig", this.NetworkConfig);

    }
}

