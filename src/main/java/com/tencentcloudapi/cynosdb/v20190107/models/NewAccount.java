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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewAccount extends AbstractModel {

    /**
    * 账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 密码，密码长度范围为8到64个字符
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * 主机(%或ipv4地址)
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户最大连接数，不能大于10240
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
     * Get 账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30 
     * @return AccountName 账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30
     * @param AccountName 账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 密码，密码长度范围为8到64个字符 
     * @return AccountPassword 密码，密码长度范围为8到64个字符
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set 密码，密码长度范围为8到64个字符
     * @param AccountPassword 密码，密码长度范围为8到64个字符
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get 主机(%或ipv4地址) 
     * @return Host 主机(%或ipv4地址)
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机(%或ipv4地址)
     * @param Host 主机(%或ipv4地址)
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户最大连接数，不能大于10240 
     * @return MaxUserConnections 用户最大连接数，不能大于10240
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set 用户最大连接数，不能大于10240
     * @param MaxUserConnections 用户最大连接数，不能大于10240
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    public NewAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewAccount(NewAccount source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);

    }
}

