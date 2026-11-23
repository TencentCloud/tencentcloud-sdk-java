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

public class CheckLDAPConnectionRequest extends AbstractModel {

    /**
    * <p>是否开启LDAP认证，必须为true</p>
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
    * <p>备用服务器地址</p>
    */
    @SerializedName("IpBackup")
    @Expose
    private String IpBackup;

    /**
    * <p>网络域id</p>
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * <p>用户名称映射属性</p>
    */
    @SerializedName("AttributeUserName")
    @Expose
    private String AttributeUserName;

    /**
    * <p>堡垒机实例ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get <p>是否开启LDAP认证，必须为true</p> 
     * @return Enable <p>是否开启LDAP认证，必须为true</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启LDAP认证，必须为true</p>
     * @param Enable <p>是否开启LDAP认证，必须为true</p>
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
     * Get <p>网络域id</p> 
     * @return DomainId <p>网络域id</p>
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>网络域id</p>
     * @param DomainId <p>网络域id</p>
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>用户名称映射属性</p> 
     * @return AttributeUserName <p>用户名称映射属性</p>
     */
    public String getAttributeUserName() {
        return this.AttributeUserName;
    }

    /**
     * Set <p>用户名称映射属性</p>
     * @param AttributeUserName <p>用户名称映射属性</p>
     */
    public void setAttributeUserName(String AttributeUserName) {
        this.AttributeUserName = AttributeUserName;
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

    public CheckLDAPConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckLDAPConnectionRequest(CheckLDAPConnectionRequest source) {
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
        if (source.IpBackup != null) {
            this.IpBackup = new String(source.IpBackup);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.AttributeUserName != null) {
            this.AttributeUserName = new String(source.AttributeUserName);
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
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "EnableSSL", this.EnableSSL);
        this.setParamSimple(map, prefix + "BaseDN", this.BaseDN);
        this.setParamSimple(map, prefix + "AdminAccount", this.AdminAccount);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "IpBackup", this.IpBackup);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "AttributeUserName", this.AttributeUserName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

