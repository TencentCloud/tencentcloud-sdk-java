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

public class StorageMount extends AbstractModel {

    /**
    * 存储挂载配置名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 存储配置
    */
    @SerializedName("StorageSource")
    @Expose
    private StorageSource StorageSource;

    /**
    * 沙箱实例本地挂载路径
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * 存储挂载读写权限配置，默认为false
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
     * Get 存储挂载配置名称 
     * @return Name 存储挂载配置名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 存储挂载配置名称
     * @param Name 存储挂载配置名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 存储配置 
     * @return StorageSource 存储配置
     */
    public StorageSource getStorageSource() {
        return this.StorageSource;
    }

    /**
     * Set 存储配置
     * @param StorageSource 存储配置
     */
    public void setStorageSource(StorageSource StorageSource) {
        this.StorageSource = StorageSource;
    }

    /**
     * Get 沙箱实例本地挂载路径 
     * @return MountPath 沙箱实例本地挂载路径
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 沙箱实例本地挂载路径
     * @param MountPath 沙箱实例本地挂载路径
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get 存储挂载读写权限配置，默认为false 
     * @return ReadOnly 存储挂载读写权限配置，默认为false
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 存储挂载读写权限配置，默认为false
     * @param ReadOnly 存储挂载读写权限配置，默认为false
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    public StorageMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageMount(StorageMount source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StorageSource != null) {
            this.StorageSource = new StorageSource(source.StorageSource);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "StorageSource.", this.StorageSource);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);

    }
}

