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

public class BuildClientNodeMountCommandRequest extends AbstractModel {

    /**
    * <p>文件系统ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy</p>
    */
    @SerializedName("CustomMountDir")
    @Expose
    private String CustomMountDir;

    /**
    * <p>客户端集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get <p>文件系统ID</p> 
     * @return FileSystemId <p>文件系统ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统ID</p>
     * @param FileSystemId <p>文件系统ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy</p> 
     * @return CustomMountDir <p>自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy</p>
     */
    public String getCustomMountDir() {
        return this.CustomMountDir;
    }

    /**
     * Set <p>自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy</p>
     * @param CustomMountDir <p>自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy</p>
     */
    public void setCustomMountDir(String CustomMountDir) {
        this.CustomMountDir = CustomMountDir;
    }

    /**
     * Get <p>客户端集群ID</p> 
     * @return ClusterId <p>客户端集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>客户端集群ID</p>
     * @param ClusterId <p>客户端集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public BuildClientNodeMountCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildClientNodeMountCommandRequest(BuildClientNodeMountCommandRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.CustomMountDir != null) {
            this.CustomMountDir = new String(source.CustomMountDir);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "CustomMountDir", this.CustomMountDir);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

