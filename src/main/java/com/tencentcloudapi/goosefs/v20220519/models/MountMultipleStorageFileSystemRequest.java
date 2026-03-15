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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountMultipleStorageFileSystemRequest extends AbstractModel {

    /**
    * 客户端集群所属的文件系统id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 客户端集群Id
    */
    @SerializedName("CustomerClusterId")
    @Expose
    private String CustomerClusterId;

    /**
    * 挂载的存储集群的id
    */
    @SerializedName("StorageFileSystemId")
    @Expose
    private String StorageFileSystemId;

    /**
     * Get 客户端集群所属的文件系统id 
     * @return FileSystemId 客户端集群所属的文件系统id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 客户端集群所属的文件系统id
     * @param FileSystemId 客户端集群所属的文件系统id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 客户端集群Id 
     * @return CustomerClusterId 客户端集群Id
     */
    public String getCustomerClusterId() {
        return this.CustomerClusterId;
    }

    /**
     * Set 客户端集群Id
     * @param CustomerClusterId 客户端集群Id
     */
    public void setCustomerClusterId(String CustomerClusterId) {
        this.CustomerClusterId = CustomerClusterId;
    }

    /**
     * Get 挂载的存储集群的id 
     * @return StorageFileSystemId 挂载的存储集群的id
     */
    public String getStorageFileSystemId() {
        return this.StorageFileSystemId;
    }

    /**
     * Set 挂载的存储集群的id
     * @param StorageFileSystemId 挂载的存储集群的id
     */
    public void setStorageFileSystemId(String StorageFileSystemId) {
        this.StorageFileSystemId = StorageFileSystemId;
    }

    public MountMultipleStorageFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountMultipleStorageFileSystemRequest(MountMultipleStorageFileSystemRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.CustomerClusterId != null) {
            this.CustomerClusterId = new String(source.CustomerClusterId);
        }
        if (source.StorageFileSystemId != null) {
            this.StorageFileSystemId = new String(source.StorageFileSystemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "CustomerClusterId", this.CustomerClusterId);
        this.setParamSimple(map, prefix + "StorageFileSystemId", this.StorageFileSystemId);

    }
}

