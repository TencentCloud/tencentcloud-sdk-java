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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckpointMountInfo extends AbstractModel {

    /**
    * <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>容器内挂载路径</p>
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * <p>COS key 前缀 或 CFS/GooseFS 子路径</p>
    */
    @SerializedName("VolumeSubPath")
    @Expose
    private String VolumeSubPath;

    /**
    * <p>实际访问的 COS bucket</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>COS region</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>是否平台托管桶（影响凭证选择）</p>
    */
    @SerializedName("PlatformManaged")
    @Expose
    private Boolean PlatformManaged;

    /**
    * <p>快照在平台 COS 桶中的 key（仅 CFS/GooseFS 有值）</p>
    */
    @SerializedName("SnapshotKey")
    @Expose
    private String SnapshotKey;

    /**
     * Get <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p> 
     * @return StorageType <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p>
     * @param StorageType <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>容器内挂载路径</p> 
     * @return MountPath <p>容器内挂载路径</p>
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set <p>容器内挂载路径</p>
     * @param MountPath <p>容器内挂载路径</p>
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get <p>COS key 前缀 或 CFS/GooseFS 子路径</p> 
     * @return VolumeSubPath <p>COS key 前缀 或 CFS/GooseFS 子路径</p>
     */
    public String getVolumeSubPath() {
        return this.VolumeSubPath;
    }

    /**
     * Set <p>COS key 前缀 或 CFS/GooseFS 子路径</p>
     * @param VolumeSubPath <p>COS key 前缀 或 CFS/GooseFS 子路径</p>
     */
    public void setVolumeSubPath(String VolumeSubPath) {
        this.VolumeSubPath = VolumeSubPath;
    }

    /**
     * Get <p>实际访问的 COS bucket</p> 
     * @return Bucket <p>实际访问的 COS bucket</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>实际访问的 COS bucket</p>
     * @param Bucket <p>实际访问的 COS bucket</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>COS region</p> 
     * @return Region <p>COS region</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>COS region</p>
     * @param Region <p>COS region</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>是否平台托管桶（影响凭证选择）</p> 
     * @return PlatformManaged <p>是否平台托管桶（影响凭证选择）</p>
     */
    public Boolean getPlatformManaged() {
        return this.PlatformManaged;
    }

    /**
     * Set <p>是否平台托管桶（影响凭证选择）</p>
     * @param PlatformManaged <p>是否平台托管桶（影响凭证选择）</p>
     */
    public void setPlatformManaged(Boolean PlatformManaged) {
        this.PlatformManaged = PlatformManaged;
    }

    /**
     * Get <p>快照在平台 COS 桶中的 key（仅 CFS/GooseFS 有值）</p> 
     * @return SnapshotKey <p>快照在平台 COS 桶中的 key（仅 CFS/GooseFS 有值）</p>
     */
    public String getSnapshotKey() {
        return this.SnapshotKey;
    }

    /**
     * Set <p>快照在平台 COS 桶中的 key（仅 CFS/GooseFS 有值）</p>
     * @param SnapshotKey <p>快照在平台 COS 桶中的 key（仅 CFS/GooseFS 有值）</p>
     */
    public void setSnapshotKey(String SnapshotKey) {
        this.SnapshotKey = SnapshotKey;
    }

    public CheckpointMountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckpointMountInfo(CheckpointMountInfo source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.VolumeSubPath != null) {
            this.VolumeSubPath = new String(source.VolumeSubPath);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PlatformManaged != null) {
            this.PlatformManaged = new Boolean(source.PlatformManaged);
        }
        if (source.SnapshotKey != null) {
            this.SnapshotKey = new String(source.SnapshotKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "VolumeSubPath", this.VolumeSubPath);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PlatformManaged", this.PlatformManaged);
        this.setParamSimple(map, prefix + "SnapshotKey", this.SnapshotKey);

    }
}

