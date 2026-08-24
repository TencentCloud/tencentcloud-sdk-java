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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendDspmCkafkaTestRequest extends AbstractModel {

    /**
    * 1为外网，7为支撑环境接入
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * ckafka实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 为7有效
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 为7有效
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * 域名，VipType为1有效
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名端口，VipType为1有效
    */
    @SerializedName("DomainPort")
    @Expose
    private String DomainPort;

    /**
    * 用户名，VipType为1有效
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 用户密码，VipType为1有效
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 1为外网，7为支撑环境接入 
     * @return VipType 1为外网，7为支撑环境接入
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set 1为外网，7为支撑环境接入
     * @param VipType 1为外网，7为支撑环境接入
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get ckafka实例id 
     * @return InstanceId ckafka实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka实例id
     * @param InstanceId ckafka实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 为7有效 
     * @return Vip 为7有效
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 为7有效
     * @param Vip 为7有效
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 为7有效 
     * @return Vport 为7有效
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set 为7有效
     * @param Vport 为7有效
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 域名，VipType为1有效 
     * @return Domain 域名，VipType为1有效
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名，VipType为1有效
     * @param Domain 域名，VipType为1有效
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名端口，VipType为1有效 
     * @return DomainPort 域名端口，VipType为1有效
     */
    public String getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set 域名端口，VipType为1有效
     * @param DomainPort 域名端口，VipType为1有效
     */
    public void setDomainPort(String DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get 用户名，VipType为1有效 
     * @return Username 用户名，VipType为1有效
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名，VipType为1有效
     * @param Username 用户名，VipType为1有效
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 用户密码，VipType为1有效 
     * @return Password 用户密码，VipType为1有效
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 用户密码，VipType为1有效
     * @param Password 用户密码，VipType为1有效
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public SendDspmCkafkaTestRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendDspmCkafkaTestRequest(SendDspmCkafkaTestRequest source) {
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new String(source.DomainPort);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

