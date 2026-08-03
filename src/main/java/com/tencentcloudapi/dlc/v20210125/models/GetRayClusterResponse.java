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

public class GetRayClusterResponse extends AbstractModel {

    /**
    * <p>获取Ray集群详情请求</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>资源类型：CLUSTER-普通集群；WORKSPACE-数据实验室（开发入口）</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集群描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>用户UIN</p>
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
    * <p>集群状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>状态详情/错误信息</p>
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>计算组 ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>所属集群组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>资源配置(JSON)</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>存储卷和挂载卷配置(JSON)</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>Dashboard URL / 历史记录链接</p>
    */
    @SerializedName("HistoryUrl")
    @Expose
    private String HistoryUrl;

    /**
    * <p>镜像拉取策略</p>
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
    * <p>高级参数（规范化后的扁平 KV JSON）</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
    * <p>优先级（1-9，数字越大优先级越高）</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>启动时间（最近一次启动）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>停止时间（最近一次停止/休眠）</p>
    */
    @SerializedName("StopTime")
    @Expose
    private Long StopTime;

    /**
    * <p>标签列表（TagKey-TagValue）</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>资源配置ID</p>
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private String ResourceConfigId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>获取Ray集群详情请求</p> 
     * @return Id <p>获取Ray集群详情请求</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>获取Ray集群详情请求</p>
     * @param Id <p>获取Ray集群详情请求</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>资源类型：CLUSTER-普通集群；WORKSPACE-数据实验室（开发入口）</p> 
     * @return Type <p>资源类型：CLUSTER-普通集群；WORKSPACE-数据实验室（开发入口）</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>资源类型：CLUSTER-普通集群；WORKSPACE-数据实验室（开发入口）</p>
     * @param Type <p>资源类型：CLUSTER-普通集群；WORKSPACE-数据实验室（开发入口）</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>集群名称</p> 
     * @return Name <p>集群名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>集群名称</p>
     * @param Name <p>集群名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>集群描述</p> 
     * @return Description <p>集群描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>集群描述</p>
     * @param Description <p>集群描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>用户UIN</p> 
     * @return Uin <p>用户UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户UIN</p>
     * @param Uin <p>用户UIN</p>
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
     * Get <p>集群状态</p> 
     * @return Status <p>集群状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>集群状态</p>
     * @param Status <p>集群状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态详情/错误信息</p> 
     * @return StatusMessage <p>状态详情/错误信息</p>
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set <p>状态详情/错误信息</p>
     * @param StatusMessage <p>状态详情/错误信息</p>
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
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
     * Get <p>计算组 ID</p> 
     * @return GroupId <p>计算组 ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>计算组 ID</p>
     * @param GroupId <p>计算组 ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>所属集群组名称</p> 
     * @return GroupName <p>所属集群组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>所属集群组名称</p>
     * @param GroupName <p>所属集群组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
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
     * Get <p>Dashboard URL / 历史记录链接</p> 
     * @return HistoryUrl <p>Dashboard URL / 历史记录链接</p>
     */
    public String getHistoryUrl() {
        return this.HistoryUrl;
    }

    /**
     * Set <p>Dashboard URL / 历史记录链接</p>
     * @param HistoryUrl <p>Dashboard URL / 历史记录链接</p>
     */
    public void setHistoryUrl(String HistoryUrl) {
        this.HistoryUrl = HistoryUrl;
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
     * Get <p>高级参数（规范化后的扁平 KV JSON）</p> 
     * @return AdvancedOptions <p>高级参数（规范化后的扁平 KV JSON）</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>高级参数（规范化后的扁平 KV JSON）</p>
     * @param AdvancedOptions <p>高级参数（规范化后的扁平 KV JSON）</p>
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
    }

    /**
     * Get <p>优先级（1-9，数字越大优先级越高）</p> 
     * @return Priority <p>优先级（1-9，数字越大优先级越高）</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级（1-9，数字越大优先级越高）</p>
     * @param Priority <p>优先级（1-9，数字越大优先级越高）</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>启动时间（最近一次启动）</p> 
     * @return StartTime <p>启动时间（最近一次启动）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>启动时间（最近一次启动）</p>
     * @param StartTime <p>启动时间（最近一次启动）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>停止时间（最近一次停止/休眠）</p> 
     * @return StopTime <p>停止时间（最近一次停止/休眠）</p>
     */
    public Long getStopTime() {
        return this.StopTime;
    }

    /**
     * Set <p>停止时间（最近一次停止/休眠）</p>
     * @param StopTime <p>停止时间（最近一次停止/休眠）</p>
     */
    public void setStopTime(Long StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get <p>标签列表（TagKey-TagValue）</p> 
     * @return Tags <p>标签列表（TagKey-TagValue）</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表（TagKey-TagValue）</p>
     * @param Tags <p>标签列表（TagKey-TagValue）</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>资源配置ID</p> 
     * @return ResourceConfigId <p>资源配置ID</p>
     */
    public String getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set <p>资源配置ID</p>
     * @param ResourceConfigId <p>资源配置ID</p>
     */
    public void setResourceConfigId(String ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetRayClusterResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRayClusterResponse(GetRayClusterResponse source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.HistoryUrl != null) {
            this.HistoryUrl = new String(source.HistoryUrl);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.ImagePullType != null) {
            this.ImagePullType = new String(source.ImagePullType);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.StopTime != null) {
            this.StopTime = new Long(source.StopTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new String(source.ResourceConfigId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "ResourcePartitionName", this.ResourcePartitionName);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "SubAccountName", this.SubAccountName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "HistoryUrl", this.HistoryUrl);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "ImagePullType", this.ImagePullType);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

