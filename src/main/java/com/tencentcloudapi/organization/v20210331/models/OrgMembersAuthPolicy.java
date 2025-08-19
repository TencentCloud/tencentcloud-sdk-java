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

public class OrgMembersAuthPolicy extends AbstractModel {

    /**
    * 身份Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * 身份的角色名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityRoleName")
    @Expose
    private String IdentityRoleName;

    /**
    * 身份的角色别名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityRoleAliasName")
    @Expose
    private String IdentityRoleAliasName;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 成员访问策略Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 成员访问策略名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 成员uin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 成员名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * 子账号uin或者用户组Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgSubAccountUin")
    @Expose
    private Long OrgSubAccountUin;

    /**
    * 子账号名称或者用户组名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgSubAccountName")
    @Expose
    private String OrgSubAccountName;

    /**
    * 绑定类型。1-子账号、2-用户组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
    * 成员信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Members")
    @Expose
    private MemberMainInfo [] Members;

    /**
     * Get 身份Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityId 身份Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set 身份Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityId 身份Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get 身份的角色名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityRoleName 身份的角色名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentityRoleName() {
        return this.IdentityRoleName;
    }

    /**
     * Set 身份的角色名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityRoleName 身份的角色名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityRoleName(String IdentityRoleName) {
        this.IdentityRoleName = IdentityRoleName;
    }

    /**
     * Get 身份的角色别名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityRoleAliasName 身份的角色别名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentityRoleAliasName() {
        return this.IdentityRoleAliasName;
    }

    /**
     * Set 身份的角色别名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityRoleAliasName 身份的角色别名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityRoleAliasName(String IdentityRoleAliasName) {
        this.IdentityRoleAliasName = IdentityRoleAliasName;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 成员访问策略Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId 成员访问策略Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 成员访问策略Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId 成员访问策略Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 成员访问策略名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyName 成员访问策略名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 成员访问策略名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyName 成员访问策略名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 成员uin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberUin 成员uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 成员uin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberUin 成员uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get 成员名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberName 成员名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set 成员名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberName 成员名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get 子账号uin或者用户组Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgSubAccountUin 子账号uin或者用户组Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrgSubAccountUin() {
        return this.OrgSubAccountUin;
    }

    /**
     * Set 子账号uin或者用户组Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgSubAccountUin 子账号uin或者用户组Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgSubAccountUin(Long OrgSubAccountUin) {
        this.OrgSubAccountUin = OrgSubAccountUin;
    }

    /**
     * Get 子账号名称或者用户组名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgSubAccountName 子账号名称或者用户组名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgSubAccountName() {
        return this.OrgSubAccountName;
    }

    /**
     * Set 子账号名称或者用户组名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgSubAccountName 子账号名称或者用户组名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgSubAccountName(String OrgSubAccountName) {
        this.OrgSubAccountName = OrgSubAccountName;
    }

    /**
     * Get 绑定类型。1-子账号、2-用户组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindType 绑定类型。1-子账号、2-用户组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定类型。1-子账号、2-用户组
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindType 绑定类型。1-子账号、2-用户组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 成员信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Members 成员信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberMainInfo [] getMembers() {
        return this.Members;
    }

    /**
     * Set 成员信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Members 成员信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMembers(MemberMainInfo [] Members) {
        this.Members = Members;
    }

    public OrgMembersAuthPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgMembersAuthPolicy(OrgMembersAuthPolicy source) {
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityRoleName != null) {
            this.IdentityRoleName = new String(source.IdentityRoleName);
        }
        if (source.IdentityRoleAliasName != null) {
            this.IdentityRoleAliasName = new String(source.IdentityRoleAliasName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
        if (source.OrgSubAccountUin != null) {
            this.OrgSubAccountUin = new Long(source.OrgSubAccountUin);
        }
        if (source.OrgSubAccountName != null) {
            this.OrgSubAccountName = new String(source.OrgSubAccountName);
        }
        if (source.BindType != null) {
            this.BindType = new Long(source.BindType);
        }
        if (source.Members != null) {
            this.Members = new MemberMainInfo[source.Members.length];
            for (int i = 0; i < source.Members.length; i++) {
                this.Members[i] = new MemberMainInfo(source.Members[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityRoleName", this.IdentityRoleName);
        this.setParamSimple(map, prefix + "IdentityRoleAliasName", this.IdentityRoleAliasName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "OrgSubAccountUin", this.OrgSubAccountUin);
        this.setParamSimple(map, prefix + "OrgSubAccountName", this.OrgSubAccountName);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamArrayObj(map, prefix + "Members.", this.Members);

    }
}

