/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoMountConfiguration extends AbstractModel{

    /**
    * 要挂载到的实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String [] InstanceId;

    /**
    * 子机内的挂载点。
    */
    @SerializedName("MountPoint")
    @Expose
    private String [] MountPoint;

    /**
    * 文件系统类型，支持的有 ext4、xfs。
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

    /**
     * Get 要挂载到的实例ID。 
     * @return InstanceId 要挂载到的实例ID。
     */
    public String [] getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 要挂载到的实例ID。
     * @param InstanceId 要挂载到的实例ID。
     */
    public void setInstanceId(String [] InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 子机内的挂载点。 
     * @return MountPoint 子机内的挂载点。
     */
    public String [] getMountPoint() {
        return this.MountPoint;
    }

    /**
     * Set 子机内的挂载点。
     * @param MountPoint 子机内的挂载点。
     */
    public void setMountPoint(String [] MountPoint) {
        this.MountPoint = MountPoint;
    }

    /**
     * Get 文件系统类型，支持的有 ext4、xfs。 
     * @return FileSystemType 文件系统类型，支持的有 ext4、xfs。
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set 文件系统类型，支持的有 ext4、xfs。
     * @param FileSystemType 文件系统类型，支持的有 ext4、xfs。
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    public AutoMountConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoMountConfiguration(AutoMountConfiguration source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String[source.InstanceId.length];
            for (int i = 0; i < source.InstanceId.length; i++) {
                this.InstanceId[i] = new String(source.InstanceId[i]);
            }
        }
        if (source.MountPoint != null) {
            this.MountPoint = new String[source.MountPoint.length];
            for (int i = 0; i < source.MountPoint.length; i++) {
                this.MountPoint[i] = new String(source.MountPoint[i]);
            }
        }
        if (source.FileSystemType != null) {
            this.FileSystemType = new String(source.FileSystemType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceId.", this.InstanceId);
        this.setParamArraySimple(map, prefix + "MountPoint.", this.MountPoint);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);

    }
}

