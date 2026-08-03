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
    * <p>存储挂载配置名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSource")
    @Expose
    private StorageSource StorageSource;

    /**
    * <p>沙箱实例本地挂载路径</p>
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * <p>存储挂载读写权限配置，默认为false</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
     * Get <p>存储挂载配置名称</p> 
     * @return Name <p>存储挂载配置名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>存储挂载配置名称</p>
     * @param Name <p>存储挂载配置名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSource <p>存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StorageSource getStorageSource() {
        return this.StorageSource;
    }

    /**
     * Set <p>存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSource <p>存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSource(StorageSource StorageSource) {
        this.StorageSource = StorageSource;
    }

    /**
     * Get <p>沙箱实例本地挂载路径</p> 
     * @return MountPath <p>沙箱实例本地挂载路径</p>
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set <p>沙箱实例本地挂载路径</p>
     * @param MountPath <p>沙箱实例本地挂载路径</p>
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get <p>存储挂载读写权限配置，默认为false</p> 
     * @return ReadOnly <p>存储挂载读写权限配置，默认为false</p>
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>存储挂载读写权限配置，默认为false</p>
     * @param ReadOnly <p>存储挂载读写权限配置，默认为false</p>
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

