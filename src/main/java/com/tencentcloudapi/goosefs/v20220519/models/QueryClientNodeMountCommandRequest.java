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

public class QueryClientNodeMountCommandRequest extends AbstractModel {

    /**
    * 客户端集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群挂载信息
    */
    @SerializedName("ClusterMountInfo")
    @Expose
    private ClusterMountAttr [] ClusterMountInfo;

    /**
    * 文件系统id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
     * Get 客户端集群ID 
     * @return ClusterId 客户端集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 客户端集群ID
     * @param ClusterId 客户端集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群挂载信息 
     * @return ClusterMountInfo 集群挂载信息
     */
    public ClusterMountAttr [] getClusterMountInfo() {
        return this.ClusterMountInfo;
    }

    /**
     * Set 集群挂载信息
     * @param ClusterMountInfo 集群挂载信息
     */
    public void setClusterMountInfo(ClusterMountAttr [] ClusterMountInfo) {
        this.ClusterMountInfo = ClusterMountInfo;
    }

    /**
     * Get 文件系统id 
     * @return FileSystemId 文件系统id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统id
     * @param FileSystemId 文件系统id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    public QueryClientNodeMountCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryClientNodeMountCommandRequest(QueryClientNodeMountCommandRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterMountInfo != null) {
            this.ClusterMountInfo = new ClusterMountAttr[source.ClusterMountInfo.length];
            for (int i = 0; i < source.ClusterMountInfo.length; i++) {
                this.ClusterMountInfo[i] = new ClusterMountAttr(source.ClusterMountInfo[i]);
            }
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ClusterMountInfo.", this.ClusterMountInfo);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

