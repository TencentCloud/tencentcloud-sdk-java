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

public class CreateLabRequest extends AbstractModel {

    /**
    * <p>数据实验室名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Lab 镜像地址（必填，用于开发工具如 Jupyter/VSCode/WebShell）。前端在&quot;内置 / 自定义&quot;两态中选择此值；当 Image 字段未显式传入时，后端会基于该字段按 R1（镜像表命中）/R2（同值 fallback）派生 Ray 集群镜像。</p>
    */
    @SerializedName("LabImage")
    @Expose
    private String LabImage;

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
    * <p>数据实验室描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Ray 集群镜像地址（可选，OpenAPI/SDK 高级控制入口）。前端不再传递此字段；为空时后端按 R1（镜像表查询命中）→ R2（同值 fallback）顺序自动派生。非空时直接作为 Ray 集群镜像，跳过派生（EXPLICIT），且后端不校验其与 LabImage 的兼容性。</p>
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
    * <p>计算组 ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>服务类型列表(VSCODE, JUPYTER, WEBSHELL)，不填则使用默认配置</p>
    */
    @SerializedName("ServiceTypes")
    @Expose
    private String [] ServiceTypes;

    /**
    * <p>案例ID，当 startMode=EXAMPLE 时必填</p>
    */
    @SerializedName("ExampleId")
    @Expose
    private String ExampleId;

    /**
    * <p>案例代码包地址，当 startMode=EXAMPLE 时填写</p>
    */
    @SerializedName("CodeArchiveUrl")
    @Expose
    private String CodeArchiveUrl;

    /**
    * <p>Lab sidecar 镜像拉取策略（Always, IfNotPresent, Never）</p>
    */
    @SerializedName("LabImagePullPolicy")
    @Expose
    private String LabImagePullPolicy;

    /**
    * <p>高级参数（扁平 Key-Value 的 JSON 字符串），Key 以 spec. 开头，按 RayCluster CRD 下钻；详见 ADVANCED_CLUSTER_OPTIONS_DESIGN.md</p>
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
    * <p>持久化工作目录配置（可选）。启用后将 COS/CFS 指定路径挂载到容器内 /workspace 工作目录，与现有 Catalog 的卷配置互斥（不允许同时在 Catalog 中显式声明 MountPath=/workspace）。</p>
    */
    @SerializedName("PersistentWorkDir")
    @Expose
    private PersistentWorkDir PersistentWorkDir;

    /**
    * <p>是否开启token认证</p>
    */
    @SerializedName("EnableToken")
    @Expose
    private Boolean EnableToken;

    /**
    * <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
    */
    @SerializedName("ImagePullType")
    @Expose
    private String ImagePullType;

    /**
    * <p>Lab sidecar 镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
    */
    @SerializedName("LabImagePullType")
    @Expose
    private String LabImagePullType;

    /**
     * Get <p>数据实验室名称</p> 
     * @return Name <p>数据实验室名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据实验室名称</p>
     * @param Name <p>数据实验室名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Lab 镜像地址（必填，用于开发工具如 Jupyter/VSCode/WebShell）。前端在&quot;内置 / 自定义&quot;两态中选择此值；当 Image 字段未显式传入时，后端会基于该字段按 R1（镜像表命中）/R2（同值 fallback）派生 Ray 集群镜像。</p> 
     * @return LabImage <p>Lab 镜像地址（必填，用于开发工具如 Jupyter/VSCode/WebShell）。前端在&quot;内置 / 自定义&quot;两态中选择此值；当 Image 字段未显式传入时，后端会基于该字段按 R1（镜像表命中）/R2（同值 fallback）派生 Ray 集群镜像。</p>
     */
    public String getLabImage() {
        return this.LabImage;
    }

