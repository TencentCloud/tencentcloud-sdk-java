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
    * <p>账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>主机(%或ipv4地址)</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>密码，密码长度范围为8到64个字符</p>
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * <p>是否开启密码轮转(0:关闭;1:开启)</p>
    */
    @SerializedName("PasswordRotation")
    @Expose
    private Long PasswordRotation;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>用户最大连接数，不能大于10240</p>
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
     * Get <p>账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30</p> 
     * @return AccountName <p>账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30</p>
     * @param AccountName <p>账户名，包含字母数字_,以字母开头，字母或数字结尾，长度1-30</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>主机(%或ipv4地址)</p> 
     * @return Host <p>主机(%或ipv4地址)</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>主机(%或ipv4地址)</p>
     * @param Host <p>主机(%或ipv4地址)</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>密码，密码长度范围为8到64个字符</p> 
     * @return AccountPassword <p>密码，密码长度范围为8到64个字符</p>
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set <p>密码，密码长度范围为8到64个字符</p>
     * @param AccountPassword <p>密码，密码长度范围为8到64个字符</p>
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get <p>是否开启密码轮转(0:关闭;1:开启)</p> 
     * @return PasswordRotation <p>是否开启密码轮转(0:关闭;1:开启)</p>
     */
    public Long getPasswordRotation() {
        return this.PasswordRotation;
    }

    /**
     * Set <p>是否开启密码轮转(0:关闭;1:开启)</p>
     * @param PasswordRotation <p>是否开启密码轮转(0:关闭;1:开启)</p>
     */
    public void setPasswordRotation(Long PasswordRotation) {
        this.PasswordRotation = PasswordRotation;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>用户最大连接数，不能大于10240</p> 
     * @return MaxUserConnections <p>用户最大连接数，不能大于10240</p>
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set <p>用户最大连接数，不能大于10240</p>
     * @param MaxUserConnections <p>用户最大连接数，不能大于10240</p>
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
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.PasswordRotation != null) {
            this.PasswordRotation = new Long(source.PasswordRotation);
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
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "PasswordRotation", this.PasswordRotation);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);

    }
}

