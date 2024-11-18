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

public class AddPermissionPolicyToRoleConfigurationRequest extends AbstractModel {

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
    * 权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。
    */
    @SerializedName("RolePolicyNames")
    @Expose
    private String [] RolePolicyNames;

    /**
    * 添加的系统策略详情。
    */
    @SerializedName("RolePolicies")
    @Expose
    private PolicyDetail [] RolePolicies;

    /**
    * 自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。
    */
    @SerializedName("CustomPolicyDocument")
    @Expose
    private String CustomPolicyDocument;

    /**
    * 自定义策略内容列表（跟RolePolicyNames一一对应）
    */
    @SerializedName("CustomPolicyDocuments")
    @Expose
    private String [] CustomPolicyDocuments;

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
     * Get 权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。 
     * @return RolePolicyNames 权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。
     */
    public String [] getRolePolicyNames() {
        return this.RolePolicyNames;
    }

    /**
     * Set 权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。
     * @param RolePolicyNames 权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。
     */
    public void setRolePolicyNames(String [] RolePolicyNames) {
        this.RolePolicyNames = RolePolicyNames;
    }

    /**
     * Get 添加的系统策略详情。 
     * @return RolePolicies 添加的系统策略详情。
     */
    public PolicyDetail [] getRolePolicies() {
        return this.RolePolicies;
    }

    /**
     * Set 添加的系统策略详情。
     * @param RolePolicies 添加的系统策略详情。
     */
    public void setRolePolicies(PolicyDetail [] RolePolicies) {
        this.RolePolicies = RolePolicies;
    }

    /**
     * Get 自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。 
     * @return CustomPolicyDocument 自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。
     */
    public String getCustomPolicyDocument() {
        return this.CustomPolicyDocument;
    }

    /**
     * Set 自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。
     * @param CustomPolicyDocument 自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。
     */
    public void setCustomPolicyDocument(String CustomPolicyDocument) {
        this.CustomPolicyDocument = CustomPolicyDocument;
    }

    /**
     * Get 自定义策略内容列表（跟RolePolicyNames一一对应） 
     * @return CustomPolicyDocuments 自定义策略内容列表（跟RolePolicyNames一一对应）
     */
    public String [] getCustomPolicyDocuments() {
        return this.CustomPolicyDocuments;
    }

    /**
     * Set 自定义策略内容列表（跟RolePolicyNames一一对应）
     * @param CustomPolicyDocuments 自定义策略内容列表（跟RolePolicyNames一一对应）
     */
    public void setCustomPolicyDocuments(String [] CustomPolicyDocuments) {
        this.CustomPolicyDocuments = CustomPolicyDocuments;
    }

    public AddPermissionPolicyToRoleConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddPermissionPolicyToRoleConfigurationRequest(AddPermissionPolicyToRoleConfigurationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RolePolicyType != null) {
            this.RolePolicyType = new String(source.RolePolicyType);
        }
        if (source.RolePolicyNames != null) {
            this.RolePolicyNames = new String[source.RolePolicyNames.length];
            for (int i = 0; i < source.RolePolicyNames.length; i++) {
                this.RolePolicyNames[i] = new String(source.RolePolicyNames[i]);
            }
        }
        if (source.RolePolicies != null) {
            this.RolePolicies = new PolicyDetail[source.RolePolicies.length];
            for (int i = 0; i < source.RolePolicies.length; i++) {
                this.RolePolicies[i] = new PolicyDetail(source.RolePolicies[i]);
            }
        }
        if (source.CustomPolicyDocument != null) {
            this.CustomPolicyDocument = new String(source.CustomPolicyDocument);
        }
        if (source.CustomPolicyDocuments != null) {
            this.CustomPolicyDocuments = new String[source.CustomPolicyDocuments.length];
            for (int i = 0; i < source.CustomPolicyDocuments.length; i++) {
                this.CustomPolicyDocuments[i] = new String(source.CustomPolicyDocuments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RolePolicyType", this.RolePolicyType);
        this.setParamArraySimple(map, prefix + "RolePolicyNames.", this.RolePolicyNames);
        this.setParamArrayObj(map, prefix + "RolePolicies.", this.RolePolicies);
        this.setParamSimple(map, prefix + "CustomPolicyDocument", this.CustomPolicyDocument);
        this.setParamArraySimple(map, prefix + "CustomPolicyDocuments.", this.CustomPolicyDocuments);

    }
}

