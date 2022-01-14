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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWxCloudBaseRunServerDBClusterRequest extends AbstractModel{

    /**
    * 账户密码
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 微信appid
    */
    @SerializedName("WxAppId")
    @Expose
    private String WxAppId;

    /**
    * mysql内核版本，支持5.7,8.0
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
     * Get 账户密码 
     * @return AccountPassword 账户密码
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set 账户密码
     * @param AccountPassword 账户密码
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 微信appid 
     * @return WxAppId 微信appid
     */
    public String getWxAppId() {
        return this.WxAppId;
    }

    /**
     * Set 微信appid
     * @param WxAppId 微信appid
     */
    public void setWxAppId(String WxAppId) {
        this.WxAppId = WxAppId;
    }

    /**
     * Get mysql内核版本，支持5.7,8.0 
     * @return DbVersion mysql内核版本，支持5.7,8.0
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set mysql内核版本，支持5.7,8.0
     * @param DbVersion mysql内核版本，支持5.7,8.0
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    public CreateWxCloudBaseRunServerDBClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWxCloudBaseRunServerDBClusterRequest(CreateWxCloudBaseRunServerDBClusterRequest source) {
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.WxAppId != null) {
            this.WxAppId = new String(source.WxAppId);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "WxAppId", this.WxAppId);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);

    }
}

