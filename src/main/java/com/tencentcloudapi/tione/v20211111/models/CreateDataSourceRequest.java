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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDataSourceRequest extends AbstractModel {

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>数据源名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据源类型英文名</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>数据源权限，取值有RW RO</p>
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * <p>存储实例ID</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>数据源挂载配置</p>
    */
    @SerializedName("MountConfigure")
    @Expose
    private MountConfigureInfo MountConfigure;

    /**
    * <p>标签配置</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>挂载数据源时默认填充的容器内路径</p>
    */
    @SerializedName("ContainerPath")
    @Expose
    private String ContainerPath;

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>数据源名称</p> 
     * @return Name <p>数据源名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据源名称</p>
     * @param Name <p>数据源名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据源类型英文名</p> 
     * @return Type <p>数据源类型英文名</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>数据源类型英文名</p>
     * @param Type <p>数据源类型英文名</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>数据源权限，取值有RW RO</p> 
     * @return Permission <p>数据源权限，取值有RW RO</p>
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>数据源权限，取值有RW RO</p>
     * @param Permission <p>数据源权限，取值有RW RO</p>
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>存储实例ID</p> 
     * @return StorageId <p>存储实例ID</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>存储实例ID</p>
     * @param StorageId <p>存储实例ID</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>数据源挂载配置</p> 
     * @return MountConfigure <p>数据源挂载配置</p>
     */
    public MountConfigureInfo getMountConfigure() {
        return this.MountConfigure;
    }

    /**
     * Set <p>数据源挂载配置</p>
     * @param MountConfigure <p>数据源挂载配置</p>
     */
    public void setMountConfigure(MountConfigureInfo MountConfigure) {
        this.MountConfigure = MountConfigure;
    }

    /**
     * Get <p>标签配置</p> 
     * @return Tags <p>标签配置</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签配置</p>
     * @param Tags <p>标签配置</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>挂载数据源时默认填充的容器内路径</p> 
     * @return ContainerPath <p>挂载数据源时默认填充的容器内路径</p>
     */
    public String getContainerPath() {
        return this.ContainerPath;
    }

    /**
     * Set <p>挂载数据源时默认填充的容器内路径</p>
     * @param ContainerPath <p>挂载数据源时默认填充的容器内路径</p>
     */
    public void setContainerPath(String ContainerPath) {
        this.ContainerPath = ContainerPath;
    }

    public CreateDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataSourceRequest(CreateDataSourceRequest source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.MountConfigure != null) {
            this.MountConfigure = new MountConfigureInfo(source.MountConfigure);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ContainerPath != null) {
            this.ContainerPath = new String(source.ContainerPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamObj(map, prefix + "MountConfigure.", this.MountConfigure);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ContainerPath", this.ContainerPath);

    }
}

