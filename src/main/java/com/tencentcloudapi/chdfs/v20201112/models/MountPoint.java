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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountPoint extends AbstractModel{

    /**
    * 挂载点ID
    */
    @SerializedName("MountPointId")
    @Expose
    private String MountPointId;

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
    * 挂载点状态（1：打开；2：关闭）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 绑定的权限组ID列表
    */
    @SerializedName("AccessGroupIds")
    @Expose
    private String [] AccessGroupIds;

    /**
     * Get 挂载点ID 
     * @return MountPointId 挂载点ID
     */
    public String getMountPointId() {
        return this.MountPointId;
    }

    /**
     * Set 挂载点ID
     * @param MountPointId 挂载点ID
     */
    public void setMountPointId(String MountPointId) {
        this.MountPointId = MountPointId;
    }

    /**
     * Get 挂载点名称 
     * @return MountPointName 挂载点名称
     */
    public String getMountPointName() {
        return this.MountPointName;
    }

    /**
     * Set 挂载点名称
     * @param MountPointName 挂载点名称
     */
    public void setMountPointName(String MountPointName) {
        this.MountPointName = MountPointName;
    }

    /**
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 挂载点状态（1：打开；2：关闭） 
     * @return Status 挂载点状态（1：打开；2：关闭）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 挂载点状态（1：打开；2：关闭）
     * @param Status 挂载点状态（1：打开；2：关闭）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 绑定的权限组ID列表 
     * @return AccessGroupIds 绑定的权限组ID列表
     */
    public String [] getAccessGroupIds() {
        return this.AccessGroupIds;
    }

    /**
     * Set 绑定的权限组ID列表
     * @param AccessGroupIds 绑定的权限组ID列表
     */
    public void setAccessGroupIds(String [] AccessGroupIds) {
        this.AccessGroupIds = AccessGroupIds;
    }

    public MountPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountPoint(MountPoint source) {
        if (source.MountPointId != null) {
            this.MountPointId = new String(source.MountPointId);
        }
        if (source.MountPointName != null) {
            this.MountPointName = new String(source.MountPointName);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AccessGroupIds != null) {
            this.AccessGroupIds = new String[source.AccessGroupIds.length];
            for (int i = 0; i < source.AccessGroupIds.length; i++) {
                this.AccessGroupIds[i] = new String(source.AccessGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPointId", this.MountPointId);
        this.setParamSimple(map, prefix + "MountPointName", this.MountPointName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "AccessGroupIds.", this.AccessGroupIds);

    }
}

