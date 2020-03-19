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

public class UpdateNotebookInstanceRequest extends AbstractModel{

    /**
    * Notebook实例名称
    */
    @SerializedName("NotebookInstanceName")
    @Expose
    private String NotebookInstanceName;

    /**
    * 角色的资源描述
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * Root访问权限
    */
    @SerializedName("RootAccess")
    @Expose
    private String RootAccess;

    /**
    * 数据卷大小(GB)
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * 算力资源类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

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
     * Get Root访问权限 
     * @return RootAccess Root访问权限
     */
    public String getRootAccess() {
        return this.RootAccess;
    }

    /**
     * Set Root访问权限
     * @param RootAccess Root访问权限
     */
    public void setRootAccess(String RootAccess) {
        this.RootAccess = RootAccess;
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
     * Get 算力资源类型 
     * @return InstanceType 算力资源类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 算力资源类型
     * @param InstanceType 算力资源类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookInstanceName", this.NotebookInstanceName);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "RootAccess", this.RootAccess);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

