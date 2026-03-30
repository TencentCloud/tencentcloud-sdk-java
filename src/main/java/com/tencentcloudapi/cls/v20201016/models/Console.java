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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Console extends AbstractModel {

    /**
    * <p>DataSight控制台Id</p>
    */
    @SerializedName("ConsoleId")
    @Expose
    private String ConsoleId;

    /**
    * <p>访问方式：public-公网，internal-内网</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String [] AccessMode;

    /**
    * <p>登录方式：0-账号密码鉴权，1-匿名登录，2-第三方认证登录</p>
    */
    @SerializedName("LoginMode")
    @Expose
    private Long LoginMode;

    /**
    * <p>自定义域名前缀</p>
    */
    @SerializedName("DomainPrefix")
    @Expose
    private String DomainPrefix;

    /**
    * <p>用户账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Accounts")
    @Expose
    private ConsoleAccount [] Accounts;

    /**
    * <p>内网类型，默认为0</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntranetType")
    @Expose
    private Long IntranetType;

    /**
    * <p>内网地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntranetRegion")
    @Expose
    private String IntranetRegion;

    /**
    * <p>内网私有网络VpcId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>内网子网SubnetId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>匿名登录账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnonymousLogin")
    @Expose
    private AnonymousLoginInfo AnonymousLogin;

    /**
    * <p>auth用户角色信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthRoles")
    @Expose
    private AuthRoleInfo [] AuthRoles;

    /**
    * <p>绑定的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>自定义隐藏参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HideParams")
    @Expose
    private String [] HideParams;

    /**
    * <p>访问控制规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessControlRules")
    @Expose
    private AccessControlRule [] AccessControlRules;

    /**
    * <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * <p>自定义显示菜单</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Menus")
    @Expose
    private String [] Menus;

    /**
     * Get <p>DataSight控制台Id</p> 
     * @return ConsoleId <p>DataSight控制台Id</p>
     */
    public String getConsoleId() {
        return this.ConsoleId;
    }

    /**
     * Set <p>DataSight控制台Id</p>
     * @param ConsoleId <p>DataSight控制台Id</p>
     */
    public void setConsoleId(String ConsoleId) {
        this.ConsoleId = ConsoleId;
    }

    /**
     * Get <p>访问方式：public-公网，internal-内网</p> 
     * @return AccessMode <p>访问方式：public-公网，internal-内网</p>
     */
    public String [] getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>访问方式：public-公网，internal-内网</p>
     * @param AccessMode <p>访问方式：public-公网，internal-内网</p>
     */
    public void setAccessMode(String [] AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>登录方式：0-账号密码鉴权，1-匿名登录，2-第三方认证登录</p> 
     * @return LoginMode <p>登录方式：0-账号密码鉴权，1-匿名登录，2-第三方认证登录</p>
     */
    public Long getLoginMode() {
        return this.LoginMode;
    }

    /**
     * Set <p>登录方式：0-账号密码鉴权，1-匿名登录，2-第三方认证登录</p>
     * @param LoginMode <p>登录方式：0-账号密码鉴权，1-匿名登录，2-第三方认证登录</p>
     */
    public void setLoginMode(Long LoginMode) {
        this.LoginMode = LoginMode;
    }

    /**
     * Get <p>自定义域名前缀</p> 
     * @return DomainPrefix <p>自定义域名前缀</p>
     */
    public String getDomainPrefix() {
        return this.DomainPrefix;
    }

    /**
     * Set <p>自定义域名前缀</p>
     * @param DomainPrefix <p>自定义域名前缀</p>
     */
    public void setDomainPrefix(String DomainPrefix) {
        this.DomainPrefix = DomainPrefix;
    }

    /**
     * Get <p>用户账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Accounts <p>用户账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsoleAccount [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set <p>用户账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Accounts <p>用户账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccounts(ConsoleAccount [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get <p>内网类型，默认为0</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntranetType <p>内网类型，默认为0</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntranetType() {
        return this.IntranetType;
    }

    /**
     * Set <p>内网类型，默认为0</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntranetType <p>内网类型，默认为0</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntranetType(Long IntranetType) {
        this.IntranetType = IntranetType;
    }

    /**
     * Get <p>内网地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntranetRegion <p>内网地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntranetRegion() {
        return this.IntranetRegion;
    }

    /**
     * Set <p>内网地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntranetRegion <p>内网地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntranetRegion(String IntranetRegion) {
        this.IntranetRegion = IntranetRegion;
    }

    /**
     * Get <p>内网私有网络VpcId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>内网私有网络VpcId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>内网私有网络VpcId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>内网私有网络VpcId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>内网子网SubnetId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId <p>内网子网SubnetId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>内网子网SubnetId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId <p>内网子网SubnetId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>匿名登录账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnonymousLogin <p>匿名登录账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnonymousLoginInfo getAnonymousLogin() {
        return this.AnonymousLogin;
    }

    /**
     * Set <p>匿名登录账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnonymousLogin <p>匿名登录账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnonymousLogin(AnonymousLoginInfo AnonymousLogin) {
        this.AnonymousLogin = AnonymousLogin;
    }

    /**
     * Get <p>auth用户角色信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthRoles <p>auth用户角色信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthRoleInfo [] getAuthRoles() {
        return this.AuthRoles;
    }

    /**
     * Set <p>auth用户角色信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthRoles <p>auth用户角色信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthRoles(AuthRoleInfo [] AuthRoles) {
        this.AuthRoles = AuthRoles;
    }

    /**
     * Get <p>绑定的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>绑定的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>绑定的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>绑定的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>自定义隐藏参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HideParams <p>自定义隐藏参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHideParams() {
        return this.HideParams;
    }

    /**
     * Set <p>自定义隐藏参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HideParams <p>自定义隐藏参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHideParams(String [] HideParams) {
        this.HideParams = HideParams;
    }

    /**
     * Get <p>访问控制规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessControlRules <p>访问控制规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessControlRule [] getAccessControlRules() {
        return this.AccessControlRules;
    }

    /**
     * Set <p>访问控制规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessControlRules <p>访问控制规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessControlRules(AccessControlRule [] AccessControlRules) {
        this.AccessControlRules = AccessControlRules;
    }

    /**
     * Get <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remarks <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remarks <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get <p>自定义显示菜单</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Menus <p>自定义显示菜单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMenus() {
        return this.Menus;
    }

    /**
     * Set <p>自定义显示菜单</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Menus <p>自定义显示菜单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenus(String [] Menus) {
        this.Menus = Menus;
    }

    public Console() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Console(Console source) {
        if (source.ConsoleId != null) {
            this.ConsoleId = new String(source.ConsoleId);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String[source.AccessMode.length];
            for (int i = 0; i < source.AccessMode.length; i++) {
                this.AccessMode[i] = new String(source.AccessMode[i]);
            }
        }
        if (source.LoginMode != null) {
            this.LoginMode = new Long(source.LoginMode);
        }
        if (source.DomainPrefix != null) {
            this.DomainPrefix = new String(source.DomainPrefix);
        }
        if (source.Accounts != null) {
            this.Accounts = new ConsoleAccount[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new ConsoleAccount(source.Accounts[i]);
            }
        }
        if (source.IntranetType != null) {
            this.IntranetType = new Long(source.IntranetType);
        }
        if (source.IntranetRegion != null) {
            this.IntranetRegion = new String(source.IntranetRegion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AnonymousLogin != null) {
            this.AnonymousLogin = new AnonymousLoginInfo(source.AnonymousLogin);
        }
        if (source.AuthRoles != null) {
            this.AuthRoles = new AuthRoleInfo[source.AuthRoles.length];
            for (int i = 0; i < source.AuthRoles.length; i++) {
                this.AuthRoles[i] = new AuthRoleInfo(source.AuthRoles[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HideParams != null) {
            this.HideParams = new String[source.HideParams.length];
            for (int i = 0; i < source.HideParams.length; i++) {
                this.HideParams[i] = new String(source.HideParams[i]);
            }
        }
        if (source.AccessControlRules != null) {
            this.AccessControlRules = new AccessControlRule[source.AccessControlRules.length];
            for (int i = 0; i < source.AccessControlRules.length; i++) {
                this.AccessControlRules[i] = new AccessControlRule(source.AccessControlRules[i]);
            }
        }
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
        if (source.Menus != null) {
            this.Menus = new String[source.Menus.length];
            for (int i = 0; i < source.Menus.length; i++) {
                this.Menus[i] = new String(source.Menus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsoleId", this.ConsoleId);
        this.setParamArraySimple(map, prefix + "AccessMode.", this.AccessMode);
        this.setParamSimple(map, prefix + "LoginMode", this.LoginMode);
        this.setParamSimple(map, prefix + "DomainPrefix", this.DomainPrefix);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "IntranetType", this.IntranetType);
        this.setParamSimple(map, prefix + "IntranetRegion", this.IntranetRegion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamObj(map, prefix + "AnonymousLogin.", this.AnonymousLogin);
        this.setParamArrayObj(map, prefix + "AuthRoles.", this.AuthRoles);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "HideParams.", this.HideParams);
        this.setParamArrayObj(map, prefix + "AccessControlRules.", this.AccessControlRules);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamArraySimple(map, prefix + "Menus.", this.Menus);

    }
}

