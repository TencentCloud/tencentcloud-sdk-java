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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CFSOption extends AbstractModel {

    /**
    * 文件系统本地挂载路径。
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * 文件系统远程挂载ip及路径。
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 文件系统协议类型。
<li>NFS 3.0</li>
<li>NFS 4.0</li>
<li>TURBO</li>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 文件系统存储类型，默认值SD；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 文件系统挂载挂载命令参数选项。
- NFS 3.0默认值：vers=3,nolock,proto=tcp,noresvport
- NFS 4.0默认值：vers=4.0,noresvport
- TURBO默认值：user_xattr
    */
    @SerializedName("MountOption")
    @Expose
    private String MountOption;

    /**
    * 文件系统ID    文件系统ID通过调用接口[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)获取。
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
     * Get 文件系统本地挂载路径。 
     * @return LocalPath 文件系统本地挂载路径。
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set 文件系统本地挂载路径。
     * @param LocalPath 文件系统本地挂载路径。
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get 文件系统远程挂载ip及路径。 
     * @return RemotePath 文件系统远程挂载ip及路径。
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set 文件系统远程挂载ip及路径。
     * @param RemotePath 文件系统远程挂载ip及路径。
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get 文件系统协议类型。
<li>NFS 3.0</li>
<li>NFS 4.0</li>
<li>TURBO</li> 
     * @return Protocol 文件系统协议类型。
<li>NFS 3.0</li>
<li>NFS 4.0</li>
<li>TURBO</li>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 文件系统协议类型。
<li>NFS 3.0</li>
<li>NFS 4.0</li>
<li>TURBO</li>
     * @param Protocol 文件系统协议类型。
<li>NFS 3.0</li>
<li>NFS 4.0</li>
<li>TURBO</li>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 文件系统存储类型，默认值SD；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。 
     * @return StorageType 文件系统存储类型，默认值SD；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 文件系统存储类型，默认值SD；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。
     * @param StorageType 文件系统存储类型，默认值SD；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 文件系统挂载挂载命令参数选项。
- NFS 3.0默认值：vers=3,nolock,proto=tcp,noresvport
- NFS 4.0默认值：vers=4.0,noresvport
- TURBO默认值：user_xattr 
     * @return MountOption 文件系统挂载挂载命令参数选项。
- NFS 3.0默认值：vers=3,nolock,proto=tcp,noresvport
- NFS 4.0默认值：vers=4.0,noresvport
- TURBO默认值：user_xattr
     */
    public String getMountOption() {
        return this.MountOption;
    }

    /**
     * Set 文件系统挂载挂载命令参数选项。
- NFS 3.0默认值：vers=3,nolock,proto=tcp,noresvport
- NFS 4.0默认值：vers=4.0,noresvport
- TURBO默认值：user_xattr
     * @param MountOption 文件系统挂载挂载命令参数选项。
- NFS 3.0默认值：vers=3,nolock,proto=tcp,noresvport
- NFS 4.0默认值：vers=4.0,noresvport
- TURBO默认值：user_xattr
     */
    public void setMountOption(String MountOption) {
        this.MountOption = MountOption;
    }

    /**
     * Get 文件系统ID    文件系统ID通过调用接口[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)获取。 
     * @return FileSystemId 文件系统ID    文件系统ID通过调用接口[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)获取。
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID    文件系统ID通过调用接口[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)获取。
     * @param FileSystemId 文件系统ID    文件系统ID通过调用接口[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)获取。
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    public CFSOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFSOption(CFSOption source) {
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.MountOption != null) {
            this.MountOption = new String(source.MountOption);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "MountOption", this.MountOption);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

