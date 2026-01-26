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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LDAPSetting extends AbstractModel {

    /**
    * 是否开启LDAP认证，false-不开启，true-开启
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 服务器地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 备用服务器地址
    */
    @SerializedName("IpBackup")
    @Expose
    private String IpBackup;

    /**
    * 服务端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 是否开启SSL，false-不开启，true-开启
    */
    @SerializedName("EnableSSL")
    @Expose
    private Boolean EnableSSL;

    /**
    * Base DN
    */
    @SerializedName("BaseDN")
    @Expose
    private String BaseDN;

    /**
    * 管理员账号
    */
    @SerializedName("AdminAccount")
    @Expose
    private String AdminAccount;

    /**
    * 用户属性
    */
    @SerializedName("AttributeUser")
    @Expose
    private String AttributeUser;

    /**
    * 用户名属性
    */
    @SerializedName("AttributeUserName")
    @Expose
    private String AttributeUserName;

    /**
    * 自动同步，false-不开启，true-开启
    */
    @SerializedName("AutoSync")
    @Expose
    private Boolean AutoSync;

    /**
    * 覆盖用户信息，false-不开启，true-开启
    */
    @SerializedName("Overwrite")
    @Expose
    private Boolean Overwrite;

    /**
    * 同步周期，30～60000之间的整数
    */
    @SerializedName("SyncPeriod")
    @Expose
    private Long SyncPeriod;

    /**
    * 是否同步全部，false-不开启，true-开启
    */
    @SerializedName("SyncAll")
    @Expose
    private Boolean SyncAll;

    /**
    * 同步OU列表
    */
    @SerializedName("SyncUnitSet")
    @Expose
    private String [] SyncUnitSet;

    /**
    * 组织单元属性
    */
    @SerializedName("AttributeUnit")
    @Expose
    private String AttributeUnit;

    /**
    * 用户姓名属性
    */
    @SerializedName("AttributeRealName")
    @Expose
    private String AttributeRealName;

    /**
    * 手机号属性
    */
    @SerializedName("AttributePhone")
    @Expose
    private String AttributePhone;

    /**
    * 邮箱属性
    */
    @SerializedName("AttributeEmail")
    @Expose
    private String AttributeEmail;

    /**
    * 请求LDAP服务的堡垒机实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 网络域Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
     * Get 是否开启LDAP认证，false-不开启，true-开启 
     * @return Enable 是否开启LDAP认证，false-不开启，true-开启
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启LDAP认证，false-不开启，true-开启
     * @param Enable 是否开启LDAP认证，false-不开启，true-开启
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 服务器地址 
     * @return Ip 服务器地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 服务器地址
     * @param Ip 服务器地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 备用服务器地址 
     * @return IpBackup 备用服务器地址
     */
    public String getIpBackup() {
        return this.IpBackup;
    }

    /**
     * Set 备用服务器地址
     * @param IpBackup 备用服务器地址
     */
    public void setIpBackup(String IpBackup) {
        this.IpBackup = IpBackup;
    }

    /**
     * Get 服务端口 
     * @return Port 服务端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 服务端口
     * @param Port 服务端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 是否开启SSL，false-不开启，true-开启 
     * @return EnableSSL 是否开启SSL，false-不开启，true-开启
     */
    public Boolean getEnableSSL() {
        return this.EnableSSL;
    }

    /**
     * Set 是否开启SSL，false-不开启，true-开启
     * @param EnableSSL 是否开启SSL，false-不开启，true-开启
     */
    public void setEnableSSL(Boolean EnableSSL) {
        this.EnableSSL = EnableSSL;
    }

    /**
     * Get Base DN 
     * @return BaseDN Base DN
     */
    public String getBaseDN() {
        return this.BaseDN;
    }

    /**
     * Set Base DN
     * @param BaseDN Base DN
     */
    public void setBaseDN(String BaseDN) {
        this.BaseDN = BaseDN;
    }

    /**
     * Get 管理员账号 
     * @return AdminAccount 管理员账号
     */
    public String getAdminAccount() {
        return this.AdminAccount;
    }

    /**
     * Set 管理员账号
     * @param AdminAccount 管理员账号
     */
    public void setAdminAccount(String AdminAccount) {
        this.AdminAccount = AdminAccount;
    }

    /**
     * Get 用户属性 
     * @return AttributeUser 用户属性
     */
    public String getAttributeUser() {
        return this.AttributeUser;
    }

    /**
     * Set 用户属性
     * @param AttributeUser 用户属性
     */
    public void setAttributeUser(String AttributeUser) {
        this.AttributeUser = AttributeUser;
    }

    /**
     * Get 用户名属性 
     * @return AttributeUserName 用户名属性
     */
    public String getAttributeUserName() {
        return this.AttributeUserName;
    }

    /**
     * Set 用户名属性
     * @param AttributeUserName 用户名属性
     */
    public void setAttributeUserName(String AttributeUserName) {
        this.AttributeUserName = AttributeUserName;
    }

    /**
     * Get 自动同步，false-不开启，true-开启 
     * @return AutoSync 自动同步，false-不开启，true-开启
     */
    public Boolean getAutoSync() {
        return this.AutoSync;
    }

    /**
     * Set 自动同步，false-不开启，true-开启
     * @param AutoSync 自动同步，false-不开启，true-开启
     */
    public void setAutoSync(Boolean AutoSync) {
        this.AutoSync = AutoSync;
    }

    /**
     * Get 覆盖用户信息，false-不开启，true-开启 
     * @return Overwrite 覆盖用户信息，false-不开启，true-开启
     */
    public Boolean getOverwrite() {
        return this.Overwrite;
    }

    /**
     * Set 覆盖用户信息，false-不开启，true-开启
     * @param Overwrite 覆盖用户信息，false-不开启，true-开启
     */
    public void setOverwrite(Boolean Overwrite) {
        this.Overwrite = Overwrite;
    }

    /**
     * Get 同步周期，30～60000之间的整数 
     * @return SyncPeriod 同步周期，30～60000之间的整数
     */
    public Long getSyncPeriod() {
        return this.SyncPeriod;
    }

    /**
     * Set 同步周期，30～60000之间的整数
     * @param SyncPeriod 同步周期，30～60000之间的整数
     */
    public void setSyncPeriod(Long SyncPeriod) {
        this.SyncPeriod = SyncPeriod;
    }

    /**
     * Get 是否同步全部，false-不开启，true-开启 
     * @return SyncAll 是否同步全部，false-不开启，true-开启
     */
    public Boolean getSyncAll() {
        return this.SyncAll;
    }

    /**
     * Set 是否同步全部，false-不开启，true-开启
     * @param SyncAll 是否同步全部，false-不开启，true-开启
     */
    public void setSyncAll(Boolean SyncAll) {
        this.SyncAll = SyncAll;
    }

    /**
     * Get 同步OU列表 
     * @return SyncUnitSet 同步OU列表
     */
    public String [] getSyncUnitSet() {
        return this.SyncUnitSet;
    }

    /**
     * Set 同步OU列表
     * @param SyncUnitSet 同步OU列表
     */
    public void setSyncUnitSet(String [] SyncUnitSet) {
        this.SyncUnitSet = SyncUnitSet;
    }

    /**
     * Get 组织单元属性 
     * @return AttributeUnit 组织单元属性
     */
    public String getAttributeUnit() {
        return this.AttributeUnit;
    }

    /**
     * Set 组织单元属性
     * @param AttributeUnit 组织单元属性
     */
    public void setAttributeUnit(String AttributeUnit) {
        this.AttributeUnit = AttributeUnit;
    }

    /**
     * Get 用户姓名属性 
     * @return AttributeRealName 用户姓名属性
     */
    public String getAttributeRealName() {
        return this.AttributeRealName;
    }

    /**
     * Set 用户姓名属性
     * @param AttributeRealName 用户姓名属性
     */
    public void setAttributeRealName(String AttributeRealName) {
        this.AttributeRealName = AttributeRealName;
    }

    /**
     * Get 手机号属性 
     * @return AttributePhone 手机号属性
     */
    public String getAttributePhone() {
        return this.AttributePhone;
    }

    /**
     * Set 手机号属性
     * @param AttributePhone 手机号属性
     */
    public void setAttributePhone(String AttributePhone) {
        this.AttributePhone = AttributePhone;
    }

    /**
     * Get 邮箱属性 
     * @return AttributeEmail 邮箱属性
     */
    public String getAttributeEmail() {
        return this.AttributeEmail;
    }

    /**
     * Set 邮箱属性
     * @param AttributeEmail 邮箱属性
     */
    public void setAttributeEmail(String AttributeEmail) {
        this.AttributeEmail = AttributeEmail;
    }

    /**
     * Get 请求LDAP服务的堡垒机实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 请求LDAP服务的堡垒机实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 请求LDAP服务的堡垒机实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 请求LDAP服务的堡垒机实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 网络域Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainId 网络域Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 网络域Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainId 网络域Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    public LDAPSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LDAPSetting(LDAPSetting source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.IpBackup != null) {
            this.IpBackup = new String(source.IpBackup);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.EnableSSL != null) {
            this.EnableSSL = new Boolean(source.EnableSSL);
        }
        if (source.BaseDN != null) {
            this.BaseDN = new String(source.BaseDN);
        }
        if (source.AdminAccount != null) {
            this.AdminAccount = new String(source.AdminAccount);
        }
        if (source.AttributeUser != null) {
            this.AttributeUser = new String(source.AttributeUser);
        }
        if (source.AttributeUserName != null) {
            this.AttributeUserName = new String(source.AttributeUserName);
        }
        if (source.AutoSync != null) {
            this.AutoSync = new Boolean(source.AutoSync);
        }
        if (source.Overwrite != null) {
            this.Overwrite = new Boolean(source.Overwrite);
        }
        if (source.SyncPeriod != null) {
            this.SyncPeriod = new Long(source.SyncPeriod);
        }
        if (source.SyncAll != null) {
            this.SyncAll = new Boolean(source.SyncAll);
        }
        if (source.SyncUnitSet != null) {
            this.SyncUnitSet = new String[source.SyncUnitSet.length];
            for (int i = 0; i < source.SyncUnitSet.length; i++) {
                this.SyncUnitSet[i] = new String(source.SyncUnitSet[i]);
            }
        }
        if (source.AttributeUnit != null) {
            this.AttributeUnit = new String(source.AttributeUnit);
        }
        if (source.AttributeRealName != null) {
            this.AttributeRealName = new String(source.AttributeRealName);
        }
        if (source.AttributePhone != null) {
            this.AttributePhone = new String(source.AttributePhone);
        }
        if (source.AttributeEmail != null) {
            this.AttributeEmail = new String(source.AttributeEmail);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "IpBackup", this.IpBackup);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "EnableSSL", this.EnableSSL);
        this.setParamSimple(map, prefix + "BaseDN", this.BaseDN);
        this.setParamSimple(map, prefix + "AdminAccount", this.AdminAccount);
        this.setParamSimple(map, prefix + "AttributeUser", this.AttributeUser);
        this.setParamSimple(map, prefix + "AttributeUserName", this.AttributeUserName);
        this.setParamSimple(map, prefix + "AutoSync", this.AutoSync);
        this.setParamSimple(map, prefix + "Overwrite", this.Overwrite);
        this.setParamSimple(map, prefix + "SyncPeriod", this.SyncPeriod);
        this.setParamSimple(map, prefix + "SyncAll", this.SyncAll);
        this.setParamArraySimple(map, prefix + "SyncUnitSet.", this.SyncUnitSet);
        this.setParamSimple(map, prefix + "AttributeUnit", this.AttributeUnit);
        this.setParamSimple(map, prefix + "AttributeRealName", this.AttributeRealName);
        this.setParamSimple(map, prefix + "AttributePhone", this.AttributePhone);
        this.setParamSimple(map, prefix + "AttributeEmail", this.AttributeEmail);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

