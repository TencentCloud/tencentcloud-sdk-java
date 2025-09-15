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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WedaUser extends AbstractModel {

    /**
    * 腾讯云主账号uin
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 环境
    */
    @SerializedName("Env")
    @Expose
    private Long Env;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 用户uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 渠道，1:自建；2:企业微信导入
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 微信openid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 关联角色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedRoles")
    @Expose
    private WedaRole [] RelatedRoles;

    /**
    * 企业微信userid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatUserId")
    @Expose
    private String WechatUserId;

    /**
    * 内部用户类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternalUserType")
    @Expose
    private Long InternalUserType;

    /**
    * 微搭用户id
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 所属部门名称
    */
    @SerializedName("OrgName")
    @Expose
    private String OrgName;

    /**
    * 用户schema
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserSchema")
    @Expose
    private String UserSchema;

    /**
    * 用户扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserExtend")
    @Expose
    private String UserExtend;

    /**
    * 用户是否授权License
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLicensed")
    @Expose
    private Boolean IsLicensed;

    /**
    * 权限组数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedRoleGroups")
    @Expose
    private RoleGroup [] RelatedRoleGroups;

    /**
    * 兼岗部门
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Orgs")
    @Expose
    private OrgResp [] Orgs;

    /**
    * 主岗部门
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainOrg")
    @Expose
    private OrgResp [] MainOrg;

    /**
    * 直属上级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentUserId")
    @Expose
    private Long ParentUserId;

    /**
    * 主列字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrimaryColumn")
    @Expose
    private String PrimaryColumn;

    /**
    * 用户头像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * 最后登录时间
    */
    @SerializedName("LastLoginTime")
    @Expose
    private String LastLoginTime;

    /**
     * Get 腾讯云主账号uin 
     * @return Uin 腾讯云主账号uin
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云主账号uin
     * @param Uin 腾讯云主账号uin
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 环境 
     * @return Env 环境
     */
    public Long getEnv() {
        return this.Env;
    }

    /**
     * Set 环境
     * @param Env 环境
     */
    public void setEnv(Long Env) {
        this.Env = Env;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 昵称 
     * @return NickName 昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
     * @param NickName 昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 邮箱 
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 手机号 
     * @return Phone 手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号
     * @param Phone 手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 用户uuid 
     * @return Uuid 用户uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 用户uuid
     * @param Uuid 用户uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 渠道，1:自建；2:企业微信导入 
     * @return Source 渠道，1:自建；2:企业微信导入
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 渠道，1:自建；2:企业微信导入
     * @param Source 渠道，1:自建；2:企业微信导入
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 微信openid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenId 微信openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 微信openid
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId 微信openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 关联角色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedRoles 关联角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WedaRole [] getRelatedRoles() {
        return this.RelatedRoles;
    }

    /**
     * Set 关联角色
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedRoles 关联角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedRoles(WedaRole [] RelatedRoles) {
        this.RelatedRoles = RelatedRoles;
    }

    /**
     * Get 企业微信userid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatUserId 企业微信userid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatUserId() {
        return this.WechatUserId;
    }

    /**
     * Set 企业微信userid
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatUserId 企业微信userid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatUserId(String WechatUserId) {
        this.WechatUserId = WechatUserId;
    }

    /**
     * Get 内部用户类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternalUserType 内部用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInternalUserType() {
        return this.InternalUserType;
    }

    /**
     * Set 内部用户类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternalUserType 内部用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternalUserType(Long InternalUserType) {
        this.InternalUserType = InternalUserType;
    }

    /**
     * Get 微搭用户id 
     * @return UserId 微搭用户id
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 微搭用户id
     * @param UserId 微搭用户id
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 所属部门名称 
     * @return OrgName 所属部门名称
     */
    public String getOrgName() {
        return this.OrgName;
    }

    /**
     * Set 所属部门名称
     * @param OrgName 所属部门名称
     */
    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    /**
     * Get 用户schema
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserSchema 用户schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserSchema() {
        return this.UserSchema;
    }

    /**
     * Set 用户schema
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserSchema 用户schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserSchema(String UserSchema) {
        this.UserSchema = UserSchema;
    }

    /**
     * Get 用户扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserExtend 用户扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserExtend() {
        return this.UserExtend;
    }

    /**
     * Set 用户扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserExtend 用户扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserExtend(String UserExtend) {
        this.UserExtend = UserExtend;
    }

    /**
     * Get 用户是否授权License
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLicensed 用户是否授权License
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLicensed() {
        return this.IsLicensed;
    }

    /**
     * Set 用户是否授权License
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLicensed 用户是否授权License
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLicensed(Boolean IsLicensed) {
        this.IsLicensed = IsLicensed;
    }

    /**
     * Get 权限组数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedRoleGroups 权限组数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoleGroup [] getRelatedRoleGroups() {
        return this.RelatedRoleGroups;
    }

    /**
     * Set 权限组数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedRoleGroups 权限组数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedRoleGroups(RoleGroup [] RelatedRoleGroups) {
        this.RelatedRoleGroups = RelatedRoleGroups;
    }

    /**
     * Get 兼岗部门
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Orgs 兼岗部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrgResp [] getOrgs() {
        return this.Orgs;
    }

    /**
     * Set 兼岗部门
注意：此字段可能返回 null，表示取不到有效值。
     * @param Orgs 兼岗部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgs(OrgResp [] Orgs) {
        this.Orgs = Orgs;
    }

    /**
     * Get 主岗部门
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainOrg 主岗部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrgResp [] getMainOrg() {
        return this.MainOrg;
    }

    /**
     * Set 主岗部门
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainOrg 主岗部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainOrg(OrgResp [] MainOrg) {
        this.MainOrg = MainOrg;
    }

    /**
     * Get 直属上级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentUserId 直属上级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParentUserId() {
        return this.ParentUserId;
    }

    /**
     * Set 直属上级
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentUserId 直属上级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentUserId(Long ParentUserId) {
        this.ParentUserId = ParentUserId;
    }

    /**
     * Get 主列字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrimaryColumn 主列字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrimaryColumn() {
        return this.PrimaryColumn;
    }

    /**
     * Set 主列字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrimaryColumn 主列字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrimaryColumn(String PrimaryColumn) {
        this.PrimaryColumn = PrimaryColumn;
    }

    /**
     * Get 用户头像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvatarUrl 用户头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set 用户头像
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvatarUrl 用户头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get 最后登录时间 
     * @return LastLoginTime 最后登录时间
     */
    public String getLastLoginTime() {
        return this.LastLoginTime;
    }

    /**
     * Set 最后登录时间
     * @param LastLoginTime 最后登录时间
     */
    public void setLastLoginTime(String LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    public WedaUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WedaUser(WedaUser source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Env != null) {
            this.Env = new Long(source.Env);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.RelatedRoles != null) {
            this.RelatedRoles = new WedaRole[source.RelatedRoles.length];
            for (int i = 0; i < source.RelatedRoles.length; i++) {
                this.RelatedRoles[i] = new WedaRole(source.RelatedRoles[i]);
            }
        }
        if (source.WechatUserId != null) {
            this.WechatUserId = new String(source.WechatUserId);
        }
        if (source.InternalUserType != null) {
            this.InternalUserType = new Long(source.InternalUserType);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.OrgName != null) {
            this.OrgName = new String(source.OrgName);
        }
        if (source.UserSchema != null) {
            this.UserSchema = new String(source.UserSchema);
        }
        if (source.UserExtend != null) {
            this.UserExtend = new String(source.UserExtend);
        }
        if (source.IsLicensed != null) {
            this.IsLicensed = new Boolean(source.IsLicensed);
        }
        if (source.RelatedRoleGroups != null) {
            this.RelatedRoleGroups = new RoleGroup[source.RelatedRoleGroups.length];
            for (int i = 0; i < source.RelatedRoleGroups.length; i++) {
                this.RelatedRoleGroups[i] = new RoleGroup(source.RelatedRoleGroups[i]);
            }
        }
        if (source.Orgs != null) {
            this.Orgs = new OrgResp[source.Orgs.length];
            for (int i = 0; i < source.Orgs.length; i++) {
                this.Orgs[i] = new OrgResp(source.Orgs[i]);
            }
        }
        if (source.MainOrg != null) {
            this.MainOrg = new OrgResp[source.MainOrg.length];
            for (int i = 0; i < source.MainOrg.length; i++) {
                this.MainOrg[i] = new OrgResp(source.MainOrg[i]);
            }
        }
        if (source.ParentUserId != null) {
            this.ParentUserId = new Long(source.ParentUserId);
        }
        if (source.PrimaryColumn != null) {
            this.PrimaryColumn = new String(source.PrimaryColumn);
        }
        if (source.AvatarUrl != null) {
            this.AvatarUrl = new String(source.AvatarUrl);
        }
        if (source.LastLoginTime != null) {
            this.LastLoginTime = new String(source.LastLoginTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamArrayObj(map, prefix + "RelatedRoles.", this.RelatedRoles);
        this.setParamSimple(map, prefix + "WechatUserId", this.WechatUserId);
        this.setParamSimple(map, prefix + "InternalUserType", this.InternalUserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OrgName", this.OrgName);
        this.setParamSimple(map, prefix + "UserSchema", this.UserSchema);
        this.setParamSimple(map, prefix + "UserExtend", this.UserExtend);
        this.setParamSimple(map, prefix + "IsLicensed", this.IsLicensed);
        this.setParamArrayObj(map, prefix + "RelatedRoleGroups.", this.RelatedRoleGroups);
        this.setParamArrayObj(map, prefix + "Orgs.", this.Orgs);
        this.setParamArrayObj(map, prefix + "MainOrg.", this.MainOrg);
        this.setParamSimple(map, prefix + "ParentUserId", this.ParentUserId);
        this.setParamSimple(map, prefix + "PrimaryColumn", this.PrimaryColumn);
        this.setParamSimple(map, prefix + "AvatarUrl", this.AvatarUrl);
        this.setParamSimple(map, prefix + "LastLoginTime", this.LastLoginTime);

    }
}

