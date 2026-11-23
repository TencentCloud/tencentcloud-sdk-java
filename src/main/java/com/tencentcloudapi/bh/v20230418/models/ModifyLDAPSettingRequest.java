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

public class ModifyLDAPSettingRequest extends AbstractModel {

    /**
    * <p>是否开启LDAP认证，false-不开启，true-开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>服务器地址</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>备用服务器地址</p>
    */
    @SerializedName("IpBackup")
    @Expose
    private String IpBackup;

    /**
    * <p>服务端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>是否开启SSL，false-不开启，true-开启</p>
    */
    @SerializedName("EnableSSL")
    @Expose
    private Boolean EnableSSL;

    /**
    * <p>Base DN</p>
    */
    @SerializedName("BaseDN")
    @Expose
    private String BaseDN;

    /**
    * <p>管理员账号</p>
    */
    @SerializedName("AdminAccount")
    @Expose
    private String AdminAccount;

    /**
    * <p>管理员密码</p>
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * <p>用户属性</p>
    */
    @SerializedName("AttributeUser")
    @Expose
    private String AttributeUser;

    /**
    * <p>用户名属性</p>
    */
    @SerializedName("AttributeUserName")
    @Expose
    private String AttributeUserName;

    /**
    * <p>自动同步，false-不开启，true-开启</p>
    */
    @SerializedName("AutoSync")
    @Expose
    private Boolean AutoSync;

    /**
    * <p>覆盖用户信息，false-不开启，true-开启</p>
    */
    @SerializedName("Overwrite")
    @Expose
    private Boolean Overwrite;

    /**
    * <p>同步周期，30～60000之间的整数</p>
    */
    @SerializedName("SyncPeriod")
    @Expose
    private Long SyncPeriod;

    /**
    * <p>是否同步全部，false-不开启，true-开启</p>
    */
    @SerializedName("SyncAll")
    @Expose
    private Boolean SyncAll;

    /**
    * <p>同步OU列表，SyncAll为false时必传</p>
    */
    @SerializedName("SyncUnitSet")
    @Expose
    private String [] SyncUnitSet;

    /**
    * <p>组织单元属性</p>
    */
    @SerializedName("AttributeUnit")
    @Expose
    private String AttributeUnit;

    /**
    * <p>用户姓名属性</p>
    */
    @SerializedName("AttributeRealName")
    @Expose
    private String AttributeRealName;

    /**
    * <p>手机号属性</p>
    */
    @SerializedName("AttributePhone")
    @Expose
    private String AttributePhone;

    /**
    * <p>邮箱属性</p>
    */
    @SerializedName("AttributeEmail")
    @Expose
    private String AttributeEmail;

    /**
    * <p>网络域Id</p>
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * <p>堡垒机实例ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get <p>是否开启LDAP认证，false-不开启，true-开启</p> 
     * @return Enable <p>是否开启LDAP认证，false-不开启，true-开启</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启LDAP认证，false-不开启，true-开启</p>
     * @param Enable <p>是否开启LDAP认证，false-不开启，true-开启</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>服务器地址</p> 
     * @return Ip <p>服务器地址</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>服务器地址</p>
     * @param Ip <p>服务器地址</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>备用服务器地址</p> 
     * @return IpBackup <p>备用服务器地址</p>
     */
    public String getIpBackup() {
        return this.IpBackup;
    }

    /**
     * Set <p>备用服务器地址</p>
     * @param IpBackup <p>备用服务器地址</p>
     */
    public void setIpBackup(String IpBackup) {
        this.IpBackup = IpBackup;
    }

    /**
     * Get <p>服务端口</p> 
     * @return Port <p>服务端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>服务端口</p>
     * @param Port <p>服务端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>是否开启SSL，false-不开启，true-开启</p> 
     * @return EnableSSL <p>是否开启SSL，false-不开启，true-开启</p>
     */
    public Boolean getEnableSSL() {
        return this.EnableSSL;
    }

    /**
     * Set <p>是否开启SSL，false-不开启，true-开启</p>
     * @param EnableSSL <p>是否开启SSL，false-不开启，true-开启</p>
     */
    public void setEnableSSL(Boolean EnableSSL) {
        this.EnableSSL = EnableSSL;
    }

    /**
     * Get <p>Base DN</p> 
     * @return BaseDN <p>Base DN</p>
     */
    public String getBaseDN() {
        return this.BaseDN;
    }

    /**
     * Set <p>Base DN</p>
     * @param BaseDN <p>Base DN</p>
     */
    public void setBaseDN(String BaseDN) {
        this.BaseDN = BaseDN;
    }

    /**
     * Get <p>管理员账号</p> 
     * @return AdminAccount <p>管理员账号</p>
     */
    public String getAdminAccount() {
        return this.AdminAccount;
    }

    /**
     * Set <p>管理员账号</p>
     * @param AdminAccount <p>管理员账号</p>
     */
    public void setAdminAccount(String AdminAccount) {
        this.AdminAccount = AdminAccount;
    }

    /**
     * Get <p>管理员密码</p> 
     * @return AdminPassword <p>管理员密码</p>
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set <p>管理员密码</p>
     * @param AdminPassword <p>管理员密码</p>
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get <p>用户属性</p> 
     * @return AttributeUser <p>用户属性</p>
     */
    public String getAttributeUser() {
        return this.AttributeUser;
    }

