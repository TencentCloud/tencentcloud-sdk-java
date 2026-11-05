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

public class DataSourceBrief extends AbstractModel {

    /**
    * <p>存储实例ID</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>存储实例名称</p>
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * <p>存储目录</p>
    */
    @SerializedName("WorkDir")
    @Expose
    private String WorkDir;

    /**
    * <p>数据源读写权限，RW/RO</p>
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

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
     * Get <p>存储实例名称</p> 
     * @return StorageName <p>存储实例名称</p>
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set <p>存储实例名称</p>
     * @param StorageName <p>存储实例名称</p>
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get <p>存储目录</p> 
     * @return WorkDir <p>存储目录</p>
     */
    public String getWorkDir() {
        return this.WorkDir;
    }

    /**
     * Set <p>存储目录</p>
     * @param WorkDir <p>存储目录</p>
     */
    public void setWorkDir(String WorkDir) {
        this.WorkDir = WorkDir;
    }

    /**
     * Get <p>数据源读写权限，RW/RO</p> 
     * @return Permission <p>数据源读写权限，RW/RO</p>
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>数据源读写权限，RW/RO</p>
     * @param Permission <p>数据源读写权限，RW/RO</p>
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    public DataSourceBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceBrief(DataSourceBrief source) {
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
        if (source.WorkDir != null) {
            this.WorkDir = new String(source.WorkDir);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StorageName", this.StorageName);
        this.setParamSimple(map, prefix + "WorkDir", this.WorkDir);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

