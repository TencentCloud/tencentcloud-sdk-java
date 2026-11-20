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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSandboxToolRequest extends AbstractModel {

    /**
    * <p>沙箱工具ID</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>沙箱工具描述，最大长度200字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>网络配置</p>
    */
    @SerializedName("NetworkConfiguration")
    @Expose
    private NetworkConfiguration NetworkConfiguration;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>沙箱工具自定义配置</p>
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private CustomConfiguration CustomConfiguration;

    /**
    * <p>桌面电脑环境类沙箱配置</p>
    */
    @SerializedName("ComputerConfiguration")
    @Expose
    private ComputerConfiguration ComputerConfiguration;

    /**
    * <p>按挂载名称更新沙箱工具已有镜像卷的镜像来源和镜像内目录。</p><p>入参限制：每项须提供已有镜像卷的 Name，以及 StorageSource.Image 中的 Reference 和 ImageRegistryType。同一请求中的 Name 须唯一。Reference 须包含镜像标签或 SHA-256 摘要。</p><p>取值参考：[{&quot;Name&quot;:&quot;runtime&quot;,&quot;StorageSource&quot;:{&quot;Image&quot;:{&quot;Reference&quot;:&quot;ccr.ccs.tencentyun.com/example/runtime:v2&quot;,&quot;ImageRegistryType&quot;:&quot;personal&quot;,&quot;SubPath&quot;:&quot;assets&quot;}}}]</p><p>省略本参数或传空数组时保留原配置。SubPath 省略时保留原目录，传空字符串时使用镜像根目录，传非空路径时使用指定目录。工具沿用原有 MountPath 和 ReadOnly，镜像摘要由服务解析。</p>
    */
    @SerializedName("StorageMounts")
    @Expose
    private StorageMount [] StorageMounts;

    /**
     * Get <p>沙箱工具ID</p> 
     * @return ToolId <p>沙箱工具ID</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>沙箱工具ID</p>
     * @param ToolId <p>沙箱工具ID</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>沙箱工具描述，最大长度200字符</p> 
     * @return Description <p>沙箱工具描述，最大长度200字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>沙箱工具描述，最大长度200字符</p>
     * @param Description <p>沙箱工具描述，最大长度200字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>网络配置</p> 
     * @return NetworkConfiguration <p>网络配置</p>
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.NetworkConfiguration;
    }

    /**
     * Set <p>网络配置</p>
     * @param NetworkConfiguration <p>网络配置</p>
     */
    public void setNetworkConfiguration(NetworkConfiguration NetworkConfiguration) {
        this.NetworkConfiguration = NetworkConfiguration;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>沙箱工具自定义配置</p> 
     * @return CustomConfiguration <p>沙箱工具自定义配置</p>
     */
    public CustomConfiguration getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set <p>沙箱工具自定义配置</p>
     * @param CustomConfiguration <p>沙箱工具自定义配置</p>
     */
    public void setCustomConfiguration(CustomConfiguration CustomConfiguration) {
        this.CustomConfiguration = CustomConfiguration;
    }

    /**
     * Get <p>桌面电脑环境类沙箱配置</p> 
     * @return ComputerConfiguration <p>桌面电脑环境类沙箱配置</p>
     */
    public ComputerConfiguration getComputerConfiguration() {
        return this.ComputerConfiguration;
    }

    /**
     * Set <p>桌面电脑环境类沙箱配置</p>
     * @param ComputerConfiguration <p>桌面电脑环境类沙箱配置</p>
     */
    public void setComputerConfiguration(ComputerConfiguration ComputerConfiguration) {
        this.ComputerConfiguration = ComputerConfiguration;
    }

    /**
     * Get <p>按挂载名称更新沙箱工具已有镜像卷的镜像来源和镜像内目录。</p><p>入参限制：每项须提供已有镜像卷的 Name，以及 StorageSource.Image 中的 Reference 和 ImageRegistryType。同一请求中的 Name 须唯一。Reference 须包含镜像标签或 SHA-256 摘要。</p><p>取值参考：[{&quot;Name&quot;:&quot;runtime&quot;,&quot;StorageSource&quot;:{&quot;Image&quot;:{&quot;Reference&quot;:&quot;ccr.ccs.tencentyun.com/example/runtime:v2&quot;,&quot;ImageRegistryType&quot;:&quot;personal&quot;,&quot;SubPath&quot;:&quot;assets&quot;}}}]</p><p>省略本参数或传空数组时保留原配置。SubPath 省略时保留原目录，传空字符串时使用镜像根目录，传非空路径时使用指定目录。工具沿用原有 MountPath 和 ReadOnly，镜像摘要由服务解析。</p> 
     * @return StorageMounts <p>按挂载名称更新沙箱工具已有镜像卷的镜像来源和镜像内目录。</p><p>入参限制：每项须提供已有镜像卷的 Name，以及 StorageSource.Image 中的 Reference 和 ImageRegistryType。同一请求中的 Name 须唯一。Reference 须包含镜像标签或 SHA-256 摘要。</p><p>取值参考：[{&quot;Name&quot;:&quot;runtime&quot;,&quot;StorageSource&quot;:{&quot;Image&quot;:{&quot;Reference&quot;:&quot;ccr.ccs.tencentyun.com/example/runtime:v2&quot;,&quot;ImageRegistryType&quot;:&quot;personal&quot;,&quot;SubPath&quot;:&quot;assets&quot;}}}]</p><p>省略本参数或传空数组时保留原配置。SubPath 省略时保留原目录，传空字符串时使用镜像根目录，传非空路径时使用指定目录。工具沿用原有 MountPath 和 ReadOnly，镜像摘要由服务解析。</p>
     */
    public StorageMount [] getStorageMounts() {
        return this.StorageMounts;
    }

    /**
     * Set <p>按挂载名称更新沙箱工具已有镜像卷的镜像来源和镜像内目录。</p><p>入参限制：每项须提供已有镜像卷的 Name，以及 StorageSource.Image 中的 Reference 和 ImageRegistryType。同一请求中的 Name 须唯一。Reference 须包含镜像标签或 SHA-256 摘要。</p><p>取值参考：[{&quot;Name&quot;:&quot;runtime&quot;,&quot;StorageSource&quot;:{&quot;Image&quot;:{&quot;Reference&quot;:&quot;ccr.ccs.tencentyun.com/example/runtime:v2&quot;,&quot;ImageRegistryType&quot;:&quot;personal&quot;,&quot;SubPath&quot;:&quot;assets&quot;}}}]</p><p>省略本参数或传空数组时保留原配置。SubPath 省略时保留原目录，传空字符串时使用镜像根目录，传非空路径时使用指定目录。工具沿用原有 MountPath 和 ReadOnly，镜像摘要由服务解析。</p>
     * @param StorageMounts <p>按挂载名称更新沙箱工具已有镜像卷的镜像来源和镜像内目录。</p><p>入参限制：每项须提供已有镜像卷的 Name，以及 StorageSource.Image 中的 Reference 和 ImageRegistryType。同一请求中的 Name 须唯一。Reference 须包含镜像标签或 SHA-256 摘要。</p><p>取值参考：[{&quot;Name&quot;:&quot;runtime&quot;,&quot;StorageSource&quot;:{&quot;Image&quot;:{&quot;Reference&quot;:&quot;ccr.ccs.tencentyun.com/example/runtime:v2&quot;,&quot;ImageRegistryType&quot;:&quot;personal&quot;,&quot;SubPath&quot;:&quot;assets&quot;}}}]</p><p>省略本参数或传空数组时保留原配置。SubPath 省略时保留原目录，传空字符串时使用镜像根目录，传非空路径时使用指定目录。工具沿用原有 MountPath 和 ReadOnly，镜像摘要由服务解析。</p>
     */
    public void setStorageMounts(StorageMount [] StorageMounts) {
        this.StorageMounts = StorageMounts;
    }

    public UpdateSandboxToolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSandboxToolRequest(UpdateSandboxToolRequest source) {
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NetworkConfiguration != null) {
            this.NetworkConfiguration = new NetworkConfiguration(source.NetworkConfiguration);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CustomConfiguration != null) {
            this.CustomConfiguration = new CustomConfiguration(source.CustomConfiguration);
        }
        if (source.ComputerConfiguration != null) {
            this.ComputerConfiguration = new ComputerConfiguration(source.ComputerConfiguration);
        }
        if (source.StorageMounts != null) {
            this.StorageMounts = new StorageMount[source.StorageMounts.length];
            for (int i = 0; i < source.StorageMounts.length; i++) {
                this.StorageMounts[i] = new StorageMount(source.StorageMounts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "NetworkConfiguration.", this.NetworkConfiguration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "CustomConfiguration.", this.CustomConfiguration);
        this.setParamObj(map, prefix + "ComputerConfiguration.", this.ComputerConfiguration);
        this.setParamArrayObj(map, prefix + "StorageMounts.", this.StorageMounts);

    }
}

