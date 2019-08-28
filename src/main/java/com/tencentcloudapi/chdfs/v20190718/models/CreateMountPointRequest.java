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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMountPointRequest  extends AbstractModel{

    /**
    * 挂载点名称
    */
    @SerializedName("MountPointName")
    @Expose
    private String MountPointName;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 权限组ID
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
    * VPC网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 挂载点状态（1：打开；2：关闭）
    */
    @SerializedName("MountPointStatus")
    @Expose
    private Long MountPointStatus;

    /**
     * 获取挂载点名称
     * @return MountPointName 挂载点名称
     */
    public String getMountPointName() {
        return this.MountPointName;
    }

    /**
     * 设置挂载点名称
     * @param MountPointName 挂载点名称
     */
    public void setMountPointName(String MountPointName) {
        this.MountPointName = MountPointName;
    }

    /**
     * 获取文件系统ID
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * 设置文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * 获取权限组ID
     * @return AccessGroupId 权限组ID
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * 设置权限组ID
     * @param AccessGroupId 权限组ID
     */
    public void setAccessGroupId(String AccessGroupId) {
        this.AccessGroupId = AccessGroupId;
    }

    /**
     * 获取VPC网络ID
     * @return VpcId VPC网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC网络ID
     * @param VpcId VPC网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取挂载点状态（1：打开；2：关闭）
     * @return MountPointStatus 挂载点状态（1：打开；2：关闭）
     */
    public Long getMountPointStatus() {
        return this.MountPointStatus;
    }

    /**
     * 设置挂载点状态（1：打开；2：关闭）
     * @param MountPointStatus 挂载点状态（1：打开；2：关闭）
     */
    public void setMountPointStatus(Long MountPointStatus) {
        this.MountPointStatus = MountPointStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPointName", this.MountPointName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "MountPointStatus", this.MountPointStatus);

    }
}

