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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCcGeoIPBlockConfigRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ip地址
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 协议类型
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * CC区域封禁配置，填写参数时配置ID请为空
    */
    @SerializedName("CcGeoIPBlockConfig")
    @Expose
    private CcGeoIPBlockConfig CcGeoIPBlockConfig;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ip地址 
     * @return IP ip地址
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set ip地址
     * @param IP ip地址
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 协议类型 
     * @return Protocol 协议类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型
     * @param Protocol 协议类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get CC区域封禁配置，填写参数时配置ID请为空 
     * @return CcGeoIPBlockConfig CC区域封禁配置，填写参数时配置ID请为空
     */
    public CcGeoIPBlockConfig getCcGeoIPBlockConfig() {
        return this.CcGeoIPBlockConfig;
    }

    /**
     * Set CC区域封禁配置，填写参数时配置ID请为空
     * @param CcGeoIPBlockConfig CC区域封禁配置，填写参数时配置ID请为空
     */
    public void setCcGeoIPBlockConfig(CcGeoIPBlockConfig CcGeoIPBlockConfig) {
        this.CcGeoIPBlockConfig = CcGeoIPBlockConfig;
    }

    public CreateCcGeoIPBlockConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCcGeoIPBlockConfigRequest(CreateCcGeoIPBlockConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CcGeoIPBlockConfig != null) {
            this.CcGeoIPBlockConfig = new CcGeoIPBlockConfig(source.CcGeoIPBlockConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "CcGeoIPBlockConfig.", this.CcGeoIPBlockConfig);

    }
}

