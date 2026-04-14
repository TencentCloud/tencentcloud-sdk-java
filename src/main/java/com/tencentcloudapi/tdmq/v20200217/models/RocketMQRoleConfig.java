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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQRoleConfig extends AbstractModel {

    /**
    * 角色名，对应SecretKey
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * accessKey
    */
    @SerializedName("RoleToken")
    @Expose
    private String RoleToken;

    /**
    * 命名空间
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 角色权限
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
    * Topic和Group维度权限配置
    */
    @SerializedName("DetailedRolePerms")
    @Expose
    private DetailedRolePerm [] DetailedRolePerms;

    /**
     * Get 角色名，对应SecretKey 
     * @return RoleName 角色名，对应SecretKey
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名，对应SecretKey
     * @param RoleName 角色名，对应SecretKey
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get accessKey 
     * @return RoleToken accessKey
     */
    public String getRoleToken() {
        return this.RoleToken;
    }

    /**
     * Set accessKey
     * @param RoleToken accessKey
     */
    public void setRoleToken(String RoleToken) {
        this.RoleToken = RoleToken;
    }

    /**
     * Get 命名空间 
     * @return EnvironmentId 命名空间
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 命名空间
     * @param EnvironmentId 命名空间
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 角色权限 
     * @return Permissions 角色权限
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 角色权限
     * @param Permissions 角色权限
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别） 
     * @return PermType 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
     * @param PermType 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
    }

    /**
     * Get Topic和Group维度权限配置 
     * @return DetailedRolePerms Topic和Group维度权限配置
     */
    public DetailedRolePerm [] getDetailedRolePerms() {
        return this.DetailedRolePerms;
    }

    /**
     * Set Topic和Group维度权限配置
     * @param DetailedRolePerms Topic和Group维度权限配置
     */
    public void setDetailedRolePerms(DetailedRolePerm [] DetailedRolePerms) {
        this.DetailedRolePerms = DetailedRolePerms;
    }

    public RocketMQRoleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQRoleConfig(RocketMQRoleConfig source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleToken != null) {
            this.RoleToken = new String(source.RoleToken);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
        if (source.DetailedRolePerms != null) {
            this.DetailedRolePerms = new DetailedRolePerm[source.DetailedRolePerms.length];
            for (int i = 0; i < source.DetailedRolePerms.length; i++) {
                this.DetailedRolePerms[i] = new DetailedRolePerm(source.DetailedRolePerms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleToken", this.RoleToken);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PermType", this.PermType);
        this.setParamArrayObj(map, prefix + "DetailedRolePerms.", this.DetailedRolePerms);

    }
}

