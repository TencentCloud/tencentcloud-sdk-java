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
    * 数据源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据源类型英文名
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据源权限，取值有RW RO
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * 存储实例ID
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * 数据源挂载配置
    */
    @SerializedName("MountConfigure")
    @Expose
    private MountConfigureInfo MountConfigure;

    /**
    * 标签配置
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 数据源名称 
     * @return Name 数据源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据源名称
     * @param Name 数据源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据源类型英文名 
     * @return Type 数据源类型英文名
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型英文名
     * @param Type 数据源类型英文名
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源权限，取值有RW RO 
     * @return Permission 数据源权限，取值有RW RO
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 数据源权限，取值有RW RO
     * @param Permission 数据源权限，取值有RW RO
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 存储实例ID 
     * @return StorageId 存储实例ID
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set 存储实例ID
     * @param StorageId 存储实例ID
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get 数据源挂载配置 
     * @return MountConfigure 数据源挂载配置
     */
    public MountConfigureInfo getMountConfigure() {
        return this.MountConfigure;
    }

    /**
     * Set 数据源挂载配置
     * @param MountConfigure 数据源挂载配置
     */
    public void setMountConfigure(MountConfigureInfo MountConfigure) {
        this.MountConfigure = MountConfigure;
    }

    /**
     * Get 标签配置 
     * @return Tags 标签配置
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签配置
     * @param Tags 标签配置
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataSourceRequest(CreateDataSourceRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamObj(map, prefix + "MountConfigure.", this.MountConfigure);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

