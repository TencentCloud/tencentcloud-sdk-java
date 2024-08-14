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

public class RemovePermissionPolicyFromRoleConfigurationRequest extends AbstractModel {

    /**
    * 空间 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 权限配置 ID
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * 权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。
    */
    @SerializedName("RolePolicyType")
    @Expose
    private String RolePolicyType;

    /**
    * 权限策略名称，长度最大为 32 个字符。
    */
    @SerializedName("RolePolicyName")
    @Expose
    private String RolePolicyName;

    /**
    * 策略ID。
    */
    @SerializedName("RolePolicyId")
    @Expose
    private Long RolePolicyId;

    /**
     * Get 空间 ID 
     * @return ZoneId 空间 ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间 ID
     * @param ZoneId 空间 ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 权限配置 ID 
     * @return RoleConfigurationId 权限配置 ID
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set 权限配置 ID
     * @param RoleConfigurationId 权限配置 ID
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get 权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。 
     * @return RolePolicyType 权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。
     */
    public String getRolePolicyType() {
        return this.RolePolicyType;
    }

    /**
     * Set 权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。
     * @param RolePolicyType 权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。
     */
    public void setRolePolicyType(String RolePolicyType) {
        this.RolePolicyType = RolePolicyType;
    }

    /**
     * Get 权限策略名称，长度最大为 32 个字符。 
     * @return RolePolicyName 权限策略名称，长度最大为 32 个字符。
     */
    public String getRolePolicyName() {
        return this.RolePolicyName;
    }

    /**
     * Set 权限策略名称，长度最大为 32 个字符。
     * @param RolePolicyName 权限策略名称，长度最大为 32 个字符。
     */
    public void setRolePolicyName(String RolePolicyName) {
        this.RolePolicyName = RolePolicyName;
    }

    /**
     * Get 策略ID。 
     * @return RolePolicyId 策略ID。
     */
    public Long getRolePolicyId() {
        return this.RolePolicyId;
    }

    /**
     * Set 策略ID。
     * @param RolePolicyId 策略ID。
     */
    public void setRolePolicyId(Long RolePolicyId) {
        this.RolePolicyId = RolePolicyId;
    }

    public RemovePermissionPolicyFromRoleConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemovePermissionPolicyFromRoleConfigurationRequest(RemovePermissionPolicyFromRoleConfigurationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RolePolicyType != null) {
            this.RolePolicyType = new String(source.RolePolicyType);
        }
        if (source.RolePolicyName != null) {
            this.RolePolicyName = new String(source.RolePolicyName);
        }
        if (source.RolePolicyId != null) {
            this.RolePolicyId = new Long(source.RolePolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RolePolicyType", this.RolePolicyType);
        this.setParamSimple(map, prefix + "RolePolicyName", this.RolePolicyName);
        this.setParamSimple(map, prefix + "RolePolicyId", this.RolePolicyId);

    }
}

