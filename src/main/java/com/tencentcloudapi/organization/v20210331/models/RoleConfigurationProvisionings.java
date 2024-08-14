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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleConfigurationProvisionings extends AbstractModel {

    /**
    * Deployed: 部署成功 DeployedRequired：需要重新部署 DeployFailed：部署失败
    */
    @SerializedName("DeploymentStatus")
    @Expose
    private String DeploymentStatus;

    /**
    * 权限配置ID。
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * 权限配置名称。
    */
    @SerializedName("RoleConfigurationName")
    @Expose
    private String RoleConfigurationName;

    /**
    * 集团账号目标账号的UIN
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * 集团账号目标账号的名称。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 创建时间，
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间，
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
     * Get Deployed: 部署成功 DeployedRequired：需要重新部署 DeployFailed：部署失败 
     * @return DeploymentStatus Deployed: 部署成功 DeployedRequired：需要重新部署 DeployFailed：部署失败
     */
    public String getDeploymentStatus() {
        return this.DeploymentStatus;
    }

    /**
     * Set Deployed: 部署成功 DeployedRequired：需要重新部署 DeployFailed：部署失败
     * @param DeploymentStatus Deployed: 部署成功 DeployedRequired：需要重新部署 DeployFailed：部署失败
     */
    public void setDeploymentStatus(String DeploymentStatus) {
        this.DeploymentStatus = DeploymentStatus;
    }

    /**
     * Get 权限配置ID。 
     * @return RoleConfigurationId 权限配置ID。
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set 权限配置ID。
     * @param RoleConfigurationId 权限配置ID。
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get 权限配置名称。 
     * @return RoleConfigurationName 权限配置名称。
     */
    public String getRoleConfigurationName() {
        return this.RoleConfigurationName;
    }

    /**
     * Set 权限配置名称。
     * @param RoleConfigurationName 权限配置名称。
     */
    public void setRoleConfigurationName(String RoleConfigurationName) {
        this.RoleConfigurationName = RoleConfigurationName;
    }

    /**
     * Get 集团账号目标账号的UIN 
     * @return TargetUin 集团账号目标账号的UIN
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 集团账号目标账号的UIN
     * @param TargetUin 集团账号目标账号的UIN
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get 集团账号目标账号的名称。 
     * @return TargetName 集团账号目标账号的名称。
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 集团账号目标账号的名称。
     * @param TargetName 集团账号目标账号的名称。
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 创建时间， 
     * @return CreateTime 创建时间，
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，
     * @param CreateTime 创建时间，
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间， 
     * @return UpdateTime 修改时间，
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间，
     * @param UpdateTime 修改时间，
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号 
     * @return TargetType 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     * @param TargetType 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    public RoleConfigurationProvisionings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleConfigurationProvisionings(RoleConfigurationProvisionings source) {
        if (source.DeploymentStatus != null) {
            this.DeploymentStatus = new String(source.DeploymentStatus);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RoleConfigurationName != null) {
            this.RoleConfigurationName = new String(source.RoleConfigurationName);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentStatus", this.DeploymentStatus);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RoleConfigurationName", this.RoleConfigurationName);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);

    }
}

