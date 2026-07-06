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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganMemberItem extends AbstractModel {

    /**
    * 成员 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 成员账号 AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 账号Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 账号名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 子账号数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountCount")
    @Expose
    private Long SubAccountCount;

    /**
    * 所属组织架构节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 成员身份：admin-管理员，delegatedAdmin-委派管理员，member-普通成员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 成员身份显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleDisplay")
    @Expose
    private String RoleDisplay;

    /**
    * 所属账户组 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroup")
    @Expose
    private AccountGroupInfo AccountGroup;

    /**
    * 云防火墙纳管状态：0-未纳管，1-已纳管
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CfwManaged")
    @Expose
    private Long CfwManaged;

    /**
    * 云防火墙共享角色：sharer-共享者，user-使用者，none-未设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CfwShareRole")
    @Expose
    private String CfwShareRole;

    /**
    * 云防火墙共享角色显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CfwShareRoleDisplay")
    @Expose
    private String CfwShareRoleDisplay;

    /**
    * 云防火墙共享者 AppId，成员角色为使用者时有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CfwSharerAppId")
    @Expose
    private String CfwSharerAppId;

    /**
    * 云防火墙计费实例 ID，非空表示已购买云防火墙
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CfwInstanceId")
    @Expose
    private String CfwInstanceId;

    /**
    * 策略分析权限：0-关闭，1-开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyAnalysisEnabled")
    @Expose
    private Long PolicyAnalysisEnabled;

    /**
    * 成员加入集团时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberCreateTime")
    @Expose
    private String MemberCreateTime;

    /**
    * 账号加入方式
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
     * Get 成员 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberId 成员 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 成员 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberId 成员 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 成员账号 AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 成员账号 AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 成员账号 AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 成员账号 AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 账号Uin 
     * @return Uin 账号Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账号Uin
     * @param Uin 账号Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 账号名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nickname 账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 账号名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nickname 账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 子账号数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountCount 子账号数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubAccountCount() {
        return this.SubAccountCount;
    }

    /**
     * Set 子账号数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountCount 子账号数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountCount(Long SubAccountCount) {
        this.SubAccountCount = SubAccountCount;
    }

    /**
     * Get 所属组织架构节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 所属组织架构节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 所属组织架构节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 所属组织架构节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 成员身份：admin-管理员，delegatedAdmin-委派管理员，member-普通成员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Role 成员身份：admin-管理员，delegatedAdmin-委派管理员，member-普通成员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 成员身份：admin-管理员，delegatedAdmin-委派管理员，member-普通成员
注意：此字段可能返回 null，表示取不到有效值。
     * @param Role 成员身份：admin-管理员，delegatedAdmin-委派管理员，member-普通成员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 成员身份显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleDisplay 成员身份显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleDisplay() {
        return this.RoleDisplay;
    }

    /**
     * Set 成员身份显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleDisplay 成员身份显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleDisplay(String RoleDisplay) {
        this.RoleDisplay = RoleDisplay;
    }

    /**
     * Get 所属账户组 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroup 所属账户组 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccountGroupInfo getAccountGroup() {
        return this.AccountGroup;
    }

    /**
     * Set 所属账户组 
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroup 所属账户组 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroup(AccountGroupInfo AccountGroup) {
        this.AccountGroup = AccountGroup;
    }

    /**
     * Get 云防火墙纳管状态：0-未纳管，1-已纳管
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CfwManaged 云防火墙纳管状态：0-未纳管，1-已纳管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCfwManaged() {
        return this.CfwManaged;
    }

    /**
     * Set 云防火墙纳管状态：0-未纳管，1-已纳管
注意：此字段可能返回 null，表示取不到有效值。
     * @param CfwManaged 云防火墙纳管状态：0-未纳管，1-已纳管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCfwManaged(Long CfwManaged) {
        this.CfwManaged = CfwManaged;
    }

    /**
     * Get 云防火墙共享角色：sharer-共享者，user-使用者，none-未设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CfwShareRole 云防火墙共享角色：sharer-共享者，user-使用者，none-未设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCfwShareRole() {
        return this.CfwShareRole;
    }

    /**
     * Set 云防火墙共享角色：sharer-共享者，user-使用者，none-未设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CfwShareRole 云防火墙共享角色：sharer-共享者，user-使用者，none-未设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCfwShareRole(String CfwShareRole) {
        this.CfwShareRole = CfwShareRole;
    }

    /**
     * Get 云防火墙共享角色显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CfwShareRoleDisplay 云防火墙共享角色显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCfwShareRoleDisplay() {
        return this.CfwShareRoleDisplay;
    }

    /**
     * Set 云防火墙共享角色显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CfwShareRoleDisplay 云防火墙共享角色显示名称（前端展示用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCfwShareRoleDisplay(String CfwShareRoleDisplay) {
        this.CfwShareRoleDisplay = CfwShareRoleDisplay;
    }

    /**
     * Get 云防火墙共享者 AppId，成员角色为使用者时有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CfwSharerAppId 云防火墙共享者 AppId，成员角色为使用者时有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCfwSharerAppId() {
        return this.CfwSharerAppId;
    }

    /**
     * Set 云防火墙共享者 AppId，成员角色为使用者时有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CfwSharerAppId 云防火墙共享者 AppId，成员角色为使用者时有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCfwSharerAppId(String CfwSharerAppId) {
        this.CfwSharerAppId = CfwSharerAppId;
    }

    /**
     * Get 云防火墙计费实例 ID，非空表示已购买云防火墙
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CfwInstanceId 云防火墙计费实例 ID，非空表示已购买云防火墙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCfwInstanceId() {
        return this.CfwInstanceId;
    }

    /**
     * Set 云防火墙计费实例 ID，非空表示已购买云防火墙
注意：此字段可能返回 null，表示取不到有效值。
     * @param CfwInstanceId 云防火墙计费实例 ID，非空表示已购买云防火墙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCfwInstanceId(String CfwInstanceId) {
        this.CfwInstanceId = CfwInstanceId;
    }

    /**
     * Get 策略分析权限：0-关闭，1-开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyAnalysisEnabled 策略分析权限：0-关闭，1-开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyAnalysisEnabled() {
        return this.PolicyAnalysisEnabled;
    }

    /**
     * Set 策略分析权限：0-关闭，1-开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyAnalysisEnabled 策略分析权限：0-关闭，1-开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyAnalysisEnabled(Long PolicyAnalysisEnabled) {
        this.PolicyAnalysisEnabled = PolicyAnalysisEnabled;
    }

    /**
     * Get 成员加入集团时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberCreateTime 成员加入集团时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberCreateTime() {
        return this.MemberCreateTime;
    }

    /**
     * Set 成员加入集团时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberCreateTime 成员加入集团时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberCreateTime(String MemberCreateTime) {
        this.MemberCreateTime = MemberCreateTime;
    }

    /**
     * Get 账号加入方式 
     * @return JoinType 账号加入方式
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set 账号加入方式
     * @param JoinType 账号加入方式
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    public OrganMemberItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganMemberItem(OrganMemberItem source) {
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.SubAccountCount != null) {
            this.SubAccountCount = new Long(source.SubAccountCount);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.RoleDisplay != null) {
            this.RoleDisplay = new String(source.RoleDisplay);
        }
        if (source.AccountGroup != null) {
            this.AccountGroup = new AccountGroupInfo(source.AccountGroup);
        }
        if (source.CfwManaged != null) {
            this.CfwManaged = new Long(source.CfwManaged);
        }
        if (source.CfwShareRole != null) {
            this.CfwShareRole = new String(source.CfwShareRole);
        }
        if (source.CfwShareRoleDisplay != null) {
            this.CfwShareRoleDisplay = new String(source.CfwShareRoleDisplay);
        }
        if (source.CfwSharerAppId != null) {
            this.CfwSharerAppId = new String(source.CfwSharerAppId);
        }
        if (source.CfwInstanceId != null) {
            this.CfwInstanceId = new String(source.CfwInstanceId);
        }
        if (source.PolicyAnalysisEnabled != null) {
            this.PolicyAnalysisEnabled = new Long(source.PolicyAnalysisEnabled);
        }
        if (source.MemberCreateTime != null) {
            this.MemberCreateTime = new String(source.MemberCreateTime);
        }
        if (source.JoinType != null) {
            this.JoinType = new String(source.JoinType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "SubAccountCount", this.SubAccountCount);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "RoleDisplay", this.RoleDisplay);
        this.setParamObj(map, prefix + "AccountGroup.", this.AccountGroup);
        this.setParamSimple(map, prefix + "CfwManaged", this.CfwManaged);
        this.setParamSimple(map, prefix + "CfwShareRole", this.CfwShareRole);
        this.setParamSimple(map, prefix + "CfwShareRoleDisplay", this.CfwShareRoleDisplay);
        this.setParamSimple(map, prefix + "CfwSharerAppId", this.CfwSharerAppId);
        this.setParamSimple(map, prefix + "CfwInstanceId", this.CfwInstanceId);
        this.setParamSimple(map, prefix + "PolicyAnalysisEnabled", this.PolicyAnalysisEnabled);
        this.setParamSimple(map, prefix + "MemberCreateTime", this.MemberCreateTime);
        this.setParamSimple(map, prefix + "JoinType", this.JoinType);

    }
}

