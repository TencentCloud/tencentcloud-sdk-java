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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessDevicesRequest extends AbstractModel {

    /**
    * 资产的登录账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 运维端登录账号
    */
    @SerializedName("LoginAccount")
    @Expose
    private String LoginAccount;

    /**
    * 运维端登录密码
    */
    @SerializedName("LoginPassword")
    @Expose
    private String LoginPassword;

    /**
    * 资产ID
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * 资源id(优先使用DeviceId)
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 未托管密码私钥时，填入
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 未托管密码私钥时，填入
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 未托管密码私钥时，填入
    */
    @SerializedName("PrivateKeyPassword")
    @Expose
    private String PrivateKeyPassword;

    /**
    * 客户端工具
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * RDP挂载盘符驱动（mstsc支持）
    */
    @SerializedName("Drivers")
    @Expose
    private String [] Drivers;

    /**
    * 窗口宽度（RDP支持）
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 窗口高度（RDP支持）
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 是否内网访问（默认不是）
    */
    @SerializedName("IntranetAccess")
    @Expose
    private Boolean IntranetAccess;

    /**
    * 是否自动管理访问串，删掉过期的，新建可用的（默认false）
    */
    @SerializedName("AutoManageAccessCredential")
    @Expose
    private Boolean AutoManageAccessCredential;

    /**
     * Get 资产的登录账号 
     * @return Account 资产的登录账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 资产的登录账号
     * @param Account 资产的登录账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 运维端登录账号 
     * @return LoginAccount 运维端登录账号
     * @deprecated
     */
    @Deprecated
    public String getLoginAccount() {
        return this.LoginAccount;
    }

    /**
     * Set 运维端登录账号
     * @param LoginAccount 运维端登录账号
     * @deprecated
     */
    @Deprecated
    public void setLoginAccount(String LoginAccount) {
        this.LoginAccount = LoginAccount;
    }

    /**
     * Get 运维端登录密码 
     * @return LoginPassword 运维端登录密码
     * @deprecated
     */
    @Deprecated
    public String getLoginPassword() {
        return this.LoginPassword;
    }

    /**
     * Set 运维端登录密码
     * @param LoginPassword 运维端登录密码
     * @deprecated
     */
    @Deprecated
    public void setLoginPassword(String LoginPassword) {
        this.LoginPassword = LoginPassword;
    }

    /**
     * Get 资产ID 
     * @return DeviceId 资产ID
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 资产ID
     * @param DeviceId 资产ID
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 资源id(优先使用DeviceId) 
     * @return InstanceId 资源id(优先使用DeviceId)
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源id(优先使用DeviceId)
     * @param InstanceId 资源id(优先使用DeviceId)
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 未托管密码私钥时，填入 
     * @return Password 未托管密码私钥时，填入
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 未托管密码私钥时，填入
     * @param Password 未托管密码私钥时，填入
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 未托管密码私钥时，填入 
     * @return PrivateKey 未托管密码私钥时，填入
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 未托管密码私钥时，填入
     * @param PrivateKey 未托管密码私钥时，填入
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 未托管密码私钥时，填入 
     * @return PrivateKeyPassword 未托管密码私钥时，填入
     */
    public String getPrivateKeyPassword() {
        return this.PrivateKeyPassword;
    }

    /**
     * Set 未托管密码私钥时，填入
     * @param PrivateKeyPassword 未托管密码私钥时，填入
     */
    public void setPrivateKeyPassword(String PrivateKeyPassword) {
        this.PrivateKeyPassword = PrivateKeyPassword;
    }

    /**
     * Get 客户端工具 
     * @return Exe 客户端工具
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set 客户端工具
     * @param Exe 客户端工具
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get RDP挂载盘符驱动（mstsc支持） 
     * @return Drivers RDP挂载盘符驱动（mstsc支持）
     */
    public String [] getDrivers() {
        return this.Drivers;
    }

    /**
     * Set RDP挂载盘符驱动（mstsc支持）
     * @param Drivers RDP挂载盘符驱动（mstsc支持）
     */
    public void setDrivers(String [] Drivers) {
        this.Drivers = Drivers;
    }

    /**
     * Get 窗口宽度（RDP支持） 
     * @return Width 窗口宽度（RDP支持）
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 窗口宽度（RDP支持）
     * @param Width 窗口宽度（RDP支持）
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 窗口高度（RDP支持） 
     * @return Height 窗口高度（RDP支持）
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 窗口高度（RDP支持）
     * @param Height 窗口高度（RDP支持）
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 是否内网访问（默认不是） 
     * @return IntranetAccess 是否内网访问（默认不是）
     */
    public Boolean getIntranetAccess() {
        return this.IntranetAccess;
    }

    /**
     * Set 是否内网访问（默认不是）
     * @param IntranetAccess 是否内网访问（默认不是）
     */
    public void setIntranetAccess(Boolean IntranetAccess) {
        this.IntranetAccess = IntranetAccess;
    }

    /**
     * Get 是否自动管理访问串，删掉过期的，新建可用的（默认false） 
     * @return AutoManageAccessCredential 是否自动管理访问串，删掉过期的，新建可用的（默认false）
     */
    public Boolean getAutoManageAccessCredential() {
        return this.AutoManageAccessCredential;
    }

    /**
     * Set 是否自动管理访问串，删掉过期的，新建可用的（默认false）
     * @param AutoManageAccessCredential 是否自动管理访问串，删掉过期的，新建可用的（默认false）
     */
    public void setAutoManageAccessCredential(Boolean AutoManageAccessCredential) {
        this.AutoManageAccessCredential = AutoManageAccessCredential;
    }

    public AccessDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessDevicesRequest(AccessDevicesRequest source) {
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.LoginAccount != null) {
            this.LoginAccount = new String(source.LoginAccount);
        }
        if (source.LoginPassword != null) {
            this.LoginPassword = new String(source.LoginPassword);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new Long(source.DeviceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.PrivateKeyPassword != null) {
            this.PrivateKeyPassword = new String(source.PrivateKeyPassword);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Drivers != null) {
            this.Drivers = new String[source.Drivers.length];
            for (int i = 0; i < source.Drivers.length; i++) {
                this.Drivers[i] = new String(source.Drivers[i]);
            }
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.IntranetAccess != null) {
            this.IntranetAccess = new Boolean(source.IntranetAccess);
        }
        if (source.AutoManageAccessCredential != null) {
            this.AutoManageAccessCredential = new Boolean(source.AutoManageAccessCredential);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "LoginAccount", this.LoginAccount);
        this.setParamSimple(map, prefix + "LoginPassword", this.LoginPassword);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "PrivateKeyPassword", this.PrivateKeyPassword);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamArraySimple(map, prefix + "Drivers.", this.Drivers);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "IntranetAccess", this.IntranetAccess);
        this.setParamSimple(map, prefix + "AutoManageAccessCredential", this.AutoManageAccessCredential);

    }
}

