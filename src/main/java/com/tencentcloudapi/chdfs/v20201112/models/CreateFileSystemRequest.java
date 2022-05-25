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

public class CreateFileSystemRequest extends AbstractModel{

    /**
    * 文件系统名称
    */
    @SerializedName("FileSystemName")
    @Expose
    private String FileSystemName;

    /**
    * 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍
    */
    @SerializedName("CapacityQuota")
    @Expose
    private Long CapacityQuota;

    /**
    * 是否校验POSIX ACL
    */
    @SerializedName("PosixAcl")
    @Expose
    private Boolean PosixAcl;

    /**
    * 文件系统描述，默认为空字符串
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 超级用户名列表，默认为空数组
    */
    @SerializedName("SuperUsers")
    @Expose
    private String [] SuperUsers;

    /**
    * 根目录Inode用户名，默认为hadoop
    */
    @SerializedName("RootInodeUser")
    @Expose
    private String RootInodeUser;

    /**
    * 根目录Inode组名，默认为supergroup
    */
    @SerializedName("RootInodeGroup")
    @Expose
    private String RootInodeGroup;

    /**
    * 是否打开Ranger地址校验
    */
    @SerializedName("EnableRanger")
    @Expose
    private Boolean EnableRanger;

    /**
    * Ranger地址列表，默认为空数组
    */
    @SerializedName("RangerServiceAddresses")
    @Expose
    private String [] RangerServiceAddresses;

    /**
    * 多个资源标签，可以为空数组
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
     * Get 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍 
     * @return CapacityQuota 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍
     */
    public Long getCapacityQuota() {
        return this.CapacityQuota;
    }

    /**
     * Set 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍
     * @param CapacityQuota 文件系统容量（byte），下限为1GB，上限为1PB，且必须是1GB的整数倍
     */
    public void setCapacityQuota(Long CapacityQuota) {
        this.CapacityQuota = CapacityQuota;
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
     * Get 文件系统描述，默认为空字符串 
     * @return Description 文件系统描述，默认为空字符串
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 文件系统描述，默认为空字符串
     * @param Description 文件系统描述，默认为空字符串
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 超级用户名列表，默认为空数组 
     * @return SuperUsers 超级用户名列表，默认为空数组
     */
    public String [] getSuperUsers() {
        return this.SuperUsers;
    }

    /**
     * Set 超级用户名列表，默认为空数组
     * @param SuperUsers 超级用户名列表，默认为空数组
     */
    public void setSuperUsers(String [] SuperUsers) {
        this.SuperUsers = SuperUsers;
    }

    /**
     * Get 根目录Inode用户名，默认为hadoop 
     * @return RootInodeUser 根目录Inode用户名，默认为hadoop
     */
    public String getRootInodeUser() {
        return this.RootInodeUser;
    }

    /**
     * Set 根目录Inode用户名，默认为hadoop
     * @param RootInodeUser 根目录Inode用户名，默认为hadoop
     */
    public void setRootInodeUser(String RootInodeUser) {
        this.RootInodeUser = RootInodeUser;
    }

    /**
     * Get 根目录Inode组名，默认为supergroup 
     * @return RootInodeGroup 根目录Inode组名，默认为supergroup
     */
    public String getRootInodeGroup() {
        return this.RootInodeGroup;
    }

    /**
     * Set 根目录Inode组名，默认为supergroup
     * @param RootInodeGroup 根目录Inode组名，默认为supergroup
     */
    public void setRootInodeGroup(String RootInodeGroup) {
        this.RootInodeGroup = RootInodeGroup;
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
     * Get Ranger地址列表，默认为空数组 
     * @return RangerServiceAddresses Ranger地址列表，默认为空数组
     */
    public String [] getRangerServiceAddresses() {
        return this.RangerServiceAddresses;
    }

    /**
     * Set Ranger地址列表，默认为空数组
     * @param RangerServiceAddresses Ranger地址列表，默认为空数组
     */
    public void setRangerServiceAddresses(String [] RangerServiceAddresses) {
        this.RangerServiceAddresses = RangerServiceAddresses;
    }

    /**
     * Get 多个资源标签，可以为空数组 
     * @return Tags 多个资源标签，可以为空数组
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 多个资源标签，可以为空数组
     * @param Tags 多个资源标签，可以为空数组
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileSystemRequest(CreateFileSystemRequest source) {
        if (source.FileSystemName != null) {
            this.FileSystemName = new String(source.FileSystemName);
        }
        if (source.CapacityQuota != null) {
            this.CapacityQuota = new Long(source.CapacityQuota);
        }
        if (source.PosixAcl != null) {
            this.PosixAcl = new Boolean(source.PosixAcl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SuperUsers != null) {
            this.SuperUsers = new String[source.SuperUsers.length];
            for (int i = 0; i < source.SuperUsers.length; i++) {
                this.SuperUsers[i] = new String(source.SuperUsers[i]);
            }
        }
        if (source.RootInodeUser != null) {
            this.RootInodeUser = new String(source.RootInodeUser);
        }
        if (source.RootInodeGroup != null) {
            this.RootInodeGroup = new String(source.RootInodeGroup);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemName", this.FileSystemName);
        this.setParamSimple(map, prefix + "CapacityQuota", this.CapacityQuota);
        this.setParamSimple(map, prefix + "PosixAcl", this.PosixAcl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "SuperUsers.", this.SuperUsers);
        this.setParamSimple(map, prefix + "RootInodeUser", this.RootInodeUser);
        this.setParamSimple(map, prefix + "RootInodeGroup", this.RootInodeGroup);
        this.setParamSimple(map, prefix + "EnableRanger", this.EnableRanger);
        this.setParamArraySimple(map, prefix + "RangerServiceAddresses.", this.RangerServiceAddresses);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

