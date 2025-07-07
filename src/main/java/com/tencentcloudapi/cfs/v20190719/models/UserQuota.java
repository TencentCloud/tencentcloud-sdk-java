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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserQuota extends AbstractModel {

    /**
    * 指定配额类型，包括Uid、Gid、Dir
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * UID/GID信息
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 容量硬限制，单位GiB
    */
    @SerializedName("CapacityHardLimit")
    @Expose
    private Long CapacityHardLimit;

    /**
    * 文件硬限制，单位个
    */
    @SerializedName("FileHardLimit")
    @Expose
    private Long FileHardLimit;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 容量使用，单位GiB
    */
    @SerializedName("CapacityUsed")
    @Expose
    private Long CapacityUsed;

    /**
    * 文件使用个数，单位个
    */
    @SerializedName("FileUsed")
    @Expose
    private Long FileUsed;

    /**
    * 目录配额的目录绝对路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DirectoryPath")
    @Expose
    private String DirectoryPath;

    /**
    * 配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 指定配额类型，包括Uid、Gid、Dir 
     * @return UserType 指定配额类型，包括Uid、Gid、Dir
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 指定配额类型，包括Uid、Gid、Dir
     * @param UserType 指定配额类型，包括Uid、Gid、Dir
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get UID/GID信息 
     * @return UserId UID/GID信息
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set UID/GID信息
     * @param UserId UID/GID信息
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 容量硬限制，单位GiB 
     * @return CapacityHardLimit 容量硬限制，单位GiB
     */
    public Long getCapacityHardLimit() {
        return this.CapacityHardLimit;
    }

    /**
     * Set 容量硬限制，单位GiB
     * @param CapacityHardLimit 容量硬限制，单位GiB
     */
    public void setCapacityHardLimit(Long CapacityHardLimit) {
        this.CapacityHardLimit = CapacityHardLimit;
    }

    /**
     * Get 文件硬限制，单位个 
     * @return FileHardLimit 文件硬限制，单位个
     */
    public Long getFileHardLimit() {
        return this.FileHardLimit;
    }

    /**
     * Set 文件硬限制，单位个
     * @param FileHardLimit 文件硬限制，单位个
     */
    public void setFileHardLimit(Long FileHardLimit) {
        this.FileHardLimit = FileHardLimit;
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
     * Get 容量使用，单位GiB 
     * @return CapacityUsed 容量使用，单位GiB
     */
    public Long getCapacityUsed() {
        return this.CapacityUsed;
    }

    /**
     * Set 容量使用，单位GiB
     * @param CapacityUsed 容量使用，单位GiB
     */
    public void setCapacityUsed(Long CapacityUsed) {
        this.CapacityUsed = CapacityUsed;
    }

    /**
     * Get 文件使用个数，单位个 
     * @return FileUsed 文件使用个数，单位个
     */
    public Long getFileUsed() {
        return this.FileUsed;
    }

    /**
     * Set 文件使用个数，单位个
     * @param FileUsed 文件使用个数，单位个
     */
    public void setFileUsed(Long FileUsed) {
        this.FileUsed = FileUsed;
    }

    /**
     * Get 目录配额的目录绝对路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DirectoryPath 目录配额的目录绝对路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDirectoryPath() {
        return this.DirectoryPath;
    }

    /**
     * Set 目录配额的目录绝对路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param DirectoryPath 目录配额的目录绝对路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirectoryPath(String DirectoryPath) {
        this.DirectoryPath = DirectoryPath;
    }

    /**
     * Get 配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败 
     * @return Status 配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败
     * @param Status 配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public UserQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserQuota(UserQuota source) {
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.CapacityHardLimit != null) {
            this.CapacityHardLimit = new Long(source.CapacityHardLimit);
        }
        if (source.FileHardLimit != null) {
            this.FileHardLimit = new Long(source.FileHardLimit);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.CapacityUsed != null) {
            this.CapacityUsed = new Long(source.CapacityUsed);
        }
        if (source.FileUsed != null) {
            this.FileUsed = new Long(source.FileUsed);
        }
        if (source.DirectoryPath != null) {
            this.DirectoryPath = new String(source.DirectoryPath);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CapacityHardLimit", this.CapacityHardLimit);
        this.setParamSimple(map, prefix + "FileHardLimit", this.FileHardLimit);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "CapacityUsed", this.CapacityUsed);
        this.setParamSimple(map, prefix + "FileUsed", this.FileUsed);
        this.setParamSimple(map, prefix + "DirectoryPath", this.DirectoryPath);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

