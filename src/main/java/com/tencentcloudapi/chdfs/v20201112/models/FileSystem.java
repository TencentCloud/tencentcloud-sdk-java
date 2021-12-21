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

public class FileSystem extends AbstractModel{

    /**
    * 资源所属用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 文件系统名称
    */
    @SerializedName("FileSystemName")
    @Expose
    private String FileSystemName;

    /**
    * 文件系统描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文件系统块大小（byte）
    */
    @SerializedName("BlockSize")
    @Expose
    private Long BlockSize;

    /**
    * 文件系统容量（byte）
    */
    @SerializedName("CapacityQuota")
    @Expose
    private Long CapacityQuota;

    /**
    * 文件系统状态（1：创建中；2：创建成功；3：创建失败）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 超级用户名列表
    */
    @SerializedName("SuperUsers")
    @Expose
    private String [] SuperUsers;

    /**
    * POSIX权限控制
    */
    @SerializedName("PosixAcl")
    @Expose
    private Boolean PosixAcl;

    /**
    * 是否打开Ranger地址校验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRanger")
    @Expose
    private Boolean EnableRanger;

    /**
    * Ranger地址列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangerServiceAddresses")
    @Expose
    private String [] RangerServiceAddresses;

    /**
     * Get 资源所属用户AppId 
     * @return AppId 资源所属用户AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 资源所属用户AppId
     * @param AppId 资源所属用户AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 文件系统名称 
     * @return FileSystemName 文件系统名称
     */
    public String getFileSystemName() {
        return this.FileSystemName;
    }

    /**
     * Set 文件系统名称
     * @param FileSystemName 文件系统名称
     */
    public void setFileSystemName(String FileSystemName) {
        this.FileSystemName = FileSystemName;
    }

    /**
     * Get 文件系统描述 
     * @return Description 文件系统描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 文件系统描述
     * @param Description 文件系统描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get 文件系统块大小（byte） 
     * @return BlockSize 文件系统块大小（byte）
     */
    public Long getBlockSize() {
        return this.BlockSize;
    }

    /**
     * Set 文件系统块大小（byte）
     * @param BlockSize 文件系统块大小（byte）
     */
    public void setBlockSize(Long BlockSize) {
        this.BlockSize = BlockSize;
    }

    /**
     * Get 文件系统容量（byte） 
     * @return CapacityQuota 文件系统容量（byte）
     */
    public Long getCapacityQuota() {
        return this.CapacityQuota;
    }

    /**
     * Set 文件系统容量（byte）
     * @param CapacityQuota 文件系统容量（byte）
     */
    public void setCapacityQuota(Long CapacityQuota) {
        this.CapacityQuota = CapacityQuota;
    }

    /**
     * Get 文件系统状态（1：创建中；2：创建成功；3：创建失败） 
     * @return Status 文件系统状态（1：创建中；2：创建成功；3：创建失败）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 文件系统状态（1：创建中；2：创建成功；3：创建失败）
     * @param Status 文件系统状态（1：创建中；2：创建成功；3：创建失败）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 超级用户名列表 
     * @return SuperUsers 超级用户名列表
     */
    public String [] getSuperUsers() {
        return this.SuperUsers;
    }

    /**
     * Set 超级用户名列表
     * @param SuperUsers 超级用户名列表
     */
    public void setSuperUsers(String [] SuperUsers) {
        this.SuperUsers = SuperUsers;
    }

    /**
     * Get POSIX权限控制 
     * @return PosixAcl POSIX权限控制
     */
    public Boolean getPosixAcl() {
        return this.PosixAcl;
    }

    /**
     * Set POSIX权限控制
     * @param PosixAcl POSIX权限控制
     */
    public void setPosixAcl(Boolean PosixAcl) {
        this.PosixAcl = PosixAcl;
    }

    /**
     * Get 是否打开Ranger地址校验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRanger 是否打开Ranger地址校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableRanger() {
        return this.EnableRanger;
    }

    /**
     * Set 是否打开Ranger地址校验
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRanger 是否打开Ranger地址校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRanger(Boolean EnableRanger) {
        this.EnableRanger = EnableRanger;
    }

    /**
     * Get Ranger地址列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangerServiceAddresses Ranger地址列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRangerServiceAddresses() {
        return this.RangerServiceAddresses;
    }

    /**
     * Set Ranger地址列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangerServiceAddresses Ranger地址列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangerServiceAddresses(String [] RangerServiceAddresses) {
        this.RangerServiceAddresses = RangerServiceAddresses;
    }

    public FileSystem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileSystem(FileSystem source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.FileSystemName != null) {
            this.FileSystemName = new String(source.FileSystemName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BlockSize != null) {
            this.BlockSize = new Long(source.BlockSize);
        }
        if (source.CapacityQuota != null) {
            this.CapacityQuota = new Long(source.CapacityQuota);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SuperUsers != null) {
            this.SuperUsers = new String[source.SuperUsers.length];
            for (int i = 0; i < source.SuperUsers.length; i++) {
                this.SuperUsers[i] = new String(source.SuperUsers[i]);
            }
        }
        if (source.PosixAcl != null) {
            this.PosixAcl = new Boolean(source.PosixAcl);
        }
        if (source.EnableRanger != null) {
            this.EnableRanger = new Boolean(source.EnableRanger);
        }
        if (source.RangerServiceAddresses != null) {
            this.RangerServiceAddresses = new String[source.RangerServiceAddresses.length];
            for (int i = 0; i < source.RangerServiceAddresses.length; i++) {
                this.RangerServiceAddresses[i] = new String(source.RangerServiceAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "FileSystemName", this.FileSystemName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BlockSize", this.BlockSize);
        this.setParamSimple(map, prefix + "CapacityQuota", this.CapacityQuota);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SuperUsers.", this.SuperUsers);
        this.setParamSimple(map, prefix + "PosixAcl", this.PosixAcl);
        this.setParamSimple(map, prefix + "EnableRanger", this.EnableRanger);
        this.setParamArraySimple(map, prefix + "RangerServiceAddresses.", this.RangerServiceAddresses);

    }
}