    /**
     * Set <p>Lab 镜像地址（必填，用于开发工具如 Jupyter/VSCode/WebShell）。前端在&quot;内置 / 自定义&quot;两态中选择此值；当 Image 字段未显式传入时，后端会基于该字段按 R1（镜像表命中）/R2（同值 fallback）派生 Ray 集群镜像。</p>
     * @param LabImage <p>Lab 镜像地址（必填，用于开发工具如 Jupyter/VSCode/WebShell）。前端在&quot;内置 / 自定义&quot;两态中选择此值；当 Image 字段未显式传入时，后端会基于该字段按 R1（镜像表命中）/R2（同值 fallback）派生 Ray 集群镜像。</p>
     */
    public void setLabImage(String LabImage) {
        this.LabImage = LabImage;
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
     * Get <p>数据实验室描述</p> 
     * @return Description <p>数据实验室描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>数据实验室描述</p>
     * @param Description <p>数据实验室描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Ray 集群镜像地址（可选，OpenAPI/SDK 高级控制入口）。前端不再传递此字段；为空时后端按 R1（镜像表查询命中）→ R2（同值 fallback）顺序自动派生。非空时直接作为 Ray 集群镜像，跳过派生（EXPLICIT），且后端不校验其与 LabImage 的兼容性。</p> 
     * @return Image <p>Ray 集群镜像地址（可选，OpenAPI/SDK 高级控制入口）。前端不再传递此字段；为空时后端按 R1（镜像表查询命中）→ R2（同值 fallback）顺序自动派生。非空时直接作为 Ray 集群镜像，跳过派生（EXPLICIT），且后端不校验其与 LabImage 的兼容性。</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>Ray 集群镜像地址（可选，OpenAPI/SDK 高级控制入口）。前端不再传递此字段；为空时后端按 R1（镜像表查询命中）→ R2（同值 fallback）顺序自动派生。非空时直接作为 Ray 集群镜像，跳过派生（EXPLICIT），且后端不校验其与 LabImage 的兼容性。</p>
     * @param Image <p>Ray 集群镜像地址（可选，OpenAPI/SDK 高级控制入口）。前端不再传递此字段；为空时后端按 R1（镜像表查询命中）→ R2（同值 fallback）顺序自动派生。非空时直接作为 Ray 集群镜像，跳过派生（EXPLICIT），且后端不校验其与 LabImage 的兼容性。</p>
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
     * Get <p>服务类型列表(VSCODE, JUPYTER, WEBSHELL)，不填则使用默认配置</p> 
     * @return ServiceTypes <p>服务类型列表(VSCODE, JUPYTER, WEBSHELL)，不填则使用默认配置</p>
     */
    public String [] getServiceTypes() {
        return this.ServiceTypes;
    }

    /**
     * Set <p>服务类型列表(VSCODE, JUPYTER, WEBSHELL)，不填则使用默认配置</p>
     * @param ServiceTypes <p>服务类型列表(VSCODE, JUPYTER, WEBSHELL)，不填则使用默认配置</p>
     */
    public void setServiceTypes(String [] ServiceTypes) {
        this.ServiceTypes = ServiceTypes;
    }

    /**
     * Get <p>案例ID，当 startMode=EXAMPLE 时必填</p> 
     * @return ExampleId <p>案例ID，当 startMode=EXAMPLE 时必填</p>
     */
    public String getExampleId() {
        return this.ExampleId;
    }

    /**
     * Set <p>案例ID，当 startMode=EXAMPLE 时必填</p>
     * @param ExampleId <p>案例ID，当 startMode=EXAMPLE 时必填</p>
     */
    public void setExampleId(String ExampleId) {
        this.ExampleId = ExampleId;
    }

    /**
     * Get <p>案例代码包地址，当 startMode=EXAMPLE 时填写</p> 
     * @return CodeArchiveUrl <p>案例代码包地址，当 startMode=EXAMPLE 时填写</p>
     */
    public String getCodeArchiveUrl() {
        return this.CodeArchiveUrl;
    }

    /**
     * Set <p>案例代码包地址，当 startMode=EXAMPLE 时填写</p>
     * @param CodeArchiveUrl <p>案例代码包地址，当 startMode=EXAMPLE 时填写</p>
     */
    public void setCodeArchiveUrl(String CodeArchiveUrl) {
        this.CodeArchiveUrl = CodeArchiveUrl;
    }

    /**
     * Get <p>Lab sidecar 镜像拉取策略（Always, IfNotPresent, Never）</p> 
     * @return LabImagePullPolicy <p>Lab sidecar 镜像拉取策略（Always, IfNotPresent, Never）</p>
     */
    public String getLabImagePullPolicy() {
        return this.LabImagePullPolicy;
    }

    /**
     * Set <p>Lab sidecar 镜像拉取策略（Always, IfNotPresent, Never）</p>
     * @param LabImagePullPolicy <p>Lab sidecar 镜像拉取策略（Always, IfNotPresent, Never）</p>
     */
    public void setLabImagePullPolicy(String LabImagePullPolicy) {
        this.LabImagePullPolicy = LabImagePullPolicy;
    }

    /**
     * Get <p>高级参数（扁平 Key-Value 的 JSON 字符串），Key 以 spec. 开头，按 RayCluster CRD 下钻；详见 ADVANCED_CLUSTER_OPTIONS_DESIGN.md</p> 
     * @return AdvancedOptions <p>高级参数（扁平 Key-Value 的 JSON 字符串），Key 以 spec. 开头，按 RayCluster CRD 下钻；详见 ADVANCED_CLUSTER_OPTIONS_DESIGN.md</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>高级参数（扁平 Key-Value 的 JSON 字符串），Key 以 spec. 开头，按 RayCluster CRD 下钻；详见 ADVANCED_CLUSTER_OPTIONS_DESIGN.md</p>
     * @param AdvancedOptions <p>高级参数（扁平 Key-Value 的 JSON 字符串），Key 以 spec. 开头，按 RayCluster CRD 下钻；详见 ADVANCED_CLUSTER_OPTIONS_DESIGN.md</p>
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

    /**
     * Get <p>持久化工作目录配置（可选）。启用后将 COS/CFS 指定路径挂载到容器内 /workspace 工作目录，与现有 Catalog 的卷配置互斥（不允许同时在 Catalog 中显式声明 MountPath=/workspace）。</p> 
     * @return PersistentWorkDir <p>持久化工作目录配置（可选）。启用后将 COS/CFS 指定路径挂载到容器内 /workspace 工作目录，与现有 Catalog 的卷配置互斥（不允许同时在 Catalog 中显式声明 MountPath=/workspace）。</p>
     */
    public PersistentWorkDir getPersistentWorkDir() {
        return this.PersistentWorkDir;
    }

    /**
     * Set <p>持久化工作目录配置（可选）。启用后将 COS/CFS 指定路径挂载到容器内 /workspace 工作目录，与现有 Catalog 的卷配置互斥（不允许同时在 Catalog 中显式声明 MountPath=/workspace）。</p>
     * @param PersistentWorkDir <p>持久化工作目录配置（可选）。启用后将 COS/CFS 指定路径挂载到容器内 /workspace 工作目录，与现有 Catalog 的卷配置互斥（不允许同时在 Catalog 中显式声明 MountPath=/workspace）。</p>
     */
    public void setPersistentWorkDir(PersistentWorkDir PersistentWorkDir) {
        this.PersistentWorkDir = PersistentWorkDir;
    }

    /**
     * Get <p>是否开启token认证</p> 
     * @return EnableToken <p>是否开启token认证</p>
     */
    public Boolean getEnableToken() {
        return this.EnableToken;
    }

    /**
     * Set <p>是否开启token认证</p>
     * @param EnableToken <p>是否开启token认证</p>
     */
    public void setEnableToken(Boolean EnableToken) {
        this.EnableToken = EnableToken;
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
     * Get <p>Lab sidecar 镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p> 
     * @return LabImagePullType <p>Lab sidecar 镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
     */
    public String getLabImagePullType() {
        return this.LabImagePullType;
    }

    /**
     * Set <p>Lab sidecar 镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
     * @param LabImagePullType <p>Lab sidecar 镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
     */
    public void setLabImagePullType(String LabImagePullType) {
        this.LabImagePullType = LabImagePullType;
    }

    public CreateLabRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLabRequest(CreateLabRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LabImage != null) {
            this.LabImage = new String(source.LabImage);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
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
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ServiceTypes != null) {
            this.ServiceTypes = new String[source.ServiceTypes.length];
            for (int i = 0; i < source.ServiceTypes.length; i++) {
                this.ServiceTypes[i] = new String(source.ServiceTypes[i]);
            }
        }
        if (source.ExampleId != null) {
            this.ExampleId = new String(source.ExampleId);
        }
        if (source.CodeArchiveUrl != null) {
            this.CodeArchiveUrl = new String(source.CodeArchiveUrl);
        }
        if (source.LabImagePullPolicy != null) {
            this.LabImagePullPolicy = new String(source.LabImagePullPolicy);
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
        if (source.PersistentWorkDir != null) {
            this.PersistentWorkDir = new PersistentWorkDir(source.PersistentWorkDir);
        }
        if (source.EnableToken != null) {
            this.EnableToken = new Boolean(source.EnableToken);
        }
        if (source.ImagePullType != null) {
            this.ImagePullType = new String(source.ImagePullType);
        }
        if (source.LabImagePullType != null) {
            this.LabImagePullType = new String(source.LabImagePullType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LabImage", this.LabImage);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "ServiceTypes.", this.ServiceTypes);
        this.setParamSimple(map, prefix + "ExampleId", this.ExampleId);
        this.setParamSimple(map, prefix + "CodeArchiveUrl", this.CodeArchiveUrl);
        this.setParamSimple(map, prefix + "LabImagePullPolicy", this.LabImagePullPolicy);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "PersistentWorkDir.", this.PersistentWorkDir);
        this.setParamSimple(map, prefix + "EnableToken", this.EnableToken);
        this.setParamSimple(map, prefix + "ImagePullType", this.ImagePullType);
        this.setParamSimple(map, prefix + "LabImagePullType", this.LabImagePullType);

    }
}

