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
    * <p>指定配额类型，包括Uid、Gid、Dir</p>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * <p>UID/GID信息</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>容量硬限制，单位GiB</p>
    */
    @SerializedName("CapacityHardLimit")
    @Expose
    private Long CapacityHardLimit;

    /**
    * <p>文件硬限制，单位个</p>
    */
    @SerializedName("FileHardLimit")
    @Expose
    private Long FileHardLimit;

    /**
    * <p>文件系统ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>容量使用，单位GiB</p>
    */
    @SerializedName("CapacityUsed")
    @Expose
    private Long CapacityUsed;

    /**
    * <p>文件使用个数，单位个</p>
    */
    @SerializedName("FileUsed")
    @Expose
    private Long FileUsed;

    /**
    * <p>需设置配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。不同目录之间不可存在包含关系。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/subdir/test1/test2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DirectoryPath")
    @Expose
    private String DirectoryPath;

    /**
    * <p>配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>指定配额类型，包括Uid、Gid、Dir</p> 
     * @return UserType <p>指定配额类型，包括Uid、Gid、Dir</p>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>指定配额类型，包括Uid、Gid、Dir</p>
     * @param UserType <p>指定配额类型，包括Uid、Gid、Dir</p>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get <p>UID/GID信息</p> 
     * @return UserId <p>UID/GID信息</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>UID/GID信息</p>
     * @param UserId <p>UID/GID信息</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>容量硬限制，单位GiB</p> 
     * @return CapacityHardLimit <p>容量硬限制，单位GiB</p>
     */
    public Long getCapacityHardLimit() {
        return this.CapacityHardLimit;
    }

    /**
     * Set <p>容量硬限制，单位GiB</p>
     * @param CapacityHardLimit <p>容量硬限制，单位GiB</p>
     */
    public void setCapacityHardLimit(Long CapacityHardLimit) {
        this.CapacityHardLimit = CapacityHardLimit;
    }

    /**
     * Get <p>文件硬限制，单位个</p> 
     * @return FileHardLimit <p>文件硬限制，单位个</p>
     */
    public Long getFileHardLimit() {
        return this.FileHardLimit;
    }

    /**
     * Set <p>文件硬限制，单位个</p>
     * @param FileHardLimit <p>文件硬限制，单位个</p>
     */
    public void setFileHardLimit(Long FileHardLimit) {
        this.FileHardLimit = FileHardLimit;
    }

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
     * Get <p>容量使用，单位GiB</p> 
     * @return CapacityUsed <p>容量使用，单位GiB</p>
     */
    public Long getCapacityUsed() {
        return this.CapacityUsed;
    }

    /**
     * Set <p>容量使用，单位GiB</p>
     * @param CapacityUsed <p>容量使用，单位GiB</p>
     */
    public void setCapacityUsed(Long CapacityUsed) {
        this.CapacityUsed = CapacityUsed;
    }

    /**
     * Get <p>文件使用个数，单位个</p> 
     * @return FileUsed <p>文件使用个数，单位个</p>
     */
    public Long getFileUsed() {
        return this.FileUsed;
    }

    /**
     * Set <p>文件使用个数，单位个</p>
     * @param FileUsed <p>文件使用个数，单位个</p>
     */
    public void setFileUsed(Long FileUsed) {
        this.FileUsed = FileUsed;
    }

    /**
     * Get <p>需设置配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。不同目录之间不可存在包含关系。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/subdir/test1/test2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DirectoryPath <p>需设置配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。不同目录之间不可存在包含关系。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/subdir/test1/test2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDirectoryPath() {
        return this.DirectoryPath;
    }

    /**
     * Set <p>需设置配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。不同目录之间不可存在包含关系。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/subdir/test1/test2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DirectoryPath <p>需设置配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。不同目录之间不可存在包含关系。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需对挂载路径下的 test1/test2 设置配额，则入参值为 /cfs/subdir/test1/test2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirectoryPath(String DirectoryPath) {
        this.DirectoryPath = DirectoryPath;
    }

    /**
     * Get <p>配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败</p> 
     * @return Status <p>配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败</p>
     * @param Status <p>配置规则状态，inavailable---配置中，available --已生效，deleting--删除中，deleted 已删除，failed--配置失败</p>
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

