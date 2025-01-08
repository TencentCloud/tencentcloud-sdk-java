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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseEsInfo extends AbstractModel {

    /**
    * es的id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * secret名字
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * ip地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 索引
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 用户名
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get es的id 
     * @return Id es的id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set es的id
     * @param Id es的id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get secret名字 
     * @return SecretName secret名字
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set secret名字
     * @param SecretName secret名字
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get ip地址 
     * @return Ip ip地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ip地址
     * @param Ip ip地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 索引 
     * @return Index 索引
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 索引
     * @param Index 索引
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 用户名 
     * @return Account 用户名
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 用户名
     * @param Account 用户名
     */
    public void setAccount(String Account) {
        this.Account = Account;
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

    public CloudBaseEsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseEsInfo(CloudBaseEsInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

