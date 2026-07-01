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

public class AddPermissionPolicyToRoleConfigurationRequest extends AbstractModel {

    /**
    * <p>空间 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>权限配置 ID</p>
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * <p>权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。</p>
    */
    @SerializedName("RolePolicyType")
    @Expose
    private String RolePolicyType;

    /**
    * <p>权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。</p>
    */
    @SerializedName("RolePolicyNames")
    @Expose
    private String [] RolePolicyNames;

    /**
    * <p>添加的系统策略详情。</p>
    */
    @SerializedName("RolePolicies")
    @Expose
    private PolicyDetail [] RolePolicies;

    /**
    * <p>自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。</p>
    */
    @SerializedName("CustomPolicyDocument")
    @Expose
    private String CustomPolicyDocument;

    /**
    * <p>自定义策略内容列表（跟RolePolicyNames一一对应）</p>
    */
    @SerializedName("CustomPolicyDocuments")
    @Expose
    private String [] CustomPolicyDocuments;

    /**
    * <p>是否公共策略</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 不是</li></ul><p>默认值：1</p>
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
     * Get <p>空间 ID</p> 
     * @return ZoneId <p>空间 ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>空间 ID</p>
     * @param ZoneId <p>空间 ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>权限配置 ID</p> 
     * @return RoleConfigurationId <p>权限配置 ID</p>
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set <p>权限配置 ID</p>
     * @param RoleConfigurationId <p>权限配置 ID</p>
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get <p>权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。</p> 
     * @return RolePolicyType <p>权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。</p>
     */
    public String getRolePolicyType() {
        return this.RolePolicyType;
    }

    /**
     * Set <p>权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。</p>
     * @param RolePolicyType <p>权限策略类型。取值：  System：系统策略。复用 CAM 的系统策略。 Custom: 自定义策略。按照 CAM 权限策略语法和结构编写的自定义策略。</p>
     */
    public void setRolePolicyType(String RolePolicyType) {
        this.RolePolicyType = RolePolicyType;
    }

    /**
     * Get <p>权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。</p> 
     * @return RolePolicyNames <p>权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。</p>
     */
    public String [] getRolePolicyNames() {
        return this.RolePolicyNames;
    }

    /**
     * Set <p>权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。</p>
     * @param RolePolicyNames <p>权限策略名称，长度最大为 20策略，每个策略长度最大32个字符。如果要添加系统策略，建议使用RolePolicies参数。自定义策略时，数组长度最大为1。</p>
     */
    public void setRolePolicyNames(String [] RolePolicyNames) {
        this.RolePolicyNames = RolePolicyNames;
    }

    /**
     * Get <p>添加的系统策略详情。</p> 
     * @return RolePolicies <p>添加的系统策略详情。</p>
     */
    public PolicyDetail [] getRolePolicies() {
        return this.RolePolicies;
    }

    /**
     * Set <p>添加的系统策略详情。</p>
     * @param RolePolicies <p>添加的系统策略详情。</p>
     */
    public void setRolePolicies(PolicyDetail [] RolePolicies) {
        this.RolePolicies = RolePolicies;
    }

    /**
     * Get <p>自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。</p> 
     * @return CustomPolicyDocument <p>自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。</p>
     */
    public String getCustomPolicyDocument() {
        return this.CustomPolicyDocument;
    }

    /**
     * Set <p>自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。</p>
     * @param CustomPolicyDocument <p>自定义策略内容。长度：最大 4096 个字符。当RolePolicyType为Inline时，该参数必须配置。关于权限策略的语法和结构，请参见权限策略语法和结构。</p>
     */
    public void setCustomPolicyDocument(String CustomPolicyDocument) {
        this.CustomPolicyDocument = CustomPolicyDocument;
    }

    /**
     * Get <p>自定义策略内容列表（跟RolePolicyNames一一对应）</p> 
     * @return CustomPolicyDocuments <p>自定义策略内容列表（跟RolePolicyNames一一对应）</p>
     */
    public String [] getCustomPolicyDocuments() {
        return this.CustomPolicyDocuments;
    }

    /**
     * Set <p>自定义策略内容列表（跟RolePolicyNames一一对应）</p>
     * @param CustomPolicyDocuments <p>自定义策略内容列表（跟RolePolicyNames一一对应）</p>
     */
    public void setCustomPolicyDocuments(String [] CustomPolicyDocuments) {
        this.CustomPolicyDocuments = CustomPolicyDocuments;
    }

    /**
     * Get <p>是否公共策略</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 不是</li></ul><p>默认值：1</p> 
     * @return PolicyType <p>是否公共策略</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 不是</li></ul><p>默认值：1</p>
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>是否公共策略</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 不是</li></ul><p>默认值：1</p>
     * @param PolicyType <p>是否公共策略</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 不是</li></ul><p>默认值：1</p>
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
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
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
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
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);

    }
}

