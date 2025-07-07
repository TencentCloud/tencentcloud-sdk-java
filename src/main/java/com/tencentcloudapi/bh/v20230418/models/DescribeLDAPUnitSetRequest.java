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

public class DescribeLDAPUnitSetRequest extends AbstractModel {

    /**
    * 是否开启LDAP认证，true-开启
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
    * 管理员密码
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * 用户名映射属性
    */
    @SerializedName("AttributeUserName")
    @Expose
    private String AttributeUserName;

    /**
    * 部门过滤
    */
    @SerializedName("AttributeUnit")
    @Expose
    private String AttributeUnit;

    /**
    * 备用服务器地址
    */
    @SerializedName("IpBackup")
    @Expose
    private String IpBackup;

    /**
    * 网络域Id
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
     * Get 是否开启LDAP认证，true-开启 
     * @return Enable 是否开启LDAP认证，true-开启
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启LDAP认证，true-开启
     * @param Enable 是否开启LDAP认证，true-开启
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
     * Get 管理员密码 
     * @return AdminPassword 管理员密码
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set 管理员密码
     * @param AdminPassword 管理员密码
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get 用户名映射属性 
     * @return AttributeUserName 用户名映射属性
     */
    public String getAttributeUserName() {
        return this.AttributeUserName;
    }

    /**
     * Set 用户名映射属性
     * @param AttributeUserName 用户名映射属性
     */
    public void setAttributeUserName(String AttributeUserName) {
        this.AttributeUserName = AttributeUserName;
    }

    /**
     * Get 部门过滤 
     * @return AttributeUnit 部门过滤
     */
    public String getAttributeUnit() {
        return this.AttributeUnit;
    }

    /**
     * Set 部门过滤
     * @param AttributeUnit 部门过滤
     */
    public void setAttributeUnit(String AttributeUnit) {
        this.AttributeUnit = AttributeUnit;
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
     * Get 网络域Id 
     * @return DomainId 网络域Id
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 网络域Id
     * @param DomainId 网络域Id
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    public DescribeLDAPUnitSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLDAPUnitSetRequest(DescribeLDAPUnitSetRequest source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
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
        if (source.AttributeUserName != null) {
            this.AttributeUserName = new String(source.AttributeUserName);
        }
        if (source.AttributeUnit != null) {
            this.AttributeUnit = new String(source.AttributeUnit);
        }
        if (source.IpBackup != null) {
            this.IpBackup = new String(source.IpBackup);
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
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "EnableSSL", this.EnableSSL);
        this.setParamSimple(map, prefix + "BaseDN", this.BaseDN);
        this.setParamSimple(map, prefix + "AdminAccount", this.AdminAccount);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "AttributeUserName", this.AttributeUserName);
        this.setParamSimple(map, prefix + "AttributeUnit", this.AttributeUnit);
        this.setParamSimple(map, prefix + "IpBackup", this.IpBackup);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