    /**
     * Set <p>用户属性</p>
     * @param AttributeUser <p>用户属性</p>
     */
    public void setAttributeUser(String AttributeUser) {
        this.AttributeUser = AttributeUser;
    }

    /**
     * Get <p>用户名属性</p> 
     * @return AttributeUserName <p>用户名属性</p>
     */
    public String getAttributeUserName() {
        return this.AttributeUserName;
    }

    /**
     * Set <p>用户名属性</p>
     * @param AttributeUserName <p>用户名属性</p>
     */
    public void setAttributeUserName(String AttributeUserName) {
        this.AttributeUserName = AttributeUserName;
    }

    /**
     * Get <p>自动同步，false-不开启，true-开启</p> 
     * @return AutoSync <p>自动同步，false-不开启，true-开启</p>
     */
    public Boolean getAutoSync() {
        return this.AutoSync;
    }

    /**
     * Set <p>自动同步，false-不开启，true-开启</p>
     * @param AutoSync <p>自动同步，false-不开启，true-开启</p>
     */
    public void setAutoSync(Boolean AutoSync) {
        this.AutoSync = AutoSync;
    }

    /**
     * Get <p>覆盖用户信息，false-不开启，true-开启</p> 
     * @return Overwrite <p>覆盖用户信息，false-不开启，true-开启</p>
     */
    public Boolean getOverwrite() {
        return this.Overwrite;
    }

    /**
     * Set <p>覆盖用户信息，false-不开启，true-开启</p>
     * @param Overwrite <p>覆盖用户信息，false-不开启，true-开启</p>
     */
    public void setOverwrite(Boolean Overwrite) {
        this.Overwrite = Overwrite;
    }

    /**
     * Get <p>同步周期，30～60000之间的整数</p> 
     * @return SyncPeriod <p>同步周期，30～60000之间的整数</p>
     */
    public Long getSyncPeriod() {
        return this.SyncPeriod;
    }

    /**
     * Set <p>同步周期，30～60000之间的整数</p>
     * @param SyncPeriod <p>同步周期，30～60000之间的整数</p>
     */
    public void setSyncPeriod(Long SyncPeriod) {
        this.SyncPeriod = SyncPeriod;
    }

    /**
     * Get <p>是否同步全部，false-不开启，true-开启</p> 
     * @return SyncAll <p>是否同步全部，false-不开启，true-开启</p>
     */
    public Boolean getSyncAll() {
        return this.SyncAll;
    }

    /**
     * Set <p>是否同步全部，false-不开启，true-开启</p>
     * @param SyncAll <p>是否同步全部，false-不开启，true-开启</p>
     */
    public void setSyncAll(Boolean SyncAll) {
        this.SyncAll = SyncAll;
    }

    /**
     * Get <p>同步OU列表，SyncAll为false时必传</p> 
     * @return SyncUnitSet <p>同步OU列表，SyncAll为false时必传</p>
     */
    public String [] getSyncUnitSet() {
        return this.SyncUnitSet;
    }

    /**
     * Set <p>同步OU列表，SyncAll为false时必传</p>
     * @param SyncUnitSet <p>同步OU列表，SyncAll为false时必传</p>
     */
    public void setSyncUnitSet(String [] SyncUnitSet) {
        this.SyncUnitSet = SyncUnitSet;
    }

    /**
     * Get <p>组织单元属性</p> 
     * @return AttributeUnit <p>组织单元属性</p>
     */
    public String getAttributeUnit() {
        return this.AttributeUnit;
    }

    /**
     * Set <p>组织单元属性</p>
     * @param AttributeUnit <p>组织单元属性</p>
     */
    public void setAttributeUnit(String AttributeUnit) {
        this.AttributeUnit = AttributeUnit;
    }

    /**
     * Get <p>用户姓名属性</p> 
     * @return AttributeRealName <p>用户姓名属性</p>
     */
    public String getAttributeRealName() {
        return this.AttributeRealName;
    }

    /**
     * Set <p>用户姓名属性</p>
     * @param AttributeRealName <p>用户姓名属性</p>
     */
    public void setAttributeRealName(String AttributeRealName) {
        this.AttributeRealName = AttributeRealName;
    }

    /**
     * Get <p>手机号属性</p> 
     * @return AttributePhone <p>手机号属性</p>
     */
    public String getAttributePhone() {
        return this.AttributePhone;
    }

    /**
     * Set <p>手机号属性</p>
     * @param AttributePhone <p>手机号属性</p>
     */
    public void setAttributePhone(String AttributePhone) {
        this.AttributePhone = AttributePhone;
    }

    /**
     * Get <p>邮箱属性</p> 
     * @return AttributeEmail <p>邮箱属性</p>
     */
    public String getAttributeEmail() {
        return this.AttributeEmail;
    }

    /**
     * Set <p>邮箱属性</p>
     * @param AttributeEmail <p>邮箱属性</p>
     */
    public void setAttributeEmail(String AttributeEmail) {
        this.AttributeEmail = AttributeEmail;
    }

    /**
     * Get <p>网络域Id</p> 
     * @return DomainId <p>网络域Id</p>
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>网络域Id</p>
     * @param DomainId <p>网络域Id</p>
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>堡垒机实例ID</p> 
     * @return ResourceId <p>堡垒机实例ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>堡垒机实例ID</p>
     * @param ResourceId <p>堡垒机实例ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public ModifyLDAPSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLDAPSettingRequest(ModifyLDAPSettingRequest source) {
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
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
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
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
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
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
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
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

