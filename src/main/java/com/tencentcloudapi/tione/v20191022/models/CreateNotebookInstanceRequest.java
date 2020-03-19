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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNotebookInstanceRequest extends AbstractModel{

    /**
    * Notebook实例名称
    */
    @SerializedName("NotebookInstanceName")
    @Expose
    private String NotebookInstanceName;

    /**
    * Notebook算力类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 角色的资源描述
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * 外网访问权限，可取值Enabled/Disabled
    */
    @SerializedName("DirectInternetAccess")
    @Expose
    private String DirectInternetAccess;

    /**
    * Root用户权限，可取值Enabled/Disabled
    */
    @SerializedName("RootAccess")
    @Expose
    private String RootAccess;

    /**
    * 安全组ID
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 数据卷大小(GB)
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * Notebook标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Notebook实例名称 
     * @return NotebookInstanceName Notebook实例名称
     */
    public String getNotebookInstanceName() {
        return this.NotebookInstanceName;
    }

    /**
     * Set Notebook实例名称
     * @param NotebookInstanceName Notebook实例名称
     */
    public void setNotebookInstanceName(String NotebookInstanceName) {
        this.NotebookInstanceName = NotebookInstanceName;
    }

    /**
     * Get Notebook算力类型 
     * @return InstanceType Notebook算力类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Notebook算力类型
     * @param InstanceType Notebook算力类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 角色的资源描述 
     * @return RoleArn 角色的资源描述
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色的资源描述
     * @param RoleArn 角色的资源描述
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 外网访问权限，可取值Enabled/Disabled 
     * @return DirectInternetAccess 外网访问权限，可取值Enabled/Disabled
     */
    public String getDirectInternetAccess() {
        return this.DirectInternetAccess;
    }

    /**
     * Set 外网访问权限，可取值Enabled/Disabled
     * @param DirectInternetAccess 外网访问权限，可取值Enabled/Disabled
     */
    public void setDirectInternetAccess(String DirectInternetAccess) {
        this.DirectInternetAccess = DirectInternetAccess;
    }

    /**
     * Get Root用户权限，可取值Enabled/Disabled 
     * @return RootAccess Root用户权限，可取值Enabled/Disabled
     */
    public String getRootAccess() {
        return this.RootAccess;
    }

    /**
     * Set Root用户权限，可取值Enabled/Disabled
     * @param RootAccess Root用户权限，可取值Enabled/Disabled
     */
    public void setRootAccess(String RootAccess) {
        this.RootAccess = RootAccess;
    }

    /**
     * Get 安全组ID 
     * @return SecurityGroupIds 安全组ID
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID
     * @param SecurityGroupIds 安全组ID
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 数据卷大小(GB) 
     * @return VolumeSizeInGB 数据卷大小(GB)
     */
    public Long getVolumeSizeInGB() {
        return this.VolumeSizeInGB;
    }

    /**
     * Set 数据卷大小(GB)
     * @param VolumeSizeInGB 数据卷大小(GB)
     */
    public void setVolumeSizeInGB(Long VolumeSizeInGB) {
        this.VolumeSizeInGB = VolumeSizeInGB;
    }

    /**
     * Get Notebook标签 
     * @return Tags Notebook标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Notebook标签
     * @param Tags Notebook标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookInstanceName", this.NotebookInstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "DirectInternetAccess", this.DirectInternetAccess);
        this.setParamSimple(map, prefix + "RootAccess", this.RootAccess);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

