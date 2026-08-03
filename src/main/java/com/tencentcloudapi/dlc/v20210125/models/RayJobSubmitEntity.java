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

public class RayJobSubmitEntity extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>所属资源分区ID</p>
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
    * <p>所属队列名称</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>任务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>入口命令</p>
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>用户主账号UIN</p>
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
    * <p>子用户名称（由聚合层通过 CAM 接口回填）</p>
    */
    @SerializedName("SubAccountName")
    @Expose
    private String SubAccountName;

    /**
    * <p>历史记录链接</p>
    */
    @SerializedName("HistoryUrl")
    @Expose
    private String HistoryUrl;

    /**
    * <p>运行时间(ms)</p>
    */
    @SerializedName("RunningTime")
    @Expose
    private Long RunningTime;

    /**
    * <p>完成时间</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private Long FinishTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>失败原因/错误信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>运行时环境配置(JSON)</p>
    */
    @SerializedName("RuntimeEnv")
    @Expose
    private String RuntimeEnv;

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>资源配置(JSON)</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>存储卷和挂载卷配置(JSON)</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>镜像拉取策略</p>
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * <p>弹性伸缩配置(JSON)</p>
    */
    @SerializedName("AutoscalerOptions")
    @Expose
    private String AutoscalerOptions;

    /**
    * <p>来源配置ID</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * <p>来源配置名称</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>高级参数，JSON 字符串（透传到 Neutrino）</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

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
    * <p>作业来源（如 RAY_JOB / RAY_SERVE / 平台直提交等）</p>
    */
    @SerializedName("JobSource")
    @Expose
    private String JobSource;

    /**
     * Get <p>任务ID</p> 
     * @return Id <p>任务ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>任务ID</p>
     * @param Id <p>任务ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>所属资源分区ID</p> 
     * @return ResourcePartitionId <p>所属资源分区ID</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>所属资源分区ID</p>
     * @param ResourcePartitionId <p>所属资源分区ID</p>
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
     * Get <p>所属队列名称</p> 
     * @return Queue <p>所属队列名称</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>所属队列名称</p>
     * @param Queue <p>所属队列名称</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>任务状态</p> 
     * @return Status <p>任务状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p>
     * @param Status <p>任务状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>用户主账号UIN</p> 
     * @return Uin <p>用户主账号UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户主账号UIN</p>
     * @param Uin <p>用户主账号UIN</p>
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
     * Get <p>子用户名称（由聚合层通过 CAM 接口回填）</p> 
     * @return SubAccountName <p>子用户名称（由聚合层通过 CAM 接口回填）</p>
     */
    public String getSubAccountName() {
        return this.SubAccountName;
    }

    /**
     * Set <p>子用户名称（由聚合层通过 CAM 接口回填）</p>
     * @param SubAccountName <p>子用户名称（由聚合层通过 CAM 接口回填）</p>
     */
    public void setSubAccountName(String SubAccountName) {
        this.SubAccountName = SubAccountName;
    }

    /**
     * Get <p>历史记录链接</p> 
     * @return HistoryUrl <p>历史记录链接</p>
     */
    public String getHistoryUrl() {
        return this.HistoryUrl;
    }

    /**
     * Set <p>历史记录链接</p>
     * @param HistoryUrl <p>历史记录链接</p>
     */
    public void setHistoryUrl(String HistoryUrl) {
        this.HistoryUrl = HistoryUrl;
    }

    /**
     * Get <p>运行时间(ms)</p> 
     * @return RunningTime <p>运行时间(ms)</p>
     */
    public Long getRunningTime() {
        return this.RunningTime;
    }

    /**
     * Set <p>运行时间(ms)</p>
     * @param RunningTime <p>运行时间(ms)</p>
     */
    public void setRunningTime(Long RunningTime) {
        this.RunningTime = RunningTime;
    }

    /**
     * Get <p>完成时间</p> 
     * @return FinishTime <p>完成时间</p>
     */
    public Long getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>完成时间</p>
     * @param FinishTime <p>完成时间</p>
     */
    public void setFinishTime(Long FinishTime) {
        this.FinishTime = FinishTime;
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
     * Get <p>失败原因/错误信息</p> 
     * @return ErrorMessage <p>失败原因/错误信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>失败原因/错误信息</p>
     * @param ErrorMessage <p>失败原因/错误信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
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
     * Get <p>来源配置ID</p> 
     * @return SpecId <p>来源配置ID</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>来源配置ID</p>
     * @param SpecId <p>来源配置ID</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>来源配置名称</p> 
     * @return SpecName <p>来源配置名称</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>来源配置名称</p>
     * @param SpecName <p>来源配置名称</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
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
     * Get <p>作业来源（如 RAY_JOB / RAY_SERVE / 平台直提交等）</p> 
     * @return JobSource <p>作业来源（如 RAY_JOB / RAY_SERVE / 平台直提交等）</p>
     */
    public String getJobSource() {
        return this.JobSource;
    }

    /**
     * Set <p>作业来源（如 RAY_JOB / RAY_SERVE / 平台直提交等）</p>
     * @param JobSource <p>作业来源（如 RAY_JOB / RAY_SERVE / 平台直提交等）</p>
     */
    public void setJobSource(String JobSource) {
        this.JobSource = JobSource;
    }

    public RayJobSubmitEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RayJobSubmitEntity(RayJobSubmitEntity source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Entrypoint != null) {
            this.Entrypoint = new String(source.Entrypoint);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
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
        if (source.SubAccountName != null) {
            this.SubAccountName = new String(source.SubAccountName);
        }
        if (source.HistoryUrl != null) {
            this.HistoryUrl = new String(source.HistoryUrl);
        }
        if (source.RunningTime != null) {
            this.RunningTime = new Long(source.RunningTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new Long(source.FinishTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.RuntimeEnv != null) {
            this.RuntimeEnv = new String(source.RuntimeEnv);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.AutoscalerOptions != null) {
            this.AutoscalerOptions = new String(source.AutoscalerOptions);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
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
        if (source.JobSource != null) {
            this.JobSource = new String(source.JobSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "ResourcePartitionName", this.ResourcePartitionName);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "SubAccountName", this.SubAccountName);
        this.setParamSimple(map, prefix + "HistoryUrl", this.HistoryUrl);
        this.setParamSimple(map, prefix + "RunningTime", this.RunningTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "RuntimeEnv", this.RuntimeEnv);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "AutoscalerOptions", this.AutoscalerOptions);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "JobSource", this.JobSource);

    }
}

