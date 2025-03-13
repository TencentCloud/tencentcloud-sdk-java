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
    * 资源id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 账号
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
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 私钥
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 私钥密码
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
     * Get 资源id 
     * @return InstanceId 资源id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源id
     * @param InstanceId 资源id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 账号 
     * @return Account 账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
     * @param Account 账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 运维端登录账号 
     * @return LoginAccount 运维端登录账号
     */
    public String getLoginAccount() {
        return this.LoginAccount;
    }

    /**
     * Set 运维端登录账号
     * @param LoginAccount 运维端登录账号
     */
    public void setLoginAccount(String LoginAccount) {
        this.LoginAccount = LoginAccount;
    }

    /**
     * Get 运维端登录密码 
     * @return LoginPassword 运维端登录密码
     */
    public String getLoginPassword() {
        return this.LoginPassword;
    }

    /**
     * Set 运维端登录密码
     * @param LoginPassword 运维端登录密码
     */
    public void setLoginPassword(String LoginPassword) {
        this.LoginPassword = LoginPassword;
    }

    /**
     * Get 密码 
     * @return Password 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
     * @param Password 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 私钥 
     * @return PrivateKey 私钥
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 私钥
     * @param PrivateKey 私钥
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 私钥密码 
     * @return PrivateKeyPassword 私钥密码
     */
    public String getPrivateKeyPassword() {
        return this.PrivateKeyPassword;
    }

    /**
     * Set 私钥密码
     * @param PrivateKeyPassword 私钥密码
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

    public AccessDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessDevicesRequest(AccessDevicesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.LoginAccount != null) {
            this.LoginAccount = new String(source.LoginAccount);
        }
        if (source.LoginPassword != null) {
            this.LoginPassword = new String(source.LoginPassword);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "LoginAccount", this.LoginAccount);
        this.setParamSimple(map, prefix + "LoginPassword", this.LoginPassword);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "PrivateKeyPassword", this.PrivateKeyPassword);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamArraySimple(map, prefix + "Drivers.", this.Drivers);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "IntranetAccess", this.IntranetAccess);

    }
}

