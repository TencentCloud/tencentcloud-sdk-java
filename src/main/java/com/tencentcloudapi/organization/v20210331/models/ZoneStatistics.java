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

public class ZoneStatistics extends AbstractModel {

    /**
    * 用户配额。
    */
    @SerializedName("UserQuota")
    @Expose
    private Long UserQuota;

    /**
    * 用户组配额。
    */
    @SerializedName("GroupQuota")
    @Expose
    private Long GroupQuota;

    /**
    * 权限配置配额。
    */
    @SerializedName("RoleConfigurationQuota")
    @Expose
    private Long RoleConfigurationQuota;

    /**
    * 权限配置绑定的系统策略配额。
    */
    @SerializedName("SystemPolicyPerRoleConfigurationQuota")
    @Expose
    private Long SystemPolicyPerRoleConfigurationQuota;

    /**
    * 用户数。
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * 用户组数。
    */
    @SerializedName("GroupCount")
    @Expose
    private Long GroupCount;

    /**
    * 权限配置数
    */
    @SerializedName("RoleConfigurationCount")
    @Expose
    private Long RoleConfigurationCount;

    /**
    * 同步用户数。
    */
    @SerializedName("UserProvisioningCount")
    @Expose
    private Long UserProvisioningCount;

    /**
    * 同步角色数。
    */
    @SerializedName("RoleConfigurationSyncCount")
    @Expose
    private Long RoleConfigurationSyncCount;

    /**
     * Get 用户配额。 
     * @return UserQuota 用户配额。
     */
    public Long getUserQuota() {
        return this.UserQuota;
    }

    /**
     * Set 用户配额。
     * @param UserQuota 用户配额。
     */
    public void setUserQuota(Long UserQuota) {
        this.UserQuota = UserQuota;
    }

    /**
     * Get 用户组配额。 
     * @return GroupQuota 用户组配额。
     */
    public Long getGroupQuota() {
        return this.GroupQuota;
    }

    /**
     * Set 用户组配额。
     * @param GroupQuota 用户组配额。
     */
    public void setGroupQuota(Long GroupQuota) {
        this.GroupQuota = GroupQuota;
    }

    /**
     * Get 权限配置配额。 
     * @return RoleConfigurationQuota 权限配置配额。
     */
    public Long getRoleConfigurationQuota() {
        return this.RoleConfigurationQuota;
    }

    /**
     * Set 权限配置配额。
     * @param RoleConfigurationQuota 权限配置配额。
     */
    public void setRoleConfigurationQuota(Long RoleConfigurationQuota) {
        this.RoleConfigurationQuota = RoleConfigurationQuota;
    }

    /**
     * Get 权限配置绑定的系统策略配额。 
     * @return SystemPolicyPerRoleConfigurationQuota 权限配置绑定的系统策略配额。
     */
    public Long getSystemPolicyPerRoleConfigurationQuota() {
        return this.SystemPolicyPerRoleConfigurationQuota;
    }

    /**
     * Set 权限配置绑定的系统策略配额。
     * @param SystemPolicyPerRoleConfigurationQuota 权限配置绑定的系统策略配额。
     */
    public void setSystemPolicyPerRoleConfigurationQuota(Long SystemPolicyPerRoleConfigurationQuota) {
        this.SystemPolicyPerRoleConfigurationQuota = SystemPolicyPerRoleConfigurationQuota;
    }

    /**
     * Get 用户数。 
     * @return UserCount 用户数。
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set 用户数。
     * @param UserCount 用户数。
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get 用户组数。 
     * @return GroupCount 用户组数。
     */
    public Long getGroupCount() {
        return this.GroupCount;
    }

    /**
     * Set 用户组数。
     * @param GroupCount 用户组数。
     */
    public void setGroupCount(Long GroupCount) {
        this.GroupCount = GroupCount;
    }

    /**
     * Get 权限配置数 
     * @return RoleConfigurationCount 权限配置数
     */
    public Long getRoleConfigurationCount() {
        return this.RoleConfigurationCount;
    }

    /**
     * Set 权限配置数
     * @param RoleConfigurationCount 权限配置数
     */
    public void setRoleConfigurationCount(Long RoleConfigurationCount) {
        this.RoleConfigurationCount = RoleConfigurationCount;
    }

    /**
     * Get 同步用户数。 
     * @return UserProvisioningCount 同步用户数。
     */
    public Long getUserProvisioningCount() {
        return this.UserProvisioningCount;
    }

    /**
     * Set 同步用户数。
     * @param UserProvisioningCount 同步用户数。
     */
    public void setUserProvisioningCount(Long UserProvisioningCount) {
        this.UserProvisioningCount = UserProvisioningCount;
    }

    /**
     * Get 同步角色数。 
     * @return RoleConfigurationSyncCount 同步角色数。
     */
    public Long getRoleConfigurationSyncCount() {
        return this.RoleConfigurationSyncCount;
    }

    /**
     * Set 同步角色数。
     * @param RoleConfigurationSyncCount 同步角色数。
     */
    public void setRoleConfigurationSyncCount(Long RoleConfigurationSyncCount) {
        this.RoleConfigurationSyncCount = RoleConfigurationSyncCount;
    }

    public ZoneStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneStatistics(ZoneStatistics source) {
        if (source.UserQuota != null) {
            this.UserQuota = new Long(source.UserQuota);
        }
        if (source.GroupQuota != null) {
            this.GroupQuota = new Long(source.GroupQuota);
        }
        if (source.RoleConfigurationQuota != null) {
            this.RoleConfigurationQuota = new Long(source.RoleConfigurationQuota);
        }
        if (source.SystemPolicyPerRoleConfigurationQuota != null) {
            this.SystemPolicyPerRoleConfigurationQuota = new Long(source.SystemPolicyPerRoleConfigurationQuota);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
        if (source.GroupCount != null) {
            this.GroupCount = new Long(source.GroupCount);
        }
        if (source.RoleConfigurationCount != null) {
            this.RoleConfigurationCount = new Long(source.RoleConfigurationCount);
        }
        if (source.UserProvisioningCount != null) {
            this.UserProvisioningCount = new Long(source.UserProvisioningCount);
        }
        if (source.RoleConfigurationSyncCount != null) {
            this.RoleConfigurationSyncCount = new Long(source.RoleConfigurationSyncCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserQuota", this.UserQuota);
        this.setParamSimple(map, prefix + "GroupQuota", this.GroupQuota);
        this.setParamSimple(map, prefix + "RoleConfigurationQuota", this.RoleConfigurationQuota);
        this.setParamSimple(map, prefix + "SystemPolicyPerRoleConfigurationQuota", this.SystemPolicyPerRoleConfigurationQuota);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);
        this.setParamSimple(map, prefix + "GroupCount", this.GroupCount);
        this.setParamSimple(map, prefix + "RoleConfigurationCount", this.RoleConfigurationCount);
        this.setParamSimple(map, prefix + "UserProvisioningCount", this.UserProvisioningCount);
        this.setParamSimple(map, prefix + "RoleConfigurationSyncCount", this.RoleConfigurationSyncCount);

    }
}

