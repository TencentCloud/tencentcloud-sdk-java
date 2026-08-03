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

public class UpdateLabResponse extends AbstractModel {

    /**
    * <p>案例模板ID（startMode=EXAMPLE 时使用）</p>
    */
    @SerializedName("ExampleId")
    @Expose
    private String ExampleId;

    /**
    * <p>代码包/工程归档地址</p>
    */
    @SerializedName("CodeArchiveUrl")
    @Expose
    private String CodeArchiveUrl;

    /**
    * <p>数据实验室服务入口（服务类型 -&gt; 访问地址）</p>
    */
    @SerializedName("Services")
    @Expose
    private TypeKVPair [] Services;

    /**
    * <p>Lab 镜像地址（必填，用于开发工具如 Jupyter/VSCode/WebShell）。前端在&quot;内置 / 自定义&quot;两态中选择此值；当 Image 字段未显式传入时，后端会基于该字段按 R1（镜像表命中）/R2（同值 fallback）派生 Ray 集群镜像。</p>
    */
    @SerializedName("LabImage")
    @Expose
    private String LabImage;

    /**
    * <p>Lab sidecar 镜像拉取策略（Always, IfNotPresent, Never）</p>
    */
    @SerializedName("LabImagePullPolicy")
    @Expose
    private String LabImagePullPolicy;

    /**
    * <p>集群ID</p>
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
    * <p>集群状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>计算组 ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>资源配置(JSON)</p>
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
    * <p>Ray 集群镜像地址（可选，OpenAPI/SDK 高级控制入口）。前端不再传递此字段；为空时后端按 R1（镜像表查询命中）→ R2（同值 fallback）顺序自动派生。非空时直接作为 Ray 集群镜像，跳过派生（EXPLICIT），且后端不校验其与 LabImage 的兼容性。</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>镜像拉取策略</p>
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * <p>优先级（1-9，数字越大优先级越高）</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

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
    * <p>Lab sidecar 镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
    */
    @SerializedName("LabImagePullType")
    @Expose
    private String LabImagePullType;

    /**
    * <p>子用户名称（由聚合层通过 CAM 接口回填）</p>
    */
    @SerializedName("SubAccountName")
    @Expose
    private String SubAccountName;

    /**
    * <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
    */
    @SerializedName("ImagePullType")
    @Expose
    private String ImagePullType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>案例模板ID（startMode=EXAMPLE 时使用）</p> 
     * @return ExampleId <p>案例模板ID（startMode=EXAMPLE 时使用）</p>
     */
    public String getExampleId() {
        return this.ExampleId;
    }

    /**
     * Set <p>案例模板ID（startMode=EXAMPLE 时使用）</p>
     * @param ExampleId <p>案例模板ID（startMode=EXAMPLE 时使用）</p>
     */
    public void setExampleId(String ExampleId) {
        this.ExampleId = ExampleId;
    }

    /**
     * Get <p>代码包/工程归档地址</p> 
     * @return CodeArchiveUrl <p>代码包/工程归档地址</p>
     */
    public String getCodeArchiveUrl() {
        return this.CodeArchiveUrl;
    }

    /**
     * Set <p>代码包/工程归档地址</p>
     * @param CodeArchiveUrl <p>代码包/工程归档地址</p>
     */
    public void setCodeArchiveUrl(String CodeArchiveUrl) {
        this.CodeArchiveUrl = CodeArchiveUrl;
    }

    /**
     * Get <p>数据实验室服务入口（服务类型 -&gt; 访问地址）</p> 
     * @return Services <p>数据实验室服务入口（服务类型 -&gt; 访问地址）</p>
     */
    public TypeKVPair [] getServices() {
        return this.Services;
    }

    /**
     * Set <p>数据实验室服务入口（服务类型 -&gt; 访问地址）</p>
     * @param Services <p>数据实验室服务入口（服务类型 -&gt; 访问地址）</p>
     */
    public void setServices(TypeKVPair [] Services) {
        this.Services = Services;
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
     * Get <p>集群ID</p> 
     * @return Id <p>集群ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>集群ID</p>
     * @param Id <p>集群ID</p>
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

    public UpdateLabResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateLabResponse(UpdateLabResponse source) {
        if (source.ExampleId != null) {
            this.ExampleId = new String(source.ExampleId);
        }
        if (source.CodeArchiveUrl != null) {
            this.CodeArchiveUrl = new String(source.CodeArchiveUrl);
        }
        if (source.Services != null) {
            this.Services = new TypeKVPair[source.Services.length];
            for (int i = 0; i < source.Services.length; i++) {
                this.Services[i] = new TypeKVPair(source.Services[i]);
            }
        }
        if (source.LabImage != null) {
            this.LabImage = new String(source.LabImage);
        }
        if (source.LabImagePullPolicy != null) {
            this.LabImagePullPolicy = new String(source.LabImagePullPolicy);
        }
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new String(source.ResourceConfigId);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.PersistentWorkDir != null) {
            this.PersistentWorkDir = new PersistentWorkDir(source.PersistentWorkDir);
        }
        if (source.EnableToken != null) {
            this.EnableToken = new Boolean(source.EnableToken);
        }
        if (source.LabImagePullType != null) {
            this.LabImagePullType = new String(source.LabImagePullType);
        }
        if (source.SubAccountName != null) {
            this.SubAccountName = new String(source.SubAccountName);
        }
        if (source.ImagePullType != null) {
            this.ImagePullType = new String(source.ImagePullType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExampleId", this.ExampleId);
        this.setParamSimple(map, prefix + "CodeArchiveUrl", this.CodeArchiveUrl);
        this.setParamArrayObj(map, prefix + "Services.", this.Services);
        this.setParamSimple(map, prefix + "LabImage", this.LabImage);
        this.setParamSimple(map, prefix + "LabImagePullPolicy", this.LabImagePullPolicy);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "ResourcePartitionName", this.ResourcePartitionName);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamObj(map, prefix + "PersistentWorkDir.", this.PersistentWorkDir);
        this.setParamSimple(map, prefix + "EnableToken", this.EnableToken);
        this.setParamSimple(map, prefix + "LabImagePullType", this.LabImagePullType);
        this.setParamSimple(map, prefix + "SubAccountName", this.SubAccountName);
        this.setParamSimple(map, prefix + "ImagePullType", this.ImagePullType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

