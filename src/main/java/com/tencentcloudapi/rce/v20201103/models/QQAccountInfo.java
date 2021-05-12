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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QQAccountInfo extends AbstractModel{

    /**
    * QQ的OpenID。
    */
    @SerializedName("QQOpenId")
    @Expose
    private String QQOpenId;

    /**
    * QQ分配给网站或应用的AppId，用来唯一标识网站或应用。
    */
    @SerializedName("AppIdUser")
    @Expose
    private String AppIdUser;

    /**
    * 用于标识QQ用户登录后所关联业务自身的账号ID。
    */
    @SerializedName("AssociateAccount")
    @Expose
    private String AssociateAccount;

    /**
    * 账号绑定的手机号。
    */
    @SerializedName("MobilePhone")
    @Expose
    private String MobilePhone;

    /**
    * 用户设备号。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get QQ的OpenID。 
     * @return QQOpenId QQ的OpenID。
     */
    public String getQQOpenId() {
        return this.QQOpenId;
    }

    /**
     * Set QQ的OpenID。
     * @param QQOpenId QQ的OpenID。
     */
    public void setQQOpenId(String QQOpenId) {
        this.QQOpenId = QQOpenId;
    }

    /**
     * Get QQ分配给网站或应用的AppId，用来唯一标识网站或应用。 
     * @return AppIdUser QQ分配给网站或应用的AppId，用来唯一标识网站或应用。
     */
    public String getAppIdUser() {
        return this.AppIdUser;
    }

    /**
     * Set QQ分配给网站或应用的AppId，用来唯一标识网站或应用。
     * @param AppIdUser QQ分配给网站或应用的AppId，用来唯一标识网站或应用。
     */
    public void setAppIdUser(String AppIdUser) {
        this.AppIdUser = AppIdUser;
    }

    /**
     * Get 用于标识QQ用户登录后所关联业务自身的账号ID。 
     * @return AssociateAccount 用于标识QQ用户登录后所关联业务自身的账号ID。
     */
    public String getAssociateAccount() {
        return this.AssociateAccount;
    }

    /**
     * Set 用于标识QQ用户登录后所关联业务自身的账号ID。
     * @param AssociateAccount 用于标识QQ用户登录后所关联业务自身的账号ID。
     */
    public void setAssociateAccount(String AssociateAccount) {
        this.AssociateAccount = AssociateAccount;
    }

    /**
     * Get 账号绑定的手机号。 
     * @return MobilePhone 账号绑定的手机号。
     */
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    /**
     * Set 账号绑定的手机号。
     * @param MobilePhone 账号绑定的手机号。
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * Get 用户设备号。 
     * @return DeviceId 用户设备号。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 用户设备号。
     * @param DeviceId 用户设备号。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public QQAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QQAccountInfo(QQAccountInfo source) {
        if (source.QQOpenId != null) {
            this.QQOpenId = new String(source.QQOpenId);
        }
        if (source.AppIdUser != null) {
            this.AppIdUser = new String(source.AppIdUser);
        }
        if (source.AssociateAccount != null) {
            this.AssociateAccount = new String(source.AssociateAccount);
        }
        if (source.MobilePhone != null) {
            this.MobilePhone = new String(source.MobilePhone);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QQOpenId", this.QQOpenId);
        this.setParamSimple(map, prefix + "AppIdUser", this.AppIdUser);
        this.setParamSimple(map, prefix + "AssociateAccount", this.AssociateAccount);
        this.setParamSimple(map, prefix + "MobilePhone", this.MobilePhone);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

