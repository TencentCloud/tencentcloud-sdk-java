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

public class CreateRayClusterRequest extends AbstractModel {

    /**
    * <p>集群名称（可选，不填写则默认使用集群ID）</p>
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
    * <p>所属计算组 ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>所属资源分区ID</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>所属队列名称</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>镜像地址</p>
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
    * <p>资源配置ID</p>
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private String ResourceConfigId;

    /**
    * <p>存储卷和挂载卷配置</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

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
    * <p>标签列表（TagKey-TagValue），用于将资源与腾讯云标签系统中的标签绑定</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>集群名称（可选，不填写则默认使用集群ID）</p> 
     * @return Name <p>集群名称（可选，不填写则默认使用集群ID）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>集群名称（可选，不填写则默认使用集群ID）</p>
     * @param Name <p>集群名称（可选，不填写则默认使用集群ID）</p>
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
     * Get <p>所属计算组 ID</p> 
     * @return GroupId <p>所属计算组 ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>所属计算组 ID</p>
     * @param GroupId <p>所属计算组 ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
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
     * Get <p>存储卷和挂载卷配置</p> 
     * @return Catalog <p>存储卷和挂载卷配置</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>存储卷和挂载卷配置</p>
     * @param Catalog <p>存储卷和挂载卷配置</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
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

    public CreateRayClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRayClusterRequest(CreateRayClusterRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
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
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new String(source.ResourceConfigId);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "ImagePullType", this.ImagePullType);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

