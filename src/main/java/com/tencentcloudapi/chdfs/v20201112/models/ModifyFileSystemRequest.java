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

public class ModifyFileSystemRequest extends AbstractModel{

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

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
    * 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍
注意：修改的文件系统容量不能小于当前使用量
    */
    @SerializedName("CapacityQuota")
    @Expose
    private Long CapacityQuota;

    /**
    * 超级用户名列表，可以为空数组
    */
    @SerializedName("SuperUsers")
    @Expose
    private String [] SuperUsers;

    /**
    * 是否校验POSIX ACL
    */
    @SerializedName("PosixAcl")
    @Expose
    private Boolean PosixAcl;

    /**
    * 是否打开Ranger地址校验
    */
    @SerializedName("EnableRanger")
    @Expose
    private Boolean EnableRanger;

    /**
    * Ranger地址列表，可以为空数组
    */
    @SerializedName("RangerServiceAddresses")
    @Expose
    private String [] RangerServiceAddresses;

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
     * Get 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍
注意：修改的文件系统容量不能小于当前使用量 
     * @return CapacityQuota 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍
注意：修改的文件系统容量不能小于当前使用量
     */
    public Long getCapacityQuota() {
        return this.CapacityQuota;
    }

    /**
     * Set 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍
注意：修改的文件系统容量不能小于当前使用量
     * @param CapacityQuota 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍
注意：修改的文件系统容量不能小于当前使用量
     */
    public void setCapacityQuota(Long CapacityQuota) {
        this.CapacityQuota = CapacityQuota;
    }

    /**
     * Get 超级用户名列表，可以为空数组 
     * @return SuperUsers 超级用户名列表，可以为空数组
     */
    public String [] getSuperUsers() {
        return this.SuperUsers;
    }

    /**
     * Set 超级用户名列表，可以为空数组
     * @param SuperUsers 超级用户名列表，可以为空数组
     */
    public void setSuperUsers(String [] SuperUsers) {
        this.SuperUsers = SuperUsers;
    }

    /**
     * Get 是否校验POSIX ACL 
     * @return PosixAcl 是否校验POSIX ACL
     */
    public Boolean getPosixAcl() {
        return this.PosixAcl;
    }

    /**
     * Set 是否校验POSIX ACL
     * @param PosixAcl 是否校验POSIX ACL
     */
    public void setPosixAcl(Boolean PosixAcl) {
        this.PosixAcl = PosixAcl;
    }

    /**
     * Get 是否打开Ranger地址校验 
     * @return EnableRanger 是否打开Ranger地址校验
     */
    public Boolean getEnableRanger() {
        return this.EnableRanger;
    }

    /**
     * Set 是否打开Ranger地址校验
     * @param EnableRanger 是否打开Ranger地址校验
     */
    public void setEnableRanger(Boolean EnableRanger) {
        this.EnableRanger = EnableRanger;
    }

    /**
     * Get Ranger地址列表，可以为空数组 
     * @return RangerServiceAddresses Ranger地址列表，可以为空数组
     */
    public String [] getRangerServiceAddresses() {
        return this.RangerServiceAddresses;
    }

    /**
     * Set Ranger地址列表，可以为空数组
     * @param RangerServiceAddresses Ranger地址列表，可以为空数组
     */
    public void setRangerServiceAddresses(String [] RangerServiceAddresses) {
        this.RangerServiceAddresses = RangerServiceAddresses;
    }

    public ModifyFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileSystemRequest(ModifyFileSystemRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FileSystemName != null) {
            this.FileSystemName = new String(source.FileSystemName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CapacityQuota != null) {
            this.CapacityQuota = new Long(source.CapacityQuota);
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
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FileSystemName", this.FileSystemName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CapacityQuota", this.CapacityQuota);
        this.setParamArraySimple(map, prefix + "SuperUsers.", this.SuperUsers);
        this.setParamSimple(map, prefix + "PosixAcl", this.PosixAcl);
        this.setParamSimple(map, prefix + "EnableRanger", this.EnableRanger);
        this.setParamArraySimple(map, prefix + "RangerServiceAddresses.", this.RangerServiceAddresses);

    }
}

