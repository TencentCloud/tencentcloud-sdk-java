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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRoleConfigurationApplyScopeRequest extends AbstractModel {

    /**
    * <p>空间ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>权限配置 ID 列表</p>
    */
    @SerializedName("RoleConfigurationIds")
    @Expose
    private String [] RoleConfigurationIds;

    /**
    * <p>目标账号 UIN</p>
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * <p>身份 ID</p>
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul>
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

    /**
     * Get <p>空间ID</p> 
     * @return ZoneId <p>空间ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>空间ID</p>
     * @param ZoneId <p>空间ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>权限配置 ID 列表</p> 
     * @return RoleConfigurationIds <p>权限配置 ID 列表</p>
     */
    public String [] getRoleConfigurationIds() {
        return this.RoleConfigurationIds;
    }

    /**
     * Set <p>权限配置 ID 列表</p>
     * @param RoleConfigurationIds <p>权限配置 ID 列表</p>
     */
    public void setRoleConfigurationIds(String [] RoleConfigurationIds) {
        this.RoleConfigurationIds = RoleConfigurationIds;
    }

    /**
     * Get <p>目标账号 UIN</p> 
     * @return TargetUin <p>目标账号 UIN</p>
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set <p>目标账号 UIN</p>
     * @param TargetUin <p>目标账号 UIN</p>
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get <p>身份 ID</p> 
     * @return PrincipalId <p>身份 ID</p>
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set <p>身份 ID</p>
     * @param PrincipalId <p>身份 ID</p>
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul> 
     * @return PrincipalType <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul>
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul>
     * @param PrincipalType <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul>
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    public DeleteRoleConfigurationApplyScopeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoleConfigurationApplyScopeRequest(DeleteRoleConfigurationApplyScopeRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationIds != null) {
            this.RoleConfigurationIds = new String[source.RoleConfigurationIds.length];
            for (int i = 0; i < source.RoleConfigurationIds.length; i++) {
                this.RoleConfigurationIds[i] = new String(source.RoleConfigurationIds[i]);
            }
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "RoleConfigurationIds.", this.RoleConfigurationIds);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);

    }
}

