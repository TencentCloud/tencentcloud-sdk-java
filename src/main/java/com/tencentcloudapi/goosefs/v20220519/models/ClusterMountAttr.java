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

public class ClusterMountAttr extends AbstractModel {

    /**
    * 挂载的文件系统Id
    */
    @SerializedName("StorageFileSystemId")
    @Expose
    private String StorageFileSystemId;

    /**
    * 客户端集群挂载点。入参是节点的自定义挂载点，出参是集群的默认挂载点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountPoint")
    @Expose
    private String MountPoint;

    /**
     * Get 挂载的文件系统Id 
     * @return StorageFileSystemId 挂载的文件系统Id
     */
    public String getStorageFileSystemId() {
        return this.StorageFileSystemId;
    }

    /**
     * Set 挂载的文件系统Id
     * @param StorageFileSystemId 挂载的文件系统Id
     */
    public void setStorageFileSystemId(String StorageFileSystemId) {
        this.StorageFileSystemId = StorageFileSystemId;
    }

    /**
     * Get 客户端集群挂载点。入参是节点的自定义挂载点，出参是集群的默认挂载点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountPoint 客户端集群挂载点。入参是节点的自定义挂载点，出参是集群的默认挂载点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountPoint() {
        return this.MountPoint;
    }

    /**
     * Set 客户端集群挂载点。入参是节点的自定义挂载点，出参是集群的默认挂载点
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountPoint 客户端集群挂载点。入参是节点的自定义挂载点，出参是集群的默认挂载点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountPoint(String MountPoint) {
        this.MountPoint = MountPoint;
    }

    public ClusterMountAttr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterMountAttr(ClusterMountAttr source) {
        if (source.StorageFileSystemId != null) {
            this.StorageFileSystemId = new String(source.StorageFileSystemId);
        }
        if (source.MountPoint != null) {
            this.MountPoint = new String(source.MountPoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageFileSystemId", this.StorageFileSystemId);
        this.setParamSimple(map, prefix + "MountPoint", this.MountPoint);

    }
}

